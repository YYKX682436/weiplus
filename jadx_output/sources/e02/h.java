package e02;

/* loaded from: classes5.dex */
public class h implements kq.o {

    /* renamed from: c, reason: collision with root package name */
    public static e02.h f245853c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f245854a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mars.cdn.CdnManager.DownloadCallback f245855b = new e02.f(this);

    public static void b(e02.h hVar, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) hVar.f245854a;
        com.tencent.mars.xlog.Log.i("ChannelPatchDownloader", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s, containCallback = %b", str, valueOf, valueOf2, str2, java.lang.Boolean.valueOf(concurrentHashMap.containsKey(str)));
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((e02.g) concurrentHashMap.get(str)).f245851a;
            if (pVar == null) {
                com.tencent.mars.xlog.Log.e("ChannelPatchDownloader", "error proxy_callback null");
            } else if (i17 == 3) {
                pVar.a(str, ((e02.g) concurrentHashMap.get(str)).f245852b, z17);
            } else {
                pVar.b(str, i18, z17);
            }
        }
    }

    @Override // kq.o
    public int a(java.lang.String str, java.lang.String str2, int i17, kq.p pVar) {
        com.tencent.mars.xlog.Log.i("ChannelPatchDownloader", "addDownloadTask: %s filepath:%s", str, str2);
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.queueTimeoutSeconds = 60;
        c2CDownloadRequest.transforTimeoutSeconds = 60;
        c2CDownloadRequest.taskStartTime = currentTimeMillis;
        c2CDownloadRequest.fileKey = b17;
        c2CDownloadRequest.url = str;
        c2CDownloadRequest.setSavePath(str2);
        e02.g gVar = new e02.g(null);
        gVar.f245851a = pVar;
        gVar.f245852b = str2;
        ((java.util.concurrent.ConcurrentHashMap) this.f245854a).put(b17, gVar);
        int startHttpsDownload = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startHttpsDownload(c2CDownloadRequest, this.f245855b);
        com.tencent.mars.xlog.Log.i("ChannelPatchDownloader", "addDownloadTask: " + startHttpsDownload);
        return startHttpsDownload;
    }
}
