package com.tencent.mm.plugin.game.media.preview;

/* loaded from: classes4.dex */
public class GameVideoView extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.f1 {
    public static final java.util.Set A = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f140131d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.f1 f140132e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.e1 f140133f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f140134g;

    /* renamed from: h, reason: collision with root package name */
    public float f140135h;

    /* renamed from: i, reason: collision with root package name */
    public int f140136i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f140137m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f140138n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f140139o;

    /* renamed from: p, reason: collision with root package name */
    public int f140140p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.z0 f140141q;

    /* renamed from: r, reason: collision with root package name */
    public c01.k f140142r;

    /* renamed from: s, reason: collision with root package name */
    public k53.i0 f140143s;

    /* renamed from: t, reason: collision with root package name */
    public k53.j0 f140144t;

    /* renamed from: u, reason: collision with root package name */
    public k53.g f140145u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f140146v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.a1 f140147w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.c1 f140148x;

    /* renamed from: y, reason: collision with root package name */
    public final c01.i f140149y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b1 f140150z;

    public GameVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140133f = com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
        this.f140134g = false;
        this.f140135h = -1.0f;
        this.f140140p = 0;
        this.f140146v = true;
        this.f140147w = new k53.e0(this);
        this.f140148x = new k53.f0(this);
        this.f140149y = new k53.g0(this);
        this.f140150z = new k53.h0(this);
        this.f140131d = getContext();
        this.f140142r = new c01.k();
    }

    public static java.lang.String getRootPath() {
        return com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_WEEK) + "haowan/";
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean a(double d17, boolean z17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return f1Var.a(d17, z17);
        }
        return false;
    }

    public final com.tencent.mm.pluginsdk.ui.f1 b() {
        com.tencent.mm.plugin.game.media.preview.GameMMVideoView gameMMVideoView = new com.tencent.mm.plugin.game.media.preview.GameMMVideoView(this.f140131d);
        gameMMVideoView.setReporter(this.f140148x);
        gameMMVideoView.setIMMVideoViewCallback(this.f140150z);
        gameMMVideoView.setIMMDownloadFinish(this.f140147w);
        java.lang.String rootPath = getRootPath();
        com.tencent.mm.vfs.w6.u(rootPath);
        gameMMVideoView.setRootPath(rootPath);
        gameMMVideoView.setLoop(this.f140146v);
        k53.g gVar = new k53.g(gameMMVideoView);
        this.f140145u = gVar;
        gameMMVideoView.setIOnlineVideoProxy(gVar);
        return gameMMVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean c(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        this.f140135h = f17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return f1Var.c(f17);
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void d() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).d();
        }
        this.f140142r.a();
        setKeepScreenOn(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            this.f140140p = f1Var.getCurrPosSec();
            this.f140132e.e();
        }
        this.f140142r.a();
        setKeepScreenOn(false);
    }

    public final java.lang.String f(java.lang.String str) {
        return getRootPath() + "MMVideo_" + str.hashCode() + ".mp4";
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        boolean z17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var;
        java.lang.String f17;
        if (this.f140132e instanceof com.tencent.mm.plugin.game.media.preview.GameMMVideoView) {
            if (com.tencent.mm.vfs.w6.j(this.f140139o)) {
                f17 = this.f140139o;
            } else if (com.tencent.mm.vfs.w6.j(f(this.f140139o))) {
                f17 = f(this.f140139o);
            }
            this.f140132e.stop();
            h(this.f140137m, f17, this.f140136i);
            z17 = true;
            this.f140132e.a(this.f140140p, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoView", "change to local video. currPosSec:%d", java.lang.Integer.valueOf(this.f140140p));
            com.tencent.mm.sdk.platformtools.u3.i(new k53.d0(this), 1000L);
            if (!z17 || (f1Var = this.f140132e) == null) {
            }
            f1Var.g();
            return;
        }
        z17 = false;
        if (z17) {
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCacheTimeSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return f1Var.getCacheTimeSec();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosMs() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return f1Var.getCurrPosMs();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return f1Var.getCurrPosSec();
        }
        return 0;
    }

    public java.lang.String getFilePath() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        return f1Var instanceof com.tencent.mm.plugin.game.media.preview.GameMMVideoView ? ((com.tencent.mm.plugin.game.media.preview.GameMMVideoView) f1Var).getFilePath() : this.f140139o;
    }

    public java.lang.String getLocalPath() {
        return this.f140138n ? this.f140139o : f(this.f140139o);
    }

    public java.lang.String getMediaId() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var instanceof com.tencent.mm.plugin.game.media.preview.GameMMVideoView) {
            return ((com.tencent.mm.plugin.game.media.preview.GameMMVideoView) f1Var).getMediaId();
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getPlayerType() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return f1Var.getPlayerType();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getVideoDurationSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        return f1Var != null ? f1Var.getVideoDurationSec() : this.f140136i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x002e, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r5.value) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.tencent.mm.pluginsdk.ui.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r5, java.lang.String r6, int r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.media.preview.GameVideoView.h(boolean, java.lang.String, int):void");
    }

    public final java.lang.String i(java.lang.String str) {
        return getRootPath() + "MMVideo_" + str.hashCode() + ".mp4.temp";
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean isPlaying() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).isPlaying();
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean j() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            return f1Var.j();
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean pause() {
        if (this.f140132e == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f140142r.a();
        return this.f140132e.pause();
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean play() {
        if (this.f140132e == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f140142r.c(this.f140149y);
        return this.f140132e.play();
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setCover(android.graphics.Bitmap bitmap) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.setCover(bitmap);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setFullDirection(int i17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.setFullDirection(i17);
        }
    }

    public void setIMMVideoViewCallback(com.tencent.mm.pluginsdk.ui.b1 b1Var) {
        if (b1Var != null) {
            this.f140150z = b1Var;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setIsShowBasicControls(boolean z17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.setIsShowBasicControls(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoop(boolean z17) {
        this.f140146v = z17;
        this.f140132e.setLoop(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoopCompletionCallback(com.tencent.mm.pluginsdk.ui.d1 d1Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setMute(boolean z17) {
        this.f140134g = z17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.setMute(z17);
        }
    }

    public void setPlayerListener(k53.j0 j0Var) {
        this.f140144t = j0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        this.f140133f = e1Var;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.setScaleType(e1Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setVideoFooterView(com.tencent.mm.pluginsdk.ui.z0 z0Var) {
        this.f140141q = z0Var;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.setVideoFooterView(z0Var);
        }
    }

    public void setVideoPreparedListener(k53.i0 i0Var) {
        this.f140143s = i0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.start();
            setKeepScreenOn(true);
            this.f140142r.c(this.f140149y);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void stop() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f140132e;
        if (f1Var != null) {
            f1Var.stop();
            this.f140142r.a();
            setKeepScreenOn(false);
        }
    }

    public GameVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f140133f = com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
        this.f140134g = false;
        this.f140135h = -1.0f;
        this.f140140p = 0;
        this.f140146v = true;
        this.f140147w = new k53.e0(this);
        this.f140148x = new k53.f0(this);
        this.f140149y = new k53.g0(this);
        this.f140150z = new k53.h0(this);
        this.f140131d = getContext();
        this.f140142r = new c01.k();
    }
}
