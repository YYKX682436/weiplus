package ik1;

/* loaded from: classes7.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ik1.g0 f291830a;

    public static ik1.g0 a() {
        if (f291830a == null) {
            synchronized (ik1.h0.class) {
                if (f291830a == null) {
                    f291830a = new ik1.g0("Luggage.Common.ThreadUtil.WORKER_THREAD");
                }
            }
        }
        return f291830a;
    }

    public static void b(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
        }
    }
}
