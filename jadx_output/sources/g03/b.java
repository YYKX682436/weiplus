package g03;

/* loaded from: classes8.dex */
public class b implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f267442d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Flutter.FlutterDataReportPlugin", "onAttachedToEngine FlutterDataReportPlugin CHANNEL%s", "com.tencent.mm.flutter.datareport");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter.datareport");
        this.f267442d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f267442d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.String str = methodCall.method;
        str.getClass();
        if (str.equals("android_idkey_report")) {
            jx3.f.INSTANCE.idkeyStat(((java.lang.Integer) methodCall.argument(dm.i4.COL_ID)).intValue(), ((java.lang.Integer) methodCall.argument("key")).intValue(), ((java.lang.Integer) methodCall.argument("value")).intValue(), false);
            result.success(null);
            return;
        }
        if (str.equals("android_kv_report")) {
            jx3.f.INSTANCE.kvStat(((java.lang.Integer) methodCall.argument(dm.i4.COL_ID)).intValue(), (java.lang.String) methodCall.argument("value"));
            result.success(null);
        }
    }
}
