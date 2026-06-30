package ev4;

/* loaded from: classes5.dex */
public final class b extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f256942a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f256942a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.String format = java.lang.String.format("wx_platform_search_webview_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return new ev4.a(context, i17, map, new io.flutter.plugin.common.MethodChannel(this.f256942a, format));
    }
}
