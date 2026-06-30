package hh;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f281443a = new android.os.Handler(android.os.Looper.getMainLooper());

    public static final boolean a() {
        return kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
    }

    public static final void b(java.lang.Runnable run) {
        kotlin.jvm.internal.o.g(run, "run");
        if (a()) {
            run.run();
        } else {
            f281443a.post(run);
        }
    }
}
