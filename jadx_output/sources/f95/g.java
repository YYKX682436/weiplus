package f95;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f260554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f260556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f260557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f260558h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f260559i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f260560m;

    public g(l75.k0 k0Var, java.lang.String str, long j17, long j18, long j19, long j27, long j28) {
        this.f260554d = k0Var;
        this.f260555e = str;
        this.f260556f = j17;
        this.f260557g = j18;
        this.f260558h = j19;
        this.f260559i = j27;
        this.f260560m = j28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            return;
        }
        java.util.Set set = f95.j.f260564a;
        com.tencent.mars.xlog.Log.e("MicroMsg.WCDBPerformance", "vacuum too slow, kill self");
        this.f260554d.close();
        jx3.f.INSTANCE.d(f95.j.f260565b, this.f260555e, this.f260554d.getPath(), java.lang.Long.valueOf(this.f260556f), java.lang.Long.valueOf(java.lang.Math.min(this.f260557g, this.f260558h)), java.lang.Long.valueOf(this.f260559i), "slow-kill", 0, java.lang.Long.valueOf(this.f260560m), 0, 0, 0, 0, 0);
        try {
            java.lang.Thread.sleep(1000L);
        } catch (java.lang.InterruptedException unused) {
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/storagebase/trace/WCDBPerformance$dBVacuum$checkVacuumRunnable$1$vacuumRunnable$1$killSelfTask$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/storagebase/trace/WCDBPerformance$dBVacuum$checkVacuumRunnable$1$vacuumRunnable$1$killSelfTask$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
