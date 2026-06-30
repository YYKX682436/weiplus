package yu5;

/* loaded from: classes12.dex */
public class i implements java.util.concurrent.Future {

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Handler f465926e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Future f465927d;

    public i(java.util.concurrent.Future future) {
        this.f465927d = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        if (z17) {
            f465926e.postAtFrontOfQueue(new yu5.h(new java.lang.UnsupportedOperationException("Cannot cancel a main thread FutureTask with parameter 'mayInterruptIfRunning' equals to true.")));
        }
        return this.f465927d.cancel(z17);
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f465927d.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f465927d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f465927d.isDone();
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f465927d.get(j17, timeUnit);
    }
}
