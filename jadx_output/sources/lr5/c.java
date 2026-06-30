package lr5;

/* loaded from: classes13.dex */
public class c implements lr5.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f320765d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f320766e = new java.util.concurrent.ConcurrentHashMap();

    public c(lr5.a aVar) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("dns-main");
        handlerThread.start();
        this.f320765d = new android.os.Handler(handlerThread.getLooper());
    }

    public void a(java.lang.Runnable runnable) {
        java.lang.Runnable runnable2;
        if (runnable == null || (runnable2 = (java.lang.Runnable) ((java.util.concurrent.ConcurrentHashMap) this.f320766e).get(runnable)) == null) {
            return;
        }
        this.f320765d.removeCallbacks(runnable2);
    }

    public void b(java.lang.Runnable runnable, long j17) {
        if (runnable != null) {
            lr5.a aVar = new lr5.a(runnable);
            if (0 >= j17) {
                execute(aVar);
            } else {
                ((java.util.concurrent.ConcurrentHashMap) this.f320766e).put(runnable, aVar);
                this.f320765d.postDelayed(aVar, j17);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (runnable != null) {
            this.f320765d.post(new lr5.a(runnable));
        }
    }
}
