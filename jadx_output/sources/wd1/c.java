package wd1;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1460;
    private static final java.lang.String NAME = "operateSnapshotWebView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView data: " + jSONObject);
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView fail, data is null");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        wd1.a aVar = (wd1.a) yVar.t3().K1(wd1.a.class);
        java.lang.String optString = jSONObject.optString("type");
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1783761045:
                    if (optString.equals("takeSnapshot")) {
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("rect");
                        int optInt = optJSONObject != null ? optJSONObject.optInt("x") : 0;
                        int optInt2 = optJSONObject != null ? optJSONObject.optInt("y") : 0;
                        int optInt3 = optJSONObject != null ? optJSONObject.optInt("width") : 0;
                        int optInt4 = optJSONObject != null ? optJSONObject.optInt("height") : 0;
                        long optLong = jSONObject.optLong("snapshotAfterScroll", 200L);
                        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("scrollTo");
                        int optInt5 = optJSONObject2 != null ? optJSONObject2.optInt("x") : 0;
                        int optInt6 = optJSONObject2 != null ? optJSONObject2.optInt("y") : 0;
                        androidx.lifecycle.y lifecycleOwner = yVar.getLifecycleOwner();
                        kotlinx.coroutines.y0 a17 = lifecycleOwner != null ? androidx.lifecycle.z.a(lifecycleOwner) : kotlinx.coroutines.z0.b();
                        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                        kotlinx.coroutines.l.d(a17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new wd1.b(aVar, optInt5, optInt6, optInt, optInt2, optInt3, optInt4, optLong, yVar, i17, this, null), 2, null);
                        return;
                    }
                    return;
                case -449313604:
                    if (optString.equals("execScript")) {
                        java.lang.String optString2 = jSONObject.optString("script", "");
                        if (aVar != null) {
                            kotlin.jvm.internal.o.d(optString2);
                            ym5.a1.f(new wd1.e(optString2, (wd1.k) aVar));
                        }
                        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put("errno", 0);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        yVar.a(i17, u(str2, jSONObject3));
                        return;
                    }
                    return;
                case 3417674:
                    if (optString.equals("open")) {
                        if (yVar.getF147807d() == null) {
                            com.tencent.mars.xlog.Log.w("Luggage.JsApiOperateSnapshotWebView", "operateSnapshotWebView open fail, context is null");
                            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                            str2 = str3 != null ? str3 : "";
                            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                            try {
                                jSONObject4.put("errno", 4);
                            } catch (java.lang.Exception e19) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                            }
                            yVar.a(i17, u(str2, jSONObject4));
                            return;
                        }
                        java.lang.String optString3 = jSONObject.optString("html", "");
                        if (aVar != null) {
                            android.content.Context f147807d = yVar.getF147807d();
                            kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
                            kotlin.jvm.internal.o.d(optString3);
                            ym5.a1.f(new wd1.i(f147807d, (wd1.k) aVar, optString3));
                        }
                        java.lang.String optString4 = jSONObject.optString("script", "");
                        if (aVar != null) {
                            kotlin.jvm.internal.o.d(optString4);
                            ym5.a1.f(new wd1.e(optString4, (wd1.k) aVar));
                        }
                        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        try {
                            jSONObject5.put("errno", 0);
                        } catch (java.lang.Exception e27) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                        }
                        yVar.a(i17, u(str2, jSONObject5));
                        return;
                    }
                    return;
                case 94756344:
                    if (optString.equals("close")) {
                        if (aVar != null) {
                            ym5.a1.f(new wd1.d((wd1.k) aVar));
                        }
                        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                        try {
                            jSONObject6.put("errno", 0);
                        } catch (java.lang.Exception e28) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                        }
                        yVar.a(i17, u(str2, jSONObject6));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
