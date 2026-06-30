package sc1;

/* loaded from: classes7.dex */
public class c1 extends gb1.h {
    private static final int CTRL_INDEX = 363;
    public static final java.lang.String NAME = "operateLivePusher";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    @Override // gb1.h
    public boolean J() {
        return true;
    }

    @Override // gb1.h
    public boolean L(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePusher", "onOperateView : livePusherId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateLivePusher", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (!(view2 instanceof com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePusher", "targetView not AppBrandLivePusherView");
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = (com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView) view2;
        java.lang.String optString = jSONObject.optString("type");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePusher", "onOperateView operateType=%s", optString);
        if (optString.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.j0.f78445f)) {
            appBrandLivePusherView.setSnapshotListener(new sc1.b1(this, nVar, tVar));
            if (appBrandLivePusherView.f(com.tencent.mm.plugin.appbrand.j0.f78445f, jSONObject)) {
                return true;
            }
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            nVar.a(u(str2, jSONObject2));
            return true;
        }
        if (!optString.equalsIgnoreCase("playBGM")) {
            if (appBrandLivePusherView.f(optString, jSONObject)) {
                str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str3 != null ? str3 : "";
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                nVar.a(u(str2, jSONObject3));
                return true;
            }
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            nVar.a(u(str2, jSONObject4));
            return true;
        }
        java.lang.String optString2 = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, url is nil");
            java.lang.String str7 = android.text.TextUtils.isEmpty("fail:url is nil") ? "fail:jsapi invalid request data" : "fail:url is nil";
            java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            nVar.a(u(str7, jSONObject5));
            return true;
        }
        com.tencent.mm.plugin.appbrand.utils.d0.c(tVar, optString2, null, new sc1.a1(this, jSONObject, appBrandLivePusherView, optString2));
        str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str3 != null ? str3 : "";
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        try {
            jSONObject6.put("errno", 0);
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        nVar.a(u(str2, jSONObject6));
        return true;
    }
}
