package com.example.user.ex_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.user.ex_2.SQLite.TableData;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_logIn;
    private TableData tableData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_logIn= findViewById(R.id.bt_logIn);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_logIn:

        }
    }









    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.touch:
                Toast.makeText(MainActivity.this, "touch", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}
