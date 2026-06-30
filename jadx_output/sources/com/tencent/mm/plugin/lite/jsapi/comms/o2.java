package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class o2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c();
        com.tencent.mars.xlog.Log.i("LiteAppJsApiGetBindPhoneState", "hasBind:" + c17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bind", java.lang.Boolean.valueOf(c17));
        this.f143442e.e(hashMap);
    }
}
