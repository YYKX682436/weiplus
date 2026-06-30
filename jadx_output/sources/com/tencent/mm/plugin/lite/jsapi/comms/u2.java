package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public class u2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long c17 = android.os.Looper.getMainLooper().isCurrentThread() ? c01.id.c() : c01.id.b();
        if (c17 == -1) {
            this.f143443f.a("getServerTime error");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverTime", java.lang.Long.valueOf(c17));
        this.f143443f.c(new org.json.JSONObject(hashMap), false);
    }
}
