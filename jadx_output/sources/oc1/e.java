package oc1;

/* loaded from: classes.dex */
public class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 910;
    public static final java.lang.String NAME = "checkHandoffEnabled";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckHandoffEnabled", "invoke JsApiCheckHandoffEnabled");
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean optBoolean = jSONObject.optBoolean("showToast", true);
        int a17 = oc1.d.a("MicroMsg.JsApiCheckHandoffEnabled", c0Var.getAppId(), c0Var.t3().u0().f47284z);
        if (a17 != 0) {
            if (optBoolean && a17 < 5 && a17 > 1) {
                android.content.Context f147807d = c0Var.getF147807d();
                java.lang.String string = c0Var.getF147807d().getString(oc1.d.f344146c[a17]);
                ((ku5.t0) ku5.t0.f312615d).B(new oc1.c(f147807d, string));
            }
            hashMap.put("errCode", java.lang.Integer.valueOf(a17));
            hashMap.put("isEnabled", java.lang.Boolean.FALSE);
        } else {
            hashMap.put("isEnabled", java.lang.Boolean.TRUE);
        }
        c0Var.a(i17, p("ok", hashMap));
    }
}
