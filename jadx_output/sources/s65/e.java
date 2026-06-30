package s65;

/* loaded from: classes11.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppInstallerUI f403442d;

    public e(com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI) {
        this.f403442d = appInstallerUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 75L, 1L, true);
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI = this.f403442d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appInstallerUI.f192310e;
        if (j0Var == null || j0Var.isShowing()) {
            return;
        }
        appInstallerUI.f192310e.show();
    }
}
