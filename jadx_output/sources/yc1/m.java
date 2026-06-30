package yc1;

/* loaded from: classes7.dex */
public final class m extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "bindSocketToNetwork";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        if (lVar == null) {
            return;
        }
        if (jSONObject == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiBindSocketToNetwork", "invoke, data: " + jSONObject);
        if (!kotlin.jvm.internal.o.b("wifi", jSONObject.optString("networkType"))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiBindSocketToNetwork", "invoke, not bind to wifi is denied now");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        int optInt = jSONObject.optInt("socketFd", -1);
        if (optInt >= 0) {
            yc1.l lVar2 = new yc1.l(lVar, i17, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.BindSocketToNetworkLogic", "bindSocketToWifi, socketFd: " + optInt);
            uh1.r1.f427898h.b(new uh1.d1(lVar2, optInt));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiBindSocketToNetwork", "invoke, socketFd is invalid");
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 101);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, u(str2, jSONObject4));
    }
}
