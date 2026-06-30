package h1;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public e1.n0 f277952d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f277953e;

    /* renamed from: f, reason: collision with root package name */
    public e1.z f277954f;

    /* renamed from: g, reason: collision with root package name */
    public float f277955g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public p2.s f277956h = p2.s.Ltr;

    public abstract boolean a(float f17);

    public abstract boolean e(e1.z zVar);

    public boolean f(p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        return false;
    }

    public final void g(g1.i draw, long j17, float f17, e1.z zVar) {
        kotlin.jvm.internal.o.g(draw, "$this$draw");
        if (!(this.f277955g == f17)) {
            if (!a(f17)) {
                if (f17 == 1.0f) {
                    e1.n0 n0Var = this.f277952d;
                    if (n0Var != null) {
                        ((e1.g) n0Var).c(f17);
                    }
                    this.f277953e = false;
                } else {
                    e1.n0 n0Var2 = this.f277952d;
                    if (n0Var2 == null) {
                        n0Var2 = new e1.g();
                        this.f277952d = n0Var2;
                    }
                    ((e1.g) n0Var2).c(f17);
                    this.f277953e = true;
                }
            }
            this.f277955g = f17;
        }
        if (!kotlin.jvm.internal.o.b(this.f277954f, zVar)) {
            if (!e(zVar)) {
                if (zVar == null) {
                    e1.n0 n0Var3 = this.f277952d;
                    if (n0Var3 != null) {
                        ((e1.g) n0Var3).f(null);
                    }
                    this.f277953e = false;
                } else {
                    e1.n0 n0Var4 = this.f277952d;
                    if (n0Var4 == null) {
                        n0Var4 = new e1.g();
                        this.f277952d = n0Var4;
                    }
                    ((e1.g) n0Var4).f(zVar);
                    this.f277953e = true;
                }
            }
            this.f277954f = zVar;
        }
        p2.s layoutDirection = draw.getLayoutDirection();
        if (this.f277956h != layoutDirection) {
            f(layoutDirection);
            this.f277956h = layoutDirection;
        }
        float d17 = d1.k.d(draw.a()) - d1.k.d(j17);
        float b17 = d1.k.b(draw.a()) - d1.k.b(j17);
        ((g1.d) ((g1.b) draw.p()).f267504a).b(0.0f, 0.0f, d17, b17);
        if (f17 > 0.0f && d1.k.d(j17) > 0.0f && d1.k.b(j17) > 0.0f) {
            if (this.f277953e) {
                d1.g a17 = d1.h.a(d1.e.f225623b, d1.l.a(d1.k.d(j17), d1.k.b(j17)));
                e1.u a18 = ((g1.b) draw.p()).a();
                e1.n0 n0Var5 = this.f277952d;
                if (n0Var5 == null) {
                    n0Var5 = new e1.g();
                    this.f277952d = n0Var5;
                }
                try {
                    a18.k(a17, n0Var5);
                    i(draw);
                } finally {
                    a18.b();
                }
            } else {
                i(draw);
            }
        }
        ((g1.d) ((g1.b) draw.p()).f267504a).b(-0.0f, -0.0f, -d17, -b17);
    }

    public abstract long h();

    public abstract void i(g1.i iVar);
}
