package t56;

/* loaded from: classes16.dex */
public final class r implements t56.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ScheduledExecutorService[] f415932e = new java.util.concurrent.ScheduledExecutorService[0];

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ScheduledExecutorService f415933f;

    /* renamed from: g, reason: collision with root package name */
    public static final t56.r f415934g;

    /* renamed from: h, reason: collision with root package name */
    public static int f415935h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f415936d = new java.util.concurrent.atomic.AtomicReference(f415932e);

    static {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(0);
        f415933f = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f415934g = new t56.r();
    }

    public r() {
        start();
    }

    public static java.util.concurrent.ScheduledExecutorService a() {
        java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr = (java.util.concurrent.ScheduledExecutorService[]) f415934g.f415936d.get();
        if (scheduledExecutorServiceArr == f415932e) {
            return f415933f;
        }
        int i17 = f415935h + 1;
        if (i17 >= scheduledExecutorServiceArr.length) {
            i17 = 0;
        }
        f415935h = i17;
        return scheduledExecutorServiceArr[i17];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t56.d0
    public void shutdown() {
        java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr;
        int i17;
        boolean z17;
        do {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f415936d;
            scheduledExecutorServiceArr = (java.util.concurrent.ScheduledExecutorService[]) atomicReference.get();
            java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr2 = f415932e;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
            while (true) {
                if (!atomicReference.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2)) {
                    if (atomicReference.get() != scheduledExecutorServiceArr) {
                        z17 = false;
                        break;
                    }
                } else {
                    z17 = true;
                    break;
                }
            }
        } while (!z17);
        for (java.util.concurrent.ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            t56.y.f415945h.remove(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t56.d0
    public void start() {
        boolean z17;
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr = new java.util.concurrent.ScheduledExecutorService[availableProcessors];
        int i17 = 0;
        int i18 = 0;
        while (true) {
            z17 = true;
            if (i18 >= availableProcessors) {
                break;
            }
            scheduledExecutorServiceArr[i18] = java.util.concurrent.Executors.newScheduledThreadPool(1, t56.s.f415937d);
            i18++;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f415936d;
            java.util.concurrent.ScheduledExecutorService[] scheduledExecutorServiceArr2 = f415932e;
            if (atomicReference.compareAndSet(scheduledExecutorServiceArr2, scheduledExecutorServiceArr)) {
                break;
            } else if (atomicReference.get() != scheduledExecutorServiceArr2) {
                z17 = false;
                break;
            }
        }
        if (!z17) {
            while (i17 < availableProcessors) {
                scheduledExecutorServiceArr[i17].shutdownNow();
                i17++;
            }
        } else {
            while (i17 < availableProcessors) {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i17];
                if (!t56.y.i(scheduledExecutorService) && (scheduledExecutorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
                    t56.y.g((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i17++;
            }
        }
    }
}
