package s65;

/* loaded from: classes11.dex */
public class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403466d;

    public h(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403466d = appUpdaterUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI.O6(this.f403466d, 2);
    }
}
