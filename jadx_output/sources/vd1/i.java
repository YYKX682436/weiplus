package vd1;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "mbAdFullLinkReport";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MBADFullLinkReporter", "[MBAd] data is null");
            if (lVar != null) {
                java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                java.lang.String str3 = str2 != null ? str2 : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i17, u(str3, jSONObject2));
                return;
            }
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("action");
            java.lang.String optString2 = jSONObject.optString("bizName");
            java.lang.String optString3 = jSONObject.optString("bizScene");
            java.lang.String optString4 = jSONObject.optString("traceId");
            java.lang.String optString5 = jSONObject.optString("frameSetName");
            java.lang.String optString6 = jSONObject.optString("implType");
            str = "";
            try {
                java.lang.String optString7 = jSONObject.optString("reportSource");
                java.lang.String optString8 = jSONObject.optString("extraJson");
                if (optString == null || r26.n0.N(optString)) {
                    com.tencent.mars.xlog.Log.w("MBADFullLinkReporter", "[MBAd] mbAdFullLinkReport: action is empty, skip");
                    if (lVar != null) {
                        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        if (str5 == null) {
                            str5 = str;
                        }
                        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put("errno", 0);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        lVar.a(i17, u(str5, jSONObject3));
                        return;
                    }
                    return;
                }
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    kotlin.jvm.internal.o.d(optString);
                    kotlin.jvm.internal.o.d(optString2);
                    kotlin.jvm.internal.o.d(optString3);
                    kotlin.jvm.internal.o.d(optString4);
                    kotlin.jvm.internal.o.d(optString5);
                    kotlin.jvm.internal.o.d(optString6);
                    kotlin.jvm.internal.o.d(optString7);
                    kotlin.jvm.internal.o.d(optString8);
                    ((mq0.i0) c0Var).Bi(optString, optString2, optString3, optString4, optString5, optString6, optString7, optString8);
                    com.tencent.mars.xlog.Log.i("MBADFullLinkReporter", "[MBAd] mbAdFullLinkReport ok, action=" + optString + ", bizName=" + optString2 + ", bizScene=" + optString3 + ", traceId=" + optString4 + ", frameSetName=" + optString5 + ", implType=" + optString6 + ", reportSource=" + optString7);
                } else {
                    com.tencent.mars.xlog.Log.w("MBADFullLinkReporter", "[MBAd] IMBADFullLinkReporter service not found");
                }
                if (lVar != null) {
                    java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    if (str7 == null) {
                        str7 = str;
                    }
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 0);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    lVar.a(i17, u(str7, jSONObject4));
                    return;
                }
                return;
            } catch (java.lang.Exception e27) {
                e = e27;
            }
            e = e27;
        } catch (java.lang.Exception e28) {
            e = e28;
            str = "";
        }
        com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] mbAdFullLinkReport failed: " + e, e);
        if (lVar != null) {
            java.lang.String str9 = "fail:" + e.getMessage();
            if (android.text.TextUtils.isEmpty(str9)) {
                str9 = "fail:internal error";
            }
            java.lang.String str10 = str9 == null ? str : str9;
            java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 4);
            } catch (java.lang.Exception e29) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
            }
            lVar.a(i17, u(str10, jSONObject5));
        }
    }
}
