package j0;

/* loaded from: classes14.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f296475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f296476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296477h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(k0.y0 y0Var, j0.c5 c5Var, boolean z17, boolean z18, yz5.l lVar) {
        super(2);
        this.f296473d = y0Var;
        this.f296474e = c5Var;
        this.f296475f = z17;
        this.f296476g = z18;
        this.f296477h = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s1.z zVar;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        j0.c5 c5Var = this.f296474e;
        j0.n0 n0Var = new j0.n0(c5Var, this.f296477h);
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(-1323940314);
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
        p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
        u1.g.f423594i1.getClass();
        yz5.a aVar = u1.f.f423587b;
        yz5.q a17 = s1.g0.a(pVar);
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
        boolean z17 = false;
        y0Var2.f333784y = false;
        n0.i5.a(oVar, n0Var, u1.f.f423590e);
        n0.i5.a(oVar, fVar, u1.f.f423589d);
        n0.i5.a(oVar, sVar, u1.f.f423591f);
        n0.i5.a(oVar, k4Var, u1.f.f423592g);
        y0Var2.n();
        ((u0.i) a17).invoke(new n0.i4(oVar), oVar, 0);
        y0Var2.U(2058660585);
        y0Var2.U(1714611517);
        y0Var2.o(false);
        y0Var2.o(false);
        y0Var2.o(true);
        y0Var2.o(false);
        j0.v1 a18 = c5Var.a();
        j0.v1 v1Var = j0.v1.Selection;
        boolean z18 = this.f296475f;
        if (a18 == v1Var && (zVar = c5Var.f296238f) != null && ((u1.c1) zVar).p0() && z18) {
            z17 = true;
        }
        k0.y0 y0Var3 = this.f296473d;
        j0.p1.d(y0Var3, z17, oVar, 8);
        if (c5Var.a() == j0.v1.Cursor && !this.f296476g && z18) {
            j0.p1.c(y0Var3, oVar, 8);
        }
        return jz5.f0.f302826a;
    }
}
