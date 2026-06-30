package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class KeyboardChannel {
    public final io.flutter.plugin.common.MethodChannel channel;
    private io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler keyboardMethodHandler;
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodHandler;

    /* loaded from: classes15.dex */
    public interface KeyboardMethodHandler {
        java.util.Map<java.lang.Long, java.lang.Long> getKeyboardState();
    }

    public KeyboardChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.KeyboardChannel.1
            java.util.Map<java.lang.Long, java.lang.Long> pressedState = new java.util.HashMap();

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                if (io.flutter.embedding.engine.systemchannels.KeyboardChannel.this.keyboardMethodHandler == null) {
                    result.success(this.pressedState);
                    return;
                }
                java.lang.String str = methodCall.method;
                str.getClass();
                if (!str.equals("getKeyboardState")) {
                    result.notImplemented();
                    return;
                }
                try {
                    this.pressedState = io.flutter.embedding.engine.systemchannels.KeyboardChannel.this.keyboardMethodHandler.getKeyboardState();
                } catch (java.lang.IllegalStateException e17) {
                    result.error("error", e17.getMessage(), null);
                }
                result.success(this.pressedState);
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "flutter/keyboard", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setKeyboardMethodHandler(io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler keyboardMethodHandler) {
        this.keyboardMethodHandler = keyboardMethodHandler;
    }
}
