package ty0;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f422963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f422964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f422965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f422966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f422967h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f422968i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, n0.v2 v2Var, boolean z18, yz5.q qVar, n0.v2 v2Var2, long j17) {
        super(2);
        this.f422963d = z17;
        this.f422964e = v2Var;
        this.f422965f = z18;
        this.f422966g = qVar;
        this.f422967h = v2Var2;
        this.f422968i = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 l2Var;
        n0.v2 v2Var;
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        long a17 = p2.c.a(j17, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ty0.d dVar = ty0.d.f422812d;
        yz5.q qVar = this.f422966g;
        s1.l0 l0Var = (s1.l0) SubcomposeLayout;
        s1.o1 m17 = ((s1.r0) kz5.n0.X(l0Var.b(dVar, u0.j.c(190276066, true, new ty0.s(qVar))))).m(a17);
        h0Var.f310123d = m17;
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        boolean z17 = this.f422963d;
        n0.v2 v2Var2 = this.f422967h;
        n0.v2 v2Var3 = this.f422964e;
        if (!z17 || m17.f402050d > p2.c.h(j17)) {
            int h17 = (p2.c.h(j17) * 2) / 3;
            l2Var = SubcomposeLayout;
            v2Var3.setValue(new ty0.j1(((s1.o1) h0Var.f310123d).f402050d + h17, p2.c.h(j17)));
            int intValue = ((s1.o1) h0Var.f310123d).f402050d + ((java.lang.Number) v2Var2.getValue()).intValue() + h17;
            if (p2.c.h(j17) - intValue > 0) {
                h0Var3.f310123d = new jz5.l(((s1.r0) kz5.n0.X(l0Var.b(ty0.d.f422813e, u0.j.c(1838416848, true, new ty0.p(qVar))))).m(a17), java.lang.Integer.valueOf(intValue));
            }
            if (this.f422965f) {
                v2Var = v2Var2;
                h0Var2.f310123d = ((s1.r0) kz5.n0.X(l0Var.b(ty0.d.f422814f, u0.j.c(-1032107069, true, new ty0.q(this.f422968i))))).m(p2.c.a(j17, 0, 0, 0, ((s1.o1) h0Var.f310123d).f402051e, 7, null));
                return s1.v0.b(l2Var, p2.c.h(j17), ((s1.o1) h0Var.f310123d).f402051e, null, new ty0.r(h0Var, h0Var3, h0Var2, v2Var), 4, null);
            }
        } else {
            h0Var.f310123d = ((s1.r0) kz5.n0.X(l0Var.b(ty0.d.f422813e, u0.j.c(1278574504, true, new ty0.o(qVar))))).m(j17);
            v2Var3.setValue(null);
            l2Var = SubcomposeLayout;
        }
        v2Var = v2Var2;
        return s1.v0.b(l2Var, p2.c.h(j17), ((s1.o1) h0Var.f310123d).f402051e, null, new ty0.r(h0Var, h0Var3, h0Var2, v2Var), 4, null);
    }
}
