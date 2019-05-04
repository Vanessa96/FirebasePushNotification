package com.example.vanessa.firebasepushnotification;

/**
 * Created by vanessa on 23-10-2016.
 */


        import android.app.Application;

        import com.firebase.client.Firebase;

/**
 * Created by Belal on 3/20/2016.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //Initializing firebase
        Firebase.setAndroidContext(getApplicationContext());
    }
}
