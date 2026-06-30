package kj;

/* loaded from: classes12.dex */
public class q extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static ej.c f308260e;

    /* renamed from: f, reason: collision with root package name */
    public static android.os.HandlerThread f308261f;

    /* renamed from: g, reason: collision with root package name */
    public static android.os.Handler f308262g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Runnable f308263h;

    public q(ej.c cVar) {
        f308260e = cVar;
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (f308260e.f253258e) {
            f308261f = new android.os.HandlerThread("IdleHandlerLagThread");
            f308263h = new kj.n();
            try {
                android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
                java.lang.reflect.Field declaredField = android.os.MessageQueue.class.getDeclaredField("mIdleHandlers");
                declaredField.setAccessible(true);
                declaredField.set(queue, new kj.o());
                f308261f.start();
                f308262g = new android.os.Handler(f308261f.getLooper());
            } catch (java.lang.Throwable th6) {
                oj.j.b("Matrix.IdleHandlerLagTracer", "reflect idle handler error = " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (f308260e.f253258e) {
            f308262g.removeCallbacksAndMessages(null);
        }
    }
}
