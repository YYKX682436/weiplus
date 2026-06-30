package m8;

/* loaded from: classes15.dex */
public final class k implements m8.i {

    /* renamed from: a, reason: collision with root package name */
    public final q9.o f324573a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.n f324574b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f324575c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.p f324576d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f324577e;

    /* renamed from: f, reason: collision with root package name */
    public final m8.l0 f324578f;

    /* renamed from: g, reason: collision with root package name */
    public final m8.k0 f324579g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f324580h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f324581i;

    /* renamed from: j, reason: collision with root package name */
    public int f324582j;

    /* renamed from: k, reason: collision with root package name */
    public int f324583k;

    /* renamed from: l, reason: collision with root package name */
    public int f324584l;

    /* renamed from: m, reason: collision with root package name */
    public int f324585m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f324586n;

    /* renamed from: o, reason: collision with root package name */
    public m8.m0 f324587o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f324588p;

    /* renamed from: q, reason: collision with root package name */
    public d9.l0 f324589q;

    /* renamed from: r, reason: collision with root package name */
    public q9.n f324590r;

    /* renamed from: s, reason: collision with root package name */
    public m8.y f324591s;

    /* renamed from: t, reason: collision with root package name */
    public m8.m f324592t;

    /* renamed from: u, reason: collision with root package name */
    public int f324593u;

    /* renamed from: v, reason: collision with root package name */
    public long f324594v;

    public k(m8.b0[] b0VarArr, q9.o oVar, m8.u uVar) {
        java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int i17 = t9.d0.f416498a;
        t9.a.d(b0VarArr.length > 0);
        oVar.getClass();
        this.f324573a = oVar;
        this.f324581i = false;
        this.f324582j = 0;
        this.f324583k = 1;
        this.f324577e = new java.util.concurrent.CopyOnWriteArraySet();
        q9.n nVar = new q9.n(new q9.m[b0VarArr.length]);
        this.f324574b = nVar;
        this.f324587o = m8.m0.f324635a;
        this.f324578f = new m8.l0();
        this.f324579g = new m8.k0();
        this.f324589q = d9.l0.f227374d;
        this.f324590r = nVar;
        this.f324591s = m8.y.f324678d;
        m8.j jVar = new m8.j(this, android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper());
        this.f324575c = jVar;
        m8.m mVar = new m8.m(0, 0L);
        this.f324592t = mVar;
        this.f324576d = new m8.p(b0VarArr, oVar, uVar, this.f324581i, this.f324582j, jVar, mVar, this);
    }

    @Override // m8.a0
    public void a(m8.y yVar) {
        if (yVar == null) {
            yVar = m8.y.f324678d;
        }
        this.f324576d.f324649i.obtainMessage(4, yVar).sendToTarget();
    }

    @Override // m8.i
    public void b(m8.h... hVarArr) {
        m8.p pVar = this.f324576d;
        synchronized (pVar) {
            if (pVar.f324662y) {
                return;
            }
            int i17 = pVar.E;
            pVar.E = i17 + 1;
            pVar.f324649i.obtainMessage(11, hVarArr).sendToTarget();
            boolean z17 = false;
            while (pVar.F <= i17) {
                try {
                    pVar.wait();
                } catch (java.lang.InterruptedException unused) {
                    z17 = true;
                }
            }
            if (z17) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    @Override // m8.a0
    public boolean c() {
        return this.f324581i;
    }

    @Override // m8.a0
    public void d(m8.z zVar) {
        this.f324577e.remove(zVar);
    }

    @Override // m8.a0
    public void e(boolean z17) {
        if (this.f324581i != z17) {
            this.f324581i = z17;
            this.f324576d.f324649i.obtainMessage(1, z17 ? 1 : 0, 0).sendToTarget();
            java.util.Iterator it = this.f324577e.iterator();
            while (it.hasNext()) {
                ((m8.z) it.next()).y(z17, this.f324583k);
            }
        }
    }

    @Override // m8.i
    public void f(m8.h... hVarArr) {
        m8.p pVar = this.f324576d;
        if (pVar.f324662y) {
            return;
        }
        pVar.E++;
        pVar.f324649i.obtainMessage(11, hVarArr).sendToTarget();
    }

    public int g() {
        if (this.f324587o.j()) {
            return 0;
        }
        long i17 = (this.f324587o.j() || this.f324584l > 0) ? this.f324594v : i(this.f324592t.f324634e);
        long duration = getDuration();
        if (i17 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        int i18 = (int) ((i17 * 100) / duration);
        int i19 = t9.d0.f416498a;
        return java.lang.Math.max(0, java.lang.Math.min(i18, 100));
    }

    @Override // m8.a0
    public long getCurrentPosition() {
        return (this.f324587o.j() || this.f324584l > 0) ? this.f324594v : i(this.f324592t.f324633d);
    }

    @Override // m8.a0
    public long getDuration() {
        if (this.f324587o.j()) {
            return -9223372036854775807L;
        }
        if (!(!this.f324587o.j() && this.f324584l == 0 && this.f324592t.f324630a.a())) {
            return m8.b.b(this.f324587o.g(h(), this.f324578f).f324628f);
        }
        d9.z zVar = this.f324592t.f324630a;
        m8.m0 m0Var = this.f324587o;
        int i17 = zVar.f227427a;
        m8.k0 k0Var = this.f324579g;
        m0Var.c(i17, k0Var);
        long[] jArr = k0Var.f324604j[zVar.f227428b];
        int length = jArr.length;
        int i18 = zVar.f227429c;
        return m8.b.b(i18 < length ? jArr[i18] : -9223372036854775807L);
    }

    public int h() {
        return (this.f324587o.j() || this.f324584l > 0) ? this.f324593u : this.f324587o.d(this.f324592t.f324630a.f227427a, this.f324579g, false).f324597c;
    }

    public final long i(long j17) {
        long b17 = m8.b.b(j17);
        if (this.f324592t.f324630a.a()) {
            return b17;
        }
        m8.m0 m0Var = this.f324587o;
        int i17 = this.f324592t.f324630a.f227427a;
        m8.k0 k0Var = this.f324579g;
        m0Var.c(i17, k0Var);
        return b17 + m8.b.b(k0Var.f324599e);
    }

    public void j(d9.a0 a0Var) {
        boolean j17 = this.f324587o.j();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f324577e;
        if (!j17 || this.f324588p != null) {
            this.f324587o = m8.m0.f324635a;
            this.f324588p = null;
            java.util.Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((m8.z) it.next()).t(this.f324587o, this.f324588p);
            }
        }
        if (this.f324580h) {
            this.f324580h = false;
            this.f324589q = d9.l0.f227374d;
            this.f324590r = this.f324574b;
            q9.k kVar = (q9.k) this.f324573a;
            kVar.getClass();
            kVar.f360866c = null;
            java.util.Iterator it6 = copyOnWriteArraySet.iterator();
            while (it6.hasNext()) {
                ((m8.z) it6.next()).e(this.f324589q, this.f324590r);
            }
        }
        this.f324585m++;
        this.f324576d.f324649i.obtainMessage(0, 1, 0, a0Var).sendToTarget();
    }

    @Override // m8.a0
    public void release() {
        java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int i17 = t9.d0.f416498a;
        java.util.HashSet hashSet = m8.q.f324664a;
        synchronized (m8.q.class) {
            java.util.HashSet hashSet2 = m8.q.f324664a;
        }
        m8.p pVar = this.f324576d;
        synchronized (pVar) {
            if (!pVar.f324662y) {
                pVar.f324649i.sendEmptyMessage(6);
                boolean z17 = false;
                while (!pVar.f324662y) {
                    try {
                        pVar.wait();
                    } catch (java.lang.InterruptedException unused) {
                        z17 = true;
                    }
                }
                if (z17) {
                    java.lang.Thread.currentThread().interrupt();
                }
                pVar.f324650m.quit();
            }
        }
        this.f324575c.removeCallbacksAndMessages(null);
    }

    @Override // m8.a0
    public void seekTo(long j17) {
        int h17 = h();
        if (h17 < 0 || (!this.f324587o.j() && h17 >= this.f324587o.i())) {
            throw new m8.t(this.f324587o, h17, j17);
        }
        this.f324584l++;
        this.f324593u = h17;
        if (!this.f324587o.j()) {
            m8.m0 m0Var = this.f324587o;
            m8.l0 l0Var = this.f324578f;
            m0Var.g(h17, l0Var);
            long a17 = j17 == -9223372036854775807L ? l0Var.f324627e : m8.b.a(j17);
            int i17 = l0Var.f324625c;
            long j18 = l0Var.f324629g + a17;
            m8.m0 m0Var2 = this.f324587o;
            m8.k0 k0Var = this.f324579g;
            long j19 = m0Var2.d(i17, k0Var, false).f324598d;
            while (j19 != -9223372036854775807L && j18 >= j19 && i17 < l0Var.f324626d) {
                j18 -= j19;
                i17++;
                j19 = this.f324587o.d(i17, k0Var, false).f324598d;
            }
        }
        m8.p pVar = this.f324576d;
        if (j17 == -9223372036854775807L) {
            this.f324594v = 0L;
            pVar.f324649i.obtainMessage(3, new m8.n(this.f324587o, h17, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f324594v = j17;
        pVar.f324649i.obtainMessage(3, new m8.n(this.f324587o, h17, m8.b.a(j17))).sendToTarget();
        java.util.Iterator it = this.f324577e.iterator();
        while (it.hasNext()) {
            ((m8.z) it.next()).A();
        }
    }

    @Override // m8.a0
    public int t() {
        return this.f324583k;
    }
}
