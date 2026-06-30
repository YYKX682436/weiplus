package mn2;

/* loaded from: classes10.dex */
public final class c4 implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final mn2.g4 f329928d;

    /* renamed from: e, reason: collision with root package name */
    public final cw2.eb f329929e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f329930f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f329931g;

    /* renamed from: h, reason: collision with root package name */
    public so2.i3 f329932h;

    /* renamed from: i, reason: collision with root package name */
    public t21.h0 f329933i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mn2.e4 f329934m;

    public c4(mn2.e4 e4Var, mn2.g4 video, cw2.eb ebVar) {
        kotlin.jvm.internal.o.g(video, "video");
        this.f329934m = e4Var;
        this.f329928d = video;
        this.f329929e = ebVar;
        this.f329930f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f329931g = new java.lang.Object();
    }

    @Override // t21.i0
    public void a(java.lang.String mediaId, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        synchronized (this.f329931g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestVideoData] mediaId=");
            sb6.append(mediaId);
            sb6.append(" offset=");
            sb6.append(i17);
            sb6.append(" length=");
            sb6.append(i18);
            sb6.append(" cacheSize=");
            so2.i3 i3Var = this.f329932h;
            sb6.append(i3Var != null ? java.lang.Long.valueOf(i3Var.field_cacheSize) : null);
            com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", sb6.toString());
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().p(mediaId, i17, i18, 0);
        }
    }

    @Override // t21.i0
    public void b(java.lang.String mediaId, java.lang.String filePath, java.lang.String url) {
        java.lang.Object obj;
        cs2.j d17;
        cs2.j d18;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.Object obj2 = this.f329931g;
        mn2.e4 e4Var = this.f329934m;
        synchronized (obj2) {
            try {
                this.f329930f.set(false);
                cu2.x xVar = cu2.x.f222449a;
                so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
                mn2.g4 g4Var = this.f329928d;
                c17.field_reqFormat = g4Var.f330005h;
                java.lang.String str = c17.field_fileFormat;
                if (str == null) {
                    str = g4Var.g();
                }
                c17.field_fileFormat = str;
                java.lang.String string = this.f329928d.f330002e.getString(9);
                if (string == null) {
                    string = "";
                }
                java.lang.String str2 = string;
                int i17 = this.f329928d.f330005h;
                java.lang.String field_fileFormat = c17.field_fileFormat;
                kotlin.jvm.internal.o.f(field_fileFormat, "field_fileFormat");
                mn2.g4 g4Var2 = this.f329928d;
                obj = obj2;
                try {
                    cu2.x.h(xVar, -1L, mediaId, str2, url, i17, field_fileFormat, g4Var2.f330006i, c17.field_cacheSize, c17.field_totalSize, 1, g4Var2.f330002e.getInteger(3), this.f329928d.i(), this.f329928d.h(), false, false, 24576, null);
                    java.lang.String string2 = this.f329928d.f330002e.getString(54);
                    if (string2 == null) {
                        string2 = "";
                    }
                    java.lang.String string3 = this.f329928d.f330002e.getString(55);
                    if (string3 == null) {
                        string3 = "";
                    }
                    yr2.f fVar = new yr2.f(string2, string3, this.f329928d.f330007m);
                    yr2.d dVar = yr2.d.f464663a;
                    so2.i3 i3Var = this.f329932h;
                    java.lang.String str3 = i3Var != null ? i3Var.field_originMediaId : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.String str4 = str3;
                    int i18 = c17.field_reqFormat;
                    java.lang.String field_fileFormat2 = c17.field_fileFormat;
                    kotlin.jvm.internal.o.f(field_fileFormat2, "field_fileFormat");
                    java.lang.String i19 = this.f329928d.i();
                    java.lang.String h17 = this.f329928d.h();
                    boolean z17 = this.f329928d.f330002e.getInteger(39) == 1;
                    mn2.x3 x3Var = new mn2.x3(e4Var, this.f329929e, this.f329933i, this.f329928d, this.f329930f, this.f329931g);
                    int i27 = e4Var.f329950b;
                    com.tencent.mm.protobuf.g byteString = this.f329928d.f330002e.getByteString(66);
                    dn.o a17 = dVar.a(0, 0L, str4, mediaId, url, filePath, i18, field_fileFormat2, i19, h17, z17, x3Var, i27, "Finder.VideoDownloader", fVar, byteString != null ? byteString.f192156a : null);
                    this.f329932h = c17;
                    cw2.w9 w9Var = e4Var.f329949a;
                    if (w9Var != null && (d18 = w9Var.d1()) != null) {
                        d18.u0(mediaId, true);
                    }
                    com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "[startHttpStream] fallback cancel mediaId=" + mediaId + " isPreLoadCompleted=" + c17.F0() + " isAllCompleted=" + c17.A0() + " file=" + filePath + ", " + url + " isMoovReady=" + c17.field_moovReady);
                    if (!c17.A0()) {
                        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                        t21.o2.Di().f(a17);
                        e4Var.a(new mn2.z3(this));
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "[finish] mediaId=" + mediaId + " cacheSize=" + c17.field_cacheSize + " totalSize=" + c17.field_totalSize + '}');
                    dn.n nVar = a17.f241815c2;
                    long j17 = c17.field_cacheSize;
                    long j18 = c17.field_totalSize;
                    com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = new com.tencent.mars.cdn.CdnManager.VideoInfo();
                    videoInfo.svrFlag = c17.field_fileFormat;
                    nVar.onMoovReady(mediaId, j17, j18, videoInfo);
                    a17.f241815c2.f(mediaId, c17.field_cacheSize, c17.field_totalSize);
                    a17.f241815c2.g(mediaId, 0, null);
                    cw2.w9 w9Var2 = e4Var.f329949a;
                    if (w9Var2 != null && (d17 = w9Var2.d1()) != null) {
                        d17.u0(mediaId, false);
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        cs2.j d17;
        java.lang.Object obj = this.f329931g;
        mn2.e4 e4Var = this.f329934m;
        synchronized (obj) {
            this.f329930f.compareAndSet(false, true);
            com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", "[stop] mediaId=" + str);
            if (str != null) {
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().i(str, null, new mn2.b4(e4Var, this));
                cw2.w9 w9Var = e4Var.f329949a;
                if (w9Var != null && (d17 = w9Var.d1()) != null) {
                    d17.u0(str, false);
                }
            }
        }
    }

    @Override // t21.i0
    public void d(t21.h0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f329933i = callback;
    }

    @Override // t21.i0
    public boolean e(java.lang.String mediaId, int i17, int i18) {
        boolean o17;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        synchronized (this.f329931g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isVideoDataAvailable] mediaId=");
            sb6.append(mediaId);
            sb6.append(" offset=");
            sb6.append(i17);
            sb6.append(" length=");
            sb6.append(i18);
            sb6.append(" cacheSize=");
            so2.i3 i3Var = this.f329932h;
            sb6.append(i3Var != null ? java.lang.Long.valueOf(i3Var.field_cacheSize) : null);
            com.tencent.mars.xlog.Log.i("Finder.VideoDownloader", sb6.toString());
            cw2.eb ebVar = this.f329929e;
            if (ebVar != null) {
                ebVar.k(mediaId, i17, i18);
            }
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            o17 = t21.o2.Di().o(mediaId, i17, i18);
        }
        return o17;
    }
}
