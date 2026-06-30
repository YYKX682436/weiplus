package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class y2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("uin", gm0.j1.b().j());
        this.f143443f.c(new org.json.JSONObject(hashMap), false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
