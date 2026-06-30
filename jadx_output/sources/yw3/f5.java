package yw3;

/* loaded from: classes11.dex */
public final class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f466742e;

    public f5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f466741d = repairerPatchDemoUI;
        this.f466742e = mm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f466741d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = repairerPatchDemoUI.h;
        if (j0Var != null) {
            kotlin.jvm.internal.o.d(j0Var);
            if (j0Var.isShowing()) {
                com.tencent.mars.xlog.Log.i(repairerPatchDemoUI.d, "update dialog is showing.");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(repairerPatchDemoUI.d, "show update dialog");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 27L, 1L, false);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493423k43));
        u1Var.m(com.tencent.mm.R.string.k3l);
        u1Var.a(true);
        r45.mm6 mm6Var = this.f466742e;
        u1Var.b(new yw3.d5(repairerPatchDemoUI, mm6Var));
        u1Var.e(new yw3.e5(mm6Var));
        u1Var.q(false);
        repairerPatchDemoUI.h = u1Var.f211998c;
        ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).Ai();
    }
}
