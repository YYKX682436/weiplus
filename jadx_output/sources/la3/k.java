package la3;

/* loaded from: classes5.dex */
public final class k extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f317541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f317541a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppWebviewViewFactory", "create platformview id: %d", java.lang.Integer.valueOf(i17));
        java.lang.String format = java.lang.String.format("wx_liteapp_webview_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return new la3.j(context, i17, (java.util.Map) obj, new io.flutter.plugin.common.MethodChannel(this.f317541a, format));
    }
}
