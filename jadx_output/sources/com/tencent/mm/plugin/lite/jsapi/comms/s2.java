package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class s2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiGetLiteAppPackageInfo", "Invoke getLiteAppPackageInfo");
        java.lang.String optString = jSONObject.optString("appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("invalid appId");
            return;
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo Cj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Cj(optString);
        if (Cj == null) {
            this.f143443f.a("cannot find app");
            return;
        }
        java.lang.String Ej = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ej(Cj.path, optString, Cj.signatureKey);
        java.lang.String liteAppVersionType = com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersionType(Cj.path, Cj.appId, Cj.signatureKey);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("appId", optString);
            jSONObject2.put("patchId", Cj.patchId);
            jSONObject2.put("type", Cj.type);
            jSONObject2.put(dm.i4.COL_UPDATETIME, Cj.updateTime);
            jSONObject2.put("version", Ej);
            jSONObject2.put("versionType", liteAppVersionType);
        } catch (org.json.JSONException unused) {
        }
        this.f143443f.c(jSONObject2, false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
