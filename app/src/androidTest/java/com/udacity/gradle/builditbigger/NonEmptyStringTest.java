package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by ashpro on 04/07/16.
 */
public class NonEmptyStringTest extends AndroidTestCase {

    private static final String TAG = "NonEmptyStringTest";

    @SuppressWarnings("unchecked")
    public void test() {

        // Testing that Async task successfully retrieves a non-empty string
        // You can test this from androidTest -> Run 'All Tests'
        Log.i(TAG, "zz Running NonEmptyStringTest test");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), "test");
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.i(TAG, "zz Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
