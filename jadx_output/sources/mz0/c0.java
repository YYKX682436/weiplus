package mz0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f332907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f332908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(mz0.b2 b2Var, n0.v2 v2Var, dz0.l lVar) {
        super(2);
        this.f332906d = b2Var;
        this.f332907e = v2Var;
        this.f332908f = lVar;
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
        mz0.b2 b2Var = this.f332906d;
        boolean booleanValue = ((java.lang.Boolean) ((n0.q4) b2Var.f332891o).getValue()).booleanValue();
        android.view.TextureView textureView = (android.view.TextureView) ((n0.q4) b2Var.f332888i).getValue();
        n0.v2 v2Var = b2Var.f332902z;
        n0.v2 v2Var2 = this.f332907e;
        n0.y0 y0Var2 = (n0.y0) oVar;
        float O6 = mz0.b2.O6(b2Var) / ((p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e)).getDensity();
        mz0.x xVar = new mz0.x(b2Var);
        mz0.y yVar = new mz0.y(b2Var);
        mz0.z zVar = new mz0.z(b2Var);
        com.tencent.mm.mj_template.sns.compose.widget.m7 o76 = b2Var.o7();
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = (com.tencent.mm.mj_template.sns.compose.widget.c1) b2Var.f332896t.getValue();
        y0Var2.U(693099541);
        dz0.l lVar = this.f332908f;
        dz0.x xVar2 = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).f69789m;
        n0.e5 a17 = v0.c.a(xVar2.f245052c, kz5.p0.f313996d, y0Var2, 72);
        n0.e5 a18 = v0.c.a(xVar2.f245053d, new com.tencent.maas.model.MJMusicInfo("", "", "", com.tencent.maas.model.time.MJTime.InvalidTime, new java.lang.Object[0]), y0Var2, 72);
        androidx.lifecycle.j0 j0Var = xVar2.f245054e;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        n0.e5 a19 = v0.c.a(j0Var, bool, y0Var2, 56);
        n0.e5 a27 = v0.c.a(xVar2.f245055f, bool, y0Var2, 56);
        y0Var2.U(-378583377);
        java.lang.Object y17 = y0Var2.y();
        java.lang.Object obj4 = y17;
        if (y17 == n0.n.f333620a) {
            ty0.b1 b1Var = new ty0.b1(a17, a18, new mz0.t(b2Var), a19, a27, new mz0.u(lVar), new mz0.v(lVar), new mz0.w(b2Var), false, b2Var.h7(), 256, null);
            b2Var.f332889m = b1Var;
            y0Var2.g0(b1Var);
            obj4 = b1Var;
        }
        ty0.b1 b1Var2 = (ty0.b1) obj4;
        y0Var2.o(false);
        y0Var2.o(false);
        kz0.k1.b(booleanValue, textureView, v2Var, v2Var2, O6, xVar, yVar, zVar, o76, c1Var, b1Var2, (com.tencent.mm.mj_template.album_template.widget.MusicV2State) b2Var.f332898v.getValue(), (com.tencent.mm.mj_template.sns.compose.widget.y) b2Var.f332897u.getValue(), b2Var.F, b2Var.q7() ? new mz0.a0(b2Var) : null, b2Var.i7(), (gz0.i) b2Var.A.getValue(), new mz0.b0(b2Var), b2Var.getLifecycleScope(), oVar, 1207962688, 136315464);
        return jz5.f0.f302826a;
    }
}
