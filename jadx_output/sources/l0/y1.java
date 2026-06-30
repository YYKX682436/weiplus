package l0;

/* loaded from: classes14.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f314668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f314669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f314670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f314671g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314672h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0.k f314673i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f314674m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c0.o f314675n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f314676o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.a f314677p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314678q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z0.t tVar, e1.a1 a1Var, long j17, float f17, int i17, a0.k kVar, float f18, c0.o oVar, boolean z17, yz5.a aVar, yz5.p pVar) {
        super(2);
        this.f314668d = tVar;
        this.f314669e = a1Var;
        this.f314670f = j17;
        this.f314671g = f17;
        this.f314672h = i17;
        this.f314673i = kVar;
        this.f314674m = f18;
        this.f314675n = oVar;
        this.f314676o = z17;
        this.f314677p = aVar;
        this.f314678q = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        n0.h3 h3Var = l0.i5.f314273a;
        z0.t tVar = this.f314668d;
        kotlin.jvm.internal.o.g(tVar, "<this>");
        z0.t a17 = z0.m.a(tVar, androidx.compose.ui.platform.e3.f10553d, l0.h5.f314228d);
        e1.a1 a1Var = this.f314669e;
        long j17 = this.f314670f;
        n0.y0 y0Var2 = (n0.y0) oVar;
        l0.c0 c0Var = (l0.c0) y0Var2.i(l0.f0.f314178a);
        float f17 = this.f314671g;
        int i17 = this.f314672h;
        z0.t c17 = a0.d0.c(l0.a2.c(a17, a1Var, l0.a2.d(j17, c0Var, f17, oVar, (i17 >> 12) & 14), this.f314673i, this.f314674m), this.f314675n, m0.x.a(false, 0.0f, 0L, oVar, 0, 7), this.f314676o, null, new y1.i(0), this.f314677p, 8, null);
        y0Var2.U(733328855);
        s1.t0 c18 = d0.y.c(z0.a.f468889a, true, oVar, 48);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(c17);
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
        n0.i5.a(oVar, c18, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a18).invoke(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(-390905273);
        this.f314678q.invoke(oVar, java.lang.Integer.valueOf((i17 >> 27) & 14));
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
