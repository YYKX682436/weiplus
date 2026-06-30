package fk4;

/* loaded from: classes12.dex */
public final class l extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader {

    /* renamed from: d, reason: collision with root package name */
    public final fk4.u f263638d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f263639e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f263640f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f263641g;

    /* renamed from: h, reason: collision with root package name */
    public long f263642h;

    public l(fk4.u downloader) {
        kotlin.jvm.internal.o.g(downloader, "downloader");
        this.f263638d = downloader;
        this.f263639e = new java.util.concurrent.atomic.AtomicInteger(0);
        java.lang.String str = "MicroMsg.DownloaderTPAssetResourceLoader@" + hashCode();
        this.f263640f = str;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f263641g = concurrentHashMap;
        this.f263642h = -1L;
        java.lang.String f17 = ((fk4.k) downloader).f();
        kotlin.jvm.internal.o.d(f17);
        concurrentHashMap.put(f17, downloader);
        com.tencent.mars.xlog.Log.i(str, "<init>, downloader=" + downloader.hashCode());
    }

    public final void a(fk4.u downloader) {
        kotlin.jvm.internal.o.g(downloader, "downloader");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f263641g;
        fk4.k kVar = (fk4.k) downloader;
        java.lang.String f17 = kVar.f();
        kotlin.jvm.internal.o.d(f17);
        concurrentHashMap.put(f17, downloader);
        com.tencent.mars.xlog.Log.i(this.f263640f, "switchDefine id:" + kVar.f() + " downloader:" + downloader.hashCode());
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mars.xlog.Log.i(this.f263640f, "getContentType: fileId=" + i17 + ", fileKey=" + str);
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        fk4.u uVar = (fk4.u) this.f263641g.get(str);
        java.lang.String str2 = this.f263640f;
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w(str2, "getDataFilePath: fileId=" + i17 + ", fileKey=" + str + " return for downloader.");
            return "";
        }
        com.tencent.mars.xlog.Log.i(str2, "getDataFilePath: fileId=" + i17 + ", fileKey=" + str);
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(((fk4.k) uVar).n(), false);
        return i18 == null ? "" : i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        fk4.u uVar = (fk4.u) this.f263641g.get(str);
        java.lang.String str2 = this.f263640f;
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w(str2, "getDataTotalSize: fileId=" + i17 + ", fileKey=" + str + " return for downloader.");
            return 0L;
        }
        fk4.k kVar = (fk4.k) uVar;
        if (this.f263642h != kVar.g()) {
            com.tencent.mars.xlog.Log.i(str2, "getDataTotalSize: fileId=" + i17 + ", fileKey=" + str + ", length=" + kVar.g() + ", downloader=" + uVar.hashCode());
            this.f263642h = kVar.g();
        }
        return kVar.g();
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String fileName, java.lang.String fileKey, long j17, long j18) {
        long min;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(fileKey, "fileKey");
        fk4.u uVar = (fk4.u) this.f263641g.get(fileKey);
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w(this.f263640f, "onReadData: fileId=" + i17 + ", fileKey=" + fileKey + " return for downloader.");
            return 0;
        }
        fk4.k kVar = (fk4.k) uVar;
        if (kVar.h()) {
            min = j18;
        } else {
            com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class);
            java.lang.String f17 = kVar.f();
            long[] jArr = kVar.f263628p;
            cdnManager.queryContinuousSize(f17, j17, jArr);
            min = java.lang.Math.min(jArr[0], j18);
        }
        com.tencent.mars.xlog.Log.i(this.f263640f, "onReadData: fileId=" + i17 + ", fileKey=" + fileKey + ", checkAvailable(" + j17 + ", " + j18 + ")=" + min);
        if (min >= j18) {
            return (int) j18;
        }
        if (!kVar.f263630r.get()) {
            synchronized (kVar.f263626n) {
                if (kVar.f263621i || !kVar.f263625m.contains("0_-1")) {
                    java.util.HashSet hashSet = kVar.f263625m;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(j17);
                    sb6.append('_');
                    sb6.append(j18);
                    if (hashSet.add(sb6.toString())) {
                        com.tencent.mars.xlog.Log.i(kVar.f263614b, "request(" + j17 + ", " + j18 + "), mediaId=" + kVar.f());
                        kVar.f263615c.post(new fk4.i(kVar, j17, j18));
                        kVar.f263630r.set(true);
                    }
                }
            }
        }
        return (int) min;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String fileName, java.lang.String fileKey, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(fileKey, "fileKey");
        com.tencent.mars.xlog.Log.i(this.f263640f, "onStartReadData: fileId=" + i17 + ", fileKey=" + fileKey + ", " + j17 + '-' + j18 + ", path=" + ((fk4.k) this.f263638d).n());
        return this.f263639e.incrementAndGet();
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mars.xlog.Log.i(this.f263640f, "onStopReadData: fileId=" + i17 + ", fileKey=" + str + ", requestId=" + i18);
        return this.f263639e.get();
    }
}
