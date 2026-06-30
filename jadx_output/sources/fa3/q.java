package fa3;

/* loaded from: classes5.dex */
public final class q extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f260784a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry f260785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(io.flutter.plugin.common.BinaryMessenger messenger, io.flutter.view.TextureRegistry registry) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        kotlin.jvm.internal.o.g(registry, "registry");
        this.f260784a = messenger;
        this.f260785b = registry;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        java.lang.String format = java.lang.String.format("wx_cameraview_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return new fa3.p(context, i17, map, new io.flutter.plugin.common.MethodChannel(this.f260784a, format), this.f260785b);
    }
}
