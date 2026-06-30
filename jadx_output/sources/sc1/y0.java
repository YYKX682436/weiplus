package sc1;

/* loaded from: classes7.dex */
public class y0 implements com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb1.n f405736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc1.z0 f405738c;

    public y0(sc1.z0 z0Var, gb1.n nVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f405738c = z0Var;
        this.f405736a = nVar;
        this.f405737b = tVar;
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
    public void onSnapshot(android.graphics.Bitmap bitmap) {
        java.lang.String str;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePlayer", "onSnapshot: bitmap nil");
            gb1.n nVar = this.f405736a;
            sc1.z0 z0Var = this.f405738c;
            z0Var.getClass();
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:take snapshot fail" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1107004);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            nVar.a(z0Var.u(str, jSONObject));
            return;
        }
        java.lang.String str4 = q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 90, android.graphics.Bitmap.CompressFormat.JPEG, str4, true);
            ik1.b0 b0Var = new ik1.b0();
            if (this.f405737b.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str4)), "jpg", true, b0Var) != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                gb1.n nVar2 = this.f405736a;
                sc1.z0 z0Var2 = this.f405738c;
                z0Var2.getClass();
                java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:save to temp file after take snapshot fail" : null;
                str = str5 != null ? str5 : "";
                java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 1107006);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                nVar2.a(z0Var2.u(str, jSONObject2));
                return;
            }
            this.f405738c.getClass();
            if (!bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePlayer", "bitmap recycle " + bitmap.toString());
                bitmap.recycle();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePlayer", "onSnapshot: actualPath:%s path:%s", str4, b0Var.f291824a);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("tempImagePath", b0Var.f291824a);
            hashMap.put("width", java.lang.Integer.valueOf(width));
            hashMap.put("height", java.lang.Integer.valueOf(height));
            gb1.n nVar3 = this.f405736a;
            sc1.z0 z0Var3 = this.f405738c;
            z0Var3.getClass();
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            nVar3.a(z0Var3.t("ok", hashMap));
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePlayer", "onSnapshot: exception %s", e19.getMessage());
            gb1.n nVar4 = this.f405736a;
            sc1.z0 z0Var4 = this.f405738c;
            z0Var4.getClass();
            java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:save to album after take snapshot fail" : null;
            str = str8 != null ? str8 : "";
            java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1107005);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            nVar4.a(z0Var4.u(str, jSONObject3));
        }
    }
}
