package pf1;

/* loaded from: classes7.dex */
public final class z extends gb1.d {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "insertHTMLVConsoleView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("htmlId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject data) {
        com.tencent.mm.plugin.appbrand.page.v5 component = (com.tencent.mm.plugin.appbrand.page.v5) tVar;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        lm0.a K1 = component.getRuntime().K1(pf1.y.class);
        kotlin.jvm.internal.o.d(K1);
        android.content.Context f147807d = component.getF147807d();
        kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
        pf1.w wVar = (pf1.w) ((pf1.y) K1);
        if (!com.tencent.xweb.a3.j()) {
            sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
            com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
            com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_PINUS;
            ((th0.a0) eVar).getClass();
            com.tencent.mm.xwebutil.y0.b(f1Var2, null);
        }
        pf1.n nVar = new pf1.n(com.tencent.mm.plugin.appbrand.ui.z6.b(f147807d), wVar.f353806d);
        component.c1(nVar);
        return nVar.getAndroidView();
    }
}
