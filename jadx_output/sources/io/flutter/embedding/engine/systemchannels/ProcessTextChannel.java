package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes8.dex */
public class ProcessTextChannel {
    private static final java.lang.String CHANNEL_NAME = "flutter/processtext";
    private static final java.lang.String METHOD_PROCESS_TEXT_ACTION = "ProcessText.processTextAction";
    private static final java.lang.String METHOD_QUERY_TEXT_ACTIONS = "ProcessText.queryTextActions";
    private static final java.lang.String TAG = "ProcessTextChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    public final android.content.pm.PackageManager packageManager;
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ProcessTextChannel.1
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            if (io.flutter.embedding.engine.systemchannels.ProcessTextChannel.this.processTextMethodHandler == null) {
                return;
            }
            java.lang.String str = methodCall.method;
            java.lang.Object obj = methodCall.arguments;
            str.getClass();
            if (!str.equals(io.flutter.embedding.engine.systemchannels.ProcessTextChannel.METHOD_PROCESS_TEXT_ACTION)) {
                if (!str.equals(io.flutter.embedding.engine.systemchannels.ProcessTextChannel.METHOD_QUERY_TEXT_ACTIONS)) {
                    result.notImplemented();
                    return;
                }
                try {
                    result.success(io.flutter.embedding.engine.systemchannels.ProcessTextChannel.this.processTextMethodHandler.queryTextActions());
                    return;
                } catch (java.lang.IllegalStateException e17) {
                    result.error("error", e17.getMessage(), null);
                    return;
                }
            }
            try {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                io.flutter.embedding.engine.systemchannels.ProcessTextChannel.this.processTextMethodHandler.processTextAction((java.lang.String) arrayList.get(0), (java.lang.String) arrayList.get(1), ((java.lang.Boolean) arrayList.get(2)).booleanValue(), result);
            } catch (java.lang.IllegalStateException e18) {
                result.error("error", e18.getMessage(), null);
            }
        }
    };
    private io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler processTextMethodHandler;

    /* loaded from: classes8.dex */
    public interface ProcessTextMethodHandler {
        void processTextAction(java.lang.String str, java.lang.String str2, boolean z17, io.flutter.plugin.common.MethodChannel.Result result);

        java.util.Map<java.lang.String, java.lang.String> queryTextActions();
    }

    public ProcessTextChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor, android.content.pm.PackageManager packageManager) {
        this.packageManager = packageManager;
        this.channel = new io.flutter.plugin.common.MethodChannel(dartExecutor, CHANNEL_NAME, io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
    }

    public void setMethodHandler(io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler processTextMethodHandler) {
        this.processTextMethodHandler = processTextMethodHandler;
    }
}
