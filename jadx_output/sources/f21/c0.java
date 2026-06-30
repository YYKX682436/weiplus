package f21;

/* loaded from: classes8.dex */
public class c0 implements com.tencent.mm.modelbase.u0 {
    public c0() {
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(160, this);
        gm0.j1.n().f273288b.g(new f21.g0(5));
    }

    public final void a() {
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(160, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof com.tencent.mm.modelbase.q1) && ((com.tencent.mm.modelbase.q1) m1Var).u() == 5) {
            int type = m1Var.getType();
            if (type != 159) {
                if (type == 160) {
                    if (i17 == 0 && i18 == 0) {
                        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        c17.w(81939, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    }
                    a();
                    return;
                }
                return;
            }
            if (i17 != 0 || i18 != 0) {
                a();
                return;
            }
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            c18.w(81939, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            f21.i0[] D0 = f21.r0.Bi().D0(5);
            if (D0 == null || D0.length == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LangPackageUpdater", "error no pkg found.");
                a();
                return;
            }
            f21.i0 i0Var = D0[0];
            com.tencent.mars.xlog.Log.i("MicroMsg.LangPackageUpdater", "dkregcode Pkg id:" + i0Var.f258913a + " version:" + i0Var.f258914b + " status:" + i0Var.f258918f + " type:" + i0Var.f258919g);
            if (5 != i0Var.f258918f) {
                a();
            } else {
                gm0.j1.n().f273288b.g(new f21.f0(i0Var.f258913a, 5));
            }
        }
    }
}
