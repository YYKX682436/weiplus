package zd1;

/* loaded from: classes7.dex */
public final class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1321;
    public static final java.lang.String NAME = "setAppSnapshotStrategy";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", "invoke(" + env.getAppId() + ") data:" + data);
        boolean optBoolean = data.optBoolean("ignoreNative", false);
        int c17 = ik1.w.c(data.optInt("shortEdge", 0));
        boolean has = data.has("frame");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var3 = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var4 = new kotlin.jvm.internal.f0();
        if (has) {
            org.json.JSONArray jSONArray = data.getJSONArray("frame");
            kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
            if (jSONArray.length() >= 4) {
                f0Var.f310116d = ik1.w.c(jSONArray.getInt(0));
                f0Var2.f310116d = ik1.w.c(jSONArray.getInt(1));
                f0Var3.f310116d = ik1.w.c(jSONArray.getInt(2));
                f0Var4.f310116d = ik1.w.c(jSONArray.getInt(3));
            }
            if (f0Var3.f310116d <= 0 || f0Var4.f310116d <= 0) {
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                env.a(i17, u(str2, jSONObject));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", "invoke(" + env.getAppId() + ") ignoreNative:" + optBoolean + " x:" + f0Var.f310116d + " y:" + f0Var2.f310116d + " width:" + f0Var3.f310116d + " height:" + f0Var4.f310116d);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new zd1.r(env, optBoolean, i17, this, has, f0Var, f0Var3, f0Var2, f0Var4, c17, null), 3, null);
    }
}
