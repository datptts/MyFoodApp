package com.example.myfoodapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String databaseName = "Register.db";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "Register.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {

        MyDatabase.execSQL("create Table allusers(username TEXT primary key, password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDatabase, int i, int i1) {

        MyDatabase.execSQL("drop Table if  exists allusers");

    }

    public Boolean insertData(String username,String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result = MyDatabase.insert("allusers",null,contentValues);

        if (result == -1){
            return false;
        }else {
            return true;
        }
    }

    public Boolean checkUserName(String username){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from allusers where username = ?", new String[]{username});

        if(cursor.getCount()>0) {
            return true;
        }else {
            return false;
        }

    }

    public Boolean checkUserNamePassword(String username,String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from allusers where username = ? and password = ?", new String[]{username, password});
        if(cursor.getCount()>0) {
            return true;
        }else {
            return false;
        }
    }

}
