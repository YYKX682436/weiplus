package xc1;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f453031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f453032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc1.l f453033f;

    public g(com.tencent.mm.plugin.appbrand.y yVar, int i17, xc1.l lVar) {
        this.f453031d = yVar;
        this.f453032e = i17;
        this.f453033f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f453031d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
        if (runtime != null) {
            runtime.S();
        }
        xc1.l lVar = this.f453033f;
        lVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(this.f453032e, lVar.u(str, jSONObject));
    }
}
