package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class z4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("fail: appId is null");
        } else if (jSONObject.optBoolean("onlyUpdate", false) && ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(optString) == null) {
            this.f143443f.d(false);
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(optString, null);
            this.f143443f.d(false);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
