package com.lib.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static final void simpleToast(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
