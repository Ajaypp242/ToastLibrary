package com.example.mylibrary2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static ToastActivity getInstance(){
        ToastActivity toastActivity = new ToastActivity();
        return toastActivity;
    }



    public  void startActivityChat (Context context){

        Intent i= new Intent(ToastActivity.this ,ChatActivity.class);
        ((Activity)context). startActivity(i);

    }



}
