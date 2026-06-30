package xi1;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.plugin.appbrand.utils.o2 {
    public t(kotlin.jvm.internal.i iVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.o2
    public com.tencent.mm.plugin.appbrand.utils.p2 a(com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        com.tencent.mm.plugin.appbrand.utils.o oVar;
        android.content.Context context;
        android.content.Context context2;
        com.tencent.mm.plugin.appbrand.hc hcVar;
        xi1.g windowAndroid;
        xi1.p orientationHandler;
        if (tVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = ((com.tencent.mm.plugin.appbrand.jsapi.d0) tVar).t3();
            if (t37 != null && (hcVar = t37.f74796e) != null && (windowAndroid = hcVar.getWindowAndroid()) != null && (orientationHandler = windowAndroid.getOrientationHandler()) != null) {
                return new xi1.u(orientationHandler);
            }
            if (tVar == null || (context2 = tVar.getContext()) == null) {
                context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context2);
            oVar = new com.tencent.mm.plugin.appbrand.utils.o(context2);
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaOrientationGetter", "create, something null, use AndroidOrientationGetter as fallback");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaOrientationGetter", "create, componentView is not AppBrandComponentWithExtra, use AndroidOrientationGetter as fallback");
            if (tVar == null || (context = tVar.getContext()) == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            oVar = new com.tencent.mm.plugin.appbrand.utils.o(context);
        }
        return oVar;
    }
}
