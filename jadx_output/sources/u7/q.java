package u7;

/* loaded from: classes13.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final u7.t f425072a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.a f425073b;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f425076e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Thread f425077f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f425078g;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f425074c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f425075d = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile int f425079h = -1;

    public q(u7.t tVar, u7.a aVar) {
        tVar.getClass();
        this.f425072a = tVar;
        aVar.getClass();
        this.f425073b = aVar;
        this.f425076e = new java.util.concurrent.atomic.AtomicInteger();
    }

    public final void a() {
        u7.t tVar = this.f425072a;
        try {
            ((u7.l) tVar).a();
        } catch (u7.r e17) {
            new u7.r("Error closing source " + tVar, e17);
        }
    }

    public final void b(long j17, long j18) {
        int i17 = (j18 > 0L ? 1 : (j18 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((((float) j17) / ((float) j18)) * 100.0f);
        boolean z17 = i17 != this.f425079h;
        if ((j18 >= 0) && z17) {
            c(i17);
        }
        this.f425079h = i17;
        synchronized (this.f425074c) {
            this.f425074c.notifyAll();
        }
    }

    public abstract void c(int i17);

    public void d() {
        synchronized (this.f425075d) {
            java.util.Objects.toString(this.f425072a);
            try {
                this.f425078g = true;
                if (this.f425077f != null) {
                    this.f425077f.interrupt();
                }
                ((v7.b) this.f425073b).c();
            } catch (u7.r e17) {
                boolean z17 = e17 instanceof u7.n;
            }
        }
    }

    public final void e() {
        boolean z17;
        synchronized (this.f425075d) {
            if (!java.lang.Thread.currentThread().isInterrupted() && !this.f425078g) {
                z17 = false;
                if (!z17 && ((v7.b) this.f425073b).b() == ((u7.l) this.f425072a).c()) {
                    ((v7.b) this.f425073b).d();
                }
            }
            z17 = true;
            if (!z17) {
                ((v7.b) this.f425073b).d();
            }
        }
    }
}
