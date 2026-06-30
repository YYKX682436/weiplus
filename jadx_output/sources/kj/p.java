package kj;

/* loaded from: classes12.dex */
public class p implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.MessageQueue.IdleHandler f308259d;

    public p(android.os.MessageQueue.IdleHandler idleHandler) {
        this.f308259d = idleHandler;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Handler handler = kj.q.f308262g;
        java.lang.Runnable runnable = kj.q.f308263h;
        kj.q.f308260e.getClass();
        handler.postDelayed(runnable, 2000);
        boolean queueIdle = this.f308259d.queueIdle();
        kj.q.f308262g.removeCallbacks(kj.q.f308263h);
        return queueIdle;
    }
}
