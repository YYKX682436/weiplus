package ea3;

/* loaded from: classes5.dex */
public final class o extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f250644a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f250645b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f250646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(io.flutter.plugin.common.BinaryMessenger messenger, java.lang.ref.WeakReference bindingRef) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        kotlin.jvm.internal.o.g(bindingRef, "bindingRef");
        this.f250644a = messenger;
        this.f250645b = bindingRef;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        java.lang.String format = java.lang.String.format("wx_album_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f250646c = new io.flutter.plugin.common.MethodChannel(this.f250644a, format);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewFactory", "create");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f250646c;
        if (methodChannel != null) {
            return new com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView(context, i17, map, methodChannel, (io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding) this.f250645b.get());
        }
        kotlin.jvm.internal.o.o("channel");
        throw null;
    }
}
