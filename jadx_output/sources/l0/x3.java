package l0;

/* loaded from: classes14.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f314619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f314620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f314621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314623h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(float f17, l0.m3 m3Var, boolean z17, int i17, int i18, yz5.p pVar) {
        super(3);
        this.f314619d = f17;
        this.f314620e = m3Var;
        this.f314621f = z17;
        this.f314622g = i17;
        this.f314623h = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t modifier = (z0.t) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(modifier, "modifier");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(modifier) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        z0.t a17 = b1.a.a(modifier, this.f314619d);
        yz5.p pVar = this.f314623h;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(733328855);
        int i17 = z0.d.f468903a;
        s1.t0 c17 = d0.y.c(z0.a.f468889a, false, oVar, 0);
        y0Var2.U(-1323940314);
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a18 = s1.g0.a(a17);
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
        ((u0.i) a18).invoke(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(-2137368960);
        y0Var2.U(1188063364);
        l0.y yVar = (l0.y) this.f314620e;
        yVar.getClass();
        y0Var2.U(264799724);
        n0.e5 e17 = n0.s4.e(new e1.y(this.f314621f ? yVar.f314646t : yVar.f314647u), y0Var2, 0);
        y0Var2.o(false);
        l0.h4.b(((e1.y) e17.getValue()).f246322a, ((l0.j5) ((n0.y0) oVar).i(l0.l5.f314376a)).f314307g, null, pVar, oVar, (this.f314622g >> 6) & 7168, 4);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
