package r72;

/* loaded from: classes16.dex */
public abstract class b {
    public static final r45.dp0 a(r72.a appBrandItem) {
        kotlin.jvm.internal.o.g(appBrandItem, "appBrandItem");
        r45.dp0 dp0Var = new r45.dp0();
        dp0Var.f372634d = appBrandItem.r();
        dp0Var.f372635e = appBrandItem.getAppid();
        dp0Var.f372636f = appBrandItem.n();
        dp0Var.f372637g = appBrandItem.getIconUrl();
        dp0Var.f372638h = appBrandItem.getType();
        dp0Var.f372639i = appBrandItem.l();
        dp0Var.f372640m = appBrandItem.p();
        dp0Var.f372641n = appBrandItem.getVersion();
        dp0Var.f372642o = appBrandItem.j();
        dp0Var.f372643p = appBrandItem.q();
        dp0Var.f372646s = appBrandItem.o();
        dp0Var.f372644q = appBrandItem.k();
        dp0Var.f372645r = appBrandItem.getSubType();
        return dp0Var;
    }

    public static final r72.a b(r45.dp0 originAppBrand) {
        kotlin.jvm.internal.o.g(originAppBrand, "originAppBrand");
        r72.a aVar = new r72.a();
        aVar.F(originAppBrand.f372634d);
        aVar.s(originAppBrand.f372635e);
        aVar.y(originAppBrand.f372636f);
        aVar.u(originAppBrand.f372637g);
        aVar.E(originAppBrand.f372638h);
        aVar.x(originAppBrand.f372639i);
        aVar.A(originAppBrand.f372640m);
        aVar.G(originAppBrand.f372641n);
        aVar.t(originAppBrand.f372642o);
        aVar.C(originAppBrand.f372643p);
        aVar.z(originAppBrand.f372646s);
        aVar.w(originAppBrand.f372644q);
        aVar.B(originAppBrand.f372645r);
        return aVar;
    }
}
