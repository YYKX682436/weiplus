package yw3;

/* loaded from: classes11.dex */
public final class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f466711e;

    public c5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f466710d = repairerPatchDemoUI;
        this.f466711e = mm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f466710d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = repairerPatchDemoUI.h;
        if (j0Var != null) {
            kotlin.jvm.internal.o.d(j0Var);
            if (j0Var.isShowing()) {
                com.tencent.mars.xlog.Log.i(repairerPatchDemoUI.d, "update dialog is showing.");
                return;
            }
        }
        r45.mm6 mm6Var = this.f466711e;
        if (mm6Var.f380681t == 4) {
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            w73.f.k(121);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 121L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 60L, 1L, false);
        }
        repairerPatchDemoUI.h = db5.e1.C(repairerPatchDemoUI.getContext(), mm6Var.f380674m, mm6Var.f380673i, mm6Var.f380675n, mm6Var.f380676o, false, new yw3.a5(repairerPatchDemoUI, mm6Var), new yw3.b5(mm6Var));
        ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).Ai();
    }
}
