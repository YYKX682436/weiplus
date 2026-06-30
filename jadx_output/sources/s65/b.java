package s65;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppInstallerUI f403432d;

    public b(com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI) {
        this.f403432d = appInstallerUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI = this.f403432d;
        if (appInstallerUI.f192314i == 2) {
            s65.o0.g(appInstallerUI, 3, 0);
        }
        java.lang.String c17 = com.tencent.mm.sandbox.monitor.l.c(appInstallerUI.f192312g, false);
        if (c17 != null) {
            s65.w0.f403525a.l(1, true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 72L, 1L, true);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new s65.c(appInstallerUI, c17), 300L);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 73L, 1L, true);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppInstallerUI", "pack not found!");
        db5.e1.T(appInstallerUI, appInstallerUI.getString(com.tencent.mm.R.string.f493418k35));
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "clearUpdateConfigPrefs");
        appInstallerUI.finish();
    }
}
