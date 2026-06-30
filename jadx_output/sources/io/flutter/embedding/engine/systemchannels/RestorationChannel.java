package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class RestorationChannel {
    private static final java.lang.String TAG = "RestorationChannel";
    private io.flutter.plugin.common.MethodChannel channel;
    private boolean engineHasProvidedData;
    private boolean frameworkHasRequestedData;
    private final io.flutter.plugin.common.MethodChannel.MethodCallHandler handler;
    private io.flutter.plugin.common.MethodChannel.Result pendingFrameworkRestorationChannelRequest;
    private byte[] restorationData;
    public final boolean waitForRestorationData;

    public RestorationChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor, boolean z17) {
        this(new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/restoration", io.flutter.plugin.common.StandardMethodCodec.INSTANCE), z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.Object> packageData(byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enabled", java.lang.Boolean.TRUE);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
        return hashMap;
    }

    public void clearData() {
        this.restorationData = null;
    }

    public byte[] getRestorationData() {
        return this.restorationData;
    }

    public void setRestorationData(final byte[] bArr) {
        this.engineHasProvidedData = true;
        io.flutter.plugin.common.MethodChannel.Result result = this.pendingFrameworkRestorationChannelRequest;
        if (result != null) {
            result.success(packageData(bArr));
            this.pendingFrameworkRestorationChannelRequest = null;
            this.restorationData = bArr;
        } else if (this.frameworkHasRequestedData) {
            this.channel.invokeMethod(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, packageData(bArr), new io.flutter.plugin.common.MethodChannel.Result() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.1
                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
                    io.flutter.Log.e(io.flutter.embedding.engine.systemchannels.RestorationChannel.TAG, "Error " + str + " while sending restoration data to framework: " + str2);
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(java.lang.Object obj) {
                    io.flutter.embedding.engine.systemchannels.RestorationChannel.this.restorationData = bArr;
                }
            });
        } else {
            this.restorationData = bArr;
        }
    }

    public RestorationChannel(io.flutter.plugin.common.MethodChannel methodChannel, boolean z17) {
        this.engineHasProvidedData = false;
        this.frameworkHasRequestedData = false;
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.2
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                java.lang.String str = methodCall.method;
                java.lang.Object obj = methodCall.arguments;
                str.getClass();
                if (!str.equals("get")) {
                    if (!str.equals("put")) {
                        result.notImplemented();
                        return;
                    }
                    io.flutter.embedding.engine.systemchannels.RestorationChannel.this.restorationData = (byte[]) obj;
                    result.success(null);
                    return;
                }
                io.flutter.embedding.engine.systemchannels.RestorationChannel.this.frameworkHasRequestedData = true;
                if (!io.flutter.embedding.engine.systemchannels.RestorationChannel.this.engineHasProvidedData) {
                    io.flutter.embedding.engine.systemchannels.RestorationChannel restorationChannel = io.flutter.embedding.engine.systemchannels.RestorationChannel.this;
                    if (restorationChannel.waitForRestorationData) {
                        restorationChannel.pendingFrameworkRestorationChannelRequest = result;
                        return;
                    }
                }
                io.flutter.embedding.engine.systemchannels.RestorationChannel restorationChannel2 = io.flutter.embedding.engine.systemchannels.RestorationChannel.this;
                result.success(restorationChannel2.packageData(restorationChannel2.restorationData));
            }
        };
        this.handler = methodCallHandler;
        this.channel = methodChannel;
        this.waitForRestorationData = z17;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }
}
