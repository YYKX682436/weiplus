package fo1;

/* loaded from: classes5.dex */
public class q implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f264891d = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f264892e;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        this.f264891d.await();
        return this.f264892e;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f264891d.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (this.f264891d.await(j17, timeUnit)) {
            return this.f264892e;
        }
        throw new java.util.concurrent.TimeoutException();
    }
}
