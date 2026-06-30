package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class g2 extends kotlinx.coroutines.f2 implements kotlinx.coroutines.i1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f310476e;

    public g2(java.util.concurrent.Executor executor) {
        java.lang.reflect.Method method;
        this.f310476e = executor;
        java.lang.reflect.Method method2 = kotlinx.coroutines.internal.e.f310491a;
        try {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor ? (java.util.concurrent.ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = kotlinx.coroutines.internal.e.f310491a) != null) {
                method.invoke(scheduledThreadPoolExecutor, java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        try {
            this.f310476e.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            kotlinx.coroutines.v2.b(lVar, kotlinx.coroutines.e2.a("The task was rejected", e17));
            kotlinx.coroutines.q1.f310570c.D(lVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.f2
    public java.util.concurrent.Executor K() {
        return this.f310476e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.concurrent.Executor executor = this.f310476e;
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlinx.coroutines.g2) && ((kotlinx.coroutines.g2) obj).f310476e == this.f310476e;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.f310476e);
    }

    @Override // kotlinx.coroutines.p0
    public java.lang.String toString() {
        return this.f310476e.toString();
    }

    @Override // kotlinx.coroutines.i1
    public kotlinx.coroutines.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        java.util.concurrent.Executor executor = this.f310476e;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                kotlinx.coroutines.v2.b(lVar, kotlinx.coroutines.e2.a("The task was rejected", e17));
            }
        }
        return scheduledFuture != null ? new kotlinx.coroutines.r1(scheduledFuture) : kotlinx.coroutines.d1.f310157n.v(j17, runnable, lVar);
    }

    @Override // kotlinx.coroutines.i1
    public void w(long j17, kotlinx.coroutines.q qVar) {
        java.util.concurrent.Executor executor = this.f310476e;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            kotlinx.coroutines.p3 p3Var = new kotlinx.coroutines.p3(this, qVar);
            oz5.l lVar = ((kotlinx.coroutines.r) qVar).f310577e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(p3Var, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                kotlinx.coroutines.v2.b(lVar, kotlinx.coroutines.e2.a("The task was rejected", e17));
            }
        }
        if (scheduledFuture != null) {
            ((kotlinx.coroutines.r) qVar).m(new kotlinx.coroutines.m(scheduledFuture));
        } else {
            kotlinx.coroutines.d1.f310157n.w(j17, qVar);
        }
    }
}
