package x03;

/* loaded from: classes15.dex */
public final class n0 extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f451077d;

    /* renamed from: e, reason: collision with root package name */
    public long f451078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f451079f;

    public n0(x03.u0 u0Var, java.lang.String mediaId, java.lang.String path) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(path, "path");
        this.f451079f = u0Var;
        this.f451077d = mediaId;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        x03.x0 a17 = x03.x0.f451161d.a();
        java.lang.String str2 = a17.f451164b.b(this.f451077d).f451016e;
        kotlin.jvm.internal.o.d(str2);
        x03.u0 u0Var = this.f451079f;
        java.lang.String str3 = u0Var.f451133a;
        java.util.Objects.toString(u0Var.f451134b);
        return str2;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        x03.x0 a17 = x03.x0.f451161d.a();
        java.lang.Long valueOf = java.lang.Long.valueOf(a17.f451164b.b(this.f451077d).f451014c);
        kotlin.jvm.internal.o.d(valueOf);
        return valueOf.longValue();
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader, com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String m3U8Content = super.getM3U8Content(i17, str, str2);
        kotlin.jvm.internal.o.f(m3U8Content, "getM3U8Content(...)");
        return m3U8Content;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        boolean z17;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        x03.u0 u0Var = this.f451079f;
        java.lang.String str2 = u0Var.f451133a;
        java.util.Objects.toString(u0Var.f451134b);
        int i18 = this.f451079f.f451141i;
        if (j18 <= 0) {
            return 0;
        }
        x03.v0 v0Var = x03.x0.f451161d;
        x03.f b17 = v0Var.a().f451164b.b(this.f451077d);
        long j19 = this.f451078e;
        long j27 = b17.f451012a;
        if (j19 != j27) {
            this.f451078e = j27;
            ((ku5.t0) ku5.t0.f312615d).B(new x03.m0(this.f451079f));
        }
        if (b17.f451015d) {
            java.lang.String str3 = this.f451079f.f451133a;
        } else {
            if (this.f451079f.f451141i != 6) {
                boolean taskExist = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(this.f451077d);
                if (taskExist && ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).isVideoDataAvailable(this.f451077d, j17, j18)) {
                    java.lang.String str4 = this.f451079f.f451133a;
                } else {
                    z17 = taskExist;
                }
            } else {
                z17 = false;
            }
            x03.u0 u0Var2 = this.f451079f;
            int i19 = u0Var2.f451141i;
            if (i19 != 3 && i19 != 5) {
                return 0;
            }
            if (i19 != 3) {
                if (i19 != 5 || (u0Var2.f451143k == j17 && u0Var2.f451144l == j18)) {
                    return 0;
                }
                x03.j jVar = v0Var.a().f451165c;
                java.lang.String mediaId = this.f451077d;
                jVar.getClass();
                kotlin.jvm.internal.o.g(mediaId, "mediaId");
                if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).requestVideoData(mediaId, j17, j18, 0) != 0) {
                    java.lang.String str5 = this.f451079f.f451133a;
                    v0Var.a().f451164b.d(false, this.f451079f.f451135c, this.f451077d, java.lang.Long.valueOf(j17 + j18));
                    this.f451079f.f451144l = 0L;
                } else {
                    x03.u0 u0Var3 = this.f451079f;
                    u0Var3.f451143k = j17;
                    u0Var3.f451144l = j18;
                }
                return 0;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(b17.f451013b);
            kotlin.jvm.internal.o.d(valueOf);
            long j28 = j17 + j18;
            if (valueOf.longValue() < j28) {
                if (z17 && b17.f451020i) {
                    x03.u0 u0Var4 = this.f451079f;
                    if (u0Var4.f451143k == j17 && u0Var4.f451144l == j18) {
                        return 0;
                    }
                    x03.j jVar2 = v0Var.a().f451165c;
                    java.lang.String mediaId2 = this.f451077d;
                    jVar2.getClass();
                    kotlin.jvm.internal.o.g(mediaId2, "mediaId");
                    boolean z18 = z17;
                    int requestVideoData = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).requestVideoData(mediaId2, j17, j18, 0);
                    if (requestVideoData != 0) {
                        com.tencent.mars.xlog.Log.e(this.f451079f.f451133a, "[key] request video data error " + this.f451077d + ", ret:" + requestVideoData + " state:" + this.f451079f.f451141i + " exists:" + z18 + ", offset:" + j17 + ", length:" + j18 + ", cache:" + java.lang.Long.valueOf(b17.f451012a));
                        v0Var.a().f451164b.d(false, this.f451079f.f451135c, this.f451077d, java.lang.Long.valueOf(j28));
                        this.f451079f.f451144l = 0L;
                    } else {
                        x03.u0 u0Var5 = this.f451079f;
                        u0Var5.f451143k = j17;
                        u0Var5.f451144l = j18;
                    }
                } else if (!b17.f451018g) {
                    v0Var.a().f451164b.d(false, this.f451079f.f451135c, this.f451077d, java.lang.Long.valueOf(j28));
                }
                java.lang.String str6 = this.f451079f.f451133a;
                return 0;
            }
            java.lang.String str7 = this.f451079f.f451133a;
        }
        return (int) j18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        x03.u0 u0Var = this.f451079f;
        java.lang.String str2 = u0Var.f451133a;
        java.util.Objects.toString(u0Var.f451134b);
        return this.f451077d.hashCode();
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        x03.u0 u0Var = this.f451079f;
        java.lang.String str2 = u0Var.f451133a;
        java.util.Objects.toString(u0Var.f451134b);
        return 0;
    }
}
