package mn2;

/* loaded from: classes4.dex */
public final class x3 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final cw2.eb f330159d;

    /* renamed from: e, reason: collision with root package name */
    public final t21.h0 f330160e;

    /* renamed from: f, reason: collision with root package name */
    public final mn2.g4 f330161f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f330162g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f330163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mn2.e4 f330164i;

    public x3(mn2.e4 e4Var, cw2.eb ebVar, t21.h0 h0Var, mn2.g4 video, java.util.concurrent.atomic.AtomicBoolean isStopped, java.lang.Object lock) {
        kotlin.jvm.internal.o.g(video, "video");
        kotlin.jvm.internal.o.g(isStopped, "isStopped");
        kotlin.jvm.internal.o.g(lock, "lock");
        this.f330164i = e4Var;
        this.f330159d = ebVar;
        this.f330160e = h0Var;
        this.f330161f = video;
        this.f330162g = isStopped;
        this.f330163h = lock;
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.Object obj = this.f330163h;
        mn2.e4 e4Var = this.f330164i;
        synchronized (obj) {
            if (!this.f330162g.get()) {
                com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "[onProgress] mediaId=" + mediaId + " offset=" + j17 + " total=" + j18);
                cu2.x.f222449a.n(mediaId, j17, j18, 1);
                e4Var.a(new mn2.w3(this, mediaId, j17, j18));
            }
        }
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h hVar) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.Object obj = this.f330163h;
        mn2.e4 e4Var = this.f330164i;
        synchronized (obj) {
            if (!this.f330162g.get()) {
                if (hVar != null) {
                    com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "[onFinish] mediaId=" + mediaId + " ret=" + i17 + " fileLength=" + hVar.field_fileLength + " sceneResult=" + hVar.field_retCode + " videoFormat:" + hVar.field_videoFormat + " videoFlag=" + hVar.field_videoFlag);
                    if (!mn2.e4.f329948c.a(mediaId)) {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                    cu2.x xVar = cu2.x.f222449a;
                    java.lang.String profile = hVar.f241778m;
                    kotlin.jvm.internal.o.f(profile, "profile");
                    xVar.l(mediaId, profile);
                    long j17 = hVar.field_fileLength;
                    xVar.n(mediaId, j17, j17, 3);
                    e4Var.a(new mn2.t3(this, mediaId, i17, hVar));
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("Finder.VideoDownloader", "sceneResult is null! mediaId=" + mediaId + " ret=" + i17);
                    e4Var.a(new mn2.u3(this, mediaId, i17, hVar));
                }
            }
        }
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.Object obj = this.f330163h;
        mn2.e4 e4Var = this.f330164i;
        synchronized (obj) {
            if (!this.f330162g.get()) {
                e4Var.a(new mn2.s3(this, mediaId, j17, j18));
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "[onDataAvailable] mediaId=" + mediaId + " offset=" + j17 + " total=" + j18);
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String mediaId, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String mediaId, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo info) {
        boolean a17;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.Object obj = this.f330163h;
        mn2.e4 e4Var = this.f330164i;
        synchronized (obj) {
            com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "[onMoovReady] mediaId=" + mediaId + " offset=" + j17 + " total=" + j18 + " fileFormat=[" + this.f330161f.g() + "=>" + info.svrFlag + "]} isHasStop=" + this.f330162g.get());
            if (!this.f330162g.get()) {
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                t21.h0 h0Var = this.f330160e;
                if (h0Var instanceof com.tencent.mm.plugin.finder.video.FinderVideoView) {
                    com.tencent.mm.plugin.finder.video.FinderVideoView finderVideoView = (com.tencent.mm.plugin.finder.video.FinderVideoView) h0Var;
                    d61.f fVar = finderVideoView.f71652z1;
                    if (fVar == null) {
                        com.tencent.mars.xlog.Log.w(finderVideoView.f189739e, "%s parser is null, thread is error.", finderVideoView.N());
                        a17 = false;
                    } else {
                        a17 = fVar.a(finderVideoView.f71645l1, j17);
                    }
                    c0Var.f310112d = a17;
                }
                cu2.x xVar = cu2.x.f222449a;
                boolean z17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null).field_moovReady ? false : true;
                java.lang.String str = info.svrFlag;
                if (str == null) {
                    str = "";
                }
                xVar.k(mediaId, str);
                e4Var.a(new mn2.v3(this, mediaId, j17, j18, c0Var, z17));
            }
        }
    }
}
