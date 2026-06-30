package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes5.dex */
public final class a2 extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f144385a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f144386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f144385a = messenger;
        this.f144386b = "NativeViewFactory." + hashCode();
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i(this.f144386b, "on create platformview, create params = " + map);
        java.lang.String format = java.lang.String.format("wxa_liteapp_platform_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return new com.tencent.mm.plugin.lite.ui.z1(context, i17, map, new io.flutter.plugin.common.MethodChannel(this.f144385a, format));
    }
}
