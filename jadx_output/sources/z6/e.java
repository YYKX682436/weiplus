package z6;

/* loaded from: classes13.dex */
public final class e implements java.util.concurrent.ExecutorService {

    /* renamed from: e, reason: collision with root package name */
    public static final long f470309e = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f470310f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f470311d;

    public e(java.util.concurrent.ExecutorService executorService) {
        this.f470311d = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f470311d.awaitTermination(j17, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f470311d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List invokeAll(java.util.Collection collection) {
        return this.f470311d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.lang.Object invokeAny(java.util.Collection collection) {
        return this.f470311d.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f470311d.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f470311d.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f470311d.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List shutdownNow() {
        return this.f470311d.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return this.f470311d.submit(runnable);
    }

    public java.lang.String toString() {
        return this.f470311d.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List invokeAll(java.util.Collection collection, long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f470311d.invokeAll(collection, j17, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.lang.Object invokeAny(java.util.Collection collection, long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f470311d.invokeAny(collection, j17, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return this.f470311d.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return this.f470311d.submit(callable);
    }
}
