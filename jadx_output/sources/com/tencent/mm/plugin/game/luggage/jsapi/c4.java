package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f139603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139607h;

    public c4(android.graphics.Bitmap bitmap, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.content.Context context, java.lang.String str2) {
        this.f139603d = bitmap;
        this.f139604e = str;
        this.f139605f = q5Var;
        this.f139606g = context;
        this.f139607h = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x018a: MOVE (r16 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:94:0x0189 */
    @Override // java.lang.Runnable
    public void run() {
        java.io.Closeable closeable;
        java.io.Closeable closeable2;
        com.tencent.mm.vfs.u6 u6Var;
        java.io.OutputStream outputStream;
        java.lang.String str;
        java.lang.String str2;
        java.io.OutputStream outputStream2;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139605f;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.vfs.u6 u6Var2 = null;
        android.graphics.Bitmap bitmap = this.f139603d;
        java.lang.String str3 = this.f139604e;
        try {
            if (bitmap != 0) {
                try {
                    java.lang.String str4 = "MMImage_" + com.tencent.mm.sdk.platformtools.w2.a(str3) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
                    com.tencent.mm.plugin.game.luggage.jsapi.x3.h(bitmap, com.tencent.mm.plugin.game.luggage.jsapi.x3.f139774e, str4);
                    str = com.tencent.mm.plugin.game.luggage.jsapi.x3.f139774e + str4;
                    u6Var = new com.tencent.mm.vfs.u6(str);
                } catch (java.io.FileNotFoundException unused) {
                    u6Var = null;
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, file not found", null);
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    return;
                } catch (java.lang.Exception unused2) {
                    u6Var = null;
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, exception", null);
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    return;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    closeable2 = null;
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var2);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable2);
                    throw th;
                }
                try {
                    com.tencent.mm.vfs.w6.h(str);
                    str2 = "jpg";
                } catch (java.io.FileNotFoundException unused3) {
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, file not found", null);
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    return;
                } catch (java.lang.Exception unused4) {
                    outputStream = null;
                    q5Var.a("saveToPhotosAlbum fail, exception", null);
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    return;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    closeable2 = null;
                    u6Var2 = u6Var;
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var2);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable2);
                    throw th;
                }
            } else {
                try {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        return;
                    }
                    u6Var = new com.tencent.mm.vfs.u6(str3);
                    try {
                        str2 = s46.c.c(str3);
                    } catch (java.io.FileNotFoundException unused5) {
                        outputStream = null;
                        q5Var.a("saveToPhotosAlbum fail, file not found", null);
                        com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Exception unused6) {
                        outputStream = null;
                        q5Var.a("saveToPhotosAlbum fail, exception", null);
                        com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                        com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                        return;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        u6Var2 = u6Var;
                        closeable2 = null;
                        com.tencent.mm.sdk.platformtools.t8.v1(u6Var2);
                        com.tencent.mm.sdk.platformtools.t8.v1(closeable2);
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused7) {
                    u6Var = null;
                } catch (java.lang.Exception unused8) {
                    u6Var = null;
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    u6Var2 = null;
                }
            }
            java.lang.String a17 = q75.c.a(str2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                q5Var.a("saveToPhotosAlbum fail, savePath is null", null);
                com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                return;
            }
            int i17 = android.os.Build.VERSION.SDK_INT;
            android.content.Context context = this.f139606g;
            java.lang.String str5 = this.f139607h;
            if (i17 < 29 || com.tencent.mm.sdk.platformtools.x.f193064a) {
                if (com.tencent.mm.plugin.game.luggage.jsapi.x3.f(a17, u6Var)) {
                    dp.a.makeText(context, context.getString(com.tencent.mm.R.string.lwd, q75.c.e()), 1).show();
                    q75.c.f(a17, context);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(a17), com.tencent.mm.plugin.game.luggage.jsapi.z0.class);
                        hashMap.put(dm.i4.COL_LOCALID, iPCString != null ? iPCString.f68406d : "");
                    } else {
                        hashMap.put(dm.i4.COL_LOCALID, str5);
                    }
                    hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, a17);
                    hashMap.put("err_msg", "saveToPhotosAlbum:ok");
                    q5Var.a(null, new org.json.JSONObject(hashMap));
                } else {
                    q5Var.a("saveToPhotosAlbum fail, save fail", null);
                }
                outputStream2 = null;
            } else {
                com.tencent.mm.sdk.platformtools.a7[] a7VarArr = {null};
                com.tencent.mm.sdk.platformtools.u6.b(context, a17, new com.tencent.mm.plugin.game.luggage.jsapi.b4(this, a7VarArr));
                com.tencent.mm.sdk.platformtools.a7 a7Var = a7VarArr[0];
                outputStream = a7Var != null ? a7Var.b() : null;
                try {
                    if (outputStream == null) {
                        throw new java.io.IOException("Open OutputStream with MediaStore fail!");
                    }
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = u6Var.read(bArr);
                        if (-1 == read) {
                            break;
                        } else {
                            outputStream.write(bArr, 0, read);
                        }
                    }
                    outputStream.flush();
                    a7VarArr[0].c();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                        com.tencent.mm.ipcinvoker.type.IPCString iPCString2 = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(a17), com.tencent.mm.plugin.game.luggage.jsapi.z0.class);
                        hashMap.put(dm.i4.COL_LOCALID, iPCString2 != null ? iPCString2.f68406d : "");
                    } else {
                        hashMap.put(dm.i4.COL_LOCALID, str5);
                    }
                    hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, a17);
                    hashMap.put("err_msg", "saveToPhotosAlbum:ok");
                    q5Var.a(null, new org.json.JSONObject(hashMap));
                    outputStream2 = outputStream;
                } catch (java.io.FileNotFoundException unused9) {
                    q5Var.a("saveToPhotosAlbum fail, file not found", null);
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    return;
                } catch (java.lang.Exception unused10) {
                    q5Var.a("saveToPhotosAlbum fail, exception", null);
                    com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
                    com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
                    return;
                }
            }
            com.tencent.mm.sdk.platformtools.t8.v1(u6Var);
            com.tencent.mm.sdk.platformtools.t8.v1(outputStream2);
        } catch (java.lang.Throwable th10) {
            th = th10;
            u6Var2 = bitmap;
            closeable2 = closeable;
        }
    }
}
