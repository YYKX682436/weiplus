package eh1;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1276;
    public static final java.lang.String NAME = "insertMagicBrushFrame";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a T2;
        fh1.i iVar;
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        this.f81338e = false;
        if (!data.has("frameId")) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            env.a(i17, u(str, jSONObject));
            return;
        }
        int optInt = data.optInt("frameId", 0);
        java.lang.String optString = data.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String optString2 = data.optString("fsPath");
        if (optString2 != null) {
            com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = env.getFileSystem();
            com.tencent.mm.plugin.appbrand.appstorage.g2 g2Var = fileSystem instanceof com.tencent.mm.plugin.appbrand.appstorage.g2 ? (com.tencent.mm.plugin.appbrand.appstorage.g2) fileSystem : null;
            com.tencent.mm.plugin.appbrand.appstorage.u1 a17 = g2Var != null ? g2Var.a(optString2) : null;
            com.tencent.mm.plugin.appbrand.appstorage.j3 j3Var = a17 instanceof com.tencent.mm.plugin.appbrand.appstorage.j3 ? (com.tencent.mm.plugin.appbrand.appstorage.j3) a17 : null;
            java.lang.String str4 = j3Var != null ? j3Var.f76226e : null;
            if (!(str4 == null || str4.length() == 0)) {
                optString2 = r26.i0.w(optString2, str4, "", false);
            }
        } else {
            optString2 = null;
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        int optInt2 = data.optInt("biz");
        int optInt3 = optJSONObject != null ? optJSONObject.optInt("width", 0) : 0;
        int optInt4 = optJSONObject != null ? optJSONObject.optInt("height", 0) : 0;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = env.x();
        if (x17 == null) {
            java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str5 != null ? str5 : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            env.a(i17, u(str, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = env.getRuntime();
        com.tencent.mm.plugin.appbrand.o6 o6Var = runtime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) runtime : null;
        if (o6Var == null || (T2 = o6Var.T2()) == null) {
            java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str7 != null ? str7 : "";
            java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            env.a(i17, u(str, jSONObject3));
            return;
        }
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b bVar = (com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b) T2;
        android.util.SparseArray sparseArray = bVar.f85736c;
        int indexOfKey = sparseArray.indexOfKey(optInt2);
        if (indexOfKey >= 0) {
            java.lang.Object valueAt = sparseArray.valueAt(indexOfKey);
            kotlin.jvm.internal.o.d(valueAt);
            iVar = (fh1.i) valueAt;
        } else {
            fh1.z zVar = new fh1.z(bVar.f85734a, optInt2, optString2, x17);
            sparseArray.put(optInt2, zVar);
            iVar = zVar;
        }
        fh1.z zVar2 = (fh1.z) iVar;
        zVar2.e(new fh1.q(zVar2, optInt, optString, optInt3, optInt4));
        java.lang.String optString3 = data.optString("appId");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b a18 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(data.optString("envVersion"), com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE);
        h0Var.f310123d = a18;
        if (a18 == com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.DEVELOP) {
            h0Var.f310123d = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.TRIAL;
        }
        pm0.v.X(new eh1.a(iVar, optString3, h0Var, data.optString("appPath")));
        java.lang.String str9 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str9 != null ? str9 : "";
        java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 0);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        env.a(i17, u(str, jSONObject4));
    }
}
