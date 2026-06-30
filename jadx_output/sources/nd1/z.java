package nd1;

/* loaded from: classes.dex */
public final class z implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f336427f;

    public z(com.tencent.mm.plugin.appbrand.y yVar, int i17, nd1.c0 c0Var) {
        this.f336425d = yVar;
        this.f336426e = i17;
        this.f336427f = c0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        nd1.c0 c0Var = this.f336427f;
        int i17 = this.f336426e;
        com.tencent.mm.plugin.appbrand.y yVar = this.f336425d;
        if (!z17) {
            c0Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty("fail: ipcInvoke.") ? "fail:internal error" : "fail: ipcInvoke.";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, c0Var.u(str, jSONObject));
            return;
        }
        c0Var.getClass();
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        yVar.a(i17, c0Var.u(str3, jSONObject2));
    }
}
