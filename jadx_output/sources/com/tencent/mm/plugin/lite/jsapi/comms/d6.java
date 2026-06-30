package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f143552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f143553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f143554h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.o6 f143555i;

    public d6(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, byte[] bArr, org.json.JSONObject jSONObject) {
        this.f143555i = o6Var;
        this.f143550d = str;
        this.f143551e = str2;
        this.f143552f = bitmap;
        this.f143553g = bArr;
        this.f143554h = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.tencent.mm.vfs.u6] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.tencent.mm.vfs.u6] */
    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        android.graphics.Bitmap bitmap3;
        java.io.OutputStream outputStream;
        android.graphics.Bitmap bitmap4;
        android.graphics.Bitmap bitmap5;
        android.graphics.Bitmap bitmap6;
        ?? u6Var;
        java.lang.String str;
        boolean z17;
        boolean z18;
        java.io.OutputStream outputStream2;
        java.util.HashMap hashMap = new java.util.HashMap();
        ?? r27 = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        java.lang.String str2 = this.f143551e;
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str2);
        com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var = this.f143555i;
        android.graphics.Bitmap bitmap7 = this.f143552f;
        java.lang.String str3 = this.f143550d;
        try {
            try {
                if (bitmap7 != null) {
                    try {
                        java.lang.String str4 = o6Var.f143704g + java.lang.String.format("MMImage_%d_%d.jpg", java.lang.Long.valueOf(o6Var.f143442e.f299028e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        if (ra3.h0.c(bitmap7, str4)) {
                            byte[] bArr = this.f143553g;
                            if (bArr != null) {
                                ra3.h0.d(str4, bArr);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "saveBitmapToFile fail. path: %s", str4);
                        }
                        u6Var = new com.tencent.mm.vfs.u6(str4);
                        com.tencent.mm.vfs.w6.h(str4);
                        str = com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
                        z17 = true;
                        z18 = false;
                    } catch (java.io.FileNotFoundException unused) {
                        bitmap7 = null;
                        bitmap3 = bitmap7;
                        outputStream = null;
                        bitmap6 = bitmap3;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, file not found");
                        r27 = bitmap6;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.io.IOException unused2) {
                        bitmap7 = null;
                        bitmap2 = bitmap7;
                        outputStream = null;
                        bitmap5 = bitmap2;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, exception");
                        r27 = bitmap5;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Exception unused3) {
                        bitmap7 = null;
                        bitmap = bitmap7;
                        outputStream = null;
                        bitmap4 = bitmap;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, exception");
                        r27 = bitmap4;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bitmap7 = null;
                        r27 = bitmap7;
                        outputStream = null;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        throw th;
                    }
                } else {
                    try {
                        u6Var = new com.tencent.mm.vfs.u6(str2);
                        str = s46.c.c(str2);
                        z18 = o6Var.C(str2);
                        z17 = !z18 && ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(str3).f182742n == 1;
                    } catch (java.io.FileNotFoundException unused4) {
                        bitmap3 = null;
                        outputStream = null;
                        bitmap6 = bitmap3;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, file not found");
                        r27 = bitmap6;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.io.IOException unused5) {
                        bitmap2 = null;
                        outputStream = null;
                        bitmap5 = bitmap2;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, exception");
                        r27 = bitmap5;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Exception unused6) {
                        bitmap = null;
                        outputStream = null;
                        bitmap4 = bitmap;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, exception");
                        r27 = bitmap4;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        r27 = 0;
                        outputStream = null;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        throw th;
                    }
                }
                if (!z17 && !z18) {
                    o6Var.f143443f.a("saveToPhotosAlbum fail, invalid file type");
                }
                java.lang.String D = o6Var.D(str, z17, z18);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(D)) {
                        com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "filePath and localId is null");
                    } else {
                        str3 = o6Var.E(D);
                        hashMap.put(dm.i4.COL_LOCALID, str3);
                    }
                }
                hashMap.put(dm.i4.COL_LOCALID, str3);
                int i17 = android.os.Build.VERSION.SDK_INT;
                org.json.JSONObject jSONObject = this.f143554h;
                if (i17 < 29 || com.tencent.mm.sdk.platformtools.x.f193064a) {
                    if (com.tencent.mm.plugin.lite.jsapi.comms.o6.B(o6Var, D, u6Var)) {
                        o6Var.G(D, z17, z18);
                        q75.c.f(D, o6Var.c());
                        hashMap.put("err_msg", "saveToPhotosAlbum:ok");
                        o6Var.f143443f.b(hashMap);
                        com.tencent.mm.plugin.lite.jsapi.comms.o6.A(o6Var, str3, jSONObject);
                    } else {
                        o6Var.f143443f.a("saveToPhotosAlbum fail, save fail");
                    }
                    outputStream2 = null;
                } else {
                    com.tencent.mm.sdk.platformtools.a7[] a7VarArr = {null};
                    if (z17) {
                        com.tencent.mm.sdk.platformtools.u6.b(o6Var.c(), D, new com.tencent.mm.plugin.lite.jsapi.comms.b6(this, a7VarArr));
                    } else if (z18) {
                        android.content.Context c17 = o6Var.c();
                        com.tencent.mm.sdk.platformtools.b7.d(c17, D, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new com.tencent.mm.sdk.platformtools.t6(new com.tencent.mm.plugin.lite.jsapi.comms.c6(this, a7VarArr), D, c17));
                    }
                    com.tencent.mm.sdk.platformtools.a7 a7Var = a7VarArr[0];
                    java.io.OutputStream b17 = a7Var != null ? a7Var.b() : null;
                    try {
                        if (b17 == null) {
                            throw new java.io.IOException("Open OutputStream with MediaStore fail!");
                        }
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int read = u6Var.read(bArr2);
                            if (-1 == read) {
                                break;
                            } else {
                                b17.write(bArr2, 0, read);
                            }
                        }
                        b17.flush();
                        a7VarArr[0].c();
                        hashMap.put("err_msg", "saveToPhotosAlbum:ok");
                        o6Var.f143443f.b(hashMap);
                        com.tencent.mm.plugin.lite.jsapi.comms.o6.A(o6Var, str3, jSONObject);
                        outputStream2 = b17;
                    } catch (java.io.FileNotFoundException unused7) {
                        outputStream = b17;
                        bitmap6 = u6Var;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, file not found");
                        r27 = bitmap6;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.io.IOException unused8) {
                        outputStream = b17;
                        bitmap5 = u6Var;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, exception");
                        r27 = bitmap5;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Exception unused9) {
                        outputStream = b17;
                        bitmap4 = u6Var;
                        o6Var.f143443f.a("saveToPhotosAlbum fail, exception");
                        r27 = bitmap4;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        outputStream = b17;
                        r27 = u6Var;
                        com.tencent.mm.sdk.platformtools.t8.v1(r27);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        throw th;
                    }
                }
                com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                com.tencent.mm.sdk.platformtools.t8.v1(outputStream2);
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.io.FileNotFoundException unused10) {
        } catch (java.io.IOException unused11) {
        } catch (java.lang.Exception unused12) {
        } catch (java.lang.Throwable th10) {
            th = th10;
        }
    }
}
