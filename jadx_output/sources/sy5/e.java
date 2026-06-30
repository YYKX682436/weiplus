package sy5;

/* loaded from: classes13.dex */
public class e implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f413902d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f413903e;

    /* renamed from: f, reason: collision with root package name */
    public dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver f413904f;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        android.content.Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.f413902d = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f413903e = new io.flutter.plugin.common.EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        sy5.a aVar = new sy5.a((android.net.ConnectivityManager) applicationContext.getSystemService("connectivity"));
        sy5.d dVar = new sy5.d(aVar);
        this.f413904f = new dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver(applicationContext, aVar);
        this.f413902d.setMethodCallHandler(dVar);
        this.f413903e.setStreamHandler(this.f413904f);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f413902d.setMethodCallHandler(null);
        this.f413903e.setStreamHandler(null);
        this.f413904f.onCancel(null);
        this.f413902d = null;
        this.f413903e = null;
        this.f413904f = null;
    }
}
