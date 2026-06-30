package nd1;

/* loaded from: classes7.dex */
public final class i0 extends nd1.n {
    @Override // nd1.n, com.tencent.mm.plugin.appbrand.jsapi.a1
    /* renamed from: B */
    public java.lang.String z(com.tencent.mm.plugin.appbrand.y env, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(env, "env");
        try {
            if ((env instanceof com.tencent.mm.plugin.appbrand.page.n7) && ((com.tencent.mm.plugin.appbrand.page.n7) env).p2()) {
                k91.f M1 = ((com.tencent.mm.plugin.appbrand.page.n7) env).M1();
                if (kotlin.jvm.internal.o.b("manual", M1 != null ? M1.f305577t : null) && jSONObject != null) {
                    jSONObject.put("ignoreWebviewPreload", true);
                }
            }
            if ((env instanceof com.tencent.mm.plugin.appbrand.service.c0) && (((com.tencent.mm.plugin.appbrand.service.c0) env).V0() instanceof com.tencent.mm.plugin.appbrand.headless.n) && jSONObject != null) {
                jSONObject.put("ignoreWebviewPreload", true);
            }
        } catch (java.lang.Exception unused) {
        }
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("renderingCacheAccepted", false) : false;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(env);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPageInitReadyWC", "invoke renderingCacheAccepted[" + optBoolean + "] appId[" + env.getAppId() + "] url[" + a17.X1() + ']');
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a18 = com.tencent.mm.plugin.appbrand.report.quality.e.a(a17.getRuntime());
            if (a18 != null) {
                synchronized (a18) {
                    if (a18.P == null) {
                        a18.P = java.lang.Boolean.valueOf(optBoolean);
                    }
                }
            }
        }
        java.lang.String z17 = super.z(env, jSONObject);
        kotlin.jvm.internal.o.f(z17, "invoke(...)");
        return z17;
    }
}
