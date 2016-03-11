package com.varshaaweblabs.event;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;


public class EvnetList extends Activity {
   // TabHost tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_tab1);

        init();
    }

    public void init()
    {
       // tab = (TabHost)findViewById(R.id.tabs);

    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            //CommonFunctions.alertboxshow(EvnetList.this);
        }

        return super.onKeyDown(keyCode, event);
    }




}
