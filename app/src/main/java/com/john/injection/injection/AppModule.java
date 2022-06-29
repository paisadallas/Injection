package com.john.injection.injection;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String someString(){
        return "This is a string";
    }

    @Provides
    static boolean getApp(Application application){
        return application == null;
    }

}
