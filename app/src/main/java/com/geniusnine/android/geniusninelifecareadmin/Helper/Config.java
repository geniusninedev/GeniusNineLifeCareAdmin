package com.geniusnine.android.geniusninelifecareadmin.Helper;

/**
 * Created by Dev on 13-01-2017.
 */

public class Config {
    public static final String BASE_URL="http://192.168.0.185/GeniusNineLifeCareServices/";
    //URL to our login.php file
    public static final String LOGIN_URL = BASE_URL+"patientlogin.php";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "geniusninelifecareapp";

    //This would be used to store the email of current logged in user
    public static final String PATIENT_EMAIL_SHARED_PREF = "patient_email";
    //This would be used to store the mobile of current logged in user
    public static final String PATIENT_MOBILE_NO_SHARED_PREF = "patient_mobile";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String PATIENT_LOGGEDIN_SHARED_PREF = "loggedin";

    //URL to our insertpatient.php file
    public static final String PATINET_REGISTER_URL = BASE_URL+"insertpatient.php";
    public static final String COLUMN_PATIENT_ID = "patient_id";
    public static final String COLUMN_PATIENT_PROFILE_PICTURE = "patient_profile_picture";
    public static final String COLUMN_PATIENT_NAME = "patient_name";
    public static final String COLUMN_PATIENT_MOBILE = "patient_mobile";
    public static final String COLUMN_PATIENT_PASSWORD = "patient_password";
    public static final String COLUMN_PATIENT_EMAIL = "patient_email";
    public static final String COLUMN_PATIENT_GENDER = "patient_gender";
    public static final String COLUMN_PATIENT_AGE = "patient_age";
    public static final String COLUMN_PATIENT_HEIGHT = "patient_height";
    public static final String COLUMN_PATIENT_WEIGHT = "patient_weight";
    public static final String COLUMN_PATIENT_BLOOD_GROUP = "patient_blood_group";
    public static final String COLUMN_PATIENT_ADDRESS = "patient_address";
    public static final String COLUMN_PATIENT_PINCODE = "patient_pincode";
    public static final String COLUMN_PATIENT_REGISRTION_DATE = "date";
}
