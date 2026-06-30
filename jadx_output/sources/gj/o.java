package gj;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final gj.o f272367n = new gj.o();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f272368d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f272369e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public long f272370f = 16666666;

    /* renamed from: g, reason: collision with root package name */
    public int[] f272371g = new int[3];

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f272372h = new boolean[3];

    /* renamed from: i, reason: collision with root package name */
    public long[] f272373i = new long[3];

    /* renamed from: m, reason: collision with root package name */
    public boolean f272374m = false;

    public final synchronized void a(int i17, java.lang.Runnable runnable, boolean z17) {
        if (this.f272372h[i17]) {
            oj.j.f("Matrix.UIThreadMonitor", "[addFrameCallback] this type %s callback has exist! isAddHeader:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            return;
        }
        if (!this.f272368d && i17 == 0) {
            oj.j.f("Matrix.UIThreadMonitor", "[addFrameCallback] UIThreadMonitor is not alive!", new java.lang.Object[0]);
            return;
        }
        try {
            throw null;
        } catch (java.lang.Exception e17) {
            oj.j.b("Matrix.UIThreadMonitor", e17.toString(), new java.lang.Object[0]);
        }
    }

    public void b(jj.f fVar) {
        if (!this.f272368d) {
            e();
        }
        synchronized (this.f272369e) {
            this.f272369e.add(fVar);
        }
    }

    public final void c(int i17) {
        this.f272371g[i17] = 1;
        this.f272373i[i17] = java.lang.System.nanoTime();
    }

    public final void d(int i17) {
        this.f272371g[i17] = 2;
        this.f272373i[i17] = java.lang.System.nanoTime() - this.f272373i[i17];
        synchronized (this) {
            this.f272372h[i17] = false;
        }
    }

    public synchronized void e() {
        if (!this.f272374m) {
            oj.j.b("Matrix.UIThreadMonitor", "[onStart] is never init.", new java.lang.Object[0]);
            return;
        }
        if (!this.f272368d) {
            this.f272368d = true;
            synchronized (this) {
                oj.j.c("Matrix.UIThreadMonitor", "[onStart] callbackExist:%s %s", java.util.Arrays.toString(this.f272372h), lj.f.c());
                this.f272372h = new boolean[3];
                this.f272371g = new int[3];
                this.f272373i = new long[3];
                a(0, this, true);
            }
        }
    }

    public synchronized void f() {
        if (!this.f272374m) {
            oj.j.b("Matrix.UIThreadMonitor", "[onStart] is never init.", new java.lang.Object[0]);
            return;
        }
        if (this.f272368d) {
            this.f272368d = false;
            oj.j.c("Matrix.UIThreadMonitor", "[onStop] callbackExist:%s %s", java.util.Arrays.toString(this.f272372h), lj.f.c());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.nanoTime();
        c(0);
        a(1, new gj.m(this), true);
        a(2, new gj.n(this), true);
        throw null;
    }
}
