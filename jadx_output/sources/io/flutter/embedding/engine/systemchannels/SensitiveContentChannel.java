package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes14.dex */
public class SensitiveContentChannel {
    public static final int AUTO_SENSITIVE_CONTENT_SENSITIVITY = 0;
    public static final int NOT_SENSITIVE_CONTENT_SENSITIVITY = 2;
    public static final int SENSITIVE_CONTENT_SENSITIVITY = 1;
    private static final java.lang.String TAG = "SensitiveContentChannel";
    public static final int UNKNOWN_CONTENT_SENSITIVITY = 3;
    public final io.flutter.plugin.common.MethodChannel channel;
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodHandler;
    private io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler sensitiveContentMethodHandler;

    /* loaded from: classes14.dex */
    public interface SensitiveContentMethodHandler {
        int getContentSensitivity();

        boolean isSupported();

        void setContentSensitivity(int i17);
    }

    public SensitiveContentChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                if (io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.this.sensitiveContentMethodHandler == null) {
                    return;
                }
                java.lang.String str = methodCall.method;
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1937987631:
                        if (str.equals("SensitiveContent.getContentSensitivity")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 598223325:
                        if (str.equals("SensitiveContent.setContentSensitivity")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 1615625817:
                        if (str.equals("SensitiveContent.isSupported")) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        try {
                            result.success(java.lang.Integer.valueOf(io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.this.serializeContentSensitivity(java.lang.Integer.valueOf(io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.this.sensitiveContentMethodHandler.getContentSensitivity()).intValue())));
                            return;
                        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
                            result.error("error", e17.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.this.sensitiveContentMethodHandler.setContentSensitivity(io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.this.deserializeContentSensitivity(((java.lang.Integer) methodCall.arguments()).intValue()));
                            return;
                        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e18) {
                            result.error("error", e18.getMessage(), null);
                            return;
                        }
                    case 2:
                        result.success(java.lang.Boolean.valueOf(io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.this.sensitiveContentMethodHandler.isSupported()));
                        return;
                    default:
                        io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.TAG, "Method " + str + " is not implemented for the SensitiveContentChannel.");
                        result.notImplemented();
                        return;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/sensitivecontent", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int deserializeContentSensitivity(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("contentSensitivityIndex " + i17 + " not known to the SensitiveContentChannel.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int serializeContentSensitivity(int i17) {
        if (i17 == 0) {
            return 0;
        }
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 3;
            }
        }
        return i18;
    }

    public void setSensitiveContentMethodHandler(io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler sensitiveContentMethodHandler) {
        this.sensitiveContentMethodHandler = sensitiveContentMethodHandler;
    }
}
