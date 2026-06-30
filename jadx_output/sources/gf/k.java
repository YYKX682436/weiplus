package gf;

/* loaded from: classes7.dex */
public final class k implements com.tencent.skyline.IRouteBackCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271100a;

    public k(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl) {
        this.f271100a = appServiceSkylineExtensionImpl;
    }

    @Override // com.tencent.skyline.IRouteBackCallback
    public void onBack(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "skyline side onBack " + i17 + "- " + i18, new java.lang.Object[0]);
    }

    @Override // com.tencent.skyline.IRouteBackCallback
    public void onBackDone(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            com.tencent.mm.sdk.platformtools.u3.h(new gf.j(this, i17, i18));
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "skyline side onBackDone " + i17 + "- " + i18, new java.lang.Object[0]);
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f271100a;
        ze.n t37 = appServiceSkylineExtensionImpl.f47705a.t3();
        we.a x07 = t37 != null ? t37.x0() : null;
        if (x07 != null) {
            java.util.Iterator it = x07.f86710p.iterator();
            while (it.hasNext()) {
                w2Var = (com.tencent.mm.plugin.appbrand.page.w2) it.next();
                if (w2Var != null && w2Var.o(i18)) {
                    break;
                }
            }
        }
        w2Var = null;
        if (w2Var == null) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("AppServiceSkylineExtensionImpl", "onBackDone error ,can't find page[" + i18 + ']', new java.lang.Object[0]);
            return;
        }
        ze.n t38 = appServiceSkylineExtensionImpl.f47705a.t3();
        we.a x08 = t38 != null ? t38.x0() : null;
        if (x08 != null) {
            x08.c0(new com.tencent.mm.plugin.appbrand.page.l3(x08, w2Var, "scene_skyline_back", null));
        }
    }
}
