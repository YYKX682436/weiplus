package n93;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        l81.b1 b1Var = new l81.b1();
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77323e = jSONObject.optString("referrerAppId");
        b1Var.f317041s.f77322d = 2;
        b1Var.f317014b = jSONObject.optString("targetAppId");
        b1Var.f317022f = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.String optString = jSONObject.optString("envVersion");
        optString.getClass();
        b1Var.f317016c = optString.equals("trial") ? 2 : !optString.equals("develop") ? 0 : 1;
        b1Var.f317032k = 1055;
        if (com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f317014b) || com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f317022f)) {
            this.f143443f.a("fail");
        } else {
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).ij(b1Var, new n93.b(this));
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
