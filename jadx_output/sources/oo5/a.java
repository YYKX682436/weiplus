package oo5;

/* loaded from: classes10.dex */
public final class a extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f347200a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f347201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f347200a = messenger;
        this.f347201b = new java.lang.ref.WeakReference(null);
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        return new oo5.e(context, this.f347200a, i17, (java.util.Map) obj, (io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding) this.f347201b.get());
    }
}
