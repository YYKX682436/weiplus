package jf;

/* loaded from: classes7.dex */
public final class j implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        if (str == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = jf.d.f299325d;
        k0Var.f211881s = new jf.i(str, context, pageView);
        k0Var.v();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        return "Switch Render";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        gf.n2 n2Var = (gf.n2) pageView.getRuntime().p0(gf.n2.class, false);
        boolean z17 = n2Var != null ? n2Var.f271145h : false;
        if (!z65.c.a()) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!com.tencent.mm.plugin.appbrand.appcache.g0.a(pageView.getRuntime().f74805p.f77281g)) {
                return false;
            }
        }
        return z17;
    }
}
