package com.tj.librarypractice_20190428;

import android.databinding.DataBindingUtil;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.tj.librarypractice_20190428.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();


    }


    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        Glide.with(mContext).load("https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2").into(act.pizzaLogoImgView);

    }

    @Override
    public void bindViews() {

    }
}
