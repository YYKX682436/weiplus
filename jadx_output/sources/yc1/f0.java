package yc1;

/* loaded from: classes7.dex */
public class f0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 507;
    public static final java.lang.String NAME = "secureTunnel";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Intent intent;
        android.os.Bundle extras;
        int i18 = i17;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSecureTunnel", "start secureTunnel");
        yc1.d0 d0Var = new yc1.d0(this, e9Var, i18);
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        java.lang.String X1 = V0 != null ? V0.X1() : null;
        java.lang.String appId = e9Var.getAppId();
        android.app.Activity Z0 = e9Var.Z0();
        java.lang.String str = "";
        int i19 = 0;
        if (Z0 != null && (intent = Z0.getIntent()) != null && (extras = intent.getExtras()) != null) {
            java.lang.Object obj = extras.get("key_appbrand_stat_object");
            r11 = obj instanceof com.tencent.mm.plugin.appbrand.report.AppBrandStatObject ? ((com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) obj).f87790f : 1000;
            java.lang.Object obj2 = extras.get("key_appbrand_init_config");
            if (obj2 instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) obj2;
                str = appBrandInitConfigWC.f47278x;
                i19 = appBrandInitConfigWC.L;
            }
        }
        try {
            java.lang.String string = jSONObject.getString("type");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSecureTunnel", "securetunnel type nil");
                e9Var.a(i18, o("fail"));
                return;
            }
            java.lang.String string2 = jSONObject.getString("reqbuf");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSecureTunnel", "securetunnel reqbuf nil");
                e9Var.a(i18, o("fail"));
                return;
            }
            java.lang.String string3 = jSONObject.getString("cmd");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSecureTunnel", "securetunnel cmd nil");
                e9Var.a(i18, o("fail"));
                return;
            }
            try {
                try {
                    if (!string.equals("wxpay")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback fail: invalid type");
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("err_desc", "invalid type");
                        e9Var.a(i17, p("fail", hashMap));
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel doscene");
                    com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
                    lVar2.f70664a = new r45.gy5();
                    lVar2.f70665b = new r45.hy5();
                    lVar2.f70666c = "/cgi-bin/mmpay-bin/securetunnel";
                    lVar2.f70678o = 2;
                    lVar2.f70667d = 2632;
                    if (jSONObject.has("timeout")) {
                        lVar2.f70672i = jSONObject.getInt("timeout");
                    }
                    lVar2.f70678o = 2;
                    com.tencent.mm.modelbase.o a17 = lVar2.a();
                    r45.gy5 gy5Var = (r45.gy5) a17.f70710a.f70684a;
                    gy5Var.f375645g = string2;
                    gy5Var.f375642d = string3;
                    gy5Var.f375644f = X1;
                    gy5Var.f375643e = appId;
                    gy5Var.f375646h = r11;
                    gy5Var.f375647i = 1;
                    gy5Var.f375648m = str;
                    gy5Var.f375649n = i19;
                    ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new yc1.e0(this, d0Var));
                } catch (org.json.JSONException unused) {
                    e9Var = lVar;
                    i18 = i17;
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSecureTunnel", "mini app securetunnel parameter error");
                    e9Var.a(i18, o("fail"));
                }
            } catch (org.json.JSONException unused2) {
            }
        } catch (org.json.JSONException unused3) {
        }
    }
}
