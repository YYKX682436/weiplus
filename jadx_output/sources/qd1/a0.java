package qd1;

/* loaded from: classes.dex */
public final class a0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1417;
    private static final java.lang.String NAME = "updateActionSheet";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiUpdateActionSheet", "updateActionSheet data:" + jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateActionSheet", "env is null, return");
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt(dm.i4.COL_ID, -1) : -1;
        if (optInt == -1) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateActionSheet", "invalid id, return");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        kotlin.jvm.internal.o.d(jSONObject);
        java.lang.String a17 = nf.e.a(jSONObject, "alertText");
        com.tencent.mars.xlog.Log.i("Luggage.JsApiUpdateActionSheet", "invoke, alertText: " + a17);
        java.lang.String optString = jSONObject.optString("itemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.Object obj = jSONArray.get(i18);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((java.lang.String) obj);
            }
            e9Var.m(new qd1.z(e9Var, optInt, i17, this, a17, arrayList));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiUpdateActionSheet", e18.getMessage());
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str4 != null ? str4 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str, jSONObject3));
        }
    }
}
