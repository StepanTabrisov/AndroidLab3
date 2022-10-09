package com.example.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import java.sql.Array;
import java.util.ArrayList;

public class EnterToApp extends Activity {

    String[] sendData = new String[]{"1", "2", "3", "4", "5"};

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ON START", "Start");
        setContentView(R.layout.enter_scene);

        Button enter = findViewById(R.id.enterBtn);
        EditText inName = findViewById(R.id.inputName);
        EditText inPsw = findViewById(R.id.inputPassword);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle data = new Bundle();
        data.putStringArray("key", sendData);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtras(data);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ON CREATE", "Create");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ON PAUSE", "Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ON RESUME", "Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ON DESTROY", "Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ON StOP", "Stop");
    }
}
