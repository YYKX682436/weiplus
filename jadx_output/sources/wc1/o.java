package wc1;

/* loaded from: classes7.dex */
public class o extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1411;
    public static final java.lang.String NAME = "listenLoadSubPackageTaskStateChange";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "JsApiListenLoadSubPackageTaskStateChange get the env,but the env is null");
            return;
        }
        wc1.t tVar = (wc1.t) e9Var.k(wc1.t.class);
        if (tVar == null) {
            tVar = new wc1.t(e9Var);
            if (!tVar.f444496e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "JsApiListenLoadSubPackageTaskStateChange not support listen task state change");
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi not supported" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 100);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                e9Var.a(i17, u(str2, jSONObject2));
                return;
            }
            e9Var.l(tVar);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("states");
        if (optJSONArray != null) {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                arrayList.add(optJSONArray.optString(i18));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "allowed statesList:" + arrayList);
        java.util.HashSet hashSet = new java.util.HashSet();
        tVar.f444495d = hashSet;
        hashSet.addAll(arrayList);
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, u(str2, jSONObject3));
    }
}
