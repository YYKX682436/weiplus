package s65;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppInstallerUI f403436e;

    public c(com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI, java.lang.String str) {
        this.f403436e = appInstallerUI;
        this.f403435d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).getClass();
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI = this.f403436e;
        com.tencent.mm.pluginsdk.model.app.n1.d(appInstallerUI, this.f403435d, null, false);
        com.tencent.mm.sandbox.updater.AppInstallerUI appInstallerUI2 = com.tencent.mm.sandbox.updater.AppInstallerUI.f192309n;
        appInstallerUI.finish();
    }
}
