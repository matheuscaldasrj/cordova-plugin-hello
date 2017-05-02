package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import org.joda.time.DateTime;

import android.content.Context;
import com.samsung.multiscreen.Search;
import org.tecgraf.automation.SmartView;
import com.samsung.multiscreen.Service;


public class Hello extends CordovaPlugin {

    private SmartView sm;

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        final CallbackContext cbc = callbackContext;

        if(sm==null){
            Context context = this.cordova.getActivity().getApplicationContext();
            sm = new SmartView(context);
        }
        if (action.equals("greet")) {
            String str = data.getString(0);
            String message = "Native code in java + parameter: " + str;
            callbackContext.success(message);
            return true;

        } else if (action.equals("getMonth")) {
            DateTime dt = new DateTime();
            String monthName = dt.monthOfYear().getAsText();
            callbackContext.success(monthName);
            return true;

        } else if(action.equals("search")){
            String targetAddress = data.getString(0);
            boolean res = sm.search(targetAddress);
            sm.setOnSearchFoundTarget(
              new Search.OnServiceFoundListener() {
                @Override
                public void onFound(Service service) {
                    cbc.success("Achei a TV");
                    sm.stopSearch();
                }
              }
            );
            if(!res){
                callbackContext.error("Ja esta em modo de busca");
            }
            return res;
        }
        else{
            return false;
        }
    }
}
