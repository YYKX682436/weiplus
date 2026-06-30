package ty5;

/* loaded from: classes8.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f423152d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        android.content.Context applicationContext = binding.getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
        this.f423152d = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
        kotlin.jvm.internal.o.f(packageManager, "getPackageManager(...)");
        java.lang.Object systemService = applicationContext.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.content.ContentResolver contentResolver = applicationContext.getContentResolver();
        kotlin.jvm.internal.o.d(contentResolver);
        ty5.b bVar = new ty5.b(packageManager, (android.app.ActivityManager) systemService, contentResolver);
        io.flutter.plugin.common.MethodChannel methodChannel = this.f423152d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(bVar);
        } else {
            kotlin.jvm.internal.o.o("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f423152d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            kotlin.jvm.internal.o.o("methodChannel");
            throw null;
        }
    }
}
