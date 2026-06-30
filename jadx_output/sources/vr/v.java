package vr;

/* loaded from: classes5.dex */
public final class v extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f439439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f439439a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        java.lang.String str = "com.tencent.xin.flutter.nativeEmoticonBoard.methodChannel." + i17;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(this.f439439a, str);
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonBoardNativeViewFactory", "created method channel: " + str + ", creationParams: " + map);
        return new vr.q(context, i17, methodChannel, map);
    }
}
