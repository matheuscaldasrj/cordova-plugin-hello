package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import org.joda.time.DateTime;

public class MyClass extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("function1")) {
            String message = "Function 1 native code in java, 1st paramter: " + data.getString(0) + " 2nd parameter: " + data.getString(1);
            callbackContext.success(message);
            return true;

        } else if (action.equals("function2")) {
            String message = "Function 2 native code in java";
            callbackContext.success(message);
            return true;

        }
        else{
            return false;
        }
    }
}
