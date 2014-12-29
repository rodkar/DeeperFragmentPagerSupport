package com.cloudyun.deeperfragmentpagersupport.parse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by 2013_13_mbp on 12/29/14.
 */
public class ParseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(ToDo.class);
        ParseObject.registerSubclass(CustomToDo.class);
        Parse.initialize(this, "AppID", "CliendID");
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
