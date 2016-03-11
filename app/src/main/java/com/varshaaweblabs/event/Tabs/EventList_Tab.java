package com.varshaaweblabs.event.Tabs;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.varshaaweblabs.event.AddEvent.AddEvent;
import com.varshaaweblabs.event.utility.CommonFunctions;
import com.varshaaweblabs.event.EvnetList;
import com.varshaaweblabs.event.ListMap;
import com.varshaaweblabs.event.R;

/**
 * Created by Jai on 6/3/16.
 */
public class EventList_Tab extends TabActivity implements TabHost.OnTabChangeListener {

    /**
     * Called when the activity is first created.
     */
    TabHost tabHost;
    ImageView event_add_btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tab);


        //For the Custome Action Bar Design-==========================
        event_add_btn = (ImageView) findViewById(R.id.event_add_btn);

        event_add_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), AddEvent.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

//==================End of Action Bar============-==========

        /* TabHost will have Tabs */
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        /* TabSpec used to create a new tab.
         * By using TabSpec only we can able to setContent to the tab.
         * By using TabSpec setIndicator() we can set name to tab. */

        /* tid1 is firstTabSpec Id. Its used to access outside. */
        TabHost.TabSpec firstTabSpec = tabHost.newTabSpec("tid1");
        TabHost.TabSpec secondTabSpec = tabHost.newTabSpec("tid1");

        /* TabSpec setIndicator() is used to set name for the tab. */
        /* TabSpec setContent() is used to set content for a particular tab. */

        Intent in = new Intent(this, EvnetList.class);


//        in.putExtra("AppointmentId",appointmentId);


        Intent ins = new Intent(this, ListMap.class);


        firstTabSpec.setIndicator("List").setContent(in);
        secondTabSpec.setIndicator("Map").setContent(ins);

        /* Add tabSpec to the TabHost to display. */
        tabHost.addTab(firstTabSpec);
        tabHost.addTab(secondTabSpec);
        for (int j = 0; j < tabHost.getTabWidget().getChildCount(); j++) {
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(j).findViewById(android.R.id.title); //Unselected Tabs
            tv.setTextColor(Color.parseColor("#ffffff"));
        }


    }

    @Override
    public void onTabChanged(String tabId) {

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            CommonFunctions.alertboxshow(EventList_Tab.this);
        }

        return super.onKeyDown(keyCode, event);
    }


    @Override
    protected void onResume() {
        super.onResume();


        TabHost tabhost = getTabHost();
        for(int i=0;i<tabhost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#000000"));
        }
    }



}
