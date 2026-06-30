package k03;

/* loaded from: classes5.dex */
public final class f extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f303118a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f303119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f303118a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        java.lang.String format = java.lang.String.format("wx_platformview_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f303119b = new io.flutter.plugin.common.MethodChannel(this.f303118a, format);
        io.flutter.plugin.common.MethodChannel methodChannel = this.f303119b;
        if (methodChannel != null) {
            return new k03.e(context, i17, map, methodChannel);
        }
        kotlin.jvm.internal.o.o("channel");
        throw null;
    }
}
