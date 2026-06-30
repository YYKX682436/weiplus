package i91;

/* loaded from: classes15.dex */
public class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i91.d f289697d;

    public c(i91.d dVar) {
        this.f289697d = dVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "getCdnAuthInfo, mediaId = %s", str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = gVar == null ? "null" : gVar.toString();
        objArr[3] = hVar != null ? hVar.toString() : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        i91.e bj6 = com.tencent.mm.plugin.appbrand.app.r9.bj();
        bj6.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (i91.b bVar : bj6.f289701a.values()) {
                java.lang.String str2 = bVar.f289694d;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals(str)) {
                    break;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByMediaID error, media id is null or nil");
        }
        bVar = null;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandCdnService", "get item by media id failed, media is : %s", str);
            return 0;
        }
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        i91.d dVar = this.f289697d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandCdnService", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            i91.d.a(dVar, false, bVar.f289691a, bVar.f289694d, null);
            return 0;
        }
        if (gVar == null) {
            if (hVar != null) {
                int i18 = hVar.field_retCode;
                if (i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                    i91.d.a(dVar, false, bVar.f289691a, bVar.f289694d, null);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "cdn trans suceess, media id : %s", str);
                    if (bVar.f289695e == null) {
                        bVar.f289695e = new i91.a();
                    }
                    i91.a aVar = bVar.f289695e;
                    aVar.field_aesKey = hVar.field_aesKey;
                    java.lang.String str3 = hVar.field_fileId;
                    aVar.field_fileId = str3;
                    aVar.field_fileUrl = hVar.field_fileUrl;
                    aVar.field_fileLength = (int) hVar.field_fileLength;
                    bVar.f289693c = str3;
                    com.tencent.mm.plugin.appbrand.app.r9.bj().a(bVar);
                    i91.d.a(dVar, true, bVar.f289691a, bVar.f289693c, bVar.f289695e.field_fileUrl);
                }
            }
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "progressInfo : %s", gVar.toString());
        long j17 = gVar.field_toltalLength;
        long j18 = j17 > 0 ? (gVar.field_finishedLength * 100) / j17 : 0L;
        long j19 = j18 >= 0 ? j18 > 100 ? 100L : j18 : 0L;
        boolean z18 = bVar.f289696f;
        int i19 = (int) j19;
        java.lang.String str4 = bVar.f289691a;
        java.lang.String str5 = bVar.f289694d;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", java.lang.Boolean.valueOf(z18), 0, java.lang.Integer.valueOf(i19), str4, str5);
        java.util.Vector vector = dVar.f289699b;
        if (vector != null && vector.size() > 0) {
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask = ((com.tencent.mm.plugin.appbrand.jsapi.media.z6) ((i91.g) it.next())).f82178a;
                jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81679p = i19;
                jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81681r = 3;
                jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.c();
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "decodePrepareResponse, mediaId = %s", str);
        return null;
    }
}
