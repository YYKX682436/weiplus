package f0;

/* loaded from: classes14.dex */
public final class r1 implements b0.f3 {

    /* renamed from: t, reason: collision with root package name */
    public static final w0.x f258206t = w0.b.a(f0.l1.f258146d, f0.m1.f258154d);

    /* renamed from: a, reason: collision with root package name */
    public final f0.a1 f258207a;

    /* renamed from: d, reason: collision with root package name */
    public float f258210d;

    /* renamed from: e, reason: collision with root package name */
    public int f258211e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f258218l;

    /* renamed from: m, reason: collision with root package name */
    public s1.r1 f258219m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f258223q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f258224r;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f258208b = n0.s4.c(f0.a.f257995a, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public final c0.o f258209c = new c0.p();

    /* renamed from: f, reason: collision with root package name */
    public p2.f f258212f = new p2.g(1.0f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    public boolean f258213g = true;

    /* renamed from: h, reason: collision with root package name */
    public final b0.f3 f258214h = new b0.r(new f0.q1(this));

    /* renamed from: i, reason: collision with root package name */
    public final boolean f258215i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f258216j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final o0.i f258217k = new o0.i(new androidx.compose.foundation.lazy.layout.t[16], 0);

    /* renamed from: n, reason: collision with root package name */
    public final s1.s1 f258220n = new f0.o1(this);

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f258221o = f0.n1.f258159d;

    /* renamed from: p, reason: collision with root package name */
    public final n0.v2 f258222p = n0.s4.c(null, null, 2, null);

    /* renamed from: s, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.v f258225s = new androidx.compose.foundation.lazy.layout.v();

    public r1(int i17, int i18) {
        this.f258207a = new f0.a1(i17, i18);
    }

    public static java.lang.Object g(f0.r1 r1Var, int i17, int i18, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        java.lang.Object a17 = b0.e3.a(r1Var.f258214h, null, new f0.p1(r1Var, i17, i18, null), continuation, 1, null);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    @Override // b0.f3
    public boolean a() {
        return ((b0.r) this.f258214h).a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((b0.r) this.f258214h).b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = ((b0.r) this.f258214h).c(k2Var, pVar, continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    public final int d() {
        return ((java.lang.Number) ((n0.q4) this.f258207a.f258001c).getValue()).intValue();
    }

    public final int e() {
        return ((java.lang.Number) ((n0.q4) this.f258207a.f258002d).getValue()).intValue();
    }

    public final f0.l0 f() {
        return (f0.l0) ((n0.q4) this.f258208b).getValue();
    }

    public final void h(int i17, int i18) {
        f0.a1 a1Var = this.f258207a;
        a1Var.a(i17, i18);
        a1Var.f258004f = null;
        f0.o oVar = (f0.o) ((n0.q4) this.f258222p).getValue();
        if (oVar != null) {
            ((java.util.LinkedHashMap) oVar.f258165d).clear();
            oVar.f258166e = kz5.q0.f314001d;
            oVar.f258167f = -1;
            oVar.f258168g = 0;
            oVar.f258169h = -1;
            oVar.f258170i = 0;
        }
        s1.r1 r1Var = this.f258219m;
        if (r1Var != null) {
            ((u1.w) r1Var).h();
        }
    }

    public final void i(f0.q itemProvider) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(itemProvider, "itemProvider");
        f0.a1 a1Var = this.f258207a;
        a1Var.getClass();
        java.lang.Object obj = a1Var.f258004f;
        int i17 = a1Var.f257999a;
        if (obj != null) {
            f0.s sVar = (f0.s) itemProvider;
            if ((i17 >= sVar.e() || !kotlin.jvm.internal.o.b(obj, sVar.c(i17))) && (num = (java.lang.Integer) sVar.b().get(obj)) != null) {
                i17 = num.intValue();
            }
        }
        a1Var.a(i17, a1Var.f258000b);
    }
}
