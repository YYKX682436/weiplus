package ff3;

/* loaded from: classes4.dex */
public class s implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ef3.r wi6 = ef3.r.wi();
        wi6.getClass();
        if (i18 == 0 && i17 == 0 && !wi6.f252430f && c01.z1.I()) {
            wi6.f252430f = true;
            boolean z17 = false;
            if ((o45.wf.f343029g & (-256)) == 637534720) {
                gm0.j1.i();
                if (637534720 != ((java.lang.Integer) gm0.j1.u().c().l(270343, 0)).intValue()) {
                    z17 = true;
                }
            }
            if (z17 && c01.z1.G()) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().r(262156, true);
                gm0.j1.i();
                gm0.j1.u().c().w(270343, 637534720);
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        }
    }
}
