package i54;

/* loaded from: classes4.dex */
public final class a implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiControlFloatComp");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("action");
        if (optString == null) {
            optString = "";
        }
        java.lang.String a17 = jsApiContext.d().a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("componentId", a17);
        jSONObject.put("action", kotlin.jvm.internal.o.b("show", optString) ? "show" : "hide");
        com.tencent.mars.xlog.Log.i("SnsAdForm.ControlFloat", "the float comp param is " + jSONObject);
        h54.a d17 = jsApiContext.d();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("event", "onEventFloatBarVisibility");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        linkedHashMap.put("params", jSONObject2);
        d17.c(linkedHashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiControlFloatComp");
    }
}
