package nm;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: g, reason: collision with root package name */
    public static final nm.j f338443g = new nm.j();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Queue f338444a = new java.util.ArrayDeque(64);

    /* renamed from: b, reason: collision with root package name */
    public boolean f338445b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f338446c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f338447d = true;

    /* renamed from: e, reason: collision with root package name */
    public volatile km5.d f338448e = km5.u.d();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f338449f = new java.util.concurrent.atomic.AtomicBoolean(false);

    public synchronized void a(java.lang.Runnable runnable) {
        lm5.d a17;
        boolean z17;
        lm5.j jVar = lm5.d.f319600a;
        a17 = lm5.i.a();
        if (!(a17 instanceof lm5.c)) {
            lm5.i.c(a17.d(), a17);
        }
        synchronized (this) {
            if (!this.f338445b || this.f338447d) {
                if (this.f338446c) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement arrange runnable postToMainThread %s", runnable);
            ((km5.q) this.f338448e).n(new nm.b(runnable, a17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement", "arrange first screen runnable: %s, %s, %s, %s", java.lang.Boolean.valueOf(this.f338445b), java.lang.Boolean.valueOf(this.f338447d), java.lang.Boolean.valueOf(this.f338446c), this.f338444a);
            ((java.util.ArrayDeque) this.f338444a).add(new nm.b(runnable, a17));
        }
    }

    public final synchronized void b() {
        boolean z17;
        synchronized (this) {
            if (!this.f338445b || this.f338447d) {
                if (this.f338446c) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        if (!z17) {
            return;
        }
        lm5.j jVar = lm5.d.f319600a;
        lm5.d a17 = lm5.i.a();
        if (!(a17 instanceof lm5.c)) {
            lm5.i.c(a17.d(), a17);
        }
        while (true) {
            nm.b bVar = (nm.b) ((java.util.ArrayDeque) this.f338444a).poll();
            if (bVar == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s", bVar.f338426a, bVar.f338427b.d());
            ((km5.q) this.f338448e).n(bVar);
        }
    }
}
