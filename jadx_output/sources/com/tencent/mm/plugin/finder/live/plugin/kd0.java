package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kd0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g84 f113221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f113222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fy2.d f113224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd0(r45.g84 g84Var, boolean z17, com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, fy2.d dVar) {
        super(0);
        this.f113221d = g84Var;
        this.f113222e = z17;
        this.f113223f = nd0Var;
        this.f113224g = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAvatarDecoration loadDecorationRes:");
        r45.g84 g84Var = this.f113221d;
        sb6.append(g84Var != null ? g84Var.getString(1) : null);
        sb6.append(" result:");
        boolean z17 = this.f113222e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", sb6.toString());
        if (z17) {
            ym5.l2 l2Var = ym5.l2.f463424a;
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f113223f;
            com.tencent.mm.view.MMPAGView mMPAGView = nd0Var.f113619t;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.E));
            fy2.d dVar = this.f113224g;
            java.lang.String N6 = dVar.N6(g84Var);
            com.tencent.mm.view.MMPAGView mMPAGView2 = nd0Var.f113619t;
            mMPAGView2.setComposition(N6);
            mMPAGView2.setRepeatCount(-1);
            mMPAGView2.g();
            dVar.f267239f = g84Var;
        }
        return jz5.f0.f302826a;
    }
}
