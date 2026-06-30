package x56;

/* loaded from: classes16.dex */
public abstract class m {

    /* renamed from: f, reason: collision with root package name */
    public static volatile r56.e f452133f;

    /* renamed from: a, reason: collision with root package name */
    public static volatile r56.b f452128a = new x56.f();

    /* renamed from: d, reason: collision with root package name */
    public static volatile r56.f f452131d = new x56.g();

    /* renamed from: h, reason: collision with root package name */
    public static volatile r56.e f452135h = new x56.h();

    /* renamed from: e, reason: collision with root package name */
    public static volatile r56.f f452132e = new x56.i();

    /* renamed from: g, reason: collision with root package name */
    public static volatile r56.e f452134g = new x56.j();

    /* renamed from: i, reason: collision with root package name */
    public static volatile r56.e f452136i = new x56.k();

    /* renamed from: k, reason: collision with root package name */
    public static volatile r56.e f452138k = new x56.l();

    /* renamed from: j, reason: collision with root package name */
    public static volatile r56.e f452137j = new x56.c();

    /* renamed from: b, reason: collision with root package name */
    public static volatile r56.e f452129b = new x56.d();

    /* renamed from: c, reason: collision with root package name */
    public static volatile r56.e f452130c = new x56.e();

    public static void a(java.lang.Throwable th6) {
        r56.b bVar = f452128a;
        if (bVar != null) {
            try {
                ((x56.f) bVar).call(th6);
                return;
            } catch (java.lang.Throwable th7) {
                java.lang.System.err.println("The onError handler threw an Exception. It shouldn't. => " + th7.getMessage());
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th7);
            }
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th6);
    }

    public static java.lang.Throwable b(java.lang.Throwable th6) {
        r56.e eVar = f452136i;
        return eVar != null ? (java.lang.Throwable) ((x56.k) eVar).call(th6) : th6;
    }

    public static r56.a c(r56.a aVar) {
        r56.e eVar = f452134g;
        return eVar != null ? (r56.a) ((x56.j) eVar).call(aVar) : aVar;
    }
}
