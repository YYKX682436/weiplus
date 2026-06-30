package s65;

/* loaded from: classes11.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s65.p f403502d;

    public o(s65.p pVar) {
        this.f403502d = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403502d.f403503d;
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI2 = com.tencent.mm.sandbox.updater.AppUpdaterUI.f192316m;
        appUpdaterUI.R6();
    }
}
