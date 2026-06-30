package ut0;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1522;
    public static final java.lang.String NAME = "applyHPatch";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 env = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch in jsapi");
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = env.getFileSystem();
        kotlin.jvm.internal.o.d(fileSystem);
        com.tencent.mm.vfs.r6 absoluteFile = fileSystem.getAbsoluteFile(data.optString("oldFile"));
        com.tencent.mm.vfs.r6 absoluteFile2 = fileSystem.getAbsoluteFile(data.optString("patchFile"));
        com.tencent.mm.vfs.r6 resolvePath = fileSystem.resolvePath(data.optString("newFile"));
        if (absoluteFile != null && absoluteFile2 != null && resolvePath != null) {
            com.tencent.mars.xlog.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch resolve path: ok: oldFile=" + absoluteFile + ", patch=" + absoluteFile2 + ", newFile=" + resolvePath);
            ((ku5.t0) ku5.t0.f312615d).g(new ut0.a(absoluteFile, absoluteFile2, resolvePath, env, i17, this));
            return;
        }
        com.tencent.mars.xlog.Log.e("AppBrand.WVA.JsApiApplyHPatch", "HPatch resolve path: failed: oldFile=" + absoluteFile + ", patch=" + absoluteFile2 + ", newFile=" + resolvePath);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (absoluteFile == null) {
            arrayList.add("oldFile");
        }
        if (absoluteFile2 == null) {
            arrayList.add("patchFile");
        }
        if (resolvePath == null) {
            arrayList.add("newFile");
        }
        java.lang.String concat = "fail: path invalid: ".concat(kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null));
        if (android.text.TextUtils.isEmpty(concat)) {
            concat = "fail:jsapi invalid request data";
        }
        if (concat == null) {
            concat = "";
        }
        java.lang.String str = concat;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str, jSONObject));
    }
}
