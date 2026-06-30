package ut0;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f430793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f430794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f430795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f430796g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f430797h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut0.b f430798i;

    public a(com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.vfs.r6 r6Var2, com.tencent.mm.vfs.r6 r6Var3, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, ut0.b bVar) {
        this.f430793d = r6Var;
        this.f430794e = r6Var2;
        this.f430795f = r6Var3;
        this.f430796g = c0Var;
        this.f430797h = i17;
        this.f430798i = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch in threadpool");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int patch = com.tencent.mm.patchligthdiff.hdiff.HPatch.patch(this.f430793d.o(), this.f430794e.o(), this.f430795f.o(), 262144L);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        ut0.b bVar = this.f430798i;
        int i17 = this.f430797h;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f430796g;
        if (patch != 0) {
            com.tencent.mars.xlog.Log.e("AppBrand.WVA.JsApiApplyHPatch", "HPatch applied failed, cost:" + currentTimeMillis2);
            java.util.Map e17 = kz5.b1.e(new jz5.l("ret", java.lang.Integer.valueOf(patch)));
            bVar.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!(e17 instanceof java.util.HashMap)) {
                e17 = new java.util.HashMap(e17);
            }
            e17.put("errno", 4);
            c0Var.a(i17, bVar.t("fail:internal error", e17));
            return;
        }
        com.tencent.mars.xlog.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch applied success, cost:" + currentTimeMillis2);
        bVar.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, bVar.u(str2, jSONObject));
    }
}
