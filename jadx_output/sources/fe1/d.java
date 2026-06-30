package fe1;

/* loaded from: classes15.dex */
public final class d extends fe1.a {
    public static final int CTRL_INDEX = 1576;
    public static final java.lang.String NAME = "checkTransitCardSupport";

    @Override // fe1.a
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(manager, "manager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString = data.optString("issuerID", "");
        java.lang.String optString2 = data.optString("actionType", "issue");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.JsApiCheckSupport", "execute, issuerID: " + optString + ", actionType: " + optString2);
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            kotlin.jvm.internal.o.d(optString2);
            fe1.c cVar = new fe1.c(currentTimeMillis, optString, env, this, i17);
            com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.CheckSupportTask checkSupportTask = new com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.CheckSupportTask(manager.f261502a, optString, optString2);
            checkSupportTask.F(cVar);
            checkSupportTask.d();
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.JsApiCheckSupport", "execute, issuerID is empty");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ie1.b bVar = ie1.b.f290978a;
        java.lang.String appId = env.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        bVar.a(NAME, false, currentTimeMillis, currentTimeMillis2, 10011, "issuerID is required", "", appId);
        env.a(i17, de1.b.a(this, 10011, "fail:issuerID is required", kz5.c1.i(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 10011))));
    }
}
