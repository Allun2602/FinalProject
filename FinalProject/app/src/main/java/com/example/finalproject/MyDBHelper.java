package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MyDBHelper extends SQLiteOpenHelper{
    private static final String name = "mdatabase.db";
    private static final int version = 1;

    MyDBHelper(Context context){
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE myTable(nhi integer PRIMARY KEY, ic text NOT NULL, name text NOT NULL, phone integer NOT NULL, place text NOT NULL/*, vac integer NOT NULL*/)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS myTable");

        onCreate(db);

    }
}
