package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes13.dex */
public class DeferredComponentChannel {
    private static final java.lang.String TAG = "DeferredComponentChannel";
    private final io.flutter.plugin.common.MethodChannel channel;
    private java.util.Map<java.lang.String, java.util.List<io.flutter.plugin.common.MethodChannel.Result>> componentNameToResults;
    private io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager;
    final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodHandler;

    public DeferredComponentChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                if (io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.this.deferredComponentManager == null) {
                    return;
                }
                java.lang.String str = methodCall.method;
                java.util.Map map = (java.util.Map) methodCall.arguments();
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.TAG, "Received '" + str + "' message.");
                int intValue = ((java.lang.Integer) map.get("loadingUnitId")).intValue();
                java.lang.String str2 = (java.lang.String) map.get("componentName");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1004447972:
                        if (str.equals("uninstallDeferredComponent")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str.equals("getDeferredComponentInstallState")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str.equals("installDeferredComponent")) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(intValue, str2);
                        result.success(null);
                        return;
                    case 1:
                        result.success(io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(intValue, str2));
                        return;
                    case 2:
                        io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(intValue, str2);
                        if (!io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.this.componentNameToResults.containsKey(str2)) {
                            io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.this.componentNameToResults.put(str2, new java.util.ArrayList());
                        }
                        ((java.util.List) io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.this.componentNameToResults.get(str2)).add(result);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/deferredcomponent", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
        this.deferredComponentManager = io.flutter.FlutterInjector.instance().deferredComponentManager();
        this.componentNameToResults = new java.util.HashMap();
    }

    public void completeInstallError(java.lang.String str, java.lang.String str2) {
        if (this.componentNameToResults.containsKey(str)) {
            java.util.Iterator<io.flutter.plugin.common.MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().error("DeferredComponent Install failure", str2, null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void completeInstallSuccess(java.lang.String str) {
        if (this.componentNameToResults.containsKey(str)) {
            java.util.Iterator<io.flutter.plugin.common.MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().success(null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void setDeferredComponentManager(io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager) {
        this.deferredComponentManager = deferredComponentManager;
    }
}
