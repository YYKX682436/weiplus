package eb4;

/* loaded from: classes4.dex */
public final class j implements eb4.e {

    /* renamed from: a, reason: collision with root package name */
    public static final eb4.j f250889a = new eb4.j();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eb4.e
    public void a(org.json.JSONObject paramsJson, android.content.Context context, yz5.p jsCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("process", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.FloatCompJsApi");
        kotlin.jvm.internal.o.g(paramsJson, "paramsJson");
        kotlin.jvm.internal.o.g(jsCallback, "jsCallback");
        com.tencent.mm.autogen.events.SnsAdShowFloatCompEvent snsAdShowFloatCompEvent = new com.tencent.mm.autogen.events.SnsAdShowFloatCompEvent();
        int i17 = !kotlin.jvm.internal.o.b(paramsJson.optString("action"), "show") ? 1 : 0;
        am.hv hvVar = snsAdShowFloatCompEvent.f54799g;
        if (hvVar != null) {
            hvVar.f6871a = i17;
        }
        if (hvVar != null) {
            hvVar.f6872b = context;
        }
        if (context instanceof com.tencent.mm.plugin.sns.ui.nd) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) ((com.tencent.mm.plugin.sns.ui.nd) context);
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            ab4.n0 A7 = snsAdNativeLandingPagesUI.A7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", A7.j());
            jSONObject.put("uxinfo", A7.o());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, A7.l());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("action", i17 != 0 ? "hide" : "show");
            jSONObject2.put("result", ya.b.SUCCESS);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("sns_ad_h5_js_control_float_component", jSONObject3);
        }
        snsAdShowFloatCompEvent.e();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("ret", "0");
        linkedHashMap.put("err_msg", "ok");
        jsCallback.invoke("ok", linkedHashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("process", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.FloatCompJsApi");
    }
}
