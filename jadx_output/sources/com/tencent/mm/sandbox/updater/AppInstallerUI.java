package com.tencent.mm.sandbox.updater;

/* loaded from: classes11.dex */
public class AppInstallerUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: n, reason: collision with root package name */
    public static com.tencent.mm.sandbox.updater.AppInstallerUI f192309n;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f192312g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f192313h;

    /* renamed from: i, reason: collision with root package name */
    public int f192314i;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f192310e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f192311f = null;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f192315m = new s65.b(this);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        q65.d.a(hashCode(), this);
        com.tencent.mm.ui.MMActivity.initLanguage(this);
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = com.tencent.mm.sandbox.updater.AppUpdaterUI.f192316m;
        if (appUpdaterUI != null && !appUpdaterUI.isFinishing()) {
            finish();
            return;
        }
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI = f192309n;
        if (appInstallerUI != null && !appInstallerUI.isFinishing() && f192309n != this) {
            finish();
            return;
        }
        f192309n = this;
        java.lang.String a17 = s65.o0.a();
        this.f192312g = a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17) || com.tencent.mm.sandbox.monitor.l.c(this.f192312g, false) == null) {
            finish();
            return;
        }
        this.f192313h = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4)).getString("update_downloaded_pack_desc_key", null);
        this.f192314i = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4)).getInt("update_downloaded_pack_download_mode", 0);
        setContentView(com.tencent.mm.R.layout.a8u);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.fdx);
        aVar.A = true;
        aVar.G = new s65.a(this);
        aVar.f211729s = getString(com.tencent.mm.R.string.f492145fe0, this.f192313h);
        aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.g1e);
        aVar.E = this.f192315m;
        aVar.Z = false;
        aVar.f211733w = of5.b.a(this).getString(com.tencent.mm.R.string.f493416k33);
        aVar.F = null;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        this.f192310e = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f192310e.show();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 71L, 1L, true);
        if (this.f192314i == 2) {
            int i17 = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4)).getInt("update_downloaded_cancel_times", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "getIgnoreDownloadedPackTimes times %s", java.lang.Integer.valueOf(i17));
            s65.o0.g(this, 2, i17 + 1);
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f192310e;
        if (j0Var != null && j0Var.isShowing()) {
            this.f192310e.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = this.f192311f;
        if (j0Var2 != null && j0Var2.isShowing()) {
            this.f192311f.dismiss();
        }
        if (f192309n == this) {
            f192309n = null;
        }
        q65.d.b(hashCode(), this);
        super.onDestroy();
    }
}
