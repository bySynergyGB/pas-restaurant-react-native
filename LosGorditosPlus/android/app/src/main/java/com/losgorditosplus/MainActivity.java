package com.losgorditosplus;

import com.facebook.react.ReactActivity;
import com.airbnb.android.react.maps.MapsPackage;

public class MainActivity extends ReactActivity {

    public static MainActivity mainActivity = null;

	public MainActivity() {
	    mainActivity = this;
	}
    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "LosGorditosPlus";
    }
}