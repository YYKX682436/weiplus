package jf;

/* loaded from: classes7.dex */
public final class c implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        f06.v[] vVarArr = gf.m0.f271125b;
        f06.v vVar = vVarArr[1];
        nf.r rVar = gf.m0.f271127d;
        gf.m0 m0Var = gf.m0.f271124a;
        boolean[] zArr = {((java.lang.Boolean) rVar.b(m0Var, vVar)).booleanValue(), ((java.lang.Boolean) gf.m0.f271128e.b(m0Var, vVarArr[2])).booleanValue()};
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(context.getString(com.tencent.mm.R.string.mdc));
        builder.setMultiChoiceItems(new java.lang.String[]{"showPerformanceOverlay", "checkerboardRasterCacheImages"}, zArr, new jf.a(zArr));
        builder.setPositiveButton("OK", new jf.b(zArr));
        builder.setNegativeButton("Cancel", (android.content.DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.b pageView = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        return "Debug Skyline";
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
