package com.example.user.ex_2.SQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 2020/7/9.
 */

public class SqliteDatabaseHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME= "exDB.db";
    private static final String TABLE_NAME= "ex_table";
    private static final String COLUMN_ID= "_id";
    private static final String COLUMN_ACCOUNT= "ACCOUNT";
    private static final String COLUMN_PASSWORD= "PASSWORD";
    private static final String COLUMN_LOGINTIME= "LOG_IN_TIME";

    public SqliteDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE IF NOT EXISTS "+
                        TABLE_NAME+ " ( "+
                        COLUMN_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT , "+
                        COLUMN_ACCOUNT+ " TEXT DEFAULT null , "+
                        COLUMN_PASSWORD+ " TEXT DEFAULT null , "+
                        COLUMN_LOGINTIME+ " TEXT DEFAULT null );"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(
                "DROP TABLE IF EXISTS "+ TABLE_NAME+ " ; "
        );
    }

    public void insertData(TableData data){
        SQLiteDatabase db= this.getWritableDatabase();
        db.execSQL(
                "INSERT INTO "+ TABLE_NAME+ " VALUES ( "+
                        data.getAccount()+ " , "+
                        data.getPassword()+ " , "+
                        data.getLogInTime()
        );
    }

    public TableData selectData(int id){
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor cursor= db.rawQuery(
                "SELECT * FROM "+ TABLE_NAME
                , null);
        TableData data = null;
        if(cursor.move(id)){
            data.setId(cursor.getInt(0));
            data.setAccount(cursor.getString(1));
            data.setPassword(cursor.getString(2));
            data.setLogInTime(cursor.getString(3));
        }
        return data;
    }
}
