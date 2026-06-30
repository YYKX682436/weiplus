package eh1;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1278;
    public static final java.lang.String NAME = "postMessageToMagicBrushFrame";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a T2;
        fh1.i iVar;
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        if (!data.has("frameId")) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
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
        int optInt = data.optInt("frameId", 0);
        java.lang.String optString = data.optString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        int optInt2 = data.optInt("biz");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = env.getRuntime();
        com.tencent.mm.plugin.appbrand.o6 o6Var = runtime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) runtime : null;
        if (o6Var == null || (T2 = o6Var.T2()) == null || (iVar = (fh1.i) ((com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.b) T2).f85736c.get(optInt2)) == null) {
            env.a(i17, o("fail biz instance not found"));
            return;
        }
        fh1.z zVar = (fh1.z) iVar;
        zVar.e(new fh1.r(zVar, optString, optInt));
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        env.a(i17, u(str2, jSONObject2));
    }
}
