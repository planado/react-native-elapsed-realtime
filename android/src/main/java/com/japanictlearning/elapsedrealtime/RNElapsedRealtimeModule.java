
package com.japanictlearning.elapsedrealtime;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNElapsedRealtimeModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNElapsedRealtimeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNElapsedRealtime";
  }
  /**
     * Return a relative unit of time in seconds that cannot be influenced by the user
     * @param promise
     */
    @ReactMethod
    public void getElapsedRealtime(Promise promise) {
      // System time in milliseconds
      long time = android.os.SystemClock.elapsedRealtime();

      // React Native bridge complains if we try to pass back a long directly
      promise.resolve(Long.toString(time / 1000));
    }
}
