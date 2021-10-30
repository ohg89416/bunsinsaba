package com.example.bunsinsaba;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    //변수 선언
    Animation ghost_hand_move;
    ImageView ghosthandleft;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //리소스할당
        ghost_hand_move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ghostbiggersmaller);
        ghosthandleft = findViewById(R.id.ghosthandleft);

        //버튼 누르면 애니메이션 실행
        ghosthandleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ghosthandleft.startAnimation(ghost_hand_move);

            }
        });
    }
}