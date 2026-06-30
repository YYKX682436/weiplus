package vy5;

/* loaded from: classes11.dex */
public final class h implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f441527d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f441528e;

    /* renamed from: f, reason: collision with root package name */
    public vy5.g f441529f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.y0 f441530g = kotlinx.coroutines.z0.a(oz5.m.f350329d);

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f441530g = kotlinx.coroutines.z0.b();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        android.content.Context applicationContext = binding.getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
        this.f441527d = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f441528e = new io.flutter.plugin.common.EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        vy5.a aVar = new vy5.a((android.net.ConnectivityManager) applicationContext.getSystemService("connectivity"));
        vy5.f fVar = new vy5.f(aVar, this.f441530g);
        vy5.g gVar = new vy5.g(new dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver(applicationContext, aVar, this.f441530g));
        this.f441529f = gVar;
        io.flutter.plugin.common.MethodChannel methodChannel = this.f441527d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(fVar);
        }
        io.flutter.plugin.common.EventChannel eventChannel = this.f441528e;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(gVar);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlinx.coroutines.z0.e(this.f441530g, null, 1, null);
        io.flutter.plugin.common.MethodChannel methodChannel = this.f441527d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        io.flutter.plugin.common.EventChannel eventChannel = this.f441528e;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        vy5.g gVar = this.f441529f;
        if (gVar != null) {
            gVar.onCancel(null);
        }
        this.f441527d = null;
        this.f441528e = null;
        this.f441529f = null;
    }
}
