package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class ScribeChannel {
    public static final java.lang.String METHOD_IS_FEATURE_AVAILABLE = "Scribe.isFeatureAvailable";
    public static final java.lang.String METHOD_IS_STYLUS_HANDWRITING_AVAILABLE = "Scribe.isStylusHandwritingAvailable";
    public static final java.lang.String METHOD_START_STYLUS_HANDWRITING = "Scribe.startStylusHandwriting";
    private static final java.lang.String TAG = "ScribeChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodHandler;
    private io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler scribeMethodHandler;

    /* loaded from: classes15.dex */
    public interface ScribeMethodHandler {
        boolean isFeatureAvailable();

        boolean isStylusHandwritingAvailable();

        void startStylusHandwriting();
    }

    public ScribeChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ScribeChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                if (io.flutter.embedding.engine.systemchannels.ScribeChannel.this.scribeMethodHandler == null) {
                    io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.ScribeChannel.TAG, "No ScribeMethodHandler registered. Scribe call not handled.");
                    return;
                }
                java.lang.String str = methodCall.method;
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.ScribeChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -705821951:
                        if (str.equals(io.flutter.embedding.engine.systemchannels.ScribeChannel.METHOD_IS_FEATURE_AVAILABLE)) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 1759284829:
                        if (str.equals(io.flutter.embedding.engine.systemchannels.ScribeChannel.METHOD_START_STYLUS_HANDWRITING)) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 2119738044:
                        if (str.equals(io.flutter.embedding.engine.systemchannels.ScribeChannel.METHOD_IS_STYLUS_HANDWRITING_AVAILABLE)) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        io.flutter.embedding.engine.systemchannels.ScribeChannel.this.isFeatureAvailable(methodCall, result);
                        return;
                    case 1:
                        io.flutter.embedding.engine.systemchannels.ScribeChannel.this.startStylusHandwriting(methodCall, result);
                        return;
                    case 2:
                        io.flutter.embedding.engine.systemchannels.ScribeChannel.this.isStylusHandwritingAvailable(methodCall, result);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/scribe", io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isFeatureAvailable(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        try {
            result.success(java.lang.Boolean.valueOf(this.scribeMethodHandler.isFeatureAvailable()));
        } catch (java.lang.IllegalStateException e17) {
            result.error("error", e17.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isStylusHandwritingAvailable(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            result.error("error", "Requires API level 34 or higher.", null);
            return;
        }
        try {
            result.success(java.lang.Boolean.valueOf(this.scribeMethodHandler.isStylusHandwritingAvailable()));
        } catch (java.lang.IllegalStateException e17) {
            result.error("error", e17.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startStylusHandwriting(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            result.error("error", "Requires API level 33 or higher.", null);
            return;
        }
        try {
            this.scribeMethodHandler.startStylusHandwriting();
            result.success(null);
        } catch (java.lang.IllegalStateException e17) {
            result.error("error", e17.getMessage(), null);
        }
    }

    public void setScribeMethodHandler(io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler scribeMethodHandler) {
        this.scribeMethodHandler = scribeMethodHandler;
    }
}
