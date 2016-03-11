/**
 * Common Functions
 * Author 	: Jitesh Rana <jhrana@gmail.com>
 * Company 	: Differenz Systems
 * Date		: 7-May-2014
 */
package com.varshaaweblabs.event.utility;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

import com.varshaaweblabs.event.R;


public class CommonFunctions {

    public static String errMessage = "";
    static String tag = "CommonFunctions :";
    /**
     * Create Progress bar
     */

    static ProgressDialog pd;

    /**
     * Check Internet connection available or not
     *
     * @return
     */


    @SuppressLint("NewApi")
    public static void alertboxshow(final Activity activity) {
        // TODO Auto-generated method stub
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(
                    activity, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
            builder.setTitle(activity.getResources().getString(R.string.app_name));

            //	builder.setIcon(R.drawable.iconlogo);
            builder.setMessage("Do you want to exit?");

            builder.setPositiveButton("YES",
                    new OnClickListener() {
                        @SuppressLint("InlinedApi")
                        public void onClick(DialogInterface dialog, int which) {
                            // System.exit(0);
                            // Home.this.finish();

                            final Intent relaunch = new Intent(activity,
                                    Exiter.class)
                                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                                            | Intent.FLAG_ACTIVITY_CLEAR_TASK
                                            | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

                            activity.startActivity(relaunch);
                            activity.finish();

                        }
                    });
            builder.setNegativeButton("NO",
                    new OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });

            AlertDialog dialog = builder.create();
            dialog.show();
        } catch (Exception e) {
            // TODO: handle exception
          //  Logger.debugE("Login", e + "");
        }
    }

    }
