package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v6 extends xt2.m6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f120039d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f120040e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f120041f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f120042g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f120043h;

    /* renamed from: i, reason: collision with root package name */
    public pk2.o9 f120044i;

    public v6(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f120039d = root;
        this.f120040e = basePlugin;
        this.f120041f = true;
        this.f120042g = root.findViewById(com.tencent.mm.R.id.jrm);
        this.f120043h = "anchorlive.bottom.tools";
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.t6(this));
        ll2.e eVar = ll2.e.f319133a;
        java.lang.Object context = root.getContext();
        eVar.k(context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null, "anchorlive.bottom.tools", new com.tencent.mm.plugin.finder.live.widget.u6(this));
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f120039d.findViewById(com.tencent.mm.R.id.jrj);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f120039d;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f120039d.findViewById(com.tencent.mm.R.id.jrl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k(r45.rq1 rq1Var) {
        pk2.d9 d9Var;
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f328000x0, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        if (this.f120044i == null) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController U0 = this.f120040e.U0(df2.ox.class);
            android.content.Context context = this.f120039d.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (U0 != null && mMActivity != null) {
                pk2.o9 o9Var = new pk2.o9((df2.ox) U0, mMActivity);
                this.f120044i = o9Var;
                qk2.a aVar = new qk2.a(o9Var, null);
                pk2.d9 d9Var2 = o9Var.f356082f;
                if (d9Var2 != null) {
                    pk2.o9 o9Var2 = d9Var2.f355680w;
                    o9Var2.f356086h = aVar;
                    pk2.t9 t9Var = pk2.t9.f356269a;
                    java.util.List menuConfigs = d9Var2.f355673p;
                    com.tencent.mm.ui.MMActivity context2 = o9Var2.f356078d;
                    kotlin.jvm.internal.o.g(context2, "context");
                    kotlin.jvm.internal.o.g(menuConfigs, "menuConfigs");
                    ((java.util.ArrayList) menuConfigs).clear();
                    t9Var.a(menuConfigs, aVar, 1, kz5.c0.i(new pk2.e8(o9Var2, 0), new pk2.v2(o9Var2, 0), new pk2.n2(o9Var2, 0), new pk2.j1(o9Var2, 0), new pk2.o2(o9Var2, 0), new pk2.q(o9Var2, 0)), null, "");
                    java.util.List i17 = kz5.c0.i(new pk2.r(o9Var2, 0), new pk2.t(o9Var2, 0, o9Var2.X, 5), new pk2.f4(o9Var2, 0), new pk2.l2(o9Var2, 0), new pk2.s1(o9Var2, 0), new pk2.t1(o9Var2, 0));
                    java.lang.String string = context2.getString(com.tencent.mm.R.string.f493764oz2);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    t9Var.a(menuConfigs, aVar, 2, i17, null, string);
                    java.util.List i18 = kz5.c0.i(new pk2.t(o9Var2, 0, o9Var2.f356095l0, 24), new pk2.t(o9Var2, 0, o9Var2.Z, 18), new pk2.t(o9Var2, 0, o9Var2.Y, 21), new pk2.t(o9Var2, 0, o9Var2.W, 12), new pk2.g0(o9Var2, 0), new pk2.t(o9Var2, 0, o9Var2.f356073a0, 11), new pk2.t(o9Var2, 0, o9Var2.f356075b0, 16), new pk2.t(o9Var2, 0, o9Var2.f356077c0, 6), new pk2.t(o9Var2, 0, o9Var2.f356079d0, 8), new pk2.p2(o9Var2, 0), new pk2.t(o9Var2, 0, o9Var2.P, 2), new pk2.z0(o9Var2, 0), new pk2.u4(o9Var2, 0), new pk2.e3(o9Var2, 0), new pk2.r2(o9Var2, 0));
                    java.lang.String string2 = context2.getString(com.tencent.mm.R.string.f493767oz5);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    t9Var.a(menuConfigs, aVar, 3, i18, null, string2);
                    java.util.List i19 = kz5.c0.i(new pk2.x1(o9Var2, 0), new pk2.c3(o9Var2, 0), new pk2.e0(o9Var2, 0), new pk2.c1(o9Var2, 0));
                    java.lang.String string3 = context2.getString(com.tencent.mm.R.string.ozg);
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    t9Var.a(menuConfigs, aVar, 4, i19, null, string3);
                    if (zl2.q4.f473933a.E() && ((java.lang.Number) ae2.in.f3688a.T().r()).intValue() == 1) {
                        t9Var.a(menuConfigs, aVar, 5, kz5.c0.i(new pk2.u9(o9Var2, 0), new pk2.r4(o9Var2, 0), new pk2.q4(o9Var2, 0)), null, "调试(内部)");
                    }
                    aVar.m();
                }
            }
        }
        pk2.o9 o9Var3 = this.f120044i;
        if (o9Var3 != null) {
            o9Var3.f356088i = rq1Var;
        }
        if (o9Var3 != null && (d9Var = o9Var3.f356082f) != null) {
            d9Var.e();
        }
        if (this.f120042g.getVisibility() == 0) {
            ll2.e.b(ll2.e.f319133a, this.f120043h, false, false, 6, null);
        }
    }
}
