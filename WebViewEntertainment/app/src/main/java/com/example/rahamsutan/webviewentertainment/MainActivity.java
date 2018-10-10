package com.example.rahamsutan.webviewentertainment;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button movlist,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       movlist =(Button)findViewById(R.id.bMovieList);
       about =(Button)findViewById(R.id.bAbout);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(v.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.alert_layout);
                Button dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
       movlist.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {
               Intent iMov = new Intent(getApplicationContext(), MovlistActivity.class);
               startActivity(iMov);
           }
       });
    }


}
