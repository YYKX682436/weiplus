package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class y4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("targetAppId");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("invalid_targetAppId");
            return;
        }
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai(optString, optJSONObject.toString());
        this.f143443f.d(false);
    }
}
