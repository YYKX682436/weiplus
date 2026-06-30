package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class o6 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143704g = "";

    public static void A(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var, java.lang.String str, org.json.JSONObject jSONObject) {
        o6Var.getClass();
        if (jSONObject == null) {
            return;
        }
        com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo = new com.tencent.mm.modelmulti.SourceImgInfo(jSONObject.optString("url", ""), 1);
        ((m11.z0) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Ri()).getClass();
        sourceImgInfo.toString();
        m11.z0.f322814a.C(str, sourceImgInfo);
    }

    public static boolean B(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var, java.lang.String str, java.io.InputStream inputStream) {
        o6Var.getClass();
        java.io.OutputStream outputStream = null;
        try {
            try {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                r6Var.s().J();
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
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "writeFile exp %s", e17);
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

    public boolean C(java.lang.String str) {
        return ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Aj(str).equals("video");
    }

    public java.lang.String D(java.lang.String str, boolean z17, boolean z18) {
        if (z17) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            return q75.c.a(str);
        }
        if (!z18) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "mp4";
        }
        return q75.c.b(str);
    }

    public java.lang.String E(java.lang.String str) {
        return str.isEmpty() ? "" : ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(str).f182736e;
    }

    public void F(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, org.json.JSONObject jSONObject, byte[] bArr) {
        com.tencent.mm.plugin.lite.jsapi.comms.d6 d6Var = new com.tencent.mm.plugin.lite.jsapi.comms.d6(this, str2, str, bitmap, bArr, jSONObject);
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(c(), d6Var, new com.tencent.mm.plugin.lite.jsapi.comms.e6(this));
    }

    public void G(java.lang.String str, boolean z17, boolean z18) {
        if (z17) {
            dp.a.makeText(c(), c().getString(com.tencent.mm.R.string.lkm, q75.c.e()), 1).show();
        } else if (z18) {
            dp.a.makeText(c(), c().getString(com.tencent.mm.R.string.lkn, q75.c.c(str)), 1).show();
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String E;
        java.lang.String str2;
        java.lang.String zj6;
        java.lang.String E2;
        if (jSONObject == null) {
            this.f143443f.a("param is null");
            return;
        }
        this.f143704g = com.tencent.mm.plugin.lite.logic.y2.f(str, "bundle", null);
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        java.lang.String optString2 = jSONObject.optString(dm.i4.COL_LOCALID);
        java.lang.String optString3 = jSONObject.optString("base64ImgStr");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("tailInfo");
        java.lang.String optString4 = jSONObject.optString("liveVideoLocalId");
        java.lang.String optString5 = jSONObject.optString("liveVideoFilePath");
        if (android.text.TextUtils.isEmpty(optString) && android.text.TextUtils.isEmpty(optString2) && android.text.TextUtils.isEmpty(optString3)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "saveToPhotosAlbum fail, filePath is null");
            this.f143443f.a("saveToPhotosAlbum fail, filePath is null");
            return;
        }
        if (!android.text.TextUtils.isEmpty(optString4) || !android.text.TextUtils.isEmpty(optString5)) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto coverFilePath=%s, coverLocalId=%s, hasBase64=%b, liveVideoLocalId=%s, liveVideoFilePath=%s", optString, optString2, java.lang.Boolean.valueOf(!android.text.TextUtils.isEmpty(optString3)), optString4, optString5);
            if (!com.tencent.mm.plugin.lite.jsapi.comms.d8.a()) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto fail, device not support, internalCode=%d", -2001);
                this.f143443f.a("saveToPhotosAlbum:live photo not supported");
                return;
            } else {
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(c(), new com.tencent.mm.plugin.lite.jsapi.comms.h6(this, str, optString, optString2, optString3, optString4, optString5, optJSONObject), new com.tencent.mm.plugin.lite.jsapi.comms.i6(this));
                return;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            int indexOf = optString3.indexOf(";base64,");
            if (indexOf != -1) {
                optString3 = optString3.substring(indexOf + 8);
            }
            try {
                byte[] decode = android.util.Base64.decode(optString3, 2);
                int length = decode.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(decode);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                if (decodeByteArray == null) {
                    this.f143443f.a("error base64");
                    return;
                } else {
                    F("", "", decodeByteArray, optJSONObject, decode);
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "error base64, decode failed %s", e17.getMessage());
                this.f143443f.a("error base64");
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(optString)) {
            zj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString2);
            E2 = E(zj6);
        } else {
            if (!android.text.TextUtils.isEmpty(optString2) || !((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
                if (com.tencent.mm.vfs.w6.j(optString)) {
                    E = E(optString);
                    str2 = optString;
                    F(str2, E, null, optJSONObject, null);
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || !optString.startsWith("http")) {
                        this.f143443f.a("saveToPhotosAlbum fail, file not found");
                        return;
                    }
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString, new com.tencent.mm.plugin.lite.jsapi.comms.a6(this, optString, optString2, optJSONObject, str));
                    return;
                }
            }
            zj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString);
            E2 = E(zj6);
        }
        str2 = zj6;
        E = E2;
        F(str2, E, null, optJSONObject, null);
    }
}
