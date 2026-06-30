package l36;

/* loaded from: classes16.dex */
public final class a1 implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final l36.w0 f315455d;

    /* renamed from: e, reason: collision with root package name */
    public final l36.r0 f315456e;

    /* renamed from: f, reason: collision with root package name */
    public final int f315457f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f315458g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.g0 f315459h;

    /* renamed from: i, reason: collision with root package name */
    public final l36.i0 f315460i;

    /* renamed from: m, reason: collision with root package name */
    public final l36.c1 f315461m;

    /* renamed from: n, reason: collision with root package name */
    public final l36.a1 f315462n;

    /* renamed from: o, reason: collision with root package name */
    public final l36.a1 f315463o;

    /* renamed from: p, reason: collision with root package name */
    public final l36.a1 f315464p;

    /* renamed from: q, reason: collision with root package name */
    public final long f315465q;

    /* renamed from: r, reason: collision with root package name */
    public final long f315466r;

    /* renamed from: s, reason: collision with root package name */
    public volatile l36.l f315467s;

    public a1(l36.z0 z0Var) {
        this.f315455d = z0Var.f315691a;
        this.f315456e = z0Var.f315692b;
        this.f315457f = z0Var.f315693c;
        this.f315458g = z0Var.f315694d;
        this.f315459h = z0Var.f315695e;
        l36.h0 h0Var = z0Var.f315696f;
        h0Var.getClass();
        this.f315460i = new l36.i0(h0Var);
        this.f315461m = z0Var.f315697g;
        this.f315462n = z0Var.f315698h;
        this.f315463o = z0Var.f315699i;
        this.f315464p = z0Var.f315700j;
        this.f315465q = z0Var.f315701k;
        this.f315466r = z0Var.f315702l;
    }

    public l36.l a() {
        l36.l lVar = this.f315467s;
        if (lVar != null) {
            return lVar;
        }
        l36.l a17 = l36.l.a(this.f315460i);
        this.f315467s = a17;
        return a17;
    }

    public java.lang.String b(java.lang.String str) {
        java.lang.String c17 = this.f315460i.c(str);
        if (c17 != null) {
            return c17;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        l36.c1 c1Var = this.f315461m;
        if (c1Var == null) {
            throw new java.lang.IllegalStateException("response is not eligible for a body and must not be closed");
        }
        c1Var.close();
    }

    public java.lang.String toString() {
        return "Response{protocol=" + this.f315456e + ", code=" + this.f315457f + ", message=" + this.f315458g + ", url=" + this.f315455d.f315681a + '}';
    }
}
