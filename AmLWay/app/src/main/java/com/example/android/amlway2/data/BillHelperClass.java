package com.example.android.amlway2.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Abdulrhman on 23/03/2017.
 */
import com.example.android.amlway2.data.ContractBill.billEntry;

public class BillHelperClass extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "amlway.dp";
    static final int DATABASE_VERSION = 1;
    final String not_null = "NOT NULL";

    public BillHelperClass(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String SQL_CREATE = "create table " + billEntry.TABLE_NAME + " ( "
                + billEntry._ID + "integer primary key not null autoincrement, "
                + billEntry.COLUMN_CUSTOMER_NAME + " text not null "
                + billEntry.COLUMN_EMPLOYEE_NAME + " text not null, "
                + billEntry.COLUMN_FROM + " text not null, "
                + billEntry.COLUMN_TO + " text not null,"
                + billEntry.COLUMN_ELEMENT + " text not null, "
                + billEntry.COLUMN_WEIGHT + " REAL NOT NULL,"
                + billEntry.COLUMN_COUNT + " integer not null,"
                + billEntry.COLUMN_PRICE + " real not null,"
                + billEntry.COLUMN_Bill_TYPE + " text not null ); ";

        sqLiteDatabase.execSQL(SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+billEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
