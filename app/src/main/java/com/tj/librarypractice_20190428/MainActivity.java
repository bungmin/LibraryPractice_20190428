package com.tj.librarypractice_20190428;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.tj.librarypractice_20190428.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViews();
        setupEvents();
        setValues();


    }


    @Override
    public void setupEvents() {

        act.callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Uri phoneUri = Uri.parse(String.format("tel:%s",act.phoneNumTxt.getText().toString()));
                Intent intent = new Intent(Intent.ACTION_DIAL, phoneUri);
                startActivity(intent);




            }
        });

    }

    @Override
    public void setValues() {
        Glide.with(mContext).load("https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2").into(act.pizzaLogoImgView);

    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);


    }
}
