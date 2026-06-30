package ea3;

/* loaded from: classes5.dex */
public final class b0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f250603d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(binding);
        java.lang.ref.WeakReference weakReference2 = this.f250603d;
        if ((weakReference2 != null ? (io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding) weakReference2.get() : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppAlbumViewPlugin", "FlutterPluginBinding is null!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewPlugin", "FlutterPluginBinding is not null!");
        java.lang.ref.WeakReference weakReference3 = this.f250603d;
        kotlin.jvm.internal.o.d(weakReference3);
        java.lang.Object obj = weakReference3.get();
        kotlin.jvm.internal.o.d(obj);
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry = ((io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding) obj).getPlatformViewRegistry();
        if (platformViewRegistry != null) {
            java.lang.ref.WeakReference weakReference4 = this.f250603d;
            kotlin.jvm.internal.o.d(weakReference4);
            java.lang.Object obj2 = weakReference4.get();
            kotlin.jvm.internal.o.d(obj2);
            io.flutter.plugin.common.BinaryMessenger binaryMessenger = ((io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding) obj2).getBinaryMessenger();
            kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
            platformViewRegistry.registerViewFactory("wxa_hybrid-photo-album-view-type", new ea3.o(binaryMessenger, weakReference));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f250603d = new java.lang.ref.WeakReference(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }
}
