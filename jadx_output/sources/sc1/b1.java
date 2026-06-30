package sc1;

/* loaded from: classes7.dex */
public class b1 implements com.tencent.rtmp.TXLivePusher.ITXSnapshotListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gb1.n f405649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405650c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc1.c1 f405651d;

    public b1(sc1.c1 c1Var, gb1.n nVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405651d = c1Var;
        this.f405649b = nVar;
        this.f405650c = tVar;
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXSnapshotListener
    public void onSnapshot(android.graphics.Bitmap bitmap) {
        java.lang.String str;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePusher", "onSnapshot: bitmap nil");
            gb1.n nVar = this.f405649b;
            sc1.c1 c1Var = this.f405651d;
            c1Var.getClass();
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:take snapshot fail" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1107004);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            nVar.a(c1Var.u(str, jSONObject));
            return;
        }
        java.lang.String str4 = q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
            ik1.b0 b0Var = new ik1.b0();
            if (this.f405650c.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str4)), "jpg", true, b0Var) != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                gb1.n nVar2 = this.f405649b;
                sc1.c1 c1Var2 = this.f405651d;
                c1Var2.getClass();
                java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:save to temp file after take snapshot fail" : null;
                str = str5 != null ? str5 : "";
                java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 1107006);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                nVar2.a(c1Var2.u(str, jSONObject2));
                return;
            }
            this.f405651d.getClass();
            if (!bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePusher", "bitmap recycle " + bitmap.toString());
                bitmap.recycle();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePusher", "onSnapshot: actualPath:%s path:%s", str4, b0Var.f291824a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("tempImagePath", b0Var.f291824a);
            hashMap.put("width", java.lang.Integer.valueOf(width));
            hashMap.put("height", java.lang.Integer.valueOf(height));
            gb1.n nVar3 = this.f405649b;
            sc1.c1 c1Var3 = this.f405651d;
            c1Var3.getClass();
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            nVar3.a(c1Var3.t("ok", hashMap));
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePusher", "onSnapshot: exception %s", e19.getMessage());
            gb1.n nVar4 = this.f405649b;
            sc1.c1 c1Var4 = this.f405651d;
            c1Var4.getClass();
            java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:save to album after take snapshot fail" : null;
            str = str8 != null ? str8 : "";
            java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1107005);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            nVar4.a(c1Var4.u(str, jSONObject3));
        }
    }
}
