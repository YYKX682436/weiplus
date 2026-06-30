package ha3;

/* loaded from: classes12.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ha3.r0 f279930a = new ha3.r0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f279931b = new java.util.LinkedHashMap();

    public final java.lang.String a(java.lang.String mainMediaId, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(mainMediaId, "mainMediaId");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        if (!r26.i0.n(fileName, ".ts", false)) {
            return mainMediaId;
        }
        return mainMediaId + '@' + fileName;
    }

    public final com.tencent.mars.cdn.CdnManager.C2CDownloadRequest b(dn.o info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileid = info.field_fileId;
        c2CDownloadRequest.fileKey = info.field_mediaId;
        c2CDownloadRequest.aeskey = info.field_aesKey;
        c2CDownloadRequest.url = info.f241811z;
        c2CDownloadRequest.setSavePath(info.field_fullpath);
        c2CDownloadRequest.treatAsVideoFile = info.f241791l1;
        int i17 = info.f241789h;
        c2CDownloadRequest.bizid = i17;
        int i18 = info.field_appType;
        c2CDownloadRequest.apptype = i18;
        int i19 = info.field_fileType;
        c2CDownloadRequest.fileType = i19;
        c2CDownloadRequest.bizReqPayLoad = info.P;
        if (i17 == 1) {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnC2CDownloadDebugIP;
        } else if (i17 == 2) {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnFavoriteDownloadDebugIP;
        } else if (i17 != 3) {
            if (i17 != 8) {
                java.lang.String url = c2CDownloadRequest.url;
                kotlin.jvm.internal.o.f(url, "url");
                if (!(url.length() == 0)) {
                    c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP;
                }
            } else {
                c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnPreviewDebugIP;
            }
        } else if (i18 < 100 || i18 > 117 || i19 != 20201) {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP;
        } else {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnFriendsImageDownloadDebugIP;
        }
        return c2CDownloadRequest;
    }
}
