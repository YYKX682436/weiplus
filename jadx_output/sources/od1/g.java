package od1;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "noticePerformanceMetrics";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        if (!com.tencent.mm.plugin.appbrand.report.quality.w1.a()) {
            yVar.a(i17, o("ok"));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("events") : null;
        if (optJSONArray == null) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        try {
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct wALifeCycleTimeAxisItemStruct = new com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct();
                java.lang.String appId = yVar.getAppId();
                kotlin.jvm.internal.o.d(appId);
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(appId, true);
                kotlin.jvm.internal.o.d(b17);
                wALifeCycleTimeAxisItemStruct.f61959d = wALifeCycleTimeAxisItemStruct.b("InstanceId", b17.f88134d, true);
                java.lang.String appId2 = yVar.getAppId();
                kotlin.jvm.internal.o.d(appId2);
                wALifeCycleTimeAxisItemStruct.f61960e = wALifeCycleTimeAxisItemStruct.b("Appid", appId2, true);
                wALifeCycleTimeAxisItemStruct.f61961f = optJSONObject.optLong("timeStamp");
                wALifeCycleTimeAxisItemStruct.f61962g = wALifeCycleTimeAxisItemStruct.b("EventName", optJSONObject.optString("eventName"), true);
                wALifeCycleTimeAxisItemStruct.f61963h = optJSONObject.optLong("eventType");
                wALifeCycleTimeAxisItemStruct.f61964i = wALifeCycleTimeAxisItemStruct.b("Parent", optJSONObject.optString("parent"), true);
                wALifeCycleTimeAxisItemStruct.f61965j = optJSONObject.optLong("category");
                wALifeCycleTimeAxisItemStruct.f61966k = optJSONObject.optLong("option");
                com.tencent.mm.plugin.appbrand.report.quality.w1.d(wALifeCycleTimeAxisItemStruct);
            }
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            yVar.a(i17, o("fail " + e17));
        }
    }
}
