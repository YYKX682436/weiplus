package f95;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f260552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f260553e;

    public f(l75.k0 k0Var, java.lang.Runnable runnable) {
        this.f260552d = k0Var;
        this.f260553e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.k0 k0Var = this.f260552d;
        java.lang.Runnable runnable = this.f260553e;
        synchronized (d95.f.class) {
            java.util.Set set = f95.j.f260564a;
            if (!kz5.n0.O(set, k0Var.getPath())) {
                java.lang.String path = k0Var.getPath();
                if (path == null) {
                    path = "";
                }
                set.add(path);
                com.tencent.mars.xlog.Log.i("MicroMsg.WCDBPerformance", "executeTaskSilently");
                runnable.run();
            }
        }
    }
}
