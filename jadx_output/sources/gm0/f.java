package gm0;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.m f273183d;

    public f(gm0.m mVar) {
        this.f273183d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.i();
        gm0.b0 u17 = gm0.j1.u();
        u17.getClass();
        gm0.m0 m0Var = new gm0.m0();
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) u17.f273154g.l(14, null));
        int i17 = o45.wf.f343029g;
        java.lang.Integer.toHexString(q17);
        java.lang.Integer.toHexString(i17);
        boolean z17 = q17 == 0;
        if (z17) {
            u17.f273154g.w(8197, "");
            u17.f273154g.w(15, 0);
        }
        boolean z18 = q17 != i17;
        if (q17 > 620822536 || q17 == i17) {
            u17.f273154g.w(274480, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i("MMKernel.CoreStorage", "[initialize] need not init emoji");
        } else {
            u17.f273154g.w(274480, java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("MMKernel.CoreStorage", "[initialize] need init emoji");
        }
        if (q17 != i17) {
            com.tencent.mars.xlog.Log.w("MMKernel.CoreStorage", "account storage version changed from " + java.lang.Integer.toHexString(q17) + " to " + java.lang.Integer.toHexString(i17) + ", init=" + z17);
            com.tencent.mm.storage.j3 j3Var = u17.f273148a;
            if (((java.lang.Integer) j3Var.b(37, 0)).intValue() == 0) {
                j3Var.f(37, java.lang.Integer.valueOf(q17));
            }
            u17.f273154g.w(62, java.lang.Boolean.TRUE);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("update_config_prefs", 4).edit().clear().commit();
            if (q17 != 0 && (q17 & (-16777216)) == (i17 & (-16777216))) {
                com.tencent.mm.sdk.platformtools.c3.a("show_whatsnew");
            }
        } else {
            com.tencent.mm.sdk.platformtools.c3.a("show_whatsnew");
        }
        com.tencent.mars.xlog.Log.i("MMKernel.CoreStorage", "unlock show_whatsnew from testWhatsNew, %s.", java.lang.Boolean.valueOf(u17.f273154g.r(com.tencent.mm.storage.u3.USERINFO_FINDER_WHATS_NEW_LOCAL_STYLE_INT_SYNC, -1) > 0));
        m0Var.f273257a = z18;
        m0Var.f273258b = q17;
        gm0.m mVar = this.f273183d;
        mVar.f273244g = m0Var;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "changeToAccountHasReady");
        mVar.f273252o = gm0.k.AccountHasReady;
    }
}
