package od1;

/* loaded from: classes.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "setAuditsTraceInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : null;
        if (optJSONArray == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String string = optJSONArray.getString(i18);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            arrayList.add(string);
        }
        boolean g17 = com.tencent.mm.plugin.appbrand.performance.m.g(e9Var.getAppId(), arrayList);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("resp", java.lang.Boolean.valueOf(g17));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        e9Var.a(i17, t("ok", hashMap));
    }
}
