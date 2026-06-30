package oc1;

/* loaded from: classes.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 903;
    public static final java.lang.String NAME = "startHandoff";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartHandoff", "invoke startHandoff");
        java.util.HashMap hashMap = new java.util.HashMap();
        int a17 = oc1.d.a("MicroMsg.JsApiStartHandoff", c0Var.getAppId(), c0Var.t3().u0().f47284z);
        if (a17 != 0) {
            hashMap.put("errCode", java.lang.Integer.valueOf(a17));
            if (a17 < 5 && a17 > 1) {
                android.content.Context f147807d = c0Var.getF147807d();
                java.lang.String string = c0Var.getF147807d().getString(oc1.d.f344146c[a17]);
                ((ku5.t0) ku5.t0.f312615d).B(new oc1.c(f147807d, string));
            }
        } else {
            java.lang.String optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
            int optInt = jSONObject.optInt("actionId", 0);
            if (optInt != 1 && optInt != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartHandoff", "  actionId from forehand is wrong!! it is not 1 or 2");
            }
            c0Var.t3().Q2().a(optString, optInt + 2);
            android.content.Context f147807d2 = c0Var.getF147807d();
            ((ku5.t0) ku5.t0.f312615d).B(new oc1.b(f147807d2));
        }
        if (a17 == 0) {
            c0Var.a(i17, o("ok"));
            return;
        }
        if (a17 == 2) {
            c0Var.a(i17, p("fail:invalid login", hashMap));
            return;
        }
        if (a17 == 3) {
            c0Var.a(i17, p("fail:low version", hashMap));
        } else if (a17 == 4) {
            c0Var.a(i17, p("fail:empty xclient data or pc not supported", hashMap));
        } else {
            hashMap.put("errCode", 0);
            c0Var.a(i17, p("fail:unknown reason", hashMap));
        }
    }
}
