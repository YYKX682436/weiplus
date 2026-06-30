package ot0;

/* loaded from: classes9.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348434a;

    public c0(java.lang.String str) {
        this.f348434a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        java.lang.String str = this.f348434a;
        qk.o b17 = r01.z.b(str);
        if (b17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.field_appId)) {
            c17.c(java.lang.Boolean.TRUE);
            return null;
        }
        if (b17 == null) {
            qk.o oVar = new qk.o();
            oVar.field_username = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgBizClickHandler", "insert stub bizInfo, username: %s, success: %b", str, java.lang.Boolean.valueOf(r01.q3.cj().update(oVar, new java.lang.String[0])));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 3, 1L, false);
        if (r01.q3.Ai().c(str, new ot0.b0(str, c17))) {
            return null;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgBizClickHandler", "try2UpdateBizAttributes fail");
        c17.a(new ot0.p0(2, "flush bizInfo fail"));
        return null;
    }
}
