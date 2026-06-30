package s65;

/* loaded from: classes11.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403513e;

    public s(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI, java.lang.String str) {
        this.f403513e = appUpdaterUI;
        this.f403512d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).getClass();
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403513e;
        com.tencent.mm.pluginsdk.model.app.n1.d(appUpdaterUI, this.f403512d, null, false);
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI2 = com.tencent.mm.sandbox.updater.AppUpdaterUI.f192316m;
        appUpdaterUI.R6();
    }
}
