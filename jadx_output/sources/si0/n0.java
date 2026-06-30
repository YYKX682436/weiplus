package si0;

/* loaded from: classes4.dex */
public final class n0 implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: f, reason: collision with root package name */
    public static si0.n0 f408137f;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.pigeon.sns.FlutterAlbumApi f408138d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f408139e = new java.lang.ref.WeakReference(null);

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        this.f408138d = new com.tencent.pigeon.sns.FlutterAlbumApi(binaryMessenger, null, 2, null);
        this.f408139e = new java.lang.ref.WeakReference(binding.getApplicationContext());
        f408137f = this;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408138d = null;
        f408137f = null;
    }
}
