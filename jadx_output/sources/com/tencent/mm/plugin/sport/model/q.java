package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class q implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.plugin.sport.model.i) {
            gm0.j1.d().q(1947, com.tencent.mm.plugin.sport.model.t.f171813b);
            if (i17 == 0 && i18 == 0) {
                r45.n87 n87Var = ((com.tencent.mm.plugin.sport.model.i) m1Var).f171792f;
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportConfigLogic", "onSceneEnd config=%s", n87Var.f381178d);
                java.lang.String str2 = n87Var.f381178d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    try {
                        com.tencent.mm.plugin.sport.model.t.f171814c = new org.json.JSONObject(str2);
                    } catch (java.lang.Exception unused) {
                        com.tencent.mm.plugin.sport.model.t.f171814c = null;
                    }
                }
                try {
                    com.tencent.mm.plugin.sport.model.t.c().put("checkWeSportInstall", com.tencent.mm.plugin.sport.model.c0.e() ? 1 : 0);
                } catch (java.lang.Exception unused2) {
                }
                java.lang.String jSONObject = com.tencent.mm.plugin.sport.model.t.c().toString();
                com.tencent.mm.plugin.sport.model.z.f171826a.e("KEY_LAST_REQUEST_CONFIG_STRING", jSONObject);
                ((ue4.r) i95.n0.c(ue4.r.class)).wi().c(jSONObject);
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sport.model.p(this));
            }
        }
    }
}
