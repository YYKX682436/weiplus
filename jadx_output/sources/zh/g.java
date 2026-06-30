package zh;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f472847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f472848e;

    public g(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.lang.String str) {
        this.f472847d = atomicInteger;
        this.f472848e = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f472847d.set(android.os.Process.myTid());
        while (!this.f472848e.get()) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
