package m62;

/* loaded from: classes8.dex */
public final class f implements m62.c {
    @Override // m62.c
    public void a() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_plus_tool_voice_inpput_wetype_reddot, "", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            return;
        }
        try {
            r45.j4 j4Var = new r45.j4();
            j4Var.f377560g = 10002;
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = Zi;
            du5Var.f372757e = true;
            j4Var.f377561h = du5Var;
            com.tencent.mm.modelbase.p0 p0Var = new com.tencent.mm.modelbase.p0(j4Var, false, false, false);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
            c01.ad.f37061a.b1(p0Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeTypeRingtoneSingleton", e17, null, new java.lang.Object[0]);
        }
    }
}
