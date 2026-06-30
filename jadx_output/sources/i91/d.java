package i91;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f289699b = new java.util.Vector();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Vector f289698a = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public final dn.k f289700c = new i91.c(this);

    public d() {
        new java.util.HashMap();
    }

    public static void a(i91.d dVar, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Vector vector = dVar.f289698a;
        if (vector == null || vector.size() <= 0) {
            return;
        }
        java.util.Iterator it = vector.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.jsapi.media.a7 a7Var = (com.tencent.mm.plugin.appbrand.jsapi.media.a7) ((i91.h) it.next());
            a7Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", " on cdn finish,  is success : %s, mediaId : %s, localId : %s, mediaUrl : %s", java.lang.Boolean.valueOf(z17), str2, str, str3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject appBrandLocalMediaObject = a7Var.f81698a;
                if (str.equals(appBrandLocalMediaObject.f76102d)) {
                    i91.d Ni = com.tencent.mm.plugin.appbrand.app.r9.Ni();
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask = a7Var.f81699b;
                    i91.g gVar = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81687x;
                    java.util.Vector vector2 = Ni.f289699b;
                    if (vector2 != null && gVar != null) {
                        vector2.remove(gVar);
                    }
                    i91.d Ni2 = com.tencent.mm.plugin.appbrand.app.r9.Ni();
                    i91.h hVar = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81688y;
                    java.util.Vector vector3 = Ni2.f289698a;
                    if (vector3 != null && hVar != null) {
                        vector3.remove(hVar);
                    }
                    com.tencent.mm.plugin.appbrand.app.r9.Ni().b(appBrandLocalMediaObject.f76102d);
                    if (z17) {
                        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81675i = str2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file success");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file false");
                    }
                    i91.e bj6 = com.tencent.mm.plugin.appbrand.app.r9.bj();
                    java.lang.String str4 = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81675i;
                    bj6.getClass();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        for (i91.b bVar : bj6.f289701a.values()) {
                            java.lang.String str5 = bVar.f289693c;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (str5.equals(str4)) {
                                break;
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByServerId error, media id is null or nil");
                    }
                    bVar = null;
                    if (bVar == null || bVar.f289695e == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is null");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is valid");
                        i91.a aVar = bVar.f289695e;
                        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81676m = aVar.field_aesKey;
                        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81675i = aVar.field_fileId;
                        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81677n = aVar.field_fileUrl;
                        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81678o = aVar.field_fileLength;
                    }
                    jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81681r = 1;
                    jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.c();
                }
            }
        }
    }

    public boolean b(java.lang.String str) {
        i91.b bVar;
        i91.e bj6 = com.tencent.mm.plugin.appbrand.app.r9.bj();
        bj6.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
            bVar = null;
        } else {
            bVar = (i91.b) bj6.f289701a.get(str);
        }
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", str);
            return false;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(bVar.f289694d);
        return true;
    }
}
