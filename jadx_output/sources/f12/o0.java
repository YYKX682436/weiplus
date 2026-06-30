package f12;

/* loaded from: classes4.dex */
public final class o0 implements com.tencent.mm.pluginsdk.ui.b1, com.tencent.mm.pluginsdk.ui.a1, t21.i0, dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView f258656d;

    /* renamed from: e, reason: collision with root package name */
    public final f12.c0 f258657e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f258658f;

    /* renamed from: g, reason: collision with root package name */
    public t21.h0 f258659g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f258660h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f258661i;

    /* renamed from: m, reason: collision with root package name */
    public long f258662m;

    /* renamed from: n, reason: collision with root package name */
    public long f258663n;

    /* renamed from: o, reason: collision with root package name */
    public int f258664o;

    /* renamed from: p, reason: collision with root package name */
    public long f258665p;

    public o0(com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView videoView, f12.c0 viewBinding, java.lang.String url, yz5.a onPreparedCb) {
        kotlin.jvm.internal.o.g(videoView, "videoView");
        kotlin.jvm.internal.o.g(viewBinding, "viewBinding");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(onPreparedCb, "onPreparedCb");
        this.f258656d = videoView;
        this.f258657e = viewBinding;
        this.f258658f = onPreparedCb;
        this.f258661i = new android.os.Handler(android.os.Looper.getMainLooper());
        videoView.setLoop(true);
        videoView.setIMMVideoViewCallback(this);
        videoView.setIMMDownloadFinish(this);
        videoView.setIOnlineVideoProxy(this);
        videoView.h(false, url, 0);
        videoView.setFilepath(d30.a.f226123f + "MMVideo_" + url.hashCode() + ".mp4.temp");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onVideoEnded!!! mediaId[%s].", str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onGetVideoSize!!! mediaId[%s].", str2);
        f12.c0 c0Var = this.f258657e;
        android.content.res.Resources resources = c0Var.f258587p.getResources();
        android.view.ViewGroup.LayoutParams layoutParams = c0Var.f258587p.getLayoutParams();
        if (i17 < i18) {
            layoutParams.width = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480156px);
            layoutParams.height = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480154pv);
        }
        c0Var.f258587p.requestLayout();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onError!!! mediaId[%s] errorMsg[%s].", str2, str3);
        f12.c0 c0Var = this.f258657e;
        c0Var.f258588q.setVisibility(0);
        this.f258656d.setVisibility(8);
        c0Var.f258593v.setVisibility(8);
        long j17 = this.f258663n;
        long j18 = this.f258662m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f258663n = j17 + (java.lang.System.currentTimeMillis() - j18);
        this.f258662m = 0L;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onVideoWaiting!!! mediaId[%s].", str2);
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        java.lang.String str2 = this.f258660h;
        if (str2 == null || !kotlin.jvm.internal.o.b(str2, str)) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.VideoController", "requestVideoData offset=" + i17 + ", length=" + i18);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().p(str, i17, i18, 0);
    }

    @Override // t21.i0
    public void b(java.lang.String mediaId, java.lang.String path, java.lang.String url) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(url, "url");
        this.f258660h = mediaId;
        if (com.tencent.mm.vfs.w6.j(d30.a.f226123f + "MMVideo_" + url.hashCode() + ".mp4")) {
            g(mediaId, 0, null);
            return;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
        dn.o oVar = new dn.o();
        oVar.field_mediaId = mediaId;
        oVar.M1 = url;
        oVar.H1 = 1;
        oVar.Z = 5;
        oVar.f241809y0 = 3;
        oVar.field_fullpath = path;
        oVar.f241815c2 = this;
        Di.e(oVar, false);
    }

    @Override // t21.i0
    public void c(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.w("MicroMsg.VideoController", "stop ".concat(mediaId));
        java.lang.String str = this.f258660h;
        if (str == null || !kotlin.jvm.internal.o.b(str, mediaId)) {
            return;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().g(mediaId, null);
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        this.f258659g = h0Var;
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "isVideoDataAvailable!!! mediaId[%s] offset[%s] length[%s].", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str2 = this.f258660h;
        if (str2 == null || !kotlin.jvm.internal.o.b(str2, str)) {
            return false;
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return t21.o2.Di().o(str, i17, i18);
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onProgress!!! mediaId[%s] offset[%s] length[%s].", mediaId, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (this.f258659g == null || (str = this.f258660h) == null || !kotlin.jvm.internal.o.b(str, mediaId)) {
            return;
        }
        this.f258661i.post(new f12.n0(this, mediaId, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h hVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onFinish!!! mediaId[%s].", mediaId);
        if (this.f258659g == null || (str = this.f258660h) == null || !kotlin.jvm.internal.o.b(str, mediaId)) {
            return;
        }
        this.f258661i.post(new f12.l0(this, mediaId, i17));
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "start");
        com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView springEggVideoView = this.f258656d;
        springEggVideoView.start();
        java.lang.Object systemService = springEggVideoView.getContext().getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "init: rangerMode=" + ((android.media.AudioManager) systemService).getRingerMode());
        springEggVideoView.setVisibility(0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onVideoPause!!! mediaId[%s].", str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onVideoPlay!!! mediaId[%s], duration[%s].", str2, java.lang.Integer.valueOf(this.f258656d.getVideoDurationSec()));
        this.f258664o++;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onVideoWaitingEnd!!! mediaId[%s].", str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onPrepared!!! mediaId[%s].", str2);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f258662m = java.lang.System.currentTimeMillis();
        this.f258665p = this.f258656d.getVideoDurationSec() * 1000;
        this.f258657e.f258588q.setVisibility(8);
        this.f258658f.invoke();
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String mediaId, long j17, long j18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onDataAvailable!!! mediaId[%s] offset[%s] length[%s].", mediaId, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (this.f258659g == null || (str = this.f258660h) == null || !kotlin.jvm.internal.o.b(str, mediaId)) {
            return;
        }
        this.f258661i.post(new f12.k0(this, mediaId, j17, j18));
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onMoovReady!!! mediaId[%s] offset[%s] length[%s].", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (this.f258659g == null || (str2 = this.f258660h) == null || !kotlin.jvm.internal.o.b(str2, str)) {
            return;
        }
        this.f258661i.post(new f12.m0(this, str, j17, j18, videoInfo));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoController", "onVideoFirstFrameDraw!!! mediaId[%s].", str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.a1
    public void r(java.lang.String str, boolean z17) {
        if (str != null) {
            java.lang.String t17 = r26.i0.t(str, ".temp", "", false);
            if (com.tencent.mm.vfs.w6.j(t17) || !r26.i0.n(str, ".temp", false)) {
                return;
            }
            com.tencent.mm.vfs.w6.c(str, t17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
