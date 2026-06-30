package s65;

/* loaded from: classes11.dex */
public class m implements s65.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403492a;

    public m(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403492a = appUpdaterUI;
    }

    @Override // s65.n0
    public void a(int i17, int i18) {
        int i19 = (int) (i17 <= 0 ? 0L : (i18 * 100) / i17);
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403492a;
        if (i19 == 100) {
            appUpdaterUI.f192318f.setText(appUpdaterUI.getString(com.tencent.mm.R.string.k3b));
            return;
        }
        appUpdaterUI.f192318f.setText(appUpdaterUI.getString(com.tencent.mm.R.string.k3_) + i19 + "%");
    }

    @Override // s65.n0
    public void b() {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403492a;
        if (appUpdaterUI.isFinishing()) {
            return;
        }
        appUpdaterUI.f192318f.setText(com.tencent.mm.R.string.k3_);
        appUpdaterUI.f192318f.setEnabled(false);
    }

    @Override // s65.n0
    public void c(java.lang.String str) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403492a;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appUpdaterUI.f192317e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        if (appUpdaterUI.isFinishing() || str == null) {
            return;
        }
        appUpdaterUI.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(405L, 70L, 1L, true);
        if (appUpdaterUI.f192319g.f403547u) {
            g0Var.idkeyStat(614L, 50L, 1L, false);
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new s65.s(appUpdaterUI, str), 300L);
        appUpdaterUI.f192318f.setEnabled(false);
    }

    @Override // s65.n0
    public void f() {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403492a;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appUpdaterUI.f192317e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        if (appUpdaterUI.isFinishing()) {
            return;
        }
        appUpdaterUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 66L, 1L, true);
        db5.e1.G(appUpdaterUI, appUpdaterUI.getString(com.tencent.mm.R.string.k3f), appUpdaterUI.getString(com.tencent.mm.R.string.f490573yv), true, new s65.v(appUpdaterUI)).setOnCancelListener(new s65.h(appUpdaterUI));
    }

    @Override // s65.n0
    public void h(com.tencent.mm.sandbox.monitor.l lVar) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403492a;
        if (appUpdaterUI.isFinishing()) {
            return;
        }
        if (!(lVar instanceof s65.g0)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 69L, 1L, true);
            db5.e1.n(appUpdaterUI, com.tencent.mm.R.string.k38, com.tencent.mm.R.string.f490573yv, new s65.f(this), new s65.g(this));
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(405L, 67L, 1L, true);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppUpdaterUI", "download package from cdn error. switch to webserver");
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appUpdaterUI.f192317e;
        if (j0Var != null) {
            j0Var.t(appUpdaterUI.getString(com.tencent.mm.R.string.fdz, appUpdaterUI.f192319g.f403535i, appUpdaterUI.getString(com.tencent.mm.R.string.k37), com.tencent.mm.sdk.platformtools.t8.f0(appUpdaterUI.f192319g.f403538l)));
        }
        if (appUpdaterUI.f192319g.f403542p) {
            g0Var.idkeyStat(405L, 68L, 1L, true);
            com.tencent.mm.ui.widget.dialog.j0 G = db5.e1.G(appUpdaterUI, appUpdaterUI.getString(com.tencent.mm.R.string.fdy, com.tencent.mm.sdk.platformtools.t8.f0(appUpdaterUI.f192319g.f403538l)), appUpdaterUI.getString(com.tencent.mm.R.string.f490573yv), true, new s65.t(appUpdaterUI, lVar));
            G.setOnCancelListener(new s65.u(appUpdaterUI));
            G.setCanceledOnTouchOutside(false);
        }
    }

    @Override // s65.n0
    public void i() {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppUpdaterUI", "no sdcard.");
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403492a;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appUpdaterUI.f192317e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        if (appUpdaterUI.isFinishing()) {
            return;
        }
        com.tencent.mm.sandbox.updater.AppUpdaterUI.P6(appUpdaterUI);
    }
}
