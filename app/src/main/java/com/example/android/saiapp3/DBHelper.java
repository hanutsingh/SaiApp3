package com.example.android.saiapp3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    static final String DATABASE                        = "billing.sqlite";

    static final String B_ID                            = "_id";
    //------------------------------------------------------------------------------------------//
    static final String TARIFF_MST                      = "TARIFF_MST";

    static final String T_SUPPLY_TYPE 		        	= "SUPPLY_TYPE";
    static final String SUPPLY_TYPE_NAME		        = "SUPPLY_TYPE_NAME";
    static final String SUPPLY_TYPE_DESCRIPTION         = "SUPPLY_TYPE_DESCRIPTION";
    static final String TARIFF_EFT_FROM                 = "TARIFF_EFT_FROM";
    static final String T_HT_LT                         = "HT_LT";
    static final String METERED                         = "METERED";
    static final String CHARGE_UNIT                     = "CHARGE_UNIT";
    static final String WATTAGE_SLAB1_FROM              = "WATTAGE_SLAB1_FROM";
    static final String WATTAGE_SLAB1_TO                = "WATTAGE_SLAB1_TO";
    static final String WATTAGE_SLAB1_FIX_CHG           = "WATTAGE_SLAB1_FIX_CHG";
    static final String WATTAGE_SLAB2_FROM              = "WATTAGE_SLAB2_FROM";
    static final String WATTAGE_SLAB2_TO                = "WATTAGE_SLAB2_TO";
    static final String WATTAGE_SLAB2_FIX_CHG           = "WATTAGE_SLAB2_FIX_CHG";
    static final String WATTAGE_SLAB3_FROM              = "WATTAGE_SLAB3_FROM";
    static final String WATTAGE_SLAB3_TO                = "WATTAGE_SLAB3_TO";
    static final String WATTAGE_SLAB3_FIX_CHG           = "WATTAGE_SLAB3_FIX_CHG";

    static final String WATTAGE_SLAB4_FROM              = "WATTAGE_SLAB4_FROM";
    static final String WATTAGE_SLAB4_TO                = "WATTAGE_SLAB4_TO";
    static final String WATTAGE_SLAB4_FIX_CHG           = "WATTAGE_SLAB4_FIX_CHG";

    static final String TOD_TARIFF_APCL                 = "TOD_TARIFF_APCL";
    static final String ENERGY_SLAB1_FROM               = "ENERGY_SLAB1_FROM";
    static final String ENERGY_SLAB1_TO                 = "ENERGY_SLAB1_TO";
    static final String ENERGY_SLAB1_RATE               = "ENERGY_SLAB1_RATE";
    static final String ENERGY_SLAB2_FROM               = "ENERGY_SLAB2_FROM";
    static final String ENERGY_SLAB2_TO                 = "ENERGY_SLAB2_TO";
    static final String ENERGY_SLAB2_RATE               = "ENERGY_SLAB2_RATE";
    static final String ENERGY_SLAB3_FROM               = "ENERGY_SLAB3_FROM";
    static final String ENERGY_SLAB3_TO                 = "ENERGY_SLAB3_TO";
    static final String ENERGY_SLAB3_RATE               = "ENERGY_SLAB3_RATE";
    static final String ENERGY_SLAB4_FROM               = "ENERGY_SLAB4_FROM";
    static final String ENERGY_SLAB4_RATE               = "ENERGY_SLAB4_RATE";
    static final String DEMAND_CHARGE_UNIT              = "DEMAND_CHARGE_UNIT";
    static final String DEMAND_CHARGE_RATE              = "DEMAND_CHARGE_RATE";
    static final String TOD_CHARGE_UNIT                 = "TOD_CHARGE_UNIT";
    static final String TOD1_RATE                       = "TOD1_RATE";
    static final String TOD2_RATE                       = "TOD2_RATE";
    static final String TOD3_RATE                       = "TOD3_RATE";
    static final String SECURITY_DEPOSIT_UNIT           = "SECURITY_DEPOSIT_UNIT";
    static final String SECURITY_DEPOSIT_PER_UNIT_URBAN = "SECURITY_DEPOSIT_PER_UNIT_URBAN";
    static final String SECURITY_DEPOSIT_PER_UNIT_RURAL = "SECURITY_DEPOSIT_PER_UNIT_RURAL";
    static final String COMPENSATION_CHARGE_UNIT        = "COMPENSATION_CHARGE_UNIT";
    static final String PF_LIMIT_FROM                   = "PF_LIMIT_FROM";
    static final String PF_LIMIT_TO                     = "PF_LIMIT_TO";
    static final String COMPENSATION_RATE_LOWPF         = "COMPENSATION_RATE_LOWPF";
    static final String LOAD_FACTOR_URBAN               = "LOAD_FACTOR_URBAN";
    static final String LOAD_FACTOR_RURAL               = "LOAD_FACTOR_RURAL";
    static final String ED_SLAB1_FROM                   = "ED_SLAB1_FROM";
    static final String ED_SLAB1_TO                     = "ED_SLAB1_TO";
    static final String ED_SLAB1_RATE                   = "ED_SLAB1_RATE";           
    static final String ED_SLAB2_FROM                   = "ED_SLAB2_FROM";
    static final String ED_SLAB2_TO                     = "ED_SLAB2_TO";
    static final String ED_SLAB2_RATE                   = "ED_SLAB2_RATE";
    static final String ED_SLAB3_FROM                   = "ED_SLAB3_FROM";
    static final String ED_SLAB3_RATE                   = "ED_SLAB3_RATE";
    static final String CHEQUE_DISH                     = "CHEQUE_DISH";
    static final String DUE_DATE_DAYS                   = "DUE_DATE_DAYS";
    static final String DISCONECTION_DAYS               = "DISCONECTION_DAYS";
    static final String EXCESS_LOAD_MULTIPLE_NTARIFF    = "EXCESS_LOAD_MULTIPLE_NTARIFF";
    static final String EXCESS_ENERGY_MULTIPLE_NTARIFF  = "EXCESS_ENERGY_MULTIPLE_NTARIFF";
    static final String TMC_SLAB1_FROM                  = "TMC_SLAB1_FROM";
    static final String TMC_SLAB1_TO                    = "TMC_SLAB1_TO";
    static final String TMC_SLAB1_RATE                  = "TMC_SLAB1_RATE";
    static final String TMC_SLAB2_FROM                  = "TMC_SLAB2_FROM";
    static final String TMC_SLAB2_TO                    = "TMC_SLAB2_TO";
    static final String TMC_SLAB2_RATE                  = "TMC_SLAB2_RATE";
    static final String TMC_SLAB3_FROM                  = "TMC_SLAB3_FROM";
    static final String TMC_SLAB3_TO                    = "TMC_SLAB3_TO";
    static final String TMC_SLAB3_RATE                  = "TMC_SLAB3_RATE";
    static final String LATE_FEE_RATE                   = "LATE_FEE_RATE";
    static final String CHANGE_NAME_CHARGE              = "CHANGE_NAME_CHARGE";
    static final String TMC_REC_ID                      = "TMC_REC_ID";

    static final String  SGST                           = "SGST";
    static final String  CGST                           = "CGST";
    //------------------------------------------------------------------------------------------//
    static final String USER_MASTER                     =   "USER_MASTER";

    static final String USER_NAME                       =   "USER_NAME";
    static final String DEVICE_ID                       =   "DEVICE_ID";
    static final String IMEI_1                          =   "IMEI_1";
    static final String IMEI_2                          =   "IMEI_2";
    static final String PASSWORD                        =   "PASSWORD";

    static final String MR_STATUS                       =   "MR_STATUS";
    static final String MR_DESG                         =   "MR_DESG";
    //------------------------------------------------------------------------------------------//
    static final String  CONSUMER_MASTER                 = "CONSUMER_MASTER";

    static final String  SUB_DIV_CODE                    = "SUB_DIV_CODE";
    static final String  AC_ID   	                     = "AC_ID";
    static final String  METER_ID                        = "METER_ID";
    static final String  METER_MAKE                      = "METER_MAKE";
    static final String  MAIN_MF  	                     = "MAIN_MF";
    static final String  METER_ID2                       = "METER_ID2";
    static final String  METER_MAKE2                     = "METER_MAKE2";
    static final String  POLE_MF                         = "POLE_MF";
    static final String  SUPPLY_VOLTAGE                  = "SUPPLY_VOLTAGE";
    static final String  SUPPLY_VOLTAGE_UNIT             = "SUPPLY_VOLTAGE_UNIT";
    static final String  SUPPLY_TYPE                     = "SUPPLY_TYPE";
    static final String  WATTAGE                         = "WATTAGE";
    static final String  NAME                            = "NAME";
    static final String  ADDRESS                         = "ADDRESS";
    static final String  FATHER_NAME                     = "FATHER_NAME";
    static final String  CONTACT_NO                      = "CONTACT_NO";
    static final String  ALT_CONTACT_NO                  = "ALT_CONTACT_NO";
    static final String  HOUSE_SEQ_NO                    = "HOUSE_SEQ_NO";
    static final String  CONS_TYPE                       = "CONS_TYPE";
    static final String  CONTRACT_DEMAND                 = "CONTRACT_DEMAND";
    static final String  CONTRACT_DEMAND_UNIT            = "CONTRACT_DEMAND_UNIT";
    static final String  CONSUMER_STATUS                 = "CONSUMER_STATUS";
    static final String  PROCESS                         = "PROCESS";
    static final String  SUBSTATION_NAME                 = "SUBSTATION_NAME";
    static final String  FEEDER_NAME                     = "FEEDER_NAME";
    static final String  DT                              = "DT";
    static final String  DOC                             = "DOC";
    static final String  HT_LT                           = "HT_LT";
    static final String  METER_RENT_MONTHLY              = "METER_RENT_MONTHLY";
    static final String  LOCK_ARREAR                     = "LOCK_ARREAR";
    static final String  RURAL_URBAN_CODE                = "RURAL_URBAN_CODE";
    static final String  OPTED_OFFSEASON                 = "OPTED_OFFSEASON";
    static final String  OFFSEASON_PERIOD_FROM           = "OFFSEASON_PERIOD_FROM";
    static final String  OFFSEASON_PERIOD_TO             = "OFFSEASON_PERIOD_TO";
    static final String  AREA                            = "AREA";

    static final String  MR_CODE                         = "MR_CODE";
    static final String  BILL_STATUS                     = "BILL_STATUS";
    static final String  BILL_DATE                       = "BILL_DATE";
    static final String  BILL_NO                         = "BILL_NO";
    static final String  TOTAL_PAY_AMT_PRV_MNTH          = "TOTAL_PAY_AMT_PRV_MNTH";
    static final String  LAST_PAY_DATE_PRV_MNTH          = "LAST_PAY_DATE_PRV_MNTH";
    static final String  OPENING_READING_KWH             = "OPENING_READING_KWH";
    static final String  CLOSING_READING_KWH             = "CLOSING_READING_KWH";
    static final String  OPENING_READING_KVAH            = "OPENING_READING_KVAH";
    static final String  CLOSING_READING_KVAH            = "CLOSING_READING_KVAH";
    static final String  OPENING_READING_KVAH_TOD1       = "OPENING_READING_KVAH_TOD1";
    static final String  CLOSING_READING_KVAH_TOD1       = "CLOSING_READING_KVAH_TOD1";
    static final String  OPENING_READING_KVAH_TOD2       = "OPENING_READING_KVAH_TOD2";
    static final String  CLOSING_READING_KVAH_TOD2       = "CLOSING_READING_KVAH_TOD2";
    static final String  OPENING_READING_KVAH_TOD3       = "OPENING_READING_KVAH_TOD3";
    static final String  CLOSING_READING_KVAH_TOD3       = "CLOSING_READING_KVAH_TOD3";
    static final String  METERED_UNITS                   = "METERED_UNITS";

    static final String  BILLING_UNITS                   = "BILLING_UNITS";

    static final String  METERED_TOD1                    = "METERED_TOD1";
    static final String  METERED_TOD2                    = "METERED_TOD2";
    static final String  METERED_TOD3                    = "METERED_TOD3";

    static final String  BILLING_TOD1                    = "BILLING_TOD1";
    static final String  BILLING_TOD2                    = "BILLING_TOD2";
    static final String  BILLING_TOD3                    = "BILLING_TOD3";

    static final String  METERED_DEMAND                  = "METERED_DEMAND";

    static final String  BILLING_DEMAND                  = "BILLING_DEMAND";
    static final String  MDMD_80PERC_11MNTH              = "MDMD_80PERC_11MNTH";
    static final String  DMD_75PERC_CL                   = "DMD_75PERC_CL";
    static final String  CONSUMPTION_SLAB1_CH            = "CONSUMPTION_SLAB1_CH";
    static final String  CONSUMPTION_SLAB2_CH            = "CONSUMPTION_SLAB2_CH";
    static final String  CONSUMPTION_SLAB3_CH            = "CONSUMPTION_SLAB3_CH";
    static final String  TOT_CONSUMPTION_CHARGE          = "TOT_CONSUMPTION_CHARGE";
    static final String  CONSUMPTION_TOD1_CH             = "CONSUMPTION_TOD1_CH";
    static final String  CONSUMPTION_TOD2_CH             = "CONSUMPTION_TOD2_CH";
    static final String  CONSUMPTION_TOD3_CH             = "CONSUMPTION_TOD3_CH";
    static final String  TOT_CONSUMPTION_TOD_CHARGE      = "TOT_CONSUMPTION_TOD_CHARGE";
    static final String  DEMAND_CHARGE                   = "DEMAND_CHARGE";
    static final String  EXCESS_DEMAND_PENALITY          = "EXCESS_DEMAND_PENALITY";
    static final String  EXC_CP_SLAB1_CH                 = "EXC_CP_SLAB1_CH";
    static final String  EXC_CP_SLAB2_CH                 = "EXC_CP_SLAB2_CH";
    static final String  EXC_CP_SLAB3_CH                 = "EXC_CP_SLAB3_CH";
    static final String  TOT_EXCESS_CONSUMPTION_PENALITY = "TOT_EXCESS_CONSUMPTION_PENALITY";
    static final String  PF                              = "PF";
    static final String  COMPENSATION_LOW_PF_CH          = "COMPENSATION_LOW_PF_CH";
    static final String  MISC_CHARGE1                    = "MISC_CHARGE1";
    static final String  MISC_REMARK1                    = "MISC_REMARK1";
    static final String  MISC_CHARGE2                    = "MISC_CHARGE2";
    static final String  MISC_REMARK2                    = "MISC_REMARK2";
    static final String  ELECTRICITY_DUTY                = "ELECTRICITY_DUTY";
    static final String  ADJ_AMOUNT                      = "ADJ_AMOUNT";
    static final String  ADJ_REMARK                      = "ADJ_REMARK";
    static final String  METER_RENT                      = "METER_RENT";
    static final String  CURRENT_BILL                    = "CURRENT_BILL";
    static final String  ARREAR_COUNT                    = "ARREAR_COUNT";
    static final String  ARR_PYR                         = "ARR_PYR";
    static final String  EDARR_PYR                       = "EDARR_PYR";
    static final String  ARRSUR_PYR                      = "ARRSUR_PYR";
    static final String  ARR_CYR                         = "ARR_CYR";
    static final String  EDARR_CYR                       = "EDARR_CYR";
    static final String  ARRSUR_CYR                      = "ARRSUR_CYR";
    static final String  CURBILL_SUR                     = "CURBILL_SUR";
    static final String  REBATE                          = "REBATE";
    static final String  SECURITY_INTEREST_TDS           = "SECURITY_INTEREST_TDS";
    static final String  GROSS_TOTAL                     = "GROSS_TOTAL";
    static final String  NET_BILL                        = "NET_BILL";
    static final String  TOTAL_PAY_AMT_CUR_MNTH          = "TOTAL_PAY_AMT_CUR_MNTH";
    static final String  LAST_PAY_DATE_CUR_MNTH          = "LAST_PAY_DATE_CUR_MNTH";

    static final String  BILL_MADE                          = "BILL_MADE";
    static final String  METER_STATUS                       = "METER_STATUS";
    static final String  METER_MF                           = "METER_MF";
    static final String  READ_DATE_PRV                      = "READ_DATE_PRV";
    static final String  READ_DATE_CUR                      = "READ_DATE_CUR";
    static final String  BILLING_DAYS                       = "BILLING_DAYS";
    static final String  BILLING_PERIOD                     = "BILLING_PERIOD";
    static final String  KVAH_TODSLAB1_ENERGY_CUR           = "KVAH_TODSLAB1_ENERGY_CUR";
    static final String  KVAH_TODSLAB2_ENERGY_CUR           = "KVAH_TODSLAB2_ENERGY_CUR";
    static final String  KVAH_TODSLAB3_ENERGY_CUR           = "KVAH_TODSLAB3_ENERGY_CUR";
    static final String  KVAH_TODSLAB4_ENERGY_CUR           = "KVAH_TODSLAB4_ENERGY_CUR";
    static final String  KVAH_TODSLAB5_ENERGY_CUR           = "KVAH_TODSLAB5_ENERGY_CUR";
    static final String  KVAH_TODSLAB6_ENERGY_CUR           = "KVAH_TODSLAB6_ENERGY_CUR";
    static final String  KVAH_TODSLAB7_ENERGY_CUR           = "KVAH_TODSLAB7_ENERGY_CUR";
    static final String  KVAH_TODSLAB8_ENERGY_CUR           = "KVAH_TODSLAB8_ENERGY_CUR";
    static final String  OPENING_TOD1_ENERGY                = "OPENING_TOD1_ENERGY";
    static final String  CLOSING_TOD1_ENERGY                = "CLOSING_TOD1_ENERGY";
    static final String  OPENING_TOD2_ENERGY                = "OPENING_TOD2_ENERGY";
    static final String  CLOSING_TOD2_ENERGY                = "CLOSING_TOD2_ENERGY";
    static final String  OPENING_TOD3_ENERGY                = "OPENING_TOD3_ENERGY";
    static final String  CLOSING_TOD3_ENERGY                = "CLOSING_TOD3_ENERGY";
    static final String  PROVISIONAL_MONTH_COUNT            = "PROVISIONAL_MONTH_COUNT";
    static final String  PROV_KWH_CONSUMPTION_PRV           = "PROV_KWH_CONSUMPTION_PRV";
    static final String  PROV_KVAH_CONSUMPTION_PRV          = "PROV_KVAH_CONSUMPTION_PRV";
    static final String  PROV_KWH_CONSUMPTION_CUR           = "PROV_KWH_CONSUMPTION_CUR";
    static final String  PROV_KVAH_CONSUMPTION_CUR          = "PROV_KVAH_CONSUMPTION_CUR";
    static final String  CONSUMPTION_SLAB4_CHRG             = "CONSUMPTION_SLAB4_CHRG";
    static final String  PROV_CHRG_PRV                      = "PROV_CHRG_PRV";
    static final String  PROV_CHRG_CUR                      = "PROV_CHRG_CUR";
    static final String  EXC_CP_SLAB4_CHRG                  = "EXC_CP_SLAB4_CHRG";
    static final String  ED_SLAB1_CHRG                      = "ED_SLAB1_CHRG";
    static final String  ED_SLAB2_CHRG                      = "ED_SLAB2_CHRG";
    static final String  ED_SLAB3_CHRG                      = "ED_SLAB3_CHRG";
    static final String  PROV_TOT_ED_CHRG_PRV               = "PROV_TOT_ED_CHRG_PRV";
    static final String  PROV_TOT_ED_CHRG_CUR               = "PROV_TOT_ED_CHRG_CUR";
    static final String  PROV_SUR_PRV                       = "PROV_SUR_PRV";
    static final String  PROV_SUR_CUR                       = "PROV_SUR_CUR";
    static final String  FINAL_BILL                         = "FINAL_BILL";
    static final String  CON_REC_ID                         = "CON_REC_ID";
    static final String  CON_UPLOAD                         = "CON_UPLOAD";

    static final String  SGST_PER                           = "SGST_PER";
    static final String  CGST_PER                           = "CGST_PER";
    static final String  EXCESS_UNITS                       = "EXCESS_UNITS";
    static final String  BILL_MADE_DEVICE                   = "BILL_MADE_DEVICE";

    static final String  SECURITY_AMOUNT                 = "SECURITY_AMOUNT";
    static final String  SEC_DEPOSIT_DT                  = "SEC_DEPOSIT_DT";
    static final String  CITY_VILLAGE                    = "CITY_VILLAGE";
    static final String  BILL_DATE_EXPECTED              = "BILL_DATE_EXPECTED";
    static final String  BILL_DUE_DATE                   = "BILL_DUE_DATE";
    static final String  BILL_DISCON_DATE                = "BILL_DISCON_DATE";

    static final String  BILL_START_DATE                 = "BILL_START_DATE";
    static final String  BILL_END_DATE                   = "BILL_END_DATE";

    static final String  EXCESS_DEMAND                   = "EXCESS_DEMAND";
    static final String  ADJ_UNITS                       = "ADJ_UNITS";
    static final String  MEPDCL_ARREAR                   = "MEPDCL_ARREAR";
    static final String  DISCOM                          = "DISCOM";
    static final String  ZONE                            = "ZONE";
    static final String  CIRCLE                          = "CIRCLE";
    static final String  DIV_NAME                        = "DIV_NAME";
    static final String  SUB_DIV_NAME                    = "SUB_DIV_NAME";

    static final String  OLD_AC_ID                       = "OLD_AC_ID";
    static final String  PHASE                           = "PHASE";
    static final String  ADDL_UNITS                      = "ADDL_UNITS";
    static final String  FPPPA_CHRG                      = "FPPPA_CHRG";
    static final String  TMC_CHRG                        = "TMC_CHRG";
    static final String  LAST_MONTH_EXTRA_PAYMENT        = "LAST_MONTH_EXTRA_PAYMENT";
    static final String  LAST_PAY_RCPT_PRV_MNTH          = "LAST_PAY_RCPT_PRV_MNTH";
    static final String  METER_CAPACITY                  = "METER_CAPACITY";
    static final String  LT_POLE                         = "LT_POLE";
    static final String  METER_ST                        = "METER_ST";
    static final String  NEW_METER_NO                    = "NEW_METER_NO";
    static final String  NEW_MOB_NO                      = "NEW_MOB_NO";
    static final String  BILL_RND_NO                     = "BILL_RND_NO";
    static final String  CAT_ID                          = "CAT_ID";
    static final String  AVG_6M                          = "AVG_6M";
    static final String  AVAIL_KVAH                      = "AVAIL_KVAH";

    static final String  TXN_DATE_TIME                   = "TXN_DATE_TIME";
    static final String  AVG_CONSUMPTION_6M              = "AVG_CONSUMPTION_6M";
    static final String  LAT                             = "LAT";
    static final String  LNG                             = "LNG";
    static final String  IMEI                            = "IMEI";
    static final String  MRNAME                          = "MRNAME";
    static final String  MRCODE                          = "MRCODE";
    static final String  BPLU_MET                        = "BPLU_MET";
    static final String  BPLU_READ                       = "BPLU_READ";

    static final String  READING_IMAGE                   = "READING_IMAGE";
    static final String  DEMAND_IMAGE                    = "DEMAND_IMAGE";
    static final String  SIGN_IMAGE                      = "SIGN_IMAGE";

    static final String  BANK_NAME                       = "BANK_NAME";
    static final String  BANK_CODE                       = "BANK_CODE";
    static final String  CHEQUE_NO                       = "CHEQUE_NO";
    static final String  CHEQUE_DATE                     = "CHEQUE_DATE";
    static final String  CHEQUE_AMOUNT                   = "CHEQUE_AMOUNT";
    static final String  CHEQUE_MICR_NO                  = "CHEQUE_MICR_NO";
    static final String  PAYMENT_TAG                     = "PAYMENT_TAG";

    static final String  LATE_PAYMENT_SUR_PRV            = "LATE_PAYMENT_SUR_PRV";
    static final String  LATE_PAYMENT_SUR_CUR            = "LATE_PAYMENT_SUR_CUR";
    static final String  MEPDCL_ARREAR_PAY_TAG           = "MEPDCL_ARREAR_PAY_TAG";
    static final String  MEPDCL_ARREAR_PAY_AMT           = "MEPDCL_ARREAR_PAY_AMT";

    static final String  Remaining_advance_pmt           = "Remaining_advance_pmt";
    static final String  Last_Bill_Payment_Credit        = "Last_Bill_Payment_Credit";
    static final String  Fixcharge_Period                = "Fixcharge_Period";
    static final String  Unpaid_Bill_Amt                 = "Unpaid_Bill_Amt";
    static final String  Unpaid_Bill_Due_Date            = "Unpaid_Bill_Due_Date";
    static final String  Last_Bill_InvoiceNo             = "Last_Bill_InvoiceNo";
    static final String  BILL_MADE_BY_SAI                = "BILL_MADE_BY_SAI";

    static final String  EXCEPTION_IMAGE                 = "EXCEPTION_IMAGE";

    static final String  CASH_AMOUNT                     = "CASH_AMOUNT";
    //--------------------------------------------------------------------//
    static final String  B_VERSION_MST                   =  "VERSION_MST";
    static final String  B_VERSION_DT_MST                =  "VERSION_DATE";
    //--------------------------------------------------------------------//
    static final String METER_STATUS_MST                    = "METER_STATUS_MST";
    static final String MS_REC_ID                           = "REC_ID";
    static final String MS_METER_STATUS                     = "METER_STATUS";
    static final String MS_CODE                             = "CODE";
    //--------------------------------------------------------------------//
    static final String METER_TYPE_MST                      = "METER_TYPE_MST ";

    static final String M_ID                                = "M_ID";
    static final String METER_TYPE                          = "METER_TYPE";
    //--------------------------------------------------------------------//
    //--------------------------------------------------------------------//
    static final String DIM_DAYS_INDEX                      = "DIM_DAYS_INDEX ";

    static final String D_ID                                = "D_ID";
    static final String D_DAYS                              = "D_DAYS";
    static final String B_INDEX                             = "B_INDEX";
    static final String R_INDEX                             = "R_INDEX";
    //--------------------------------------------------------------------//
    //----------------------------------------------------------------------------------------------//
    static final String  B_BANK_MST                      =  "BANK_MST";

    static final String  B_BANK_NAME                     =  "BANK_NAME";
    static final String  B_BANK_CODE                     =  "BANK_CODE";
    static final String  B_REC_NO                        =  "REC_NO";
//--------------------------------------------------------------------------------------------------//
    static final String  LT_POLE_MST                      =  "LT_POLE_MST";

    static final String  LT_LINE                          =  "LT_LINE";
    static final String  LT_NUMBER                        =  "LT_NUMBER";
    static final String  L_REC_NO                         =  "L_REC_NO";
//--------------------------------------------------------------------------------------------------//

    public DBHelper(Context context)
    {
        super( context,DATABASE,null,1 );
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL("CREATE TABLE "  + TARIFF_MST + "(" + B_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,  "+ T_SUPPLY_TYPE +  " NVARCHAR(50),  " +  SUPPLY_TYPE_NAME+  " NVARCHAR(50),  " +  SUPPLY_TYPE_DESCRIPTION+  " NVARCHAR (200),  " +  TARIFF_EFT_FROM+  " DATETIME,  " +  T_HT_LT+  " NVARCHAR (5),  " +  METERED+  " NVARCHAR (10),  " +  CHARGE_UNIT+  " NVARCHAR(50),  " +  WATTAGE_SLAB1_FROM+  " NUMERIC(18,0),  " +  WATTAGE_SLAB1_TO+  " NUMERIC(18,0),  " +  WATTAGE_SLAB1_FIX_CHG+  " NUMERIC(18,0),  " +  WATTAGE_SLAB2_FROM+  " NUMERIC(18,0),  " +  WATTAGE_SLAB2_TO+  " NUMERIC(18,0),  " +  WATTAGE_SLAB2_FIX_CHG+  " NUMERIC(18,0),  " +  WATTAGE_SLAB3_FROM+  " NUMERIC(18,0),  " +  WATTAGE_SLAB3_TO+  " NUMERIC(18,0),  " +  WATTAGE_SLAB3_FIX_CHG+  " NUMERIC(18,0),  " +  WATTAGE_SLAB4_FROM+  " NUMERIC(18,0),  " +  WATTAGE_SLAB4_TO+  " NUMERIC(18,0),  " +  WATTAGE_SLAB4_FIX_CHG+  " NUMERIC(18,0),  " +  TOD_TARIFF_APCL+  " NVARCHAR (5),  " +  ENERGY_SLAB1_FROM+  " NUMERIC(18,0),  " +  ENERGY_SLAB1_TO+  " NUMERIC(18,0),  " +  ENERGY_SLAB1_RATE+  " NUMERIC(18,2),  " +  ENERGY_SLAB2_FROM+  " NUMERIC(18,0),  " +  ENERGY_SLAB2_TO+  " NUMERIC(18,0),  " +  ENERGY_SLAB2_RATE+  " NUMERIC(18,2),  " +  ENERGY_SLAB3_FROM+  " NUMERIC(18,0),  " +  ENERGY_SLAB3_TO+  " NUMERIC(18,0),  " +  ENERGY_SLAB3_RATE+  " NUMERIC(18,2),  " +  ENERGY_SLAB4_FROM+  " NUMERIC(18,0),  " +  ENERGY_SLAB4_RATE+  " NUMERIC(18,2),  " +  DEMAND_CHARGE_UNIT+  " NVARCHAR(50),  " +  DEMAND_CHARGE_RATE+  " NUMERIC(18,0),  " +  TOD_CHARGE_UNIT+  " NVARCHAR (10),  " +  TOD1_RATE+  " NUMERIC(18,2),  " +  TOD2_RATE+  " NUMERIC(18,2),  " +  TOD3_RATE+  " NUMERIC(18,2),  " +  SECURITY_DEPOSIT_UNIT+  " NVARCHAR (10),  " +  SECURITY_DEPOSIT_PER_UNIT_URBAN+  " NUMERIC(18,0),  " +  SECURITY_DEPOSIT_PER_UNIT_RURAL+  " NUMERIC(18,0),  " +  COMPENSATION_CHARGE_UNIT+  " NVARCHAR (10),  " +  PF_LIMIT_FROM+  " NUMERIC(18,2),  " +  PF_LIMIT_TO+  " NUMERIC(18,2),  " +  COMPENSATION_RATE_LOWPF+  " NUMERIC(18,2),  " +  LOAD_FACTOR_URBAN+  " NUMERIC(18,3),  " +  LOAD_FACTOR_RURAL+  " NUMERIC(18,3),  " +  ED_SLAB1_FROM+  " NUMERIC(18,0),  " +  ED_SLAB1_TO+  " NUMERIC(18,0),  " +  ED_SLAB1_RATE+  " NUMERIC(18,2),  " +  ED_SLAB2_FROM+  " NUMERIC(18,0),  " +  ED_SLAB2_TO+  " NUMERIC(18,0),  " +  ED_SLAB2_RATE+  " NUMERIC(18,2),  " +  ED_SLAB3_FROM+  " NUMERIC(18,0),  " +  ED_SLAB3_RATE+  " NUMERIC(18,2),  " +  CHEQUE_DISH+  " NUMERIC(18,0),  " +  DUE_DATE_DAYS+  " NUMERIC(18,0) ,  " +  DISCONECTION_DAYS+  " NUMERIC(18,0) ,  " +  EXCESS_LOAD_MULTIPLE_NTARIFF+  " NUMERIC(18,2),  " +  EXCESS_ENERGY_MULTIPLE_NTARIFF+  " NUMERIC(18,2) ,  " +  TMC_SLAB1_FROM+  " NUMERIC(18,0) ,  " +  TMC_SLAB1_TO+  " NUMERIC(18,0) ,  " +  TMC_SLAB1_RATE+  " NUMERIC(18,0) ,  " +  TMC_SLAB2_FROM+  " NUMERIC(18,0),  " +  TMC_SLAB2_TO+  " NUMERIC(18,0) ,  " +  TMC_SLAB2_RATE+  " NUMERIC(18,0),  " +  TMC_SLAB3_FROM+  " NUMERIC(18,0),  " +  TMC_SLAB3_TO+  " NUMERIC(18,0) ,  " +  TMC_SLAB3_RATE+  " NUMERIC(18,0),  " +  LATE_FEE_RATE+  " NUMERIC(18,2) ,  " + CHANGE_NAME_CHARGE+  " NUMERIC(18,0),  "+TMC_REC_ID+" NUMERIC(18,0)," +SGST+"  NUMERIC(10,2), " +CGST+"  NUMERIC(10,2) )");

            db.execSQL(" CREATE TABLE " + USER_MASTER + "(" + B_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + USER_NAME + "  NVARCHAR ," + DEVICE_ID + " NVARCHAR(50)," + IMEI_1 + " NVARCHAR(50)," + IMEI_2 + " NVARCHAR(50) ," + PASSWORD + " NVARCHAR(5), "+MR_DESG+" NVARCHAR (25), "+MR_STATUS+" NVARCHAR (25) )");

            db.execSQL(" CREATE TABLE " + CONSUMER_MASTER + "(" + B_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,  " + SUB_DIV_CODE + "  NVARCHAR(50),    " + AC_ID + "  NVARCHAR(50) ,    " + METER_ID + "  NVARCHAR(50),    " + METER_MAKE + "  NVARCHAR(50),    " + MAIN_MF + "  NUMERIC(18, 2),    " + METER_ID2 + "  NVARCHAR(50),    " + METER_MAKE2 + "  NVARCHAR(50),    " + POLE_MF + "  NVARCHAR(50),    " + SUPPLY_VOLTAGE + "  NUMERIC(18, 3),    " + SUPPLY_VOLTAGE_UNIT + "  NVARCHAR(10),    " + SUPPLY_TYPE + "  NVARCHAR(50),    " + WATTAGE + "  NUMERIC(18, 0),    " + NAME + "  NVARCHAR(100),    " + ADDRESS + "  NVARCHAR(500),    " + FATHER_NAME + "  NVARCHAR(100),    " + CONTACT_NO + "  NVARCHAR(10),    " + ALT_CONTACT_NO + "  NVARCHAR(10),    " + HOUSE_SEQ_NO + "  NVARCHAR(50),    " + CONS_TYPE + "  NVARCHAR(50),    " + CONTRACT_DEMAND + "  NUMERIC(18, 2),    " + CONTRACT_DEMAND_UNIT + "  NVARCHAR(10),    " + CONSUMER_STATUS + "  NVARCHAR(10),    " + PROCESS + "  NVARCHAR(50),    " + SUBSTATION_NAME + "  NVARCHAR(50),    " + FEEDER_NAME + "  NVARCHAR(50),    " + DT + "  NVARCHAR(50),    " + DOC + "  DATETIME,    " + HT_LT + "  NVARCHAR(5),    " + METER_RENT_MONTHLY + "  NUMERIC(18, 0),    " + LOCK_ARREAR + "  NUMERIC(18, 2),    " + RURAL_URBAN_CODE + "  NVARCHAR(2),    " + OPTED_OFFSEASON + "  NVARCHAR(2),    " + OFFSEASON_PERIOD_FROM + "  DATETIME,    " + OFFSEASON_PERIOD_TO + "  DATETIME,    " + AREA + "  NVARCHAR(100),    " + MR_CODE + "  NVARCHAR(50),    " + BILL_STATUS + "  NVARCHAR(50),    " + BILL_DATE + "  DATETIME,    " + BILL_NO + "  NVARCHAR(50),    " + TOTAL_PAY_AMT_PRV_MNTH + "  NUMERIC(18, 0),    " + LAST_PAY_DATE_PRV_MNTH + "  DATETIME,    " + OPENING_READING_KWH + "  NUMERIC(18, 3),    " + CLOSING_READING_KWH + "  NUMERIC(18, 3),    " + OPENING_READING_KVAH + "  NUMERIC(18, 3),    " + CLOSING_READING_KVAH + "  NUMERIC(18, 3),    " + OPENING_READING_KVAH_TOD1 + "  NUMERIC(18, 3),    " + CLOSING_READING_KVAH_TOD1 + "  NUMERIC(18, 3),    " + OPENING_READING_KVAH_TOD2 + "  NUMERIC(18, 3),    " + CLOSING_READING_KVAH_TOD2 + "  NUMERIC(18, 3),    " + OPENING_READING_KVAH_TOD3 + "  NUMERIC(18, 3),    " + CLOSING_READING_KVAH_TOD3 + "  NUMERIC(18, 3),    " + METERED_UNITS + "  NUMERIC(18, 3),  " + BILLING_UNITS + "  NUMERIC(18, 3)  ," + METERED_TOD1 + "  NUMERIC(18, 3),    " + METERED_TOD2 + "  NUMERIC(18, 3),    " + METERED_TOD3 + "  NUMERIC(18, 3)," + BILLING_TOD1 + "  NUMERIC(18, 3),    " + BILLING_TOD2 + "  NUMERIC(18, 3),    " + BILLING_TOD3 + "  NUMERIC(18, 3), " + METERED_DEMAND + "  NUMERIC(18, 3) ,    " + BILLING_DEMAND + "  NUMERIC(18, 3),    " + MDMD_80PERC_11MNTH + "  NUMERIC(18, 3),    " + DMD_75PERC_CL + "  NUMERIC(18, 3),    " + CONSUMPTION_SLAB1_CH + "  NUMERIC(18, 2),    " + CONSUMPTION_SLAB2_CH + "  NUMERIC(18, 2),    " + CONSUMPTION_SLAB3_CH + "  NUMERIC(18, 2),    " + TOT_CONSUMPTION_CHARGE + "  NUMERIC(18, 2),    " + CONSUMPTION_TOD1_CH + "  NUMERIC(18, 2),    " + CONSUMPTION_TOD2_CH + "  NUMERIC(18, 2),    " + CONSUMPTION_TOD3_CH + "  NUMERIC(18, 2),    " + TOT_CONSUMPTION_TOD_CHARGE + "  NUMERIC(18, 2),    " + DEMAND_CHARGE + "  NUMERIC(18, 2),    " + EXCESS_DEMAND_PENALITY + "  NUMERIC(18, 2),    " + EXC_CP_SLAB1_CH + "  NUMERIC(18, 2),    " + EXC_CP_SLAB2_CH + "  NUMERIC(18, 2),    " + EXC_CP_SLAB3_CH + "  NUMERIC(18, 2),    " + TOT_EXCESS_CONSUMPTION_PENALITY + "  NUMERIC(18, 2),    " + PF + "  NUMERIC(18, 2),    " + COMPENSATION_LOW_PF_CH + "  NUMERIC(18, 2),    " + MISC_CHARGE1 + "  NUMERIC(18, 2),    " + MISC_REMARK1 + "  NVARCHAR(500),    " + MISC_CHARGE2 + "  NUMERIC(18, 2),    " + MISC_REMARK2 + "  NVARCHAR(500),    " + ELECTRICITY_DUTY + "  NUMERIC(18, 2),    " + ADJ_AMOUNT + "  NUMERIC(18, 2),    " + ADJ_REMARK + "  NVARCHAR(500),    " + METER_RENT + "  NUMERIC(18, 0),    " + CURRENT_BILL + "  NUMERIC(18, 2),    " + ARREAR_COUNT + "  NUMERIC(18, 0),    " + ARR_PYR + "  NUMERIC(18, 2),    " + EDARR_PYR + "  NUMERIC(18, 2),    " + ARRSUR_PYR + "  NUMERIC(18, 2),    " + ARR_CYR + "  NUMERIC(18, 2),    " + EDARR_CYR + "  NUMERIC(18, 2),    " + ARRSUR_CYR + "  NUMERIC(18, 2),    " + CURBILL_SUR + "  NUMERIC(18, 2),    " + REBATE + "  NUMERIC(18, 2),    " + SECURITY_INTEREST_TDS + "  NUMERIC(18, 2),    " + GROSS_TOTAL + "  NUMERIC(18, 2),    " + NET_BILL + "  NUMERIC(18, 0),    " + TOTAL_PAY_AMT_CUR_MNTH + "  NUMERIC(18, 0),    " + LAST_PAY_DATE_CUR_MNTH + "  DATETIME,  " +
                    " "+BILL_MADE +" NVARCHAR(1), "+METER_STATUS+" NVARCHAR(50) ,"+METER_MF+" NUMERIC(18, 2) , " + READ_DATE_PRV+ " DATETIME, " + READ_DATE_CUR+ " DATETIME ,"+BILLING_DAYS+" NUMERIC(18, 0) ,"+BILLING_PERIOD+" NUMERIC(18, 0),"+KVAH_TODSLAB1_ENERGY_CUR+" NUMERIC(18, 3) ,"+KVAH_TODSLAB2_ENERGY_CUR+" NUMERIC(18, 3),"+KVAH_TODSLAB3_ENERGY_CUR+" NUMERIC(18, 3) ,"+KVAH_TODSLAB4_ENERGY_CUR+" NUMERIC(18, 3),"+KVAH_TODSLAB5_ENERGY_CUR+" NUMERIC(18, 3) ,"+KVAH_TODSLAB6_ENERGY_CUR+" NUMERIC(18, 3),"+KVAH_TODSLAB7_ENERGY_CUR+" NUMERIC(18, 3) ,"+KVAH_TODSLAB8_ENERGY_CUR+" NUMERIC(18, 3),"+OPENING_TOD1_ENERGY+" NUMERIC(18, 3) ,"+CLOSING_TOD1_ENERGY+" NUMERIC(18, 3),"+OPENING_TOD2_ENERGY+" NUMERIC(18, 3) ,"+CLOSING_TOD2_ENERGY+" NUMERIC(18, 3),"+OPENING_TOD3_ENERGY+" NUMERIC(18, 3) ,"+CLOSING_TOD3_ENERGY+" NUMERIC(18, 3),"+PROVISIONAL_MONTH_COUNT+" NUMERIC(18, 3) ,"+PROV_KWH_CONSUMPTION_PRV+" NUMERIC(18, 3),"+PROV_KVAH_CONSUMPTION_PRV+" NUMERIC(18, 3) ,"+PROV_KWH_CONSUMPTION_CUR+" NUMERIC(18, 3) ,"+PROV_KVAH_CONSUMPTION_CUR+" NUMERIC(18, 3),"+CONSUMPTION_SLAB4_CHRG+" NUMERIC(18, 2),"+PROV_CHRG_PRV+" NUMERIC(18, 2),"+PROV_CHRG_CUR+" NUMERIC(18, 2),"+EXC_CP_SLAB4_CHRG+" NUMERIC(18, 2),"+ED_SLAB1_CHRG+" NUMERIC(18, 2),"+ED_SLAB2_CHRG+" NUMERIC(18, 2),"+ED_SLAB3_CHRG+" NUMERIC(18, 2),"+PROV_TOT_ED_CHRG_PRV+" NUMERIC(18, 2),"+PROV_TOT_ED_CHRG_CUR+" NUMERIC(18, 2), "+PROV_SUR_PRV+" NUMERIC(18, 2),"+PROV_SUR_CUR+" NUMERIC(18, 2), "+FINAL_BILL+" NUMERIC(18, 2),  "+CON_REC_ID+" NUMERIC(18, 0),   "+ ZONE+"  NVARCHAR(50),   "+ CIRCLE+"  NVARCHAR(50),   "+ DISCOM+"  NVARCHAR(50),   "+SUB_DIV_NAME+"  NVARCHAR(50),   "+DIV_NAME+"  NVARCHAR(50),    "+SECURITY_AMOUNT+"  NUMERIC(18, 2),    "+SEC_DEPOSIT_DT+"  DATETIME,   "+CITY_VILLAGE+"  NVARCHAR(50),    "+BILL_DATE_EXPECTED+"  DATETIME,    "+BILL_DUE_DATE+"  DATETIME,    "+BILL_DISCON_DATE+"  DATETIME ,    "+BILL_START_DATE+"  DATETIME,    "+BILL_END_DATE+"  DATETIME ,    "+EXCESS_DEMAND+"  NUMERIC(18, 3),    "+EXCESS_UNITS+"  NUMERIC(18, 3),    "+ADJ_UNITS+"  NUMERIC(18, 0),    "+AVG_CONSUMPTION_6M+"  NUMERIC(18, 0),    "+MEPDCL_ARREAR+"  NUMERIC(18, 2),    "+CON_UPLOAD+"  NVARCHAR(5) ,  "+TXN_DATE_TIME+"  DATETIME ,    "+LAT+"  NVARCHAR(30),    "+LNG+"  NVARCHAR(30),    "+IMEI+"  NVARCHAR(20),    "+MRNAME+"  NVARCHAR(30),    "+MRCODE+"  NVARCHAR(10),    "+READING_IMAGE+"  BLOB,    "+DEMAND_IMAGE+"  BLOB,    "+SIGN_IMAGE+"  BLOB,    "+BANK_NAME+"  NVARCHAR(50),    "+BANK_CODE+"  NVARCHAR(20),    "+CHEQUE_NO+"  NVARCHAR(20),    "+CHEQUE_DATE+"  DATE,    "+CHEQUE_AMOUNT+"  NUMERIC(18, 2),    "+CHEQUE_MICR_NO+"  NVARCHAR(25),    "+PAYMENT_TAG+"  NVARCHAR(2),    "+EXCEPTION_IMAGE+"  BLOB,    "+LATE_PAYMENT_SUR_PRV+"  NUMERIC(18, 2),    "+LATE_PAYMENT_SUR_CUR+"  NUMERIC(18, 2),    "+MEPDCL_ARREAR_PAY_TAG+"  NVARCHAR(2),    "+MEPDCL_ARREAR_PAY_AMT+"  NUMERIC(18, 2),    "+CASH_AMOUNT+"  NUMERIC(18, 2),  " + OLD_AC_ID + "  NVARCHAR(50),  " + PHASE + "  NVARCHAR(50),  " + ADDL_UNITS + "  NUMERIC(18, 2),  " + FPPPA_CHRG + "  NUMERIC(18, 2),  " + TMC_CHRG + "  NUMERIC(18, 2),  " + LAST_MONTH_EXTRA_PAYMENT + "  NUMERIC(18, 2),  " + LAST_PAY_RCPT_PRV_MNTH + "  NVARCHAR(50),  " + METER_CAPACITY + "  NVARCHAR(50),  " + LT_POLE + "  NVARCHAR(50),  " + METER_ST + "  NVARCHAR(50),  " + NEW_METER_NO + "  NVARCHAR(50),  " + NEW_MOB_NO + "  NVARCHAR(10), " + BILL_RND_NO + "  NVARCHAR(13), " +CAT_ID+"  NVARCHAR(13), " +AVG_6M+"  NVARCHAR(13)," +BPLU_MET+"  NVARCHAR(13), " +BPLU_READ+"  NVARCHAR(13), " +BILL_MADE_DEVICE+"  NVARCHAR(5)," +AVAIL_KVAH+"  NVARCHAR(5)," +SGST_PER+"  NUMERIC(10,2), " +CGST_PER+"  NUMERIC(10,2), " +Remaining_advance_pmt+"  NUMERIC(10,2)," +Last_Bill_Payment_Credit+"  NUMERIC(10,2), " +Fixcharge_Period+"  NUMERIC(10), " +Unpaid_Bill_Amt+"  NUMERIC(10,2),   " + Unpaid_Bill_Due_Date + "  NVARCHAR(50),    " + Last_Bill_InvoiceNo + "  NVARCHAR(50),    " + BILL_MADE_BY_SAI + "  NVARCHAR(50)) ");

            db.execSQL("CREATE TABLE "  + B_VERSION_MST + "   ( " + B_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + B_VERSION_DT_MST + " INTEGER )");

            db.execSQL("CREATE TABLE "  + B_BANK_MST + "   ( " + B_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + B_BANK_NAME + " NVARCHAR(250), "+B_BANK_CODE+" NVARCHAR(20) ,"+B_REC_NO+" NUMERIC(18, 0))");

            db.execSQL("CREATE TABLE "  + LT_POLE_MST + "   ( " + L_REC_NO + " INTEGER PRIMARY KEY AUTOINCREMENT, " + LT_LINE + " NVARCHAR(250), "+LT_NUMBER+" NVARCHAR(10))");

            db.execSQL("CREATE TABLE "  + METER_STATUS_MST + "   ( " + B_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + MS_REC_ID + " INTEGER , " + MS_METER_STATUS + " NVARCHAR(200) ,"+MS_CODE+" NVARCHAR(10))");

            db.execSQL("CREATE TABLE "  + METER_TYPE_MST + "   ( " + M_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,  " + METER_TYPE + " NVARCHAR(200)) ");

            db.execSQL("CREATE TABLE "  + DIM_DAYS_INDEX + "   ( " + D_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,  " + D_DAYS + " NVARCHAR(10),  " + B_INDEX + " NVARCHAR(10),  " + R_INDEX + " NVARCHAR(10)) ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL( "DROP TABLE IF EXISTS "  + "USER_MASTER" );
        db.execSQL( "DROP TABLE IF EXISTS "  + "CONSUMER_MASTER" );
        db.execSQL( " DROP TABLE  IF EXISTS " + "B_VERSION_MST ");
        db.execSQL( " DROP TABLE IF EXISTS " + " TARIFF_MST ");
        db.execSQL( " DROP TABLE IF EXISTS " + " METER_STATUS_MST ");
        db.execSQL( " DROP TABLE IF EXISTS " + " METER_TYPE_MST ");
        db.execSQL( " DROP TABLE IF EXISTS " + " DIM_DAYS_INDEX ");
        db.execSQL( " DROP TABLE IF EXISTS " + " LT_POLE_MST ");
    }
}
