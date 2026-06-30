package s65;

/* loaded from: classes11.dex */
public class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppInstallerUI f403430d;

    public a(com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI) {
        this.f403430d = appInstallerUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI = this.f403430d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appInstallerUI.f192310e;
        if (j0Var != null && j0Var.isShowing()) {
            appInstallerUI.f192310e.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = appInstallerUI.f192311f;
        if (j0Var2 == null || !j0Var2.isShowing()) {
            appInstallerUI.f192311f = db5.e1.k(appInstallerUI, com.tencent.mm.R.string.aq_, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.aqa, com.tencent.mm.R.string.bkw, false, new s65.d(appInstallerUI), new s65.e(appInstallerUI));
        }
    }
}
