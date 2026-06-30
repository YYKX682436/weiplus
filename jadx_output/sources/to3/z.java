package to3;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.a0 f420988d;

    public z(to3.a0 a0Var, to3.w wVar) {
        this.f420988d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineTokensMgr", "mUpdateTokenRunnable, do doNetSceneToken");
        if (gm0.j1.b().m()) {
            this.f420988d.b(6, 6);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OfflineTokensMgr", "account not init.");
        }
    }
}
