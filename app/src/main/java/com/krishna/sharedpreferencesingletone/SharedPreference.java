package com.krishna.sharedpreferencesingletone;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;

public class SharedPreference {

    private static final String SHARED_NAME = "ASCII";
    private SharedPreferences sharedPreference;
    private SharedPreferences.Editor editor;
    private static Preference mInstancePreference;


    private static final String firstName = "First Name";
    private static final String lastName = "Last Name";
    private static final String email = "Email";
    private static final String isLogin = "isLogin";


    public SharedPreference(Context context) {
        sharedPreference = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharedPreference.edit();
        editor.putInt(SHARED_NAME, 0);
        editor.apply();

    }

    public static Preference getmInstancePreference(Context context) {
        if (mInstancePreference == null) {
            mInstancePreference = new Preference(context);
        }
        return mInstancePreference;
    }

    public void setFirstName(String fName) {
        editor.putString(firstName, fName).commit();
    }

    public String getFirstName() {
        return sharedPreference.getString(firstName, "");
    }

    public void setLastName(String lName) {
        editor.putString(lastName, lName).commit();
    }

    public String getLastName() {
        return sharedPreference.getString(lastName, "");
    }

    public void setEmail(String emailId) {
        editor.putString(email, emailId).commit();
    }

    public String getEmail() {
        return sharedPreference.getString(email, "");
    }

    public void setIsLogin(boolean login) {
        editor.putBoolean(isLogin, login).commit();
    }

    public boolean getIsLogin() {
        return sharedPreference.getBoolean(isLogin, false);
    }


}