package p;

/* loaded from: classes12.dex */
public class b extends p.e {

    /* renamed from: b, reason: collision with root package name */
    public static volatile p.b f350333b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.Executor f350334c = new p.a();

    /* renamed from: a, reason: collision with root package name */
    public final p.e f350335a = new p.d();

    public static p.b a() {
        if (f350333b != null) {
            return f350333b;
        }
        synchronized (p.b.class) {
            if (f350333b == null) {
                f350333b = new p.b();
            }
        }
        return f350333b;
    }

    public void b(java.lang.Runnable runnable) {
        p.d dVar = (p.d) this.f350335a;
        if (dVar.f350339c == null) {
            synchronized (dVar.f350337a) {
                if (dVar.f350339c == null) {
                    dVar.f350339c = p.d.a(android.os.Looper.getMainLooper());
                }
            }
        }
        dVar.f350339c.post(runnable);
    }
}
