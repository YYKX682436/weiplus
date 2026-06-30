package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class NavigationChannel {
    private static final java.lang.String TAG = "NavigationChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    private final io.flutter.plugin.common.MethodChannel.MethodCallHandler defaultHandler;

    public NavigationChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.NavigationChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                result.success(null);
            }
        };
        this.defaultHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/navigation", io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void popRoute() {
        io.flutter.Log.v(TAG, "Sending message to pop route.");
        this.channel.invokeMethod("popRoute", null);
    }

    public void pushRoute(java.lang.String str) {
        io.flutter.Log.v(TAG, "Sending message to push route '" + str + "'");
        this.channel.invokeMethod("pushRoute", str);
    }

    public void pushRouteInformation(java.lang.String str) {
        io.flutter.Log.v(TAG, "Sending message to push route information '" + str + "'");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.LOCATION, str);
        this.channel.invokeMethod("pushRouteInformation", hashMap);
    }

    public void setInitialRoute(java.lang.String str) {
        io.flutter.Log.v(TAG, "Sending message to set initial route to '" + str + "'");
        this.channel.invokeMethod("setInitialRoute", str);
    }

    public void setMethodCallHandler(io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler) {
        this.channel.setMethodCallHandler(methodCallHandler);
    }
}
