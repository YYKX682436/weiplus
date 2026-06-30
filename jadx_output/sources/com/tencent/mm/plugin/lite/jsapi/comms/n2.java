package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class n2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(274436, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2) || "CN".equalsIgnoreCase(str2));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isRegInChina", valueOf);
        this.f143443f.c(new org.json.JSONObject(hashMap), false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
