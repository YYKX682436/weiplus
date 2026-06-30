package g03;

/* loaded from: classes8.dex */
public class c implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f267443d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f267444e;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Flutter.FlutterLvCppHandler", "onAttachedToEngine FlutterLvCppHandler CHANNEL%s", "com.tencent.mm.mmflutter.lvcppmethod");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.mmflutter.lvcppmethod");
        this.f267443d = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f267444e = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f267443d.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (!methodCall.method.equals("getDisplayParams")) {
            result.notImplemented();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.util.DisplayMetrics displayMetrics = this.f267444e.getResources().getDisplayMetrics();
            android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this.f267444e);
            jSONObject.put("screenWidth", h17.x);
            jSONObject.put("screenHeight", h17.y);
            jSONObject.put("densityDpi", displayMetrics.densityDpi);
            jSONObject.put("density", displayMetrics.density);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Flutter.FlutterLvCppHandler", e17, "", new java.lang.Object[0]);
        }
        result.success(jSONObject.toString());
    }
}
