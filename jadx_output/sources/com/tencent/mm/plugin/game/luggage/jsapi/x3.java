package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class x3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f139774e = "";

    public static boolean f(java.lang.String str, java.io.InputStream inputStream) {
        java.io.OutputStream outputStream = null;
        try {
            try {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                com.tencent.mm.vfs.r6 s17 = r6Var.s();
                java.util.Objects.requireNonNull(s17);
                s17.J();
                outputStream = com.tencent.mm.vfs.w6.H(r6Var);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read == -1) {
                        outputStream.flush();
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveImageToPhotosAlbum", "writeFile exp %s", e17);
                com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                return false;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
            throw th6;
        }
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = !com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str2 : "_";
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir() + "/gamecenter/tmp/" + str + "/";
    }

    public static void h(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str + str2, true);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveImageToPhotosAlbum", "save temp file failed");
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, android.content.Context context, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.c4(bitmap, str, q5Var, context, str2));
    }

    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.p6.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSaveImageToPhotosAlbum", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_LOCALID);
        java.lang.String optString2 = jSONObject.optString("imgUrl");
        java.lang.String optString3 = jSONObject.optString("base64ImgStr");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tailInfo");
        f139774e = g("bundle", null);
        final com.tencent.mm.plugin.game.luggage.jsapi.y3 y3Var = new com.tencent.mm.plugin.game.luggage.jsapi.y3(this, bVar, optJSONObject);
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406610d, new com.tencent.mm.plugin.game.luggage.jsapi.a4(this, optString3, bVar, y3Var, optString2, optString), new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.luggage.jsapi.x3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.webview.luggage.jsapi.q5.this.a("saveToPhotosAlbum fail:system permission denied", null);
            }
        });
    }
}
