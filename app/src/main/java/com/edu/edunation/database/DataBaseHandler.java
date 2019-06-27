package com.edu.edunation.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by akashchandra on 11/24/17.
 */

public class DataBaseHandler extends SQLiteOpenHelper {

    private static final String TAG = "SQL";

    // Specifying the DATABASE VERSION
    private static final int DATABASE_VERSION = 1;

    // Specifying the database name
    private static final String DATABASE_NAME = "COUNTRY";

    // Specifying the TABLE NAME
    private static final String TABLE_NAME = "data";

    //Specifying the fields
    private static final String KEY_NAME = "userid";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_USEREMAIL = "useremail";
    private static final String KEY_USERIMGURL = "imageurl";
    private static final String KEY_LOGGED_STATE = "log_state";

    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null  , DATABASE_VERSION);
    }

    public DataBaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        /*String query = "CREATE TABLE " + TABLE_NAME + " ( " + KEY_USERID + " TEXT , "+ KEY_USERNAME + " TEXT , " + KEY_USEREMAIL + " TEXT , "
                + KEY_USERIMGURL + " TEXT , " + KEY_LOGGED_STATE + " INTEGER ) ";
        sqLiteDatabase.execSQL(query);*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
