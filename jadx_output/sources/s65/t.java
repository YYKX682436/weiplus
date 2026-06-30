package s65;

/* loaded from: classes11.dex */
public class t implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.monitor.l f403516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403517e;

    public t(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI, com.tencent.mm.sandbox.monitor.l lVar) {
        this.f403517e = appUpdaterUI;
        this.f403516d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403517e;
        com.tencent.mm.sandbox.updater.AppUpdaterUI.Q6(appUpdaterUI, 11);
        com.tencent.mm.sandbox.monitor.l lVar = this.f403516d;
        if (lVar != null) {
            try {
                java.io.File file = new java.io.File(lVar.d());
                if (file.exists()) {
                    file.delete();
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MM.GetUpdatePack", "error in deleteTempFile");
            }
        }
        s65.x0 x0Var = appUpdaterUI.f192319g;
        x0Var.f403545s = true;
        x0Var.m(false);
    }
}
