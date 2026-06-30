package s65;

/* loaded from: classes11.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403486d;

    public k(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403486d = appUpdaterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403486d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appUpdaterUI.f192317e;
        if (j0Var != null && j0Var.isShowing()) {
            appUpdaterUI.f192317e.dismiss();
        }
        com.tencent.mm.sandbox.updater.AppUpdaterUI.Q6(appUpdaterUI, 6);
        if (appUpdaterUI.f192319g.f403547u) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 59L, 1L, true);
        }
        appUpdaterUI.f192319g.k();
        appUpdaterUI.f192319g.l(2, true);
        appUpdaterUI.R6();
    }
}
