package te1;

/* loaded from: classes13.dex */
public class s {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f417820v = new java.util.concurrent.atomic.AtomicInteger(10000);

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f417821a;

    /* renamed from: d, reason: collision with root package name */
    public te1.t f417824d;

    /* renamed from: i, reason: collision with root package name */
    public long f417829i;

    /* renamed from: j, reason: collision with root package name */
    public long f417830j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f417832l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f417833m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f417834n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f417835o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f417836p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f417837q;

    /* renamed from: t, reason: collision with root package name */
    public int f417840t;

    /* renamed from: b, reason: collision with root package name */
    public int f417822b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f417823c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f417825e = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public int f417827g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f417828h = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f417831k = -1;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f417838r = "";

    /* renamed from: s, reason: collision with root package name */
    public te1.b f417839s = te1.b.f417768c;

    /* renamed from: f, reason: collision with root package name */
    public final int f417826f = f417820v.incrementAndGet();

    /* renamed from: u, reason: collision with root package name */
    public final long f417841u = java.lang.System.currentTimeMillis();

    public final boolean a(int i17) {
        boolean z17;
        synchronized (this.f417825e) {
            z17 = this.f417823c == i17;
        }
        return z17;
    }

    public void b() {
        if (u(1, 2)) {
            te1.t tVar = this.f417824d;
            if (tVar != null) {
                tVar.getClass();
            }
            if (qe1.a.a().f362017b) {
                ve1.g.p(3, f(), "cancel proceeding, seq=" + this.f417826f, null);
            }
        }
    }

    public void c() {
        if (u(2, 3)) {
            te1.t tVar = this.f417824d;
            if (tVar != null) {
                ((te1.u) tVar).f417842a.countDown();
            }
            if (qe1.a.a().f362017b) {
                ve1.g.p(3, f(), "cancel success, seq=" + this.f417826f, null);
            }
        }
    }

    public int d() {
        return this.f417827g;
    }

    public synchronized te1.b e() {
        return this.f417839s;
    }

    public java.lang.String f() {
        return this.f417838r + "VideoRequest";
    }

    public int g() {
        return this.f417828h;
    }

    public long h() {
        return this.f417830j;
    }

    public long i() {
        return this.f417829i;
    }

    public java.lang.String j() {
        return this.f417837q;
    }

    public int k() {
        return this.f417826f;
    }

    public java.lang.String l() {
        return this.f417835o;
    }

    public java.lang.String m() {
        return this.f417833m;
    }

    public java.lang.String n() {
        return this.f417834n;
    }

    public boolean o() {
        return a(2);
    }

    public boolean p() {
        java.lang.String str = this.f417837q;
        return str != null && str.toLowerCase().equals("head");
    }

    public void q(int i17) {
        this.f417827g = i17;
    }

    public synchronized void r(int i17) {
    }

    public void s(int i17) {
        int i18 = this.f417822b;
        if ((i18 & i17) == 0) {
            this.f417822b = i18 + i17;
        }
    }

    public boolean t() {
        return a(1);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append("{seq=");
        sb6.append(this.f417826f);
        sb6.append(",priority=");
        sb6.append(this.f417828h);
        sb6.append(",range=[");
        sb6.append(this.f417829i);
        sb6.append(",");
        sb6.append(this.f417830j);
        sb6.append("],uuid=");
        sb6.append(this.f417833m);
        sb6.append(",contentType=");
        sb6.append(this.f417836p);
        sb6.append(",cancelState=");
        sb6.append(this.f417823c);
        sb6.append(",sourceUrl=");
        sb6.append(this.f417835o);
        sb6.append(",videoKey=");
        sb6.append(this.f417834n);
        sb6.append(",task=");
        java.util.concurrent.Future future = this.f417821a;
        sb6.append(future == null ? "null" : future.toString());
        sb6.append("}");
        return sb6.toString();
    }

    public final boolean u(int i17, int i18) {
        synchronized (this.f417825e) {
            if (this.f417823c == i17) {
                this.f417823c = i18;
                return true;
            }
            ve1.g.p(5, f(), java.lang.String.format(java.util.Locale.US, "transState error, current %d, condition %d, newState %d", java.lang.Integer.valueOf(this.f417823c), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), null);
            return false;
        }
    }

    public synchronized void v(long j17, te1.b bVar) {
        this.f417831k = j17;
        this.f417839s = bVar;
        if (bVar.equals(te1.b.f417770e)) {
            this.f417827g |= 8;
        }
    }

    public synchronized void w(int i17) {
        this.f417840t += i17;
    }
}
