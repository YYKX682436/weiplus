package k03;

/* loaded from: classes5.dex */
public final class g extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f303120a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f303120a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        kotlin.jvm.internal.o.d(context);
        return new k03.j(context, i17, map, this.f303120a);
    }
}
