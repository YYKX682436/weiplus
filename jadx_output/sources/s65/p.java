package s65;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403503d;

    public p(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403503d = appUpdaterUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403503d;
        db5.e1.G(appUpdaterUI, appUpdaterUI.f192319g.f403535i, appUpdaterUI.getString(com.tencent.mm.R.string.f490573yv), true, new s65.n(this)).setOnCancelListener(new s65.o(this));
    }
}
