package j8;

/* loaded from: classes15.dex */
public class g implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f298097d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f298098e;

    /* renamed from: f, reason: collision with root package name */
    public j8.k f298099f;

    /* renamed from: g, reason: collision with root package name */
    public j8.o f298100g;

    /* renamed from: h, reason: collision with root package name */
    public final j8.d f298101h = new j8.d(this);

    /* renamed from: i, reason: collision with root package name */
    public final j8.f f298102i = new j8.f(this);

    /* renamed from: m, reason: collision with root package name */
    public j8.b f298103m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.Context f298104n;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.github.rmtmckenzie/flutter_native_device_orientation/orientation");
        this.f298097d = methodChannel;
        methodChannel.setMethodCallHandler(this.f298101h);
        io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(flutterPluginBinding.getBinaryMessenger(), "com.github.rmtmckenzie/flutter_native_device_orientation/orientationevent");
        this.f298098e = eventChannel;
        eventChannel.setStreamHandler(this.f298102i);
        android.content.Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.f298104n = applicationContext;
        this.f298099f = new j8.k(applicationContext);
        this.f298100g = new j8.o(applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f298097d.setMethodCallHandler(null);
        this.f298098e.setStreamHandler(null);
    }
}
