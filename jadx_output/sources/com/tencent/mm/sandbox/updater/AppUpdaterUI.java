package com.tencent.mm.sandbox.updater;

/* loaded from: classes11.dex */
public class AppUpdaterUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.sandbox.updater.AppUpdaterUI f192316m;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f192318f;

    /* renamed from: g, reason: collision with root package name */
    public s65.x0 f192319g;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f192317e = null;

    /* renamed from: h, reason: collision with root package name */
    public final s65.n0 f192320h = new s65.m(this);

    /* renamed from: i, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f192321i = new s65.r(this);

    public static void O6(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI, int i17) {
        appUpdaterUI.f192319g.k();
        appUpdaterUI.f192319g.l(i17, true);
        appUpdaterUI.R6();
    }

    public static void P6(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        appUpdaterUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 65L, 1L, true);
        db5.e1.G(appUpdaterUI, appUpdaterUI.getString(com.tencent.mm.R.string.k3c), appUpdaterUI.getString(com.tencent.mm.R.string.f490573yv), true, new s65.i(appUpdaterUI)).setOnCancelListener(new s65.j(appUpdaterUI));
    }

    public static void Q6(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI, int i17) {
        appUpdaterUI.getClass();
        s65.o0.h(appUpdaterUI, i17);
    }

    public final void R6() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f192317e;
        if (j0Var != null && j0Var.isShowing()) {
            this.f192317e.dismiss();
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String[] strArr;
        super.onCreate(bundle);
        q65.d.a(hashCode(), this);
        com.tencent.mm.ui.MMActivity.initLanguage(this);
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI = com.tencent.mm.sandbox.updater.AppInstallerUI.f192309n;
        if (appInstallerUI != null && !appInstallerUI.isFinishing()) {
            finish();
            return;
        }
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = f192316m;
        if (appUpdaterUI != null && !appUpdaterUI.isFinishing() && f192316m != this) {
            finish();
            return;
        }
        f192316m = this;
        setContentView(com.tencent.mm.R.layout.a8u);
        s65.x0 x0Var = s65.w0.f403525a;
        this.f192319g = x0Var;
        if (!x0Var.o(getIntent())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUpdaterUI", "updaterManager.handleCommand return false");
            R6();
            return;
        }
        s65.x0 x0Var2 = this.f192319g;
        if (x0Var2.f403530d == 999 && (strArr = x0Var2.f403539m) != null && strArr.length > 0) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new s65.p(this), 100L);
            return;
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.fdx);
        aVar.A = true;
        aVar.G = new s65.q(this);
        s65.x0 x0Var3 = this.f192319g;
        java.lang.String string = (!x0Var3.f403542p || x0Var3.f403541o == null) ? getString(com.tencent.mm.R.string.fdz, x0Var3.f403535i, getString(com.tencent.mm.R.string.k37), com.tencent.mm.sdk.platformtools.t8.f0(this.f192319g.f403538l)) : getString(com.tencent.mm.R.string.fdz, x0Var3.f403535i, getString(com.tencent.mm.R.string.k3a), com.tencent.mm.sdk.platformtools.t8.f0(this.f192319g.f403541o.f428505e));
        int i17 = this.f192319g.f403530d != 1 ? com.tencent.mm.R.string.f493416k33 : com.tencent.mm.R.string.f493419k36;
        aVar.f211729s = string;
        aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.k3e);
        aVar.E = this.f192321i;
        aVar.Z = false;
        aVar.f211733w = of5.b.a(this).getString(i17);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        this.f192317e = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f192318f = this.f192317e.f(-1);
        this.f192317e.getClass();
        this.f192317e.show();
        if (this.f192319g.f403544r == 1) {
            s65.o0.g(this, 5, 0);
        }
        if (this.f192319g.f403547u) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 60L, 1L, false);
        }
        s65.x0 x0Var4 = this.f192319g;
        s65.n0 n0Var = this.f192320h;
        if (n0Var == null) {
            x0Var4.getClass();
            return;
        }
        java.util.ArrayList arrayList = x0Var4.f403528b;
        if (arrayList.contains(n0Var)) {
            return;
        }
        arrayList.add(n0Var);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        q65.d.b(hashCode(), this);
        s65.x0 x0Var = this.f192319g;
        if (x0Var != null) {
            x0Var.f403528b.remove(this.f192320h);
        }
        if (f192316m == this) {
            f192316m = null;
        }
        super.onDestroy();
    }
}
