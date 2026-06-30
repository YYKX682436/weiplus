package g64;

/* loaded from: classes4.dex */
public final class c implements w44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g64.d f269189a;

    public c(g64.d dVar) {
        this.f269189a = dVar;
    }

    @Override // w44.a
    public final void a(java.lang.String event, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$2");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        lc3.e eVar = this.f269189a.f317890a;
        if (eVar instanceof hq0.i0) {
            com.tencent.mars.xlog.Log.i("SnsAdMB.JsApi", "[" + event + "]: " + data);
            java.lang.String jSONObject = data.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            ((hq0.i0) eVar).N0(event, jSONObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$2");
    }
}
