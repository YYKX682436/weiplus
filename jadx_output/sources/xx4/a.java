package xx4;

/* loaded from: classes.dex */
public final class a extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xx4.a f458025d = new xx4.a();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Integer num = (java.lang.Integer) msg.f340790a.get("enterScene");
        int intValue = num != null ? num.intValue() : 18;
        java.lang.String str = (java.lang.String) msg.f340790a.get("templateInfo");
        if (str == null) {
            str = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            jSONObject.put("enterScene", intValue);
            kotlin.Result.m521constructorimpl(jSONObject.put("templateInfo", new org.json.JSONObject(str)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        android.content.Intent intent = new android.content.Intent(env.f340860a, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, xx4.b.class);
        intent.putExtra("KEY_JSON_STRING", jSONObject.toString());
        android.content.Context context = env.f340860a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/finder/JsApiOpenFinderCamera", "openFinderCameraView", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/finder/JsApiOpenFinderCamera", "openFinderCameraView", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mars.xlog.Log.i("JsApiOpenFinderCamera", "openFinderCameraView json: " + jSONObject);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 544;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderCamera";
    }
}
