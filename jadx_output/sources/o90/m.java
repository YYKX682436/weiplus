package o90;

/* loaded from: classes4.dex */
public final class m implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (gm0.j1.a()) {
            lh3.n nVar = (lh3.n) i95.n0.c(lh3.n.class);
            nVar.getClass();
            com.tencent.mm.sdk.platformtools.b4 b4Var = lh3.n.f318686o;
            if (b4Var != null) {
                b4Var.d();
                lh3.n.f318686o.c(86400000L, 86400000L);
            }
            try {
                if (i17 != 0 || i18 != 0) {
                    nVar.f318694i = 60L;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SimcardService", "CheckMobileSimType error:(" + i17 + "," + i18 + ")");
                    nVar.Di(nVar.f318690e, 2);
                    return;
                }
                c01.oa oaVar = (c01.oa) m1Var;
                nVar.f318689d = true;
                nVar.f318691f = oaVar.f37370g;
                int i19 = oaVar.f37371h;
                nVar.f318692g = i19;
                nVar.f318690e = oaVar.f37369f;
                long j17 = oaVar.f37372i;
                if (j17 >= 60 && j17 <= 86400) {
                    nVar.f318694i = j17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "CheckMobileSIMTypeResp type[%d], productType[%d], businessFlag[%d] expiredTime[%d]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(nVar.f318691f), java.lang.Integer.valueOf(nVar.f318690e), java.lang.Integer.valueOf(oaVar.f37372i));
                    nVar.Di(nVar.f318690e, 3);
                }
                nVar.f318694i = 28800L;
                com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "CheckMobileSIMTypeResp type[%d], productType[%d], businessFlag[%d] expiredTime[%d]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(nVar.f318691f), java.lang.Integer.valueOf(nVar.f318690e), java.lang.Integer.valueOf(oaVar.f37372i));
                nVar.Di(nVar.f318690e, 3);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SimcardService", th6, "[-] CheckMobileSimType error.", new java.lang.Object[0]);
            }
        }
    }
}
