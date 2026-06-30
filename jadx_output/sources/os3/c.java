package os3;

/* loaded from: classes9.dex */
public class c implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ os3.d f348044a;

    public c(os3.d dVar) {
        this.f348044a = dVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.vfs.x1 m17;
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348044a.f348056d;
        int i18 = com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.F;
        java.lang.String Z6 = attachDownloadPage.Z6(false);
        attachDownloadPage.getClass();
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.lang.String q17 = com.tencent.mm.vfs.w6.q(Z6);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(Z6);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (K0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Qqmail.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            c4Var.f6326l = com.tencent.mm.R.string.cac;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Qqmail.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", q17, "", Z6, 9);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(Z6);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            long j17 = (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L;
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            if (j17 > ip.c.g()) {
                c4Var.f6326l = com.tencent.mm.R.string.hko;
            } else {
                r45.bq0 bq0Var = new r45.bq0();
                r45.jq0 jq0Var = new r45.jq0();
                r45.gp0 gp0Var = new r45.gp0();
                gp0Var.A0(Z6);
                gp0Var.h0(8);
                gp0Var.i0(com.tencent.mm.vfs.w6.n(Z6));
                gp0Var.z0(true);
                gp0Var.O0(q17);
                gp0Var.m0("");
                jq0Var.e(c01.z1.r());
                jq0Var.j(c01.z1.r());
                jq0Var.g(9);
                jq0Var.c(java.lang.System.currentTimeMillis());
                bq0Var.o(jq0Var);
                bq0Var.f370964f.add(gp0Var);
                java.lang.String str2 = gp0Var.f375404d;
                c4Var.f6318d = str2;
                c4Var.f6319e = str2;
                c4Var.f6315a = bq0Var;
                c4Var.f6317c = 8;
            }
        }
        c4Var.f6323i = attachDownloadPage;
        c4Var.f6327m = 6;
        doFavoriteEvent.e();
    }
}
