package s65;

/* loaded from: classes11.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403489d;

    public l(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403489d = appUpdaterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403489d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = appUpdaterUI.f192317e;
        if (j0Var == null || j0Var.isShowing()) {
            return;
        }
        appUpdaterUI.f192317e.show();
    }
}
