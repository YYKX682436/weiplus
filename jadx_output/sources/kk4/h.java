package kk4;

/* loaded from: classes15.dex */
public final class h extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f308545d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f308546e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f308547f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f308548g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f308549h;

    /* renamed from: i, reason: collision with root package name */
    public int f308550i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f308551m;

    /* renamed from: n, reason: collision with root package name */
    public final long f308552n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308553o;

    public h(kk4.v vVar, java.lang.String mediaId, java.lang.String mediaPath) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        this.f308553o = vVar;
        this.f308545d = mediaId;
        this.f308546e = mediaPath;
        this.f308552n = 1048576L;
    }

    public final java.lang.String a() {
        return this.f308553o.w() + " isMoovReady:" + this.f308547f + " isAllComplete:" + this.f308548g + " isRequestingData:" + this.f308549h;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        kk4.v vVar = this.f308553o;
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "onProgress mediaId:" + str + " offset:" + j17 + " total:" + j18 + ' ' + a());
        vVar.N = j18;
        dn.o oVar = vVar.f308581f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null) {
            bVar.f42546p2 = j17;
            bVar.f42547q2 = j18;
            kk4.v.j(vVar);
            nk4.s sVar = vVar.f308588m;
            if (sVar != null) {
                dn.o oVar2 = vVar.f308581f;
                ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).o(new nk4.h(bVar2 != null ? bVar2.f42534d2 : 0L, j17, j18, android.os.SystemClock.uptimeMillis(), null));
            }
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        this.f308548g = true;
        yz5.p pVar = this.f308551m;
        if (pVar != null) {
            pVar.invoke(str, java.lang.Integer.valueOf(i17));
        }
        kk4.v vVar = this.f308553o;
        dn.o oVar = vVar.f308581f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null) {
            if (i17 == 0 && hVar != null) {
                long j17 = hVar.field_fileLength;
                bVar.f42546p2 = j17;
                bVar.f42547q2 = j17;
                kk4.v.j(vVar);
            }
            nk4.s sVar = vVar.f308588m;
            if (sVar != null) {
                dn.o oVar2 = vVar.f308581f;
                ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).n(new nk4.g(bVar2 != null ? bVar2.f42534d2 : 0L, hVar, android.os.SystemClock.uptimeMillis(), null));
            }
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mars.xlog.Log.i(this.f308553o.f308576a, "getContentType() fileId:" + i17 + ", fileKey:" + str + " contentType:video/mp4 " + a());
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        return com.tencent.mm.vfs.w6.i(this.f308546e, false);
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kk4.v vVar = this.f308553o;
        long j17 = vVar.N;
        if (j17 <= 0) {
            j17 = com.tencent.mm.vfs.w6.k(this.f308546e);
        }
        com.tencent.mars.xlog.Log.i(vVar.f308576a, "getDataTotalSize() fileId:" + i17 + ", fileKey:" + str + " fileLength:" + j17 + ' ' + a());
        return j17;
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i(this.f308553o.f308576a, "onDataAvailable mediaId:" + str + " offset:" + j17 + ' ' + a());
        this.f308549h = false;
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f308547f = true;
        kk4.v vVar = this.f308553o;
        dn.o oVar = vVar.f308581f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null) {
            bVar.f42545o2 = true;
            kk4.v.j(vVar);
            nk4.s sVar = vVar.f308588m;
            if (sVar != null) {
                dn.o oVar2 = vVar.f308581f;
                ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).s(new nk4.l(bVar2 != null ? bVar2.f42534d2 : 0L, android.os.SystemClock.uptimeMillis(), j17, j18, null));
            }
        }
        vVar.y(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r4 > 0) goto L28;
     */
    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onReadData(int r20, java.lang.String r21, java.lang.String r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.h.onReadData(int, java.lang.String, java.lang.String, long, long):int");
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mars.xlog.Log.i(this.f308553o.f308576a, "onStartReadData() fileId:" + i17 + ", fileKey:" + str + " requestStart:" + j17 + " requestEnd:" + j18 + ' ' + a());
        int i18 = this.f308550i;
        this.f308550i = i18 + 1;
        return i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        com.tencent.mars.xlog.Log.i(this.f308553o.f308576a, "onStopReadData() fileId:" + i17 + ", fileKey:" + str + " requestId:" + i18 + ' ' + a());
        return this.f308550i;
    }
}
