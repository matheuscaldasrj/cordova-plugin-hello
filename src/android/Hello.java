package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import org.joda.time.DateTime;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {
            String str = data.getString(0);
            String message = "Codigo nativo em java " + str;
            callbackContext.success(message);
            return true;

        } else if (action.equals("getMonth")) {
            DateTime dt = new DateTime();
            String monthName = dt.monthOfYear().getAsText();
            callbackContext.success(monthName);
            return true;

        }
        else{
            return false;
        }
    }
}
