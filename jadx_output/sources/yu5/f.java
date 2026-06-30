package yu5;

/* loaded from: classes12.dex */
public final class f implements yu5.a {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f465919f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f465920g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f465921h;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f465917d = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(yu5.f.class), "stubExecutor", "getStubExecutor()Ljava/util/concurrent/ScheduledExecutorService;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(yu5.f.class), "stubHandlerThreads", "getStubHandlerThreads()Ljava/util/List;"))};

    /* renamed from: i, reason: collision with root package name */
    public static final yu5.f f465922i = new yu5.f();

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Handler f465918e = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        jz5.i iVar = jz5.i.f302829d;
        f465919f = jz5.h.a(iVar, yu5.d.f465915d);
        f465920g = jz5.h.a(iVar, yu5.e.f465916d);
        f465921h = new java.util.LinkedHashMap();
    }

    @Override // yu5.a
    public java.util.concurrent.Future a(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.h(runnable, "runnable");
        return execute(runnable);
    }

    @Override // yu5.a
    public java.util.concurrent.Future b(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.h(runnable, "runnable");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        f465918e.post(futureTask);
        return new yu5.i(futureTask);
    }

    @Override // yu5.a
    public java.util.concurrent.Future d(java.lang.Runnable runnable, java.lang.String str) {
        android.os.Handler handler;
        kotlin.jvm.internal.o.h(runnable, "runnable");
        if (str == null) {
            return execute(runnable);
        }
        yu5.f fVar = f465922i;
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        fVar.getClass();
        java.util.Map map = f465921h;
        synchronized (map) {
            handler = (android.os.Handler) ((java.util.LinkedHashMap) map).get(str);
            if (handler == null) {
                jz5.g gVar = f465920g;
                f06.v vVar = f465917d[1];
                java.util.List list = (java.util.List) gVar.getValue();
                int hashCode = str.hashCode();
                if (hashCode < 0) {
                    hashCode *= -1;
                }
                android.os.HandlerThread handlerThread = (android.os.HandlerThread) list.get(hashCode % 50);
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                    handlerThread.getName();
                }
                android.os.Handler handler2 = new android.os.Handler(handlerThread.getLooper());
                handlerThread.getName();
                map.put(str, handler2);
                handler = handler2;
            }
        }
        handler.postDelayed(futureTask, 0L);
        return futureTask;
    }

    @Override // yu5.a
    public java.util.concurrent.Future e(java.lang.Runnable runnable, long j17) {
        kotlin.jvm.internal.o.h(runnable, "runnable");
        jz5.g gVar = f465919f;
        f06.v vVar = f465917d[0];
        java.util.concurrent.ScheduledFuture<?> schedule = ((java.util.concurrent.ScheduledExecutorService) gVar.getValue()).schedule(runnable, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
        kotlin.jvm.internal.o.c(schedule, "stubExecutor.schedule(ru…s, TimeUnit.MILLISECONDS)");
        return schedule;
    }

    @Override // yu5.a
    public java.util.concurrent.Future execute(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.h(runnable, "runnable");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        jz5.g gVar = f465919f;
        f06.v vVar = f465917d[0];
        ((java.util.concurrent.ScheduledExecutorService) gVar.getValue()).execute(futureTask);
        return futureTask;
    }
}
