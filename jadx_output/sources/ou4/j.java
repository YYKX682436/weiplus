package ou4;

/* loaded from: classes8.dex */
public final class j implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f348983d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f348984e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f348985f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f348986g;

    public j(java.lang.String containerId) {
        kotlin.jvm.internal.o.g(containerId, "containerId");
        this.f348983d = containerId;
        this.f348985f = new java.util.concurrent.ConcurrentHashMap();
        this.f348986g = new java.util.ArrayList();
    }

    public final void a() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f348985f;
        java.util.Collection values = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((ou4.c0) it.next()).getClass();
        }
        concurrentHashMap.clear();
        ((java.util.ArrayList) this.f348986g).clear();
        io.flutter.plugin.common.MethodChannel methodChannel = this.f348984e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f348984e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "flutter_container_bridge_" + this.f348983d);
        this.f348984e = methodChannel;
        methodChannel.setMethodCallHandler(this);
        java.util.List list = this.f348986g;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        ((java.util.ArrayList) list).clear();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f348984e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f348984e = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        if (!kotlin.jvm.internal.o.b(call.method, "callApi")) {
            result.notImplemented();
            return;
        }
        java.lang.String str = (java.lang.String) call.argument("apiName");
        java.util.Map map = (java.util.Map) call.argument(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (str == null || str.length() == 0) {
            result.error("INVALID_ARGS", "apiName is required", null);
            return;
        }
        ou4.c0 c0Var = (ou4.c0) this.f348985f.get(str);
        if (c0Var == null) {
            result.error("NOT_FOUND", "No handler for apiName: " + str, null);
            return;
        }
        try {
            c0Var.a(map, new ou4.i(result));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterApiBridge", "handleCallApi: handler error, apiName=" + str, e17);
            result.error("HANDLER_ERROR", e17.getMessage(), null);
        }
    }
}
