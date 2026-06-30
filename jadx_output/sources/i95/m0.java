package i95;

/* loaded from: classes12.dex */
public enum m0 implements java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f289815d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f289816e = new java.util.concurrent.atomic.AtomicInteger(0);

    m0() {
        java.lang.reflect.Field field;
        try {
            field = android.os.Looper.class.getDeclaredField("sThreadLocal");
            field.setAccessible(true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ServiceManager", th6, "Fail to get Looper TLS field.", new java.lang.Object[0]);
            field = null;
        }
        this.f289815d = field;
    }

    @Override // java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory
    public java.util.concurrent.ForkJoinWorkerThread newThread(java.util.concurrent.ForkJoinPool forkJoinPool) {
        int andIncrement = this.f289816e.getAndIncrement();
        i95.l0 l0Var = new i95.l0(this, forkJoinPool, forkJoinPool);
        l0Var.setName("wc_srvinit_" + andIncrement);
        l0Var.setPriority(6);
        return l0Var;
    }
}
