package l0;

/* loaded from: classes14.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f314573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f314574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f314575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f314576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0.k f314578i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f314579m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314580n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(z0.t tVar, e1.a1 a1Var, long j17, float f17, int i17, a0.k kVar, float f18, yz5.p pVar) {
        super(2);
        this.f314573d = tVar;
        this.f314574e = a1Var;
        this.f314575f = j17;
        this.f314576g = f17;
        this.f314577h = i17;
        this.f314578i = kVar;
        this.f314579m = f18;
        this.f314580n = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        int intValue = ((java.lang.Number) obj2).intValue() & 11;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (intValue == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return f0Var;
            }
        }
        z0.t tVar = this.f314573d;
        e1.a1 a1Var = this.f314574e;
        long j17 = this.f314575f;
        n0.y0 y0Var2 = (n0.y0) oVar;
        l0.c0 c0Var = (l0.c0) y0Var2.i(l0.f0.f314178a);
        float f17 = this.f314576g;
        int i17 = this.f314577h;
        z0.t b17 = p1.x0.b(y1.t.b(l0.a2.c(tVar, a1Var, l0.a2.d(j17, c0Var, f17, oVar, (i17 >> 6) & 14), this.f314578i, this.f314579m), false, l0.u1.f314539d), f0Var, new l0.v1(null));
        y0Var2.U(733328855);
        int i18 = z0.d.f468903a;
        s1.t0 c17 = d0.y.c(z0.a.f468889a, true, oVar, 48);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(b17);
        if (!(y0Var2.f333761b instanceof n0.e)) {
            n0.l.a();
            throw null;
        }
        y0Var2.X();
        if (y0Var2.L) {
            y0Var2.j(aVar);
        } else {
            y0Var2.i0();
        }
        y0Var2.f333784y = false;
        n0.i5.a(oVar, c17, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a17).invoke(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(1539610176);
        this.f314580n.invoke(oVar, java.lang.Integer.valueOf((i17 >> 18) & 14));
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return f0Var;
    }
}
