package ld1;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 245;
    private static final java.lang.String NAME = "reportPageData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = yVar.t3().u0();
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = yVar.t3().E0();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = yVar.t3().l2();
        java.lang.String appId = yVar.getAppId();
        r45.dr5 dr5Var = new r45.dr5();
        r45.ff4 ff4Var = new r45.ff4();
        dr5Var.f372704d = ff4Var;
        if (E0 != null) {
            ff4Var.f374271d = E0.f305842e;
            ff4Var.f374272e = u07.f47278x;
            ff4Var.f374273f = E0.f305852r.f75399d;
            dr5Var.f372704d.f374274g = E0.f305852r.pkgVersion;
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = yVar.x();
            if (x17 != null) {
                dr5Var.f372704d.f374279o = x17.i();
            }
        }
        if (l27 != null) {
            r45.ff4 ff4Var2 = dr5Var.f372704d;
            ff4Var2.f374275h = l27.f87790f;
            ff4Var2.f374276i = l27.f87788d;
        }
        dr5Var.f372704d.f374277m = 1;
        com.tencent.luggage.sdk.jsapi.component.b V0 = yVar.V0();
        if (V0 != null) {
            dr5Var.f372704d.f374278n = V0.X1();
        }
        dr5Var.f372705e = jSONObject.toString();
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) yVar.q(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxabusiness/reportwxaappexpose", appId, dr5Var, r45.er5.class).n(new ld1.g(this, yVar, i17, appId))).s(new ld1.f(this, yVar, i17));
    }
}
