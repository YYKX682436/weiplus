package hf;

/* loaded from: classes11.dex */
public final class d implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f280993d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineCrashReportPlugin", "onAttachedToEngine SkylineCrashReportPlugin CHANNEL%s", "com.tencent.skyline.crashreport");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.skyline.crashreport");
        this.f280993d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f280993d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineCrashReportPlugin", "onMethodCall method", methodCall.method);
        if (kotlin.jvm.internal.o.b(methodCall.method, "crash_report")) {
            java.util.Map map = (java.util.Map) methodCall.argument("crashInfo");
            if (map == null) {
                map = new java.util.HashMap();
            }
            java.lang.Boolean bool = (java.lang.Boolean) methodCall.argument("killSelf");
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            java.lang.String valueOf = java.lang.String.valueOf(map.get("deviceParameters"));
            java.lang.String valueOf2 = java.lang.String.valueOf(map.get("customParameters"));
            java.lang.String valueOf3 = java.lang.String.valueOf(map.get("applicationParameters"));
            java.lang.String valueOf4 = java.lang.String.valueOf(map.get("dateTime"));
            java.lang.String valueOf5 = java.lang.String.valueOf(map.get("context"));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(map.get("error"));
            sb6.append('\n');
            sb6.append(map.get("stackTrace"));
            java.lang.String crashContent = sb6.toString();
            kotlin.jvm.internal.o.g(crashContent, "crashContent");
            hf.c.f280992a.a(new hf.b(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, crashContent, booleanValue ? 1 : 0));
        }
    }
}
