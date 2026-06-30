package j3;

/* loaded from: classes11.dex */
public class j implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f297336d;

    public j(android.os.Handler handler) {
        handler.getClass();
        this.f297336d = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        android.os.Handler handler = this.f297336d;
        if (handler.post(runnable)) {
            return;
        }
        throw new java.util.concurrent.RejectedExecutionException(handler + " is shutting down");
    }
}
