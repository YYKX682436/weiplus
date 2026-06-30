package l36;

/* loaded from: classes16.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public l36.w0 f315691a;

    /* renamed from: b, reason: collision with root package name */
    public l36.r0 f315692b;

    /* renamed from: c, reason: collision with root package name */
    public int f315693c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f315694d;

    /* renamed from: e, reason: collision with root package name */
    public l36.g0 f315695e;

    /* renamed from: f, reason: collision with root package name */
    public l36.h0 f315696f;

    /* renamed from: g, reason: collision with root package name */
    public l36.c1 f315697g;

    /* renamed from: h, reason: collision with root package name */
    public l36.a1 f315698h;

    /* renamed from: i, reason: collision with root package name */
    public l36.a1 f315699i;

    /* renamed from: j, reason: collision with root package name */
    public l36.a1 f315700j;

    /* renamed from: k, reason: collision with root package name */
    public long f315701k;

    /* renamed from: l, reason: collision with root package name */
    public long f315702l;

    public z0() {
        this.f315693c = -1;
        this.f315696f = new l36.h0();
    }

    public l36.a1 a() {
        if (this.f315691a == null) {
            throw new java.lang.IllegalStateException("request == null");
        }
        if (this.f315692b == null) {
            throw new java.lang.IllegalStateException("protocol == null");
        }
        if (this.f315693c >= 0) {
            if (this.f315694d != null) {
                return new l36.a1(this);
            }
            throw new java.lang.IllegalStateException("message == null");
        }
        throw new java.lang.IllegalStateException("code < 0: " + this.f315693c);
    }

    public final void b(java.lang.String str, l36.a1 a1Var) {
        if (a1Var.f315461m != null) {
            throw new java.lang.IllegalArgumentException(str + ".body != null");
        }
        if (a1Var.f315462n != null) {
            throw new java.lang.IllegalArgumentException(str + ".networkResponse != null");
        }
        if (a1Var.f315463o != null) {
            throw new java.lang.IllegalArgumentException(str + ".cacheResponse != null");
        }
        if (a1Var.f315464p == null) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + ".priorResponse != null");
    }

    public z0(l36.a1 a1Var) {
        this.f315693c = -1;
        this.f315691a = a1Var.f315455d;
        this.f315692b = a1Var.f315456e;
        this.f315693c = a1Var.f315457f;
        this.f315694d = a1Var.f315458g;
        this.f315695e = a1Var.f315459h;
        this.f315696f = a1Var.f315460i.e();
        this.f315697g = a1Var.f315461m;
        this.f315698h = a1Var.f315462n;
        this.f315699i = a1Var.f315463o;
        this.f315700j = a1Var.f315464p;
        this.f315701k = a1Var.f315465q;
        this.f315702l = a1Var.f315466r;
    }
}
