package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes15.dex */
public class c5 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int c17;
        java.lang.String optString = jSONObject.optString("url");
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
            optString = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(optString);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiPreloadVideo", "no need preload, file exist:%s", optString);
                this.f143442e.d();
                return;
            }
        }
        java.lang.String str3 = optString;
        jd.c cVar = this.f143442e;
        java.lang.String cacheKeyByUrl = com.tencent.mm.plugin.lite.LiteAppCenter.getCacheKeyByUrl(str, cVar.f299024a, cVar.f299026c, str3);
        int optInt = jSONObject.optInt("ratio");
        if (j62.e.g().l("clicfg_liteapp_video_use_finder", false, true, true)) {
            ha3.i0 i0Var = ha3.j0.f279886a;
            c17 = ha3.j0.f279887b.d(cacheKeyByUrl, optInt);
        } else {
            c17 = x03.x0.f451161d.a().f451164b.c(cacheKeyByUrl, optInt);
        }
        if (c17 == 0) {
            this.f143442e.d();
        } else {
            this.f143442e.b("preload video fail.");
        }
    }
}
