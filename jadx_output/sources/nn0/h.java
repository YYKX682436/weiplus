package nn0;

/* loaded from: classes14.dex */
public class h implements nn0.o, com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener, com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener {
    public nn0.b A;
    public final java.lang.Object C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public android.content.Context H;
    public com.tencent.rtmp.ITXLivePlayListener I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f338562J;
    public boolean K;
    public android.graphics.RectF L;
    public android.graphics.RectF[] M;
    public int N;
    public long P;

    /* renamed from: r, reason: collision with root package name */
    public android.view.Surface f338574r;

    /* renamed from: y, reason: collision with root package name */
    public boolean f338581y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f338563d = "CustomRender_" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public boolean f338564e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f338565f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f338566g = null;

    /* renamed from: h, reason: collision with root package name */
    public nn0.g f338567h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.rtmp.ui.TXCloudVideoView f338568i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.view.TextureView f338569m = null;

    /* renamed from: n, reason: collision with root package name */
    public nn0.m f338570n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.SurfaceTexture f338571o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f338572p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f338573q = null;

    /* renamed from: s, reason: collision with root package name */
    public int f338575s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f338576t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f338577u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f338578v = 0;

    /* renamed from: w, reason: collision with root package name */
    public q05.c f338579w = null;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.SurfaceTexture f338580x = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f338582z = false;
    public long B = -1;

    public h(android.content.Context context) {
        this.f338581y = false;
        this.A = null;
        java.lang.Object obj = new java.lang.Object();
        this.C = obj;
        this.D = 1;
        this.E = 0;
        this.F = false;
        this.G = false;
        this.I = null;
        this.f338562J = false;
        this.K = false;
        this.L = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
        this.M = null;
        this.N = 0;
        this.H = context;
        this.f338581y = true;
        synchronized (obj) {
            this.A = new nn0.b();
        }
    }

    @Override // nn0.o
    public void B(boolean z17) {
        this.f338582z = z17;
    }

    @Override // nn0.o
    public void Bg(android.graphics.RectF[] rectFArr) {
        this.M = rectFArr;
        nn0.b bVar = this.A;
        if (bVar != null) {
            bVar.u(rectFArr);
        }
    }

    @Override // nn0.o
    public android.graphics.SurfaceTexture Da() {
        return this.f338580x;
    }

    @Override // nn0.o
    public void Gg(pn0.b bVar) {
    }

    @Override // nn0.o
    public void O2(pn0.b bVar) {
    }

    public boolean a(nn0.b bVar, java.lang.Object obj) {
        if (bVar == null || !bVar.f338552w || !bVar.w(obj)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f338563d, "shared eglcontext changed!");
        b(bVar);
        this.G = false;
        return true;
    }

    public void b(nn0.b bVar) {
        android.content.Context context;
        if (bVar == null || !bVar.f338552w) {
            return;
        }
        try {
            bVar.p();
            q05.c cVar = this.f338579w;
            if (cVar != null) {
                cVar.a();
                this.f338579w = null;
            }
            bVar.y();
            if (this.N == 1 && (context = this.H) != null) {
                bVar.z(context);
            }
            synchronized (this.C) {
                if (this.A == bVar) {
                    this.A = null;
                    this.G = false;
                } else {
                    com.tencent.mars.xlog.Log.w(this.f338563d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(this.f338563d, "destroyInternal error");
            synchronized (this.C) {
                if (this.A == bVar) {
                    this.A = null;
                    this.G = false;
                } else {
                    com.tencent.mars.xlog.Log.w(this.f338563d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        }
    }

    @Override // nn0.o
    public void bc(ps0.a aVar) {
        nn0.b bVar = this.A;
        if (bVar != null) {
            if (aVar != null) {
                ((go0.w1) aVar).e(this.f338566g);
            }
            bVar.R = aVar;
        }
    }

    public void c() {
        i();
        this.K = true;
        synchronized (this) {
            java.lang.String str = "GL.CustomRender_" + java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 10000);
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a(str, 10);
            this.f338565f = a17;
            a17.start();
            com.tencent.mars.xlog.Log.i(this.f338563d, "CustomRender mGLThread start " + this.f338565f.isAlive() + " threadName = " + str + "@" + hashCode());
            this.f338566g = new com.tencent.mm.sdk.platformtools.n3(this.f338565f.getLooper());
            this.f338567h = new nn0.g(this.f338565f.getLooper(), this);
        }
    }

    public void d() {
        this.F = true;
        this.f338581y = true;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f338568i;
        int i17 = 0;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.f338568i.setVisibility(0);
        }
        android.view.TextureView textureView = this.f338569m;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3909w3).getValue()).r()).intValue() == 1;
        if (bj6 && z17) {
            this.P = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
            i17 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).aj(this.P, Di, Ni, 3, 48000, 2);
        }
        com.tencent.mars.xlog.Log.i(this.f338563d, "WaveHAid, enable:%s, type:%s, device:%s, result:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(i17));
    }

    @Override // nn0.o
    public void d1(boolean z17) {
        nn0.b bVar = this.A;
        if (bVar != null) {
            bVar.v(z17);
        }
    }

    public void e(boolean z17) {
        if (!this.f338582z || z17) {
            this.f338581y = false;
        } else {
            this.f338581y = true;
        }
        this.f338582z = false;
        this.F = false;
        this.f338562J = false;
        this.f338580x = null;
        if (z17) {
            com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f338568i;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.setVisibility(8);
            }
            android.view.TextureView textureView = this.f338569m;
            if (textureView != null) {
                textureView.setVisibility(8);
            }
        }
        if (this.P != 0) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.P);
            this.P = 0L;
        }
    }

    @Override // nn0.o
    public void f(boolean z17) {
        stopPlay(z17);
    }

    public void finalize() {
        i();
        this.H = null;
        this.I = null;
        this.P = 0L;
    }

    public void g(nn0.b bVar, android.graphics.SurfaceTexture surfaceTexture) {
        b(bVar);
        this.G = false;
    }

    @Override // nn0.o
    public int getVideoHeight() {
        return 0;
    }

    @Override // nn0.o
    public int getVideoWidth() {
        return 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:22|(3:24|(1:26)|27)|28|(1:30)|31|54|36|(5:104|105|(1:107)(1:112)|108|109)|38|(3:40|(1:98)(1:44)|(3:46|47|(1:49)(8:50|(3:52|(1:54)(1:(1:57)(1:58))|55)|59|(4:63|(2:79|80)|65|(4:67|(2:69|(1:71)(2:72|(1:74)))|75|76))|83|(1:85)(1:94)|86|(1:92)(2:90|91))))|99|100|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00c7, code lost:
    
        com.tencent.mars.xlog.Log.e(r12.f338563d, "renderInternal makeCurrent error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a0, code lost:
    
        if (r8.f338552w == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.h.h(com.tencent.rtmp.TXLivePlayer$TXLiteAVTexture):void");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 2) {
            h((com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture) message.obj);
            return false;
        }
        if (i17 != 3) {
            return false;
        }
        java.lang.Object obj = message.obj;
        com.tencent.mars.xlog.Log.i(this.f338563d, "MSG_DESTROY customRenderImpl = " + obj + " mCustomGLRenderImp = " + this.A);
        if (obj instanceof nn0.b) {
            b((nn0.b) obj);
        }
        com.tencent.mars.xlog.Log.i(this.f338563d, "MSG_DESTROY");
        return false;
    }

    @Override // nn0.o
    public void he(android.graphics.RectF rectF) {
    }

    public void i() {
        synchronized (this) {
            android.os.HandlerThread handlerThread = this.f338565f;
            if (handlerThread != null && handlerThread.isAlive()) {
                this.f338565f.quitSafely();
                com.tencent.mars.xlog.Log.i(this.f338563d, "CustomRender mGLThread quit");
            }
            this.f338566g = null;
            this.f338567h = null;
            this.f338565f = null;
        }
    }

    @Override // nn0.o
    public void j4(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, nn0.c0 c0Var) {
        android.view.TextureView videoView;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView2 = this.f338568i;
        if (tXCloudVideoView2 != null && tXCloudVideoView2 != tXCloudVideoView && (videoView = tXCloudVideoView2.getVideoView()) != null) {
            this.f338568i.removeView(videoView);
        }
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView3 = this.f338568i;
        if ((tXCloudVideoView3 == null && tXCloudVideoView != null) || (tXCloudVideoView3 != null && !tXCloudVideoView3.equals(tXCloudVideoView))) {
            this.f338562J = false;
        }
        this.f338568i = tXCloudVideoView;
        if (tXCloudVideoView != null) {
            android.view.TextureView videoView2 = tXCloudVideoView.getVideoView();
            this.f338569m = videoView2;
            if (videoView2 == null) {
                this.f338569m = new android.view.TextureView(this.f338568i.getContext());
            }
            this.f338569m.setOpaque(false);
            this.f338569m.setTransform(new android.graphics.Matrix());
            this.f338569m.setScaleX(1.0f);
            this.f338569m.setScaleY(1.0f);
            this.f338569m.setRotation(0.0f);
            if (this.f338569m.getParent() != null && (this.f338569m.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) this.f338569m.getParent()).removeView(this.f338569m);
            }
            this.f338568i.addVideoView(this.f338569m);
        }
        android.view.TextureView textureView = this.f338569m;
        if (textureView != null && this.f338580x == null) {
            textureView.setSurfaceTextureListener(null);
        }
        if (this.f338569m.getWidth() != 0 && this.f338569m.getHeight() != 0) {
            this.f338571o = this.f338569m.getSurfaceTexture();
            this.f338575s = this.f338569m.getWidth();
            this.f338576t = this.f338569m.getHeight();
        }
        android.view.TextureView textureView2 = this.f338569m;
        if (textureView2 != null && this.N != 1) {
            this.f338575s = textureView2.getWidth();
            this.f338576t = this.f338569m.getHeight();
            nn0.m mVar = new nn0.m(this.f338569m);
            this.f338570n = mVar;
            mVar.f(this.f338577u, this.f338578v);
            this.f338570n.g(this.f338575s, this.f338576t);
            this.f338570n.b(this.D);
            this.f338570n.d(this.E % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
        }
        this.f338569m.setSurfaceTextureListener(new nn0.d(this));
        if (this.f338580x != null) {
            android.graphics.SurfaceTexture surfaceTexture = this.f338569m.getSurfaceTexture();
            android.graphics.SurfaceTexture surfaceTexture2 = this.f338580x;
            if (surfaceTexture == surfaceTexture2) {
                com.tencent.mars.xlog.Log.i(this.f338563d, "not setSurfaceTexture old surfaceTexture " + this.f338569m.getSurfaceTexture() + ", new surfaceTexture " + this.f338580x);
                return;
            }
            try {
                this.f338569m.setSurfaceTexture(surfaceTexture2);
                this.f338571o = this.f338580x;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(this.f338563d, "setSurfaceTexture error " + e17);
                this.f338571o = this.f338569m.getSurfaceTexture();
            }
        }
    }

    @Override // nn0.o
    public void le(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f338572p = surfaceTexture;
        u(i17, i18);
    }

    @Override // nn0.o
    public void n7(int i17) {
        this.N = i17;
        this.G = false;
        nn0.b bVar = this.A;
        if (bVar != null) {
            if (i17 == 1) {
                bVar.m(this.H);
            } else {
                bVar.z(this.H);
            }
        }
        if (this.N == 2) {
            this.f338564e = true;
        }
    }

    @Override // nn0.o
    public com.tencent.rtmp.ui.TXCloudVideoView o1() {
        return null;
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener
    public void onAudioInfoChanged(int i17, int i18, int i19) {
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener
    public void onPcmDataAvailable(byte[] bArr, long j17) {
        if (this.P == 0 || bArr.length <= 0) {
            return;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[bArr.length];
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        long j18 = this.P;
        ((u14.t) l1Var).getClass();
        if (com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid.Process(j18, bArr, bArr2, length) == 0) {
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        }
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener
    public void onRenderVideoFrame(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture) {
        int i17 = tXLiteAVTexture.width;
        int i18 = tXLiteAVTexture.height;
        if (this.f338577u != i17 || this.f338578v != i18) {
            this.f338577u = i17;
            this.f338578v = i18;
            nn0.m mVar = this.f338570n;
            if (mVar != null && this.N != 1) {
                mVar.f(i17, i18);
            }
        }
        android.opengl.GLES20.glFinish();
        synchronized (this) {
            nn0.g gVar = this.f338567h;
            if (gVar != null) {
                gVar.obtainMessage(2, tXLiteAVTexture).sendToTarget();
            }
        }
    }

    @Override // nn0.o
    public nn0.a pg() {
        return this.A;
    }

    @Override // nn0.o
    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        com.tencent.mars.xlog.Log.i(this.f338563d, "set listener " + iTXLivePlayListener);
        this.I = iTXLivePlayListener;
    }

    @Override // nn0.o
    public void setRenderMode(int i17) {
        this.D = i17;
        nn0.m mVar = this.f338570n;
        if (mVar == null || this.N == 1) {
            return;
        }
        mVar.b(i17);
    }

    @Override // nn0.o
    public void setRenderRotation(int i17) {
        this.E = i17;
        nn0.m mVar = this.f338570n;
        if (mVar == null || this.N == 1) {
            return;
        }
        mVar.d(i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
    }

    @Override // nn0.o
    public void startPlay() {
        c();
        this.G = false;
        d();
    }

    @Override // nn0.o
    public void stopPlay(boolean z17) {
        e(z17);
        nn0.b bVar = this.A;
        synchronized (this.C) {
            if (this.f338567h != null) {
                this.B = this.f338565f.getId();
            }
            if (bVar != null) {
                this.A = null;
            }
            this.G = false;
        }
        synchronized (this) {
            if (bVar != null) {
                nn0.g gVar = this.f338567h;
                if (gVar != null) {
                    gVar.obtainMessage(3, bVar).sendToTarget();
                }
            }
        }
        i();
    }

    @Override // nn0.o
    public void t3(android.graphics.RectF rectF) {
        this.L = rectF;
        nn0.b bVar = this.A;
        if (bVar != null) {
            bVar.s(rectF);
        }
    }

    @Override // nn0.o
    public void u(int i17, int i18) {
        if (i17 == this.f338575s && i18 == this.f338576t) {
            return;
        }
        this.f338575s = i17;
        this.f338576t = i18;
        nn0.m mVar = this.f338570n;
        if (mVar == null || this.N == 1) {
            return;
        }
        mVar.g(i17, i18);
    }

    @Override // nn0.o
    public void v(android.view.Surface surface, int i17, int i18) {
        this.f338573q = surface;
        u(i17, i18);
    }

    @Override // nn0.o
    public void v3(android.graphics.SurfaceTexture surfaceTexture) {
        this.f338580x = surfaceTexture;
    }

    @Override // nn0.o
    public android.graphics.Bitmap yf(android.graphics.Bitmap.Config config) {
        return null;
    }

    @Override // nn0.o
    public void z(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18) {
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView2 = this.f338568i;
        if ((tXCloudVideoView2 == null && tXCloudVideoView != null) || (tXCloudVideoView2 != null && !tXCloudVideoView2.equals(tXCloudVideoView))) {
            this.f338562J = false;
        }
        this.f338568i = tXCloudVideoView;
        if (tXCloudVideoView != null) {
            android.view.TextureView videoView = tXCloudVideoView.getVideoView();
            this.f338569m = videoView;
            if (videoView == null) {
                com.tencent.mars.xlog.Log.e(this.f338563d, "switchPlayerViewImmediately, mTextureView is null!!");
                return;
            }
            videoView.setOpaque(false);
            this.f338569m.setTransform(new android.graphics.Matrix());
            this.f338569m.setScaleX(1.0f);
            this.f338569m.setScaleY(1.0f);
            this.f338569m.setRotation(0.0f);
            android.view.TextureView textureView = this.f338569m;
            if (textureView != null && this.f338580x == null) {
                textureView.setSurfaceTextureListener(null);
            }
            android.view.TextureView textureView2 = this.f338569m;
            if (textureView2 != null && this.N != 1) {
                this.f338575s = textureView2.getWidth();
                this.f338576t = this.f338569m.getHeight();
                nn0.m mVar = new nn0.m(this.f338569m);
                this.f338570n = mVar;
                mVar.f(this.f338577u, this.f338578v);
                this.f338570n.g(this.f338575s, this.f338576t);
                this.f338570n.b(this.D);
                this.f338570n.d(this.E % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
            }
            this.f338569m.setSurfaceTextureListener(new nn0.e(this));
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f338569m.getSurfaceTexture();
        android.graphics.SurfaceTexture surfaceTexture2 = this.f338580x;
        if (surfaceTexture2 == null || surfaceTexture == surfaceTexture2) {
            this.f338571o = surfaceTexture;
        } else {
            try {
                this.f338569m.setSurfaceTexture(surfaceTexture2);
                this.f338571o = this.f338580x;
                this.f338580x = null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(this.f338563d, "setSurfaceTexture error onSurfacetextureAvailable " + e17);
                this.f338571o = surfaceTexture;
            }
        }
        this.f338572p = null;
        this.f338573q = null;
        this.K = true;
        u(i17, i18);
    }
}
