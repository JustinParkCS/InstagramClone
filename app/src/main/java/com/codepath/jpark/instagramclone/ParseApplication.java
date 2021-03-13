package com.codepath.jpark.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("X1owVtgedPvxbgZ7ZH8xJCshdqGctIgnk683PqQ1")
                .clientKey("PSnQuOh5IYpuY8I9JyMOKDGAVZH4LGMWsHUG61ZJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
