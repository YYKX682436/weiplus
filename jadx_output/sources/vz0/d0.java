package vz0;

/* loaded from: classes14.dex */
public final class d0 implements b0.f3 {

    /* renamed from: g, reason: collision with root package name */
    public static final w0.x f441593g = w0.b.a(vz0.z.f441653d, vz0.a0.f441576d);

    /* renamed from: a, reason: collision with root package name */
    public final e0.f1 f441594a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f441595b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.e5 f441596c = n0.s4.a(new vz0.c0(this));

    /* renamed from: d, reason: collision with root package name */
    public final n0.e5 f441597d = n0.s4.a(new vz0.b0(this));

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f441598e = n0.s4.c(null, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f441599f = n0.s4.c(null, null, 2, null);

    public d0(int i17) {
        this.f441594a = new e0.f1(i17, 0);
        this.f441595b = n0.s4.c(java.lang.Integer.valueOf(i17), null, 2, null);
    }

    @Override // b0.f3
    public boolean a() {
        return this.f441594a.a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return this.f441594a.b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = this.f441594a.c(k2Var, pVar, continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    public final e0.n d() {
        java.lang.Object obj;
        java.util.List b17 = this.f441594a.f().b();
        java.util.ListIterator listIterator = b17.listIterator(b17.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((e0.q0) ((e0.n) obj)).f245678a <= 0) {
                break;
            }
        }
        return (e0.n) obj;
    }

    public final int e() {
        return ((java.lang.Number) this.f441595b.getValue()).intValue();
    }

    public java.lang.String toString() {
        return "PagerState(pageCount=" + ((java.lang.Number) ((n0.x1) this.f441596c).getValue()).intValue() + ", currentPage=" + e() + ", currentPageOffset=" + ((java.lang.Number) ((n0.x1) this.f441597d).getValue()).floatValue() + ')';
    }
}
