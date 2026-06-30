package md1;

/* loaded from: classes13.dex */
public final class t implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md1.u f325803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f325804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325805c;

    public t(md1.u uVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f325803a = uVar;
        this.f325804b = lVar;
        this.f325805c = i17;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2, int i18, int i19) {
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "onCapture ret:" + i17 + ", path:" + str + ", errMsg:" + str2 + ", width:" + i18 + ", height:" + i19);
        int i27 = this.f325805c;
        md1.u uVar = this.f325803a;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f325804b;
        if (i17 != 0 || str == null) {
            java.lang.String str4 = "fail:" + str2;
            uVar.getClass();
            str3 = android.text.TextUtils.isEmpty(str4) ? "fail:internal error" : str4;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i27, uVar.u(str3, jSONObject));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String C = md1.u.C(uVar, lVar, str, true);
        if (C != null) {
            hashMap.put("tempImagePath", C);
            hashMap.put("width", java.lang.Integer.valueOf(i18));
            hashMap.put("height", java.lang.Integer.valueOf(i19));
            uVar.getClass();
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i27, uVar.t("ok", hashMap));
            return;
        }
        uVar.getClass();
        str3 = android.text.TextUtils.isEmpty("fail:failed to create local id") ? "fail:internal error" : "fail:failed to create local id";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i27, uVar.u(str3, jSONObject2));
    }

    public void b(int i17, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "onStartRecord, ret:" + i17 + ", errMsg:" + str);
        md1.u uVar = this.f325803a;
        int i18 = this.f325805c;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f325804b;
        if (i17 == 0) {
            uVar.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i18, uVar.u(str2, jSONObject));
            return;
        }
        java.lang.String str5 = "fail:" + str;
        uVar.getClass();
        if (android.text.TextUtils.isEmpty(str5)) {
            str5 = "fail:internal error";
        }
        str2 = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i18, uVar.u(str2, jSONObject2));
    }

    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, boolean z17) {
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceOperateVoIPView", "onStopRecord ret %d, tempVideoPath %s, width %d, height %d, isSaveRecordPath %b", java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        int i27 = this.f325805c;
        md1.u uVar = this.f325803a;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f325804b;
        if (i17 != 0) {
            java.lang.String str4 = "fail:" + str;
            uVar.getClass();
            str3 = android.text.TextUtils.isEmpty(str4) ? "fail:internal error" : str4;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i27, uVar.u(str3, jSONObject));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.o.d(str2);
        java.lang.String C = md1.u.C(uVar, lVar, str2, !z17);
        if (C != null) {
            hashMap.put("tempVideoPath", C);
            hashMap.put("height", java.lang.Integer.valueOf(i19));
            hashMap.put("width", java.lang.Integer.valueOf(i18));
            uVar.getClass();
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i27, uVar.t("ok", hashMap));
            return;
        }
        uVar.getClass();
        str3 = android.text.TextUtils.isEmpty("fail:failed to create local id") ? "fail:internal error" : "fail:failed to create local id";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i27, uVar.u(str3, jSONObject2));
    }
}
