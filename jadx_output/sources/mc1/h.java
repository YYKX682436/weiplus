package mc1;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1039;
    public static final java.lang.String NAME = "getGameLivePermission";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (!java.lang.Boolean.valueOf(ti1.c.a(c0Var.t3())).booleanValue()) {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeNotPermitted, i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameLivePermission", "not permitted");
            return;
        }
        if (((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(c0Var.getAppId(), c0Var.t3().u0().f77281g).booleanValue()) {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeIsLiving, i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameLivePermission", "is Living");
            return;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.T) {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeVoipConflict, i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameLivePermission", "is voIPTalking");
        } else if (tb1.b.f416889a.a().length <= 0) {
            C(c0Var, 1, mc1.g.GameLiveStatusErrCodeNormal, i17);
        } else {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeCameraConfict, i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetGameLivePermission", "is Camera Capturing");
        }
    }

    public final void C(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, mc1.g gVar, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("status", java.lang.Integer.valueOf(i17));
        hashMap.put("errCode", java.lang.Integer.valueOf(gVar.f325607d));
        c0Var.a(i18, p("ok", hashMap));
    }
}
