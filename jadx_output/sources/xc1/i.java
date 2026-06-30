package xc1;

/* loaded from: classes.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f453038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f453039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f453040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.h f453041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f453042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xc1.l f453043i;

    public i(com.tencent.mm.plugin.appbrand.y yVar, int i17, org.json.JSONObject jSONObject, com.tencent.luggage.sdk.launching.h hVar, java.lang.Object obj, xc1.l lVar) {
        this.f453038d = yVar;
        this.f453039e = i17;
        this.f453040f = jSONObject;
        this.f453041g = hVar;
        this.f453042h = obj;
        this.f453043i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc1.l lVar = this.f453043i;
        int i17 = this.f453039e;
        com.tencent.mm.plugin.appbrand.y yVar = this.f453038d;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke onWXAppResult, appId:");
            sb6.append(yVar.getAppId());
            sb6.append(", callbackId:");
            sb6.append(i17);
            sb6.append(" data:");
            sb6.append(this.f453040f);
            sb6.append(" receiver: ");
            com.tencent.luggage.sdk.launching.h hVar = this.f453041g;
            java.lang.String name = hVar != null ? hVar.getClass().getName() : null;
            if (name == null) {
                name = "null";
            }
            sb6.append(name);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiNavigateBackNative", sb6.toString());
            if (hVar != null) {
                java.lang.Object obj = this.f453042h;
                java.lang.String obj2 = obj != null ? obj.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                hVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(obj2));
            }
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
            yVar.a(i17, lVar.u(str, jSONObject));
        } catch (java.lang.Exception e18) {
            java.lang.String str3 = "fail " + e18.getMessage();
            lVar.getClass();
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = "fail:internal error";
            }
            java.lang.String str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, lVar.u(str4, jSONObject2));
        }
    }
}
