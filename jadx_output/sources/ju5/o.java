package ju5;

/* loaded from: classes15.dex */
public class o {

    /* renamed from: d, reason: collision with root package name */
    public static volatile ju5.o f302134d;

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f302135a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f302136b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f302137c;

    public o() {
        this.f302136b = null;
        this.f302137c = null;
        if (this.f302135a == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("SoterGenKeyHandlerThreadName");
            this.f302135a = handlerThread;
            handlerThread.start();
            if (this.f302135a.getLooper() != null) {
                this.f302136b = new android.os.Handler(this.f302135a.getLooper());
            } else {
                zt5.h.b("Soter.SoterTaskThread", "soter: task looper is null! use main looper as the task looper", new java.lang.Object[0]);
                this.f302136b = new android.os.Handler(android.os.Looper.getMainLooper());
            }
        }
        this.f302137c = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static ju5.o a() {
        ju5.o oVar;
        if (f302134d != null) {
            return f302134d;
        }
        synchronized (ju5.o.class) {
            if (f302134d == null) {
                f302134d = new ju5.o();
            }
            oVar = f302134d;
        }
        return oVar;
    }

    public void b(java.lang.Runnable runnable) {
        this.f302137c.post(runnable);
    }

    public void c(java.lang.Runnable runnable) {
        this.f302136b.post(runnable);
    }
}
