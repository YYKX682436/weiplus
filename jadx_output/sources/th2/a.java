package th2;

/* loaded from: classes5.dex */
public final class a extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f419323a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419324b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f419325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f419323a = messenger;
        this.f419324b = "NativeViewFactory";
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i(this.f419324b, "on create platformview, create params = " + map);
        java.lang.String format = java.lang.String.format("wx_platformview_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f419325c = new io.flutter.plugin.common.MethodChannel(this.f419323a, format);
        java.lang.Object obj2 = map != null ? map.get("anchor") : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        io.flutter.plugin.common.MethodChannel methodChannel = this.f419325c;
        if (methodChannel == null) {
            kotlin.jvm.internal.o.o("channel");
            throw null;
        }
        ud2.a aVar = new ud2.a(context, i17, map, methodChannel, str2);
        new java.lang.ref.WeakReference(aVar);
        return aVar;
    }
}
