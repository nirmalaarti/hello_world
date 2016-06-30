package com.example.dcdc.layoutanim1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main2Activity extends AppCompatActivity implements Animation.AnimationListener{

    RelativeLayout rvl1,rvl2;
    LinearLayout l1;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        b=(Button)findViewById(R.id.button);
        l1=(LinearLayout)findViewById(R.id.ll1);
        rvl1=(RelativeLayout)findViewById(R.id.rl1);
        rvl2=(RelativeLayout)findViewById(R.id.rl2);
        overridePendingTransition(0,0);
        Animation hide = AnimationUtils.loadAnimation(this, R.anim.slide_in_top);
        hide.setAnimationListener(this);
        rvl1.startAnimation(hide);

        overridePendingTransition(0,0);
        Animation hide1 = AnimationUtils.loadAnimation(this, R.anim.slideintop1);
        hide.setAnimationListener(this);
        rvl2.startAnimation(hide1);

        overridePendingTransition(0,0);
        Animation hide2=AnimationUtils.loadAnimation(this,R.anim.slide_in_left);
        b.startAnimation(hide2);

     /*overridePendingTransition(0,0);
        Animation hide3=AnimationUtils.loadAnimation(this,R.anim.bounce_animation);
        b.startAnimation(hide3);*/


        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.e("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

}
