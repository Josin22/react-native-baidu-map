package org.lovebing.reactnative.baidumap;

import com.facebook.react.bridge.ReactApplicationContext;

/**
 * Created by zachary on 2/9/2016.
 */
public class BaiduMapModule extends com.lovebing.reactnative.baidumap.BaseModule {

    private static final String REACT_CLASS = "BaiduMapModule";
    public BaiduMapModule(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;
    }

    public String getName() {
        return REACT_CLASS;
    }
}
