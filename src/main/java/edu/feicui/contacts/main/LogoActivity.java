package edu.feicui.contacts.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/8/9.
 */
public class LogoActivity extends AppCompatActivity {
    private ImageView img_logo;
    private Animation animation;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        img_logo=(ImageView)findViewById(R.id.iv_logo);
        animation= AnimationUtils.loadAnimation(this,R.anim.anim_logo);
        Animation.AnimationListener animationListenner=new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

                Intent intent=new Intent(LogoActivity.this,TelmsgActivity.class);
                startActivity(intent);
                finish();
            }
        };
        animation.setAnimationListener(animationListenner);
        img_logo.startAnimation(animation);
    }
}