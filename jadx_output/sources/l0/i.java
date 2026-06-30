package l0;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final n0.v2 f314229a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f314230b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f314231c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f314232d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f314233e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f314234f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f314235g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.v2 f314236h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f314237i;

    /* renamed from: j, reason: collision with root package name */
    public final n0.v2 f314238j;

    /* renamed from: k, reason: collision with root package name */
    public final n0.v2 f314239k;

    /* renamed from: l, reason: collision with root package name */
    public final n0.v2 f314240l;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f314241m;

    public i(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, boolean z17, kotlin.jvm.internal.i iVar) {
        e1.y yVar = new e1.y(j17);
        n0.h5 h5Var = n0.h5.f333529a;
        this.f314229a = n0.s4.b(yVar, h5Var);
        this.f314230b = n0.s4.b(new e1.y(j18), h5Var);
        this.f314231c = n0.s4.b(new e1.y(j19), h5Var);
        this.f314232d = n0.s4.b(new e1.y(j27), h5Var);
        this.f314233e = n0.s4.b(new e1.y(j28), h5Var);
        this.f314234f = n0.s4.b(new e1.y(j29), h5Var);
        this.f314235g = n0.s4.b(new e1.y(j37), h5Var);
        this.f314236h = n0.s4.b(new e1.y(j38), h5Var);
        this.f314237i = n0.s4.b(new e1.y(j39), h5Var);
        this.f314238j = n0.s4.b(new e1.y(j47), h5Var);
        this.f314239k = n0.s4.b(new e1.y(j48), h5Var);
        this.f314240l = n0.s4.b(new e1.y(j49), h5Var);
        this.f314241m = n0.s4.b(java.lang.Boolean.valueOf(z17), h5Var);
    }

    public static l0.i a(l0.i iVar, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, boolean z17, int i17, java.lang.Object obj) {
        long g17 = (i17 & 1) != 0 ? iVar.g() : j17;
        long h17 = (i17 & 2) != 0 ? iVar.h() : j18;
        long i18 = (i17 & 4) != 0 ? iVar.i() : j19;
        long j57 = (i17 & 8) != 0 ? iVar.j() : j27;
        long b17 = (i17 & 16) != 0 ? iVar.b() : j28;
        long k17 = (i17 & 32) != 0 ? iVar.k() : j29;
        long c17 = (i17 & 64) != 0 ? iVar.c() : j37;
        long d17 = (i17 & 128) != 0 ? iVar.d() : j38;
        long e17 = (i17 & 256) != 0 ? iVar.e() : j39;
        long j58 = (i17 & 512) != 0 ? ((e1.y) ((n0.q4) iVar.f314238j).getValue()).f246322a : j47;
        long f17 = (i17 & 1024) != 0 ? iVar.f() : j48;
        long j59 = (i17 & 2048) != 0 ? ((e1.y) ((n0.q4) iVar.f314240l).getValue()).f246322a : j49;
        boolean l17 = (i17 & 4096) != 0 ? iVar.l() : z17;
        iVar.getClass();
        return new l0.i(g17, h17, i18, j57, b17, k17, c17, d17, e17, j58, f17, j59, l17, null);
    }

    public final long b() {
        return ((e1.y) this.f314233e.getValue()).f246322a;
    }

    public final long c() {
        return ((e1.y) this.f314235g.getValue()).f246322a;
    }

    public final long d() {
        return ((e1.y) this.f314236h.getValue()).f246322a;
    }

    public final long e() {
        return ((e1.y) this.f314237i.getValue()).f246322a;
    }

    public final long f() {
        return ((e1.y) this.f314239k.getValue()).f246322a;
    }

    public final long g() {
        return ((e1.y) this.f314229a.getValue()).f246322a;
    }

    public final long h() {
        return ((e1.y) this.f314230b.getValue()).f246322a;
    }

    public final long i() {
        return ((e1.y) this.f314231c.getValue()).f246322a;
    }

    public final long j() {
        return ((e1.y) this.f314232d.getValue()).f246322a;
    }

    public final long k() {
        return ((e1.y) this.f314234f.getValue()).f246322a;
    }

    public final boolean l() {
        return ((java.lang.Boolean) this.f314241m.getValue()).booleanValue();
    }

    public java.lang.String toString() {
        return "Colors(primary=" + ((java.lang.Object) e1.y.i(g())) + ", primaryVariant=" + ((java.lang.Object) e1.y.i(h())) + ", secondary=" + ((java.lang.Object) e1.y.i(i())) + ", secondaryVariant=" + ((java.lang.Object) e1.y.i(j())) + ", background=" + ((java.lang.Object) e1.y.i(b())) + ", surface=" + ((java.lang.Object) e1.y.i(k())) + ", error=" + ((java.lang.Object) e1.y.i(c())) + ", onPrimary=" + ((java.lang.Object) e1.y.i(d())) + ", onSecondary=" + ((java.lang.Object) e1.y.i(e())) + ", onBackground=" + ((java.lang.Object) e1.y.i(((e1.y) ((n0.q4) this.f314238j).getValue()).f246322a)) + ", onSurface=" + ((java.lang.Object) e1.y.i(f())) + ", onError=" + ((java.lang.Object) e1.y.i(((e1.y) ((n0.q4) this.f314240l).getValue()).f246322a)) + ", isLight=" + l() + ')';
    }
}
