package gb1;

/* loaded from: classes7.dex */
public abstract class f extends gb1.i {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            I(lVar, c0Var, jSONObject, i17);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new gb1.e(this, lVar, c0Var, jSONObject, i17));
        }
    }

    public final void I(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        boolean z17;
        if (!lVar.c(k(), c0Var)) {
            lVar.a(i17, "fail:interrupted");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.t E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseRemoveViewJsApi", "invoke JsApi(%s) failed, component view is null", k());
            str = android.text.TextUtils.isEmpty("fail:ComponentView is null.") ? "fail:internal error" : "fail:ComponentView is null.";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            return;
        }
        if (E.getCustomViewContainer() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseRemoveViewJsApi", "fail, component custom view container is null");
            str = android.text.TextUtils.isEmpty("fail:remove view failed") ? "fail:internal error" : "fail:remove view failed";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        try {
            int H = H(jSONObject);
            boolean optBoolean = jSONObject.optBoolean("independent", false);
            android.view.View o17 = ((com.tencent.mm.plugin.appbrand.page.ia) E.M(optBoolean)).o(H);
            if ((o17 instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) && jSONObject.has("draggable") && jSONObject.optBoolean("draggable", false)) {
                ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) o17).getClass();
                com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.C.remove(java.lang.Integer.valueOf(H));
            }
            if (((com.tencent.mm.plugin.appbrand.page.ia) E.M(optBoolean)).p(H) != null) {
                z17 = ((com.tencent.mm.plugin.appbrand.page.ia) E.M(optBoolean)).r(H);
                if (z17) {
                    z17 = J(E, H, o17, jSONObject);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                E.M(optBoolean).a(H);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRemoveViewJsApi", "remove view(parentId : %s, viewId : %s, r : %s)", java.lang.Integer.valueOf(jSONObject.optInt("parentId", 0)), java.lang.Integer.valueOf(H), java.lang.Boolean.valueOf(z17));
            lVar.a(i17, r(null, z17 ? jc1.f.f298912a : jc1.f.f298915d, null));
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseRemoveViewJsApi", "get viewId error. exception : %s", e19);
            str = android.text.TextUtils.isEmpty("fail:view id do not exist") ? "fail:internal error" : "fail:view id do not exist";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, u(str, jSONObject4));
        }
    }

    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        return true;
    }
}
