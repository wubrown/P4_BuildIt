package com.udacity.gradle.builditbigger;


import android.content.Intent;
import android.test.mock.MockContext;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by Bill on 10/19/2017.
 * Helped by hjosen discussion:
 * https://discussions.udacity.com/t/async-task-test-where-to-even-begin/159593/23
 */

public class GetJokeAsyncTaskTest {
   @Test
    public void taskResultTest() throws InterruptedException, ExecutionException, TimeoutException {
       MockContext mockContext = new MockContext() {
           @Override
           public String getPackageName() {
               return "com.udacity.gradle.builditbigger";
           }

           @Override
           public void startActivity(Intent intent) {
               // intentionally empty
           }
       };
       String result = new GetJokeAsyncTask() {
           @Override
           protected void onPostExecute(String result) {
           }
       }.execute(mockContext).get(20, TimeUnit.SECONDS);
       Assert.assertNotNull(result);
    }
}
