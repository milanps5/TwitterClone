package com.milanps.twitterclone;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;

/**
 * Milan Pop Stefanija
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("N3p27jepsl4eCeciMGsrXeiiziUS2otFKwmoDl8s")
                .clientKey("SOTEE9b6uTTuu0BKCKRP5I8ZNabGrr7X17YsPAni")
                .server("https://parseapi.back4app.com")
                .build()
        );
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
