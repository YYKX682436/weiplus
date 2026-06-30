package s65;

/* loaded from: classes11.dex */
public class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403520d;

    public u(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403520d = appUpdaterUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403520d;
        com.tencent.mm.sandbox.updater.AppUpdaterUI.Q6(appUpdaterUI, 12);
        com.tencent.mm.sandbox.updater.AppUpdaterUI.O6(appUpdaterUI, 2);
    }
}
