package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class b5 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143442e.b("url is null");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.lite.jsapi.comms.a5(this, optString));
    }
}
