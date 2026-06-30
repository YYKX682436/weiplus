package t56;

/* loaded from: classes16.dex */
public class y extends p56.p {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f415943f;

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.lang.Object f415947m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f415949d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f415950e;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Object f415948n = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f415945h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f415946i = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public static final int f415944g = java.lang.Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    static {
        boolean z17 = java.lang.Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int i17 = u56.i.f424830a;
        f415943f = !z17 && (i17 == 0 || i17 >= 21);
    }

    public y(java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory);
        if (!i(newScheduledThreadPool) && (newScheduledThreadPool instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
            g((java.util.concurrent.ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f415949d = newScheduledThreadPool;
    }

    public static java.lang.reflect.Method f(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        for (java.lang.reflect.Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == java.lang.Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public static void g(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = f415946i;
            if (((java.util.concurrent.ScheduledExecutorService) atomicReference.get()) != null) {
                break;
            }
            boolean z17 = true;
            java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, new u56.n("RxSchedulerPurge-"));
            while (true) {
                if (atomicReference.compareAndSet(null, newScheduledThreadPool)) {
                    break;
                } else if (atomicReference.get() != null) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                t56.x xVar = new t56.x();
                int i17 = f415944g;
                newScheduledThreadPool.scheduleAtFixedRate(xVar, i17, i17, java.util.concurrent.TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f415945h.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean i(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.lang.reflect.Method f17;
        if (f415943f) {
            if (scheduledExecutorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor) {
                java.lang.Object obj = f415947m;
                java.lang.Object obj2 = f415948n;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    f17 = f(scheduledExecutorService);
                    if (f17 != null) {
                        obj2 = f17;
                    }
                    f415947m = obj2;
                } else {
                    f17 = (java.lang.reflect.Method) obj;
                }
            } else {
                f17 = f(scheduledExecutorService);
            }
            if (f17 != null) {
                try {
                    f17.invoke(scheduledExecutorService, java.lang.Boolean.TRUE);
                    return true;
                } catch (java.lang.IllegalAccessException e17) {
                    x56.m.a(e17);
                } catch (java.lang.IllegalArgumentException e18) {
                    x56.m.a(e18);
                } catch (java.lang.reflect.InvocationTargetException e19) {
                    x56.m.a(e19);
                }
            }
        }
        return false;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415950e;
    }

    @Override // p56.s
    public void c() {
        this.f415950e = true;
        this.f415949d.shutdownNow();
        f415945h.remove(this.f415949d);
    }

    @Override // p56.p
    public p56.s d(r56.a aVar) {
        return e(aVar, 0L, null);
    }

    @Override // p56.p
    public p56.s e(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f415950e ? a66.g.f1801a : h(aVar, j17, timeUnit);
    }

    public t56.c0 h(r56.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        t56.c0 c0Var = new t56.c0(x56.m.c(aVar));
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f415949d;
        c0Var.f415862d.a(new t56.z(c0Var, j17 <= 0 ? scheduledExecutorService.submit(c0Var) : scheduledExecutorService.schedule(c0Var, j17, timeUnit)));
        return c0Var;
    }
}
