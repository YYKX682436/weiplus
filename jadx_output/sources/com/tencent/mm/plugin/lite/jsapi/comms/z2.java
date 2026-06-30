package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class z2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiGetUserInfo", "Invoke getUserInfo");
        com.tencent.mm.storage.z3 g17 = c01.z1.g();
        java.lang.String P0 = g17.P0();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        java.lang.String d17 = com.tencent.mm.modelavatar.d1.Ni().n0(g17.d1()).d();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        java.lang.String c17 = com.tencent.mm.modelavatar.d1.Ni().n0(g17.d1()).c();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("nickName", P0);
        hashMap.put("headImg", d17);
        hashMap.put("hdHeadImg", c17);
        this.f143442e.e(hashMap);
    }
}
