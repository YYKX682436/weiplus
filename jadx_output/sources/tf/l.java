package tf;

/* loaded from: classes7.dex */
public abstract class l {
    public static boolean a(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        if (!k0Var.k().contains("operate")) {
            return false;
        }
        java.lang.String optString = jSONObject.optString("type");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || !optString.equalsIgnoreCase("exitPictureInPicture")) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0 ? ((com.tencent.mm.plugin.appbrand.jsapi.d0) lVar).t3() : null;
        if (t37 == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, k0Var.u(str2, jSONObject2));
            return true;
        }
        com.tencent.mm.plugin.appbrand.pip.o0 z07 = t37.z0();
        if (z07 == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, k0Var.u(str2, jSONObject3));
            return true;
        }
        int ordinal = z07.g(jSONObject.optInt("viewId")).ordinal();
        if (ordinal == 1) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:exiting picture in picture mode now" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 1107008);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar.a(i17, k0Var.u(str2, jSONObject4));
            return true;
        }
        if (ordinal != 2) {
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 0);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, k0Var.u(str2, jSONObject5));
            return true;
        }
        str = android.text.TextUtils.isEmpty(null) ? "fail:not in picture in picture mode now" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        try {
            jSONObject6.put("errno", 1107007);
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        lVar.a(i17, k0Var.u(str2, jSONObject6));
        return true;
    }
}
