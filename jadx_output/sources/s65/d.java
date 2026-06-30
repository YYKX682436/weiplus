package s65;

/* loaded from: classes11.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppInstallerUI f403439d;

    public d(com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI) {
        this.f403439d = appInstallerUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI = this.f403439d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appInstallerUI.f192310e;
        if (j0Var != null && j0Var.isShowing()) {
            appInstallerUI.f192310e.dismiss();
        }
        s65.w0.f403525a.l(2, true);
        if (appInstallerUI.f192314i == 2) {
            s65.o0.g(appInstallerUI, 4, 0);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 74L, 1L, true);
        s65.o0.e();
        appInstallerUI.finish();
    }
}
