package fe1;

/* loaded from: classes15.dex */
public final class t extends fe1.a {
    public static final int CTRL_INDEX = 1579;
    public static final java.lang.String NAME = "rechargeTransitCard";

    @Override // fe1.a
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(manager, "manager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString = data.optString("issuerID", "");
        java.lang.String optString2 = data.optString("orderNo", "");
        java.lang.String optString3 = data.optString("operation", "");
        java.lang.String optString4 = data.optString("sign", "");
        java.lang.String optString5 = data.optString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "");
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            kotlin.jvm.internal.o.d(optString2);
            if (!(optString2.length() == 0)) {
                kotlin.jvm.internal.o.d(optString3);
                if (!(optString3.length() == 0)) {
                    kotlin.jvm.internal.o.d(optString4);
                    if (!(optString4.length() == 0)) {
                        kotlin.jvm.internal.o.d(optString5);
                        fe1.s sVar = new fe1.s(currentTimeMillis, optString, env, this, i17);
                        com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.RechargeTask rechargeTask = new com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.RechargeTask(manager.f261502a, optString, optString2, optString4, optString5, optString3);
                        rechargeTask.F(sVar);
                        rechargeTask.d();
                        return;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.JsApiRecharge", "execute, missing required parameters");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ie1.b bVar = ie1.b.f290978a;
        java.lang.String appId = env.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        bVar.a(NAME, false, currentTimeMillis, currentTimeMillis2, 10011, "issuerID, orderNo, operation, sign are required", optString, appId);
        env.a(i17, de1.b.a(this, 10011, "fail:issuerID, orderNo, operation, sign are required", kz5.c1.i(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 10011))));
    }
}
