package com.john.injection;

import com.john.injection.injection.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


public class BaseApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
