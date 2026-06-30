package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class m2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        new com.tencent.mm.autogen.events.DealQBarStrEvent();
        java.lang.String optString = jSONObject.optString("codeString");
        int optInt = jSONObject.optInt("codeType");
        ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
        new com.tencent.mm.plugin.scanner.y().a(optInt, new kd0.f2(optString)).a(new com.tencent.mm.plugin.lite.jsapi.comms.l2(this));
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
