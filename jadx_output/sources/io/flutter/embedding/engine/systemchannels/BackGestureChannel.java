package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class BackGestureChannel {
    private static final java.lang.String TAG = "BackGestureChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    private final io.flutter.plugin.common.MethodChannel.MethodCallHandler defaultHandler;

    public BackGestureChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.BackGestureChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                result.success(null);
            }
        };
        this.defaultHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/backgesture", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    private java.util.Map<java.lang.String, java.lang.Object> backEventToJsonMap(android.window.BackEvent backEvent) {
        java.util.HashMap hashMap = new java.util.HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (java.lang.Float.isNaN(touchX) || java.lang.Float.isNaN(touchY)) ? null : java.util.Arrays.asList(java.lang.Float.valueOf(touchX), java.lang.Float.valueOf(touchY)));
        hashMap.put("progress", java.lang.Float.valueOf(backEvent.getProgress()));
        hashMap.put("swipeEdge", java.lang.Integer.valueOf(backEvent.getSwipeEdge()));
        return hashMap;
    }

    public void cancelBackGesture() {
        io.flutter.Log.v(TAG, "Sending message to cancel back gesture");
        this.channel.invokeMethod("cancelBackGesture", null);
    }

    public void commitBackGesture() {
        io.flutter.Log.v(TAG, "Sending message to commit back gesture");
        this.channel.invokeMethod("commitBackGesture", null);
    }

    public void setMethodCallHandler(io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler) {
        this.channel.setMethodCallHandler(methodCallHandler);
    }

    public void startBackGesture(android.window.BackEvent backEvent) {
        io.flutter.Log.v(TAG, "Sending message to start back gesture");
        this.channel.invokeMethod("startBackGesture", backEventToJsonMap(backEvent));
    }

    public void updateBackGestureProgress(android.window.BackEvent backEvent) {
        io.flutter.Log.v(TAG, "Sending message to update back gesture progress");
        this.channel.invokeMethod("updateBackGestureProgress", backEventToJsonMap(backEvent));
    }
}
