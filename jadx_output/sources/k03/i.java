package k03;

/* loaded from: classes8.dex */
public final class i implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k03.j f303121d;

    public i(k03.j jVar) {
        this.f303121d = jVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        if (!kotlin.jvm.internal.o.b(call.method, "updateQuery")) {
            result.notImplemented();
            return;
        }
        java.lang.Object obj = call.arguments;
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map != null ? map.get("query") : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null) {
            str = "";
        }
        k03.j jVar = this.f303121d;
        jVar.f303122d = str;
        jVar.f303125g.setText(jVar.a(str));
        jVar.f303123e.invokeMethod("onSectionOrderChanged", java.util.Collections.singletonMap("isWebSearchTop", java.lang.Boolean.TRUE));
        result.success(null);
    }
}
