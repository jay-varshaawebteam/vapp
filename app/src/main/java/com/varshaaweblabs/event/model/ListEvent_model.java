package com.varshaaweblabs.event.model;

import android.content.Context;

/**
 * Created by Jai on 6/3/16.
 */
public class ListEvent_model {

    String title, desc, date, img;
    Context context;


    public ListEvent_model(Context context) {
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Context getContext() {
        return context;
    }


}
