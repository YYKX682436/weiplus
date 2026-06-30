package da2;

/* loaded from: classes2.dex */
public final class c implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ub f227736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f227737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ da2.g f227738f;

    public c(yz5.a aVar, da2.g gVar) {
        this.f227737e = aVar;
        this.f227738f = gVar;
        if (!zy2.ub.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(zy2.ub.class.getClassLoader(), new java.lang.Class[]{zy2.ub.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderVideoViewCallback");
        }
        this.f227736d = (zy2.ub) newProxyInstance;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        this.f227736d.E(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f227736d.I(str, str2, i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        yz5.a aVar = this.f227737e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        this.f227736d.N5(str, str2, bool);
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        this.f227736d.e3(i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        kk4.g0 g0Var = this.f227738f.f227752d;
        if (g0Var != null) {
            ((ea2.c0) g0Var).f250546a.t7();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        kk4.g0 g0Var = this.f227738f.f227752d;
        if (g0Var != null) {
            ((ea2.c0) g0Var).f250546a.t7();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f227736d.m2(str, str2, z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f227736d.o(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.f227736d.onSeekComplete(iTPPlayer);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        this.f227736d.p2(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f227736d.v3(str, str2, i17, i18, i19);
    }
}
