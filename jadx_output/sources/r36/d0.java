package r36;

/* loaded from: classes16.dex */
public final class d0 implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f369370d = new x36.k();

    /* renamed from: e, reason: collision with root package name */
    public boolean f369371e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f369372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.g0 f369373g;

    public d0(r36.g0 g0Var) {
        this.f369373g = g0Var;
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        x36.k kVar2 = this.f369370d;
        kVar2.U(kVar, j17);
        while (kVar2.f451694e >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z17) {
        r36.g0 g0Var;
        long min;
        r36.g0 g0Var2;
        synchronized (this.f369373g) {
            this.f369373g.f369404j.i();
            while (true) {
                try {
                    g0Var = this.f369373g;
                    if (g0Var.f369396b > 0 || this.f369372f || this.f369371e || g0Var.f369405k != null) {
                        break;
                    } else {
                        g0Var.g();
                    }
                } finally {
                }
            }
            g0Var.f369404j.m();
            this.f369373g.b();
            min = java.lang.Math.min(this.f369373g.f369396b, this.f369370d.f451694e);
            g0Var2 = this.f369373g;
            g0Var2.f369396b -= min;
        }
        g0Var2.f369404j.i();
        try {
            r36.g0 g0Var3 = this.f369373g;
            g0Var3.f369398d.l(g0Var3.f369397c, z17 && min == this.f369370d.f451694e, this.f369370d, min);
        } finally {
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f369373g) {
            if (this.f369371e) {
                return;
            }
            r36.g0 g0Var = this.f369373g;
            if (!g0Var.f369402h.f369372f) {
                if (this.f369370d.f451694e > 0) {
                    while (this.f369370d.f451694e > 0) {
                        a(true);
                    }
                } else {
                    g0Var.f369398d.l(g0Var.f369397c, true, null, 0L);
                }
            }
            synchronized (this.f369373g) {
                this.f369371e = true;
            }
            this.f369373g.f369398d.flush();
            this.f369373g.a();
        }
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        synchronized (this.f369373g) {
            this.f369373g.b();
        }
        while (this.f369370d.f451694e > 0) {
            a(false);
            this.f369373g.f369398d.flush();
        }
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f369373g.f369404j;
    }
}
