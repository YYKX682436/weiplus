package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f207478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q5 f207479e;

    public b6(com.tencent.mm.ui.conversation.q5 q5Var, r45.mm6 mm6Var) {
        this.f207479e = q5Var;
        this.f207478d = mm6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.mm6 mm6Var;
        boolean z17;
        boolean pj6 = ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).pj(this.f207478d);
        if (pj6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "checkTinkerBoostInstall, isApkHasUpdateIndialogInfo = %s.", java.lang.Boolean.valueOf(pj6));
            return;
        }
        java.lang.String a17 = k35.o1.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "checkTinkerBoostInstall, oldApkMd5 = %s.", a17);
        r45.mm6 mm6Var2 = this.f207478d;
        if ((mm6Var2 == null || !mm6Var2.f380672h.equalsIgnoreCase(a17)) && ((mm6Var = this.f207478d) == null || mm6Var.f380681t != 4)) {
            return;
        }
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207479e;
        int i17 = this.f207478d.f380681t;
        q5Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "isPatch = %s", java.lang.Boolean.valueOf(i17 == 2 || i17 == 3 || i17 == 4));
        r45.mm6 mm6Var3 = this.f207478d;
        if (mm6Var3.f380682u == 0 && mm6Var3.f380683v == 0 && mm6Var3.f380684w == 0) {
            mm6Var3.f380682u = 1;
            mm6Var3.f380683v = 1;
        }
        if (com.tencent.mm.vfs.w6.j(mm6Var3.f380669e) && uk.b.a(this.f207478d.f380669e)) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_update_patch_dialog_can_show_flag, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "showUpdateDilaog = %s, currentVersion = %s, dialogInfo.isShowDialog = %s, dialogInfo.isShowNotification = %s.", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(this.f207478d.f380684w), java.lang.Integer.valueOf(this.f207478d.f380682u));
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.conversation.x5(this, z17));
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(this.f207478d.f380679r);
        z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_allow_no_alpha_version_install, 1) == 1;
        ((wv.a) ((xv.g0) i95.n0.c(xv.g0.class))).getClass();
        boolean a18 = c83.c.a(valueOf);
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "checkTinkerBoostInstall, isAlphaVersion = %s, isForceAllowNoAlphaVersionInstall = %s.", java.lang.Boolean.valueOf(a18), java.lang.Boolean.valueOf(z17));
        if (a18 || !z17) {
            ((un4.e) i95.n0.c(un4.e.class)).getClass();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.conversation.a6(this));
        }
    }
}
