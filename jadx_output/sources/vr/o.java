package vr;

/* loaded from: classes8.dex */
public final class o implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.q f439418d;

    public o(vr.q qVar) {
        this.f439418d = qVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        if (!kotlin.jvm.internal.o.b(call.method, "updateContentLength")) {
            result.notImplemented();
            return;
        }
        java.lang.Object obj = call.arguments;
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map != null ? map.get("currentLength") : null;
        java.lang.Number number = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonBoardNativeView", "updateContentLength viewId=" + this.f439418d.f439421e + " currentLength=" + (number != null ? number.intValue() : 0));
        result.success(null);
    }
}
