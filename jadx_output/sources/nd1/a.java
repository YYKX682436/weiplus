package nd1;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 pageView;
        kotlin.jvm.internal.o.g(rt6, "rt");
        nd1.b bVar = new nd1.b(null);
        com.tencent.mars.xlog.Log.i("AppBrandOnNavigateBackInterceptEvent", "[dispatch] type=" + i17);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("type", java.lang.Integer.valueOf(i17));
        bVar.t(hashMap);
        bVar.u(rt6.C0());
        bVar.m();
        com.tencent.mm.plugin.appbrand.page.i3 x07 = rt6.x0();
        if (x07 == null || (pageView = x07.getPageView()) == null) {
            return;
        }
        bVar.t(hashMap);
        bVar.u(pageView);
        bVar.m();
    }
}
