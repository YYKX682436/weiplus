package sc2;

/* loaded from: classes2.dex */
public final class y0 implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ub f406374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f406377g;

    public y0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f406375e = h1Var;
        this.f406376f = s0Var;
        this.f406377g = t01Var;
        if (!zy2.ub.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(zy2.ub.class.getClassLoader(), new java.lang.Class[]{zy2.ub.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderVideoViewCallback");
        }
        this.f406374d = (zy2.ub) newProxyInstance;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        pm0.v.X(new sc2.x0(this.f406375e, this.f406376f, this.f406377g));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f406374d.I(str, str2, i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        this.f406374d.N(str, str2, str3, i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        sc2.h1 h1Var = this.f406375e;
        h1Var.getClass();
        ym5.a1.f(new sc2.e1(h1Var, this.f406376f));
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        this.f406374d.e3(i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        sc2.h1 h1Var = this.f406375e;
        h1Var.getClass();
        ym5.a1.f(new sc2.s(h1Var));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        this.f406374d.l(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        sc2.h1 h1Var = this.f406375e;
        h1Var.getClass();
        ym5.a1.f(new sc2.s(h1Var));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f406374d.o(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.f406374d.onSeekComplete(iTPPlayer);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        this.f406374d.p2(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f406374d.v3(str, str2, i17, i18, i19);
    }
}
