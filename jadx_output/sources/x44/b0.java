package x44;

/* loaded from: classes4.dex */
public final class b0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("canvasKey");
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghCanvasExtra", "the canvas key is empty, please check it!!!");
            b(g("the canvas key is empty!!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
            return;
        }
        m54.j jVar = m54.j.f324282a;
        kotlin.jvm.internal.o.d(optString);
        if (!m54.j.h(jVar.c(optString))) {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghCanvasExtra", "the canvas key has no vangogh element, canvas key is ".concat(optString));
            b(g("the canvas key has no vangogh element"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
            return;
        }
        java.lang.String p17 = env.b().p();
        if (p17 == null) {
            p17 = "";
        }
        java.lang.String f17 = env.b().f();
        if (f17 == null) {
            f17 = "";
        }
        java.lang.String b17 = env.b().b();
        java.lang.String str = b17 != null ? b17 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", p17);
        jSONObject.put("rewardCommInfo", f17);
        jSONObject.put("rewardParams", str);
        m(jSONObject);
        b(jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
    }
}
