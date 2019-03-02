package com.example.mylibrary2;

import android.content.Context;
import android.widget.Toast;

public class ToastActivity {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
