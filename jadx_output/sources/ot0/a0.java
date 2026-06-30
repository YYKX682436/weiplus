package ot0;

/* loaded from: classes4.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348371a;

    public a0(java.lang.String str) {
        this.f348371a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f348371a;
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        if (n17 == null || ((int) n17.E2) == 0 || !n17.k2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgBizClickHandler", "contact do not exist.(username : %s)", str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 2, 1L, false);
            ((c01.k7) c01.n8.a()).b(str, 5, new ot0.z(str, c17));
        } else {
            c17.c(java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.FALSE;
    }
}
