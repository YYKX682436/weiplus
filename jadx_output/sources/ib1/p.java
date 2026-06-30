package ib1;

/* loaded from: classes7.dex */
public final class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 815;
    public static final java.lang.String NAME = "makeBluetoothPair";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        byte[] decode;
        java.lang.String str;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "env is null", new java.lang.Object[0]);
            return;
        }
        if (jSONObject == null || !jSONObject.has("deviceId")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "data is null or do not have key: deviceId", new java.lang.Object[0]);
            java.util.Map l17 = kz5.c1.l(new jz5.l("errCode", 10013));
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            l17.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", l17));
            return;
        }
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "appId: " + appId + ", data: " + jSONObject, new java.lang.Object[0]);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(appId);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "bleWorker is null", new java.lang.Object[0]);
            java.util.Map l18 = kz5.c1.l(new jz5.l("errCode", 10000));
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            l18.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", l18));
            return;
        }
        java.lang.String optString = jSONObject.optString("deviceId", null);
        if (optString == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "deviceId is null", new java.lang.Object[0]);
            java.util.Map l19 = kz5.c1.l(new jz5.l("errCode", 10013));
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            l19.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", l19));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("pin", null);
        if (optString2 == null) {
            decode = null;
        } else {
            try {
                decode = android.util.Base64.decode(optString2, 2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "decode pin fail since " + e17, new java.lang.Object[0]);
                java.util.Map l27 = kz5.c1.l(new jz5.l("errCode", 10013));
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                l27.put("errno", 101);
                lVar.a(i17, t("fail:invalid data", l27));
                return;
            }
        }
        long optLong = jSONObject.optLong("timeout", 20000L);
        boolean optBoolean = jSONObject.optBoolean("forcePair", false);
        boolean optBoolean2 = jSONObject.optBoolean("useOldImpl", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deviceId: ");
        sb6.append(optString);
        sb6.append(", pin: ");
        if (decode != null) {
            str = java.util.Arrays.toString(decode);
            kotlin.jvm.internal.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", timeoutMs: ");
        sb6.append(optLong);
        sb6.append(", forcePair: ");
        sb6.append(optBoolean);
        sb6.append(", useOldImpl: ");
        sb6.append(optBoolean2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", sb6.toString(), new java.lang.Object[0]);
        b17.h(optString, new mb1.j(optString, decode, optLong, optBoolean, optBoolean2), new ib1.o(appId, this, i17, lVar));
    }
}
