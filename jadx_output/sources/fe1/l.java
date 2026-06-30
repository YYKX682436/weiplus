package fe1;

/* loaded from: classes15.dex */
public final class l extends fe1.a {
    public static final int CTRL_INDEX = 1581;
    public static final java.lang.String NAME = "getTransitCardInfo";

    @Override // fe1.a
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(manager, "manager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString = data.optString("issuerID", "");
        org.json.JSONArray optJSONArray = data.optJSONArray("fields");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.JsApiGetCardInfo", "execute, issuerID is empty");
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            ie1.b bVar = ie1.b.f290978a;
            java.lang.String appId = env.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            bVar.a(NAME, false, currentTimeMillis, currentTimeMillis2, 10011, "issuerID is required", "", appId);
            env.a(i17, de1.b.a(this, 10011, "fail:issuerID is required", kz5.c1.i(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 10011))));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString2 = optJSONArray.optString(i18, "");
                kotlin.jvm.internal.o.d(optString2);
                if (optString2.length() > 0) {
                    arrayList.add(optString2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(kz5.c0.i("cardNo", "balance", "validateDate", "transactionRecords"));
        }
        fe1.k kVar = new fe1.k(currentTimeMillis, optString, env, this, i17);
        com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardInfoTask getCardInfoTask = new com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardInfoTask(manager.f261502a, optString, arrayList);
        getCardInfoTask.F(kVar);
        getCardInfoTask.d();
    }
}
