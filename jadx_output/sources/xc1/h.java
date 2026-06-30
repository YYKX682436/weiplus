package xc1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f453034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f453035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f453036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc1.l f453037g;

    public h(com.tencent.mm.plugin.appbrand.y yVar, java.lang.Object obj, int i17, xc1.l lVar) {
        this.f453034d = yVar;
        this.f453035e = obj;
        this.f453036f = i17;
        this.f453037g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime;
        com.tencent.mm.plugin.appbrand.y yVar = this.f453034d;
        if (yVar != null && (runtime = yVar.getRuntime()) != null) {
            com.tencent.mm.plugin.appbrand.y yVar2 = this.f453034d;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime2 = yVar2 != null ? yVar2.getRuntime() : null;
            java.lang.Object obj = this.f453035e;
            runtime.T(com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult.a(runtime2, obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null, null), null);
        }
        com.tencent.mm.plugin.appbrand.m6.a(this.f453034d.getAppId()).f85719l = true;
        com.tencent.mm.plugin.appbrand.y yVar3 = this.f453034d;
        int i17 = this.f453036f;
        xc1.l lVar = this.f453037g;
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
        yVar3.a(i17, lVar.u(str, jSONObject));
    }
}
