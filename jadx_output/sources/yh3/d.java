package yh3;

/* loaded from: classes12.dex */
public final class d extends xh3.b implements dn.n, dn.k {

    /* renamed from: o, reason: collision with root package name */
    public final rh3.f f462401o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicBoolean f462402p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f462403q;

    /* renamed from: r, reason: collision with root package name */
    public yh3.c f462404r;

    /* renamed from: s, reason: collision with root package name */
    public yh3.b f462405s;

    /* renamed from: t, reason: collision with root package name */
    public dn.h f462406t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rh3.p onePlayContext, wh3.d mediaSource, rh3.f fVar) {
        super(onePlayContext, mediaSource);
        kotlin.jvm.internal.o.g(onePlayContext, "onePlayContext");
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        this.f462401o = fVar;
        this.f462402p = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f454570f = "MMMarsDownloaderTask";
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public void d() {
        int i17;
        dn.h hVar;
        rh3.p pVar = this.f454568d;
        ((xh3.h) pVar.c()).b(this);
        dn.h hVar2 = new dn.h();
        xh3.h hVar3 = (xh3.h) pVar.c();
        java.lang.String str = this.f454571g;
        java.util.List c17 = hVar3.c(str);
        boolean isEmpty = ((java.util.concurrent.CopyOnWriteArrayList) c17).isEmpty();
        java.lang.String str2 = this.f454572h;
        if (isEmpty) {
            yh3.b bVar = this.f462405s;
            i17 = bVar != null ? bVar.b(str, hVar2) : -112;
            com.tencent.mars.xlog.Log.i(b(), "stopDownloadInternal real stop ret:" + i17 + " taskId:" + str2);
        } else {
            com.tencent.mars.xlog.Log.i(b(), "stopDownloadInternal fake stop ret:0 taskId:" + str2 + " list:" + c17);
            i17 = 0;
        }
        if (i17 != 0 && (hVar = this.f462406t) != null && this.f454573i == xh3.a.f454564h) {
            kotlin.jvm.internal.o.d(hVar);
            hVar2 = hVar;
        }
        rh3.f fVar = this.f462401o;
        if (fVar != null) {
            wh3.d dVar = this.f454569e;
            fVar.l(dVar, dVar.f445972c, hVar2);
        }
    }

    public final void e(boolean z17) {
        com.tencent.mars.xlog.Log.i(b(), "updateRequestingData " + z17 + ' ' + this);
        this.f462402p.set(z17);
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i(b(), "onProgress start offset=" + j17 + " total=" + j18 + ' ' + this);
        this.f454574m.g(j17, j18, 1);
        rh3.f fVar = this.f462401o;
        if (fVar != null) {
            fVar.o(this.f454569e, (int) j17, (int) j18);
        }
        com.tencent.mars.xlog.Log.i(b(), "onProgress end offset=" + j17 + " total=" + j18 + ' ' + this);
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h sceneResult) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(sceneResult, "sceneResult");
        com.tencent.mars.xlog.Log.i(b(), "onFinish mediaId=" + mediaId + " ret=" + i17 + " recvBytes=" + sceneResult.field_recvedBytes + " fileLength=" + sceneResult.field_fileLength + " format:" + sceneResult.field_videoFormat);
        if (i17 != 0) {
            a(xh3.a.f454565i);
            this.f454574m.f(i17);
        } else {
            this.f462406t = sceneResult;
            a(xh3.a.f454564h);
            qh3.a aVar = this.f454574m;
            long j17 = sceneResult.field_fileLength;
            aVar.g(j17, j17, 3);
        }
        ((xh3.h) this.f454568d.c()).b(this);
        wh3.d dVar = this.f454569e;
        dn.o oVar = dVar.f445972c;
        if (oVar.f241813a2 && sceneResult.field_retCode == 0) {
            r45.hv hvVar = new r45.hv();
            hvVar.f376465d = oVar.field_fullpath;
            hvVar.f376466e = sceneResult.field_fileLength;
            df0.r rVar = (df0.r) i95.n0.c(df0.r.class);
            java.lang.String b17 = b();
            java.lang.String str = oVar.field_mediaId;
            ((cf0.t) rVar).getClass();
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(6, str, hvVar, new cf0.s(b17));
        }
        rh3.f fVar = this.f462401o;
        if (fVar != null) {
            fVar.a(dVar, i17, sceneResult);
        }
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        e(false);
        rh3.f fVar = this.f462401o;
        if (fVar != null) {
            fVar.g(this.f454569e, (int) j17, (int) j18);
        }
        com.tencent.mars.xlog.Log.i(b(), "onDataAvailable offset=" + j17 + " length=" + j18 + ' ' + this + '}');
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String mediaId, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i(b(), "mediaId:" + mediaId + " m3u8:" + str);
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        java.lang.String str2 = videoInfo != null ? videoInfo.svrFlag : null;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i(b(), "onMoovReady start offset=" + j17 + " length=" + j18 + " svrflag=" + str2 + ' ' + this);
        this.f462404r = new yh3.c(j17, j18);
        this.f454568d.getClass();
        qh3.a aVar = this.f454574m;
        boolean e17 = aVar.e() ^ true;
        aVar.h();
        aVar.d(str2);
        rh3.f fVar = this.f462401o;
        if (fVar != null) {
            fVar.f(this.f454569e, (int) j17, (int) j18, e17);
        }
        com.tencent.mars.xlog.Log.i(b(), "onMoovReady end offset=" + j17 + " length=" + j18 + " svrflag=" + str2 + ' ' + this);
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.String b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloaderOnStart mediaId=");
        sb6.append(mediaId);
        sb6.append(" startRet=");
        sb6.append(i17);
        sb6.append(" finishedLength=");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.field_finishedLength) : null);
        sb6.append(" fileFormat=");
        sb6.append(hVar != null ? hVar.field_videoFlag : null);
        sb6.append(' ');
        sb6.append(this);
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
        if (gVar != null) {
            if (!(i17 == 0 && gVar.field_finishedLength > 0)) {
                gVar = null;
            }
            if (gVar != null) {
                long j17 = gVar.field_finishedLength;
                long j18 = gVar.field_toltalLength;
                this.f454574m.g(j17, j18, j17 >= j18 ? 3 : 1);
            }
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
