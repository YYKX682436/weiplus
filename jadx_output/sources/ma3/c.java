package ma3;

/* loaded from: classes8.dex */
public final class c implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f325212d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f325213e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f325214f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f325215g;

    public c(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.MethodChannel methodChannel) {
        android.app.Activity activity;
        this.f325212d = methodChannel;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f325214f = uuid;
        this.f325215g = "";
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        this.f325213e = relativeLayout;
        relativeLayout.setBackgroundColor(-65536);
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "creationParams: %s, token: %s", java.lang.String.valueOf(map), uuid);
        java.lang.Object obj = map != null ? map.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH) : null;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        this.f325215g = (java.lang.String) obj;
        java.lang.Object obj2 = map != null ? map.get("fileExt") : null;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj2;
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppXFileView", "fileExt is empty");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean c17 = com.tencent.xweb.r1.c(str, false, true, 3);
        hashMap.put("extra_param_enable_multi_instance", java.lang.String.valueOf(c17));
        hashMap.put("extra_param_disable_scale", "false");
        hashMap.put("extra_param_enable_receive_view_status_change", "true");
        hashMap.put("extra_param_disable_finish_activity", "true");
        hashMap.put("extra_param_set_max_scale", "3");
        hashMap.put("extra_param_can_download_when_plugin_error", "true");
        hashMap.put("extra_param_open_file_scene", "20");
        hashMap.put("extra_param_enable_view_edge_changed_event", "true");
        if (context instanceof android.content.MutableContextWrapper) {
            android.content.Context baseContext = ((android.content.MutableContextWrapper) context).getBaseContext();
            if (baseContext instanceof android.app.Activity) {
                activity = (android.app.Activity) baseContext;
                com.tencent.xweb.r1.d(this.f325215g, str, uuid, c17, hashMap, com.tencent.xweb.q1.ListView, activity, relativeLayout, new ma3.a(this), ma3.b.f325211a);
            }
        }
        activity = null;
        com.tencent.xweb.r1.d(this.f325215g, str, uuid, c17, hashMap, com.tencent.xweb.q1.ListView, activity, relativeLayout, new ma3.a(this), ma3.b.f325211a);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        java.lang.String str = this.f325214f;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "LiteAppXFileView is dispose!!! %s", str);
        try {
            com.tencent.xweb.r1.a(str, this.f325215g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppXFileView", "dispose finishReadFile failed", e17);
        }
        io.flutter.plugin.common.MethodChannel methodChannel = this.f325212d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f325213e;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppXFileView", "onMethodCall " + methodCall.method + ", " + methodCall.arguments);
        java.lang.String str = methodCall.method;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!str.equals("supportMultiInstance")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppXFileView", "onMethodCall not found method: ".concat(str));
            result.error("", "onMethodCall not found method", null);
            return;
        }
        linkedHashMap.put("result", java.lang.Boolean.FALSE);
        java.lang.Object obj = methodCall.arguments;
        if (obj instanceof java.util.ArrayList) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (arrayList.size() == 2) {
                java.lang.Object obj2 = arrayList.get(0);
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                linkedHashMap.put("result", java.lang.Boolean.valueOf(com.tencent.xweb.r1.c(str2 != null ? str2 : "", false, true, 3)));
            }
        }
        result.success(linkedHashMap);
    }
}
