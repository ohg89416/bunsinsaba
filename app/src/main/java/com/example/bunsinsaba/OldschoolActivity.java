package com.example.bunsinsaba;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class OldschoolActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldschool);

        Button enterBtn = findViewById(R.id.enter);
        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OldschoolActivity.this, StartActivity.class);
                startActivity(intent);
            }
            
            {
        Button noenterbtn = findViewById(R.id.noenter);
            noenterbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(OldschoolActivity.this);
                    builder.setMessage("지금 종료하면 후회할지 몰라요...\n 그래도 종료하시겠습니까?");
                    builder.setTitle("게임 종료창")
                            .setCancelable(false)
                            .setPositiveButton("그만둘래", new DialogInterface.OnClickListener() {
                                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    moveTaskToBack(true);
                                    finishAndRemoveTask();
                                    System.exit(0);

                                }
                            })
                            .setNegativeButton("도전!", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int i) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.setTitle("게임 종료창");
                    alert.show();

                }
            });

            }

        });
    }
}