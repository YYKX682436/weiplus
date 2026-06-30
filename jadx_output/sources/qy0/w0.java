package qy0;

/* loaded from: classes14.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f367658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f367659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f367661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f367662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f367663i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(boolean z17, kotlinx.coroutines.y0 y0Var, yz5.a aVar, n0.v2 v2Var, n0.v2 v2Var2, ty0.b1 b1Var) {
        super(2);
        this.f367658d = z17;
        this.f367659e = y0Var;
        this.f367660f = aVar;
        this.f367661g = v2Var;
        this.f367662h = v2Var2;
        this.f367663i = b1Var;
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
        java.lang.Object obj3 = n0.e1.f333492a;
        n0.v2 v2Var = this.f367661g;
        int ordinal = ((qy0.a) v2Var.getValue()).ordinal();
        if (ordinal == 1) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(-1652726532);
            ty0.b1 b1Var = this.f367663i;
            y0Var2.U(-483455358);
            z0.p pVar = z0.p.f468921d;
            s1.t0 a17 = d0.j0.a(d0.p.f225186d, z0.a.f468900l, y0Var2, 0);
            y0Var2.U(-1323940314);
            p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(pVar);
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
            n0.i5.a(y0Var2, a17, u1.f.f423590e);
            n0.i5.a(y0Var2, fVar, u1.f.f423589d);
            n0.i5.a(y0Var2, sVar, u1.f.f423591f);
            n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
            y0Var2.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            d0.e3.a(d0.a3.g(pVar, ((float) 2.5d) * 8), y0Var2, 6);
            y0Var2.U(875993297);
            n0.v2 v2Var2 = this.f367662h;
            boolean e17 = y0Var2.e(v2Var2);
            java.lang.Object y17 = y0Var2.y();
            if (e17 || y17 == n0.n.f333620a) {
                y17 = new qy0.r0(v2Var2);
                y0Var2.g0(y17);
            }
            y0Var2.o(false);
            ty0.z0.e((yz5.a) y17, b1Var, ty0.a1.f422775k, u0.j.b(y0Var2, 1918554445, true, new qy0.t0(v2Var)), y0Var2, 3526, 0);
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.o(true);
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.o(false);
        } else if (ordinal != 2) {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(-1652724422);
            y0Var3.o(false);
        } else {
            n0.y0 y0Var4 = (n0.y0) oVar;
            y0Var4.U(-1652725804);
            ty0.a1 a1Var = ty0.a1.f422775k;
            boolean z17 = this.f367658d;
            com.tencent.mm.mj_template.sns.compose.widget.u2 u2Var = z17 ? com.tencent.mm.mj_template.sns.compose.widget.u2.f70262d : com.tencent.mm.mj_template.sns.compose.widget.u2.f70263e;
            kotlinx.coroutines.y0 y0Var5 = this.f367659e;
            qy0.b1 b1Var2 = qy0.b1.f367566a;
            ty0.b1 b1Var3 = this.f367663i;
            qy0.u0 u0Var = new qy0.u0(b1Var3);
            yz5.a aVar2 = this.f367660f;
            com.tencent.mm.mj_template.sns.compose.widget.o2.b(a1Var, u2Var, y0Var5, b1Var2, u0Var, aVar2, new qy0.v0(aVar2, z17, b1Var3), y0Var4, 200198);
            y0Var4.o(false);
        }
        return jz5.f0.f302826a;
    }
}
