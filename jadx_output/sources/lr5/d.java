package lr5;

/* loaded from: classes13.dex */
public class d implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Executor f320767d;

    public d(lr5.a aVar) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = lr5.e.f320768a;
        this.f320767d = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (runnable != null) {
            this.f320767d.execute(new lr5.a(runnable));
        }
    }
}
