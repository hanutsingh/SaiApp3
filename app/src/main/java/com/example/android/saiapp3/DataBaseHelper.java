package com.example.android.saiapp3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBaseHelper extends SQLiteOpenHelper {

    static final String DATABASE_NAME = "Student.db";

    static final String TABLE_NAME = "Student_table";
    //------------------------------------------------------------------------------------------//
    static final String COL_1 = "ID";
    static final String COL_2 = "Name";
    static final String COL_3 = "SURNAME";
    static final String COL_4 = "MARKS";


//--------------------------------------------------------------------------------------------------//

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {

            db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

    }

    public boolean insertData(String name, String surname, String marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        //Instance of a class ContentValues and use "Put" method to store values in objects
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, surname);
        contentValues.put(COL_4, marks);

        //Insert Data in table using "insert" method on the SQLiteDatabase instance
        long result = db.insert(TABLE_NAME, null, contentValues);
        db.close();

        // To Check whether Data is Inserted in DataBase or Not
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }


    public Integer deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        int i= db.delete(TABLE_NAME,"ID=?",new String[]{id});
        return i;
    }


    public Cursor getAllData() {
        //open DataBase to read database
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from " + TABLE_NAME, null);
        return res;
    }



/*
    // Get User Details based on userid
    public ArrayList<HashMap<String, String>> GetUserByUserId(int userid){
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<HashMap<String, String>> userList = new ArrayList<>();
        String query = "SELECT Name, SURNAME, MARKS FROM " + TABLE_NAME;
        Cursor cursor = db.query(TABLE_NAME, new String[]{COL_2, COL_3, COL_4}, COL_1+ "=?",new String[]{String.valueOf(userid)},null, null, null, null);
        if (cursor.moveToNext()){
            HashMap<String,String> user = new HashMap<>();
            user.put("Name",cursor.getString(cursor.getColumnIndex(COL_2)));
            user.put("SURNAME",cursor.getString(cursor.getColumnIndex(COL_3)));
            user.put("MARKS",cursor.getString(cursor.getColumnIndex(COL_4)));
            userList.add(user);
        }
        return  userList;
    }

    */


    // Get User Details in ListView
    public ArrayList<HashMap<String, String>> GetUsers() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<HashMap<String, String>> userList = new ArrayList<>();

        String query = "SELECT Name, SURNAME, MARKS FROM " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);

        while (true) {
            if (cursor.moveToNext()) {
                HashMap<String, String> user = new HashMap<>();
                user.put("Name", cursor.getString(cursor.getColumnIndex(COL_2)));
                user.put("SURNAME", cursor.getString(cursor.getColumnIndex(COL_3)));
                user.put("MARKS", cursor.getString(cursor.getColumnIndex(COL_4)));
                userList.add(user);
            }

            return userList;
        }
    }



}
