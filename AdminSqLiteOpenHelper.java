/**
 * Created by Wendyriega on 21/09/17.
 */
package com.example.wendyriega.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class AdminSqLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSqLiteOpenHelper(Context context, String nombre, SQLiteDatabase.CursorFactory factory, int version) {

        super(context, nombre, factory, version);

    }

    @Override

    public void onCreate(SQLiteDatabase db) {

        //aquí creamos la tabla de usuario (dni, nombre, ciudad, numero)
        db.execSQL("create table usuario(dni integer primary key, nombre text, ciudad text, numero integer)");

    }

    @Override

    public void onUpgrade(SQLiteDatabase db, int version1, int version2) {

        db.execSQL("drop table if exists usuario");

        db.execSQL("create table usuario(dni integer primary key, nombre text, ciudad text, numero integer)");

    }
}
