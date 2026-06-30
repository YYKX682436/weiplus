package e1;

/* loaded from: classes14.dex */
public final class x0 implements e1.e0 {

    /* renamed from: d, reason: collision with root package name */
    public float f246295d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f246296e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f246297f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f246298g;

    /* renamed from: h, reason: collision with root package name */
    public float f246299h;

    /* renamed from: i, reason: collision with root package name */
    public float f246300i;

    /* renamed from: m, reason: collision with root package name */
    public long f246301m;

    /* renamed from: n, reason: collision with root package name */
    public long f246302n;

    /* renamed from: o, reason: collision with root package name */
    public float f246303o;

    /* renamed from: p, reason: collision with root package name */
    public float f246304p;

    /* renamed from: q, reason: collision with root package name */
    public float f246305q;

    /* renamed from: r, reason: collision with root package name */
    public float f246306r;

    /* renamed from: s, reason: collision with root package name */
    public long f246307s;

    /* renamed from: t, reason: collision with root package name */
    public e1.a1 f246308t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f246309u;

    /* renamed from: v, reason: collision with root package name */
    public p2.f f246310v;

    public x0() {
        long j17 = e1.f0.f246252a;
        this.f246301m = j17;
        this.f246302n = j17;
        this.f246306r = 8.0f;
        this.f246307s = e1.i1.f246272b;
        this.f246308t = e1.v0.f246289a;
        this.f246310v = new p2.g(1.0f, 1.0f);
    }

    @Override // p2.f
    public int G(float f17) {
        return p2.e.a(this, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return p2.e.d(this, j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * getDensity();
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    @Override // p2.f
    public float getDensity() {
        return this.f246310v.getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f246310v.getFontScale();
    }

    @Override // p2.f
    public float n(int i17) {
        return p2.e.b(this, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / getDensity();
    }

    @Override // p2.f
    public long t(long j17) {
        return p2.e.e(this, j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return p2.e.f(this, f17);
    }
}
