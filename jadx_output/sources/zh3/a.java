package zh3;

/* loaded from: classes12.dex */
public final class a extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader {

    /* renamed from: d, reason: collision with root package name */
    public final rh3.p f472960d;

    /* renamed from: e, reason: collision with root package name */
    public final qh3.a f472961e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f472962f;

    /* renamed from: g, reason: collision with root package name */
    public final zh3.b f472963g;

    /* renamed from: h, reason: collision with root package name */
    public final yh3.d f472964h;

    public a(rh3.p onePlayContext, wh3.d mediaSource, rh3.f fVar) {
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f472960d = onePlayContext;
        this.f472961e = ((rh3.q) onePlayContext).e();
        this.f472962f = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f472963g = new zh3.b();
        this.f472964h = new yh3.d(onePlayContext, mediaSource, fVar);
    }

    public final java.lang.String a() {
        return ((rh3.q) this.f472960d).f("MMMarsDownloaderProxy");
    }

    public final void b() {
        yh3.d dVar = this.f472964h;
        xh3.a aVar = dVar.f454573i;
        xh3.a aVar2 = xh3.a.f454563g;
        if (aVar == aVar2) {
            com.tencent.mars.xlog.Log.w(dVar.b(), "startDownload return for state:" + dVar.f454573i);
            return;
        }
        if (aVar != xh3.a.f454560d && aVar != xh3.a.f454561e) {
            dVar.d();
            dVar.a(aVar2);
        } else {
            com.tencent.mars.xlog.Log.w(dVar.b(), "startDownload return for state:" + dVar.f454573i);
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mars.xlog.Log.i(rh3.p.b(this.f472960d, null, 1, null), "getContentType() fileId:" + i17 + ", fileKey:" + str + " contentType:video/mp4");
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String filePath = this.f472961e.getFilePath();
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(filePath, false);
        com.tencent.mars.xlog.Log.i(a(), "getDataFilePath(), dataFilePath:" + i18 + " isExists:" + com.tencent.mm.vfs.w6.j(i18) + " mediaInfoPath:" + filePath);
        return i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        long c17 = this.f472961e.c();
        com.tencent.mars.xlog.Log.i(a(), "getDataTotalSize() fileId:" + i17 + ", fileKey:" + str + " dataTotalSize:" + c17);
        return c17;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02c1  */
    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onReadData(int r29, java.lang.String r30, java.lang.String r31, long r32, long r34) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.a.onReadData(int, java.lang.String, java.lang.String, long, long):int");
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        int andIncrement = this.f472962f.getAndIncrement();
        com.tencent.mars.xlog.Log.i(a(), "onStartReadData, requestId: " + andIncrement);
        this.f472964h.c();
        return andIncrement;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mars.xlog.Log.i(a(), "onStopReadData() fileId:" + i17 + ", fileKey:" + str + ", requestId:" + i18);
        return 0;
    }
}
