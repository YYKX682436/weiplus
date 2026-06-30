package nn0;

/* loaded from: classes14.dex */
public class s implements nn0.o, com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener, com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener {
    public final java.lang.Object E;
    public int F;
    public int G;
    public android.graphics.Bitmap H;
    public final java.util.concurrent.atomic.AtomicBoolean I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.Surface f338607J;
    public final nn0.b0 K;
    public android.os.Handler L;
    public long M;
    public int N;
    public int P;
    public com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture Q;
    public final android.os.Message R;
    public java.lang.String S;
    public long T;

    /* renamed from: s, reason: collision with root package name */
    public nn0.b f338620s;

    /* renamed from: x, reason: collision with root package name */
    public android.content.Context f338625x;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f338608d = "Finder.NewCustomRender" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public boolean f338609e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f338610f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f338611g = null;

    /* renamed from: h, reason: collision with root package name */
    public nn0.q f338612h = null;

    /* renamed from: i, reason: collision with root package name */
    public pn0.b f338613i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f338614m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f338615n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.rtmp.ui.TXCloudVideoView f338616o = null;

    /* renamed from: p, reason: collision with root package name */
    public nn0.d0 f338617p = null;

    /* renamed from: q, reason: collision with root package name */
    public q05.c f338618q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.SurfaceTexture f338619r = null;

    /* renamed from: t, reason: collision with root package name */
    public long f338621t = -1;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.RectF[] f338622u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f338623v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f338624w = false;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.rtmp.ITXLivePlayListener f338626y = null;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.RectF f338627z = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
    public final android.graphics.RectF A = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
    public int B = 0;
    public int C = 1;
    public int D = 0;

    public s(android.content.Context context) {
        this.f338620s = null;
        java.lang.Object obj = new java.lang.Object();
        this.E = obj;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f338607J = null;
        this.K = new nn0.b0();
        this.N = 0;
        this.P = 0;
        this.Q = null;
        this.R = android.os.Message.obtain();
        this.S = "";
        this.T = 0L;
        this.f338625x = context;
        this.L = new android.os.Handler(android.os.Looper.getMainLooper());
        this.N = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_render_surface_destroy_strategy, 0);
        this.P = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_live_render_surface_lifecycle_check, 0);
        com.tencent.mars.xlog.Log.i(this.f338608d, "commonInit surfaceDestroyStrategy = " + this.N + ", surfaceCheckStrategy = " + this.P);
        synchronized (obj) {
            this.f338620s = new nn0.b();
            a();
        }
    }

    @Override // nn0.o
    public void B(boolean z17) {
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            bVar.B(z17);
        }
    }

    @Override // nn0.o
    public void Bg(android.graphics.RectF[] rectFArr) {
        this.f338622u = rectFArr;
        nn0.b bVar = this.f338620s;
        if (bVar != null) {
            bVar.u(rectFArr);
        }
    }

    @Override // nn0.o
    public android.graphics.SurfaceTexture Da() {
        return this.f338619r;
    }

    @Override // nn0.o
    public void Gg(pn0.b bVar) {
        synchronized (this.E) {
            if (this.f338620s == null) {
                return;
            }
            android.view.Surface surface = bVar.getSurface();
            if (surface == null) {
                return;
            }
            java.lang.ref.WeakReference weakReference = this.f338620s.G;
            if (surface == (weakReference != null ? (android.view.Surface) weakReference.get() : null)) {
                hn0.s[] sVarArr = hn0.s.f282435d;
                if ((this.N & 1) <= 0) {
                    com.tencent.mars.xlog.Log.i(this.f338608d, "onSurfaceChanged: surfaceDestroyStrategy = " + this.N + ", skip destroy");
                } else if (this.f338612h != null) {
                    com.tencent.mars.xlog.Log.i(this.f338608d, "obtainMessage(MSG_DESTROY)_onSurfaceChanged");
                    this.f338612h.obtainMessage(3, this.f338620s).sendToTarget();
                }
            }
        }
    }

    @Override // nn0.o
    public void O2(pn0.b bVar) {
        synchronized (this.E) {
            if (this.f338620s == null) {
                return;
            }
            android.view.Surface surface = bVar.getSurface();
            if (surface == null) {
                return;
            }
            java.lang.ref.WeakReference weakReference = this.f338620s.G;
            if (surface == (weakReference != null ? (android.view.Surface) weakReference.get() : null)) {
                com.tencent.mars.xlog.Log.i(this.f338608d, "surfaceRender.surface Destroyed, but mCustomGLRenderImp is not null");
                hn0.s[] sVarArr = hn0.s.f282435d;
                if ((this.N & 2) <= 0) {
                    com.tencent.mars.xlog.Log.i(this.f338608d, "onSurfaceDestroyed: surfaceDestroyStrategy = " + this.N + ", skip ignore");
                } else if (this.f338612h != null) {
                    com.tencent.mars.xlog.Log.i(this.f338608d, "obtainMessage(MSG_DESTROY)_onSurfaceDestroyed");
                    this.f338612h.obtainMessage(3, this.f338620s).sendToTarget();
                }
            }
        }
    }

    public final void a() {
        synchronized (this.E) {
            nn0.b bVar = this.f338620s;
            if (bVar == null) {
                return;
            }
            boolean z17 = this.N > 0;
            if (bVar.P != z17) {
                bVar.P = z17;
                com.tencent.mars.xlog.Log.i(bVar.f338530a, "updateNeedHoldSurface: " + z17);
                if (!bVar.P) {
                    bVar.G = null;
                }
            }
        }
    }

    public boolean b(nn0.b bVar, java.lang.Object obj) {
        if (bVar == null || !bVar.f338552w || !bVar.w(obj)) {
            return false;
        }
        c(bVar, "checkShareContextChange");
        this.f338624w = false;
        return true;
    }

    @Override // nn0.o
    public void bc(ps0.a aVar) {
        nn0.b bVar = this.f338620s;
        if (bVar != null) {
            if (aVar != null) {
                ((go0.w1) aVar).e(this.f338611g);
            }
            bVar.R = aVar;
        }
    }

    public void c(nn0.b bVar, java.lang.String str) {
        android.content.Context context;
        com.tencent.mars.xlog.Log.i(this.f338608d, "destroyInternal fromSrc = " + str);
        if (bVar == null || !bVar.f338552w) {
            return;
        }
        try {
            bVar.p();
            q05.c cVar = this.f338618q;
            if (cVar != null) {
                cVar.a();
                this.f338618q = null;
            }
            bVar.y();
            if (this.B == 1 && (context = this.f338625x) != null) {
                bVar.z(context);
            }
            synchronized (this.E) {
                if (this.f338620s == bVar) {
                    this.f338620s = null;
                    this.f338624w = false;
                } else {
                    com.tencent.mars.xlog.Log.w(this.f338608d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(this.f338608d, "destroyInternal error");
            synchronized (this.E) {
                if (this.f338620s == bVar) {
                    this.f338620s = null;
                    this.f338624w = false;
                } else {
                    com.tencent.mars.xlog.Log.w(this.f338608d, "mCustomGLRenderImp != customGLRenderImp");
                }
            }
        }
    }

    public final pn0.b d() {
        pn0.b bVar = this.f338613i;
        if (bVar != null && ((pn0.a) bVar).d()) {
            return this.f338613i;
        }
        java.lang.ref.WeakReference weakReference = this.f338615n;
        pn0.b bVar2 = weakReference != null ? (pn0.b) weakReference.get() : null;
        if (bVar2 == null || !((pn0.a) bVar2).d()) {
            return null;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return bVar2;
    }

    @Override // nn0.o
    public void d1(boolean z17) {
        nn0.b bVar = this.f338620s;
        if (bVar != null) {
            bVar.v(z17);
        }
    }

    public void e() {
        l();
        this.f338607J = null;
        synchronized (this) {
            java.lang.String str = this.f338608d;
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a(str, 10);
            this.f338610f = a17;
            a17.start();
            com.tencent.mars.xlog.Log.i(this.f338608d, "CustomRender mGLThread start " + this.f338610f.isAlive());
            this.f338611g = new com.tencent.mm.sdk.platformtools.n3(this.f338610f.getLooper());
            this.f338612h = new nn0.q(this.f338610f.getLooper(), this);
        }
    }

    @Override // nn0.o
    public void f(boolean z17) {
        h(z17);
        synchronized (this.E) {
            if (this.f338612h != null) {
                this.f338621t = this.f338610f.getId();
            }
        }
    }

    public void finalize() {
        com.tencent.mars.xlog.Log.i(this.f338608d, "finalize");
        l();
        this.L.removeCallbacksAndMessages(null);
        this.L = null;
        this.f338625x = null;
        this.f338626y = null;
        this.f338616o = null;
        this.f338613i = null;
        this.f338615n = null;
        this.f338619r = null;
        this.M = 0L;
    }

    public void g() {
        this.f338623v = true;
        com.tencent.mars.xlog.Log.i(this.f338608d, "startPlay surfaceRender = " + this.f338613i);
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        int i17 = 0;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3909w3).getValue()).r()).intValue() == 1;
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
        if (bj6 && z17) {
            this.M = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
            i17 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).aj(this.M, Di, Ni, 3, 48000, 2);
        }
        com.tencent.mars.xlog.Log.i(this.f338608d, "WaveHAid, enable:%s, type:%s, device:%s, result:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(i17));
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            bVar.startPlay();
        }
    }

    @Override // nn0.o
    public int getVideoHeight() {
        return this.G;
    }

    @Override // nn0.o
    public int getVideoWidth() {
        return this.F;
    }

    public void h(boolean z17) {
        this.f338623v = false;
        com.tencent.mars.xlog.Log.i(this.f338608d, "stopPlay clearLastFrame = " + z17 + " surfaceRender = " + this.f338613i);
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            bVar.stopPlay(z17);
        }
        if (z17) {
            this.f338616o = null;
            this.f338617p = null;
        }
        this.f338615n = null;
        if (this.M != 0) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.M);
            this.M = 0L;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 2) {
            if (i17 == 3) {
                java.lang.Object obj = message.obj;
                if (obj instanceof nn0.b) {
                    c((nn0.b) obj, "MSG_DESTROY");
                }
                com.tencent.mars.xlog.Log.i(this.f338608d, "MSG_DESTROY");
                return false;
            }
            if (i17 != 1000) {
                return false;
            }
        }
        this.R.copyFrom(message);
        j((com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture) message.obj);
        return false;
    }

    @Override // nn0.o
    public void he(android.graphics.RectF rectF) {
        this.A.set(rectF);
        nn0.b bVar = this.f338620s;
        if (bVar != null) {
            bVar.t(rectF);
            k(1000, 1000, null);
        }
    }

    public void i(nn0.b bVar, android.view.Surface surface) {
        c(bVar, "dealSurfaceChange");
        this.f338624w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        if (r9.f338552w == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture r26) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn0.s.j(com.tencent.rtmp.TXLivePlayer$TXLiteAVTexture):void");
    }

    @Override // nn0.o
    public void j4(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, nn0.c0 c0Var) {
        com.tencent.mars.xlog.Log.i(this.f338608d, "setPlayerView glRootView = " + tXCloudVideoView + " listener = " + c0Var);
        this.f338617p = c0Var == null ? null : new nn0.d0(c0Var, tXCloudVideoView.hashCode());
        if (tXCloudVideoView == null) {
            this.f338616o = null;
            return;
        }
        pn0.b bVar = this.f338613i;
        if (bVar != null && ((pn0.a) bVar).d()) {
            pn0.b bVar2 = this.f338613i;
            if (((pn0.a) bVar2).f356947k == tXCloudVideoView && bVar2.a(tXCloudVideoView)) {
                com.tencent.mars.xlog.Log.i(this.f338608d, "setPlayerView repeat setView: " + tXCloudVideoView);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f338608d, "setPlayerView check surface render = " + this.f338613i);
        pn0.b bVar3 = this.f338613i;
        if (bVar3 != null) {
            bVar3.reset();
        }
        if (tXCloudVideoView.getF68622g() != null) {
            this.f338613i = new pn0.e(this);
        } else {
            this.f338613i = new pn0.h(this);
        }
        this.f338614m = true;
        pn0.b bVar4 = this.f338613i;
        int i17 = this.B;
        int i18 = this.C;
        int i19 = this.D;
        pn0.a aVar = (pn0.a) bVar4;
        aVar.f356941e = i17;
        aVar.f356942f = i18;
        aVar.f356943g = i19;
        bVar4.b(tXCloudVideoView);
        this.f338616o = tXCloudVideoView;
        k(1000, 1000, null);
        com.tencent.mars.xlog.Log.i(this.f338608d, "setPlayerView finish check surface render = " + this.f338613i);
    }

    public void k(int i17, int i18, com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture) {
        if (tXLiteAVTexture == null && (tXLiteAVTexture = (com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture) this.R.obj) == null) {
            return;
        }
        synchronized (this) {
            nn0.q qVar = this.f338612h;
            if (qVar != null) {
                if (i18 != 0) {
                    qVar.removeMessages(i18);
                }
                this.f338612h.obtainMessage(i17, tXLiteAVTexture).sendToTarget();
            }
        }
    }

    public void l() {
        synchronized (this) {
            android.os.HandlerThread handlerThread = this.f338610f;
            if (handlerThread != null && handlerThread.isAlive()) {
                this.f338610f.quitSafely();
                com.tencent.mars.xlog.Log.i(this.f338608d, "CustomRender mGLThread quit");
            }
            this.f338611g = null;
            this.f338612h = null;
            this.f338610f = null;
        }
    }

    @Override // nn0.o
    public void le(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        if (surfaceTexture != null) {
            this.f338613i = new pn0.c(this, surfaceTexture, i17, i18);
            this.f338614m = true;
            com.tencent.mars.xlog.Log.i(this.f338608d, "setOutsideSurfaceTexture " + surfaceTexture);
        }
    }

    @Override // nn0.o
    public void n7(int i17) {
        this.B = i17;
        this.f338624w = false;
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            ((pn0.a) bVar).f356941e = i17;
        }
        nn0.b bVar2 = this.f338620s;
        if (bVar2 != null) {
            if (i17 == 1) {
                bVar2.m(this.f338625x);
            } else {
                bVar2.z(this.f338625x);
            }
        }
        if (this.B == 2) {
            this.f338609e = true;
        }
    }

    @Override // nn0.o
    public com.tencent.rtmp.ui.TXCloudVideoView o1() {
        return this.f338616o;
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener
    public void onAudioInfoChanged(int i17, int i18, int i19) {
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener
    public void onPcmDataAvailable(byte[] bArr, long j17) {
        if (this.M == 0 || bArr.length <= 0) {
            return;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[bArr.length];
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        long j18 = this.M;
        ((u14.t) l1Var).getClass();
        if (com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid.Process(j18, bArr, bArr2, length) == 0) {
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        }
    }

    @Override // com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener
    public void onRenderVideoFrame(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture) {
        int i17;
        com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture2 = tXLiteAVTexture;
        int i18 = tXLiteAVTexture2.width;
        int i19 = tXLiteAVTexture2.height;
        if (this.F != i18 || this.G != i19) {
            this.F = i18;
            this.G = i19;
        }
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            bVar.c(i18, i19);
        }
        nn0.b0 b0Var = this.K;
        b0Var.getClass();
        com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture3 = b0Var.f338556a;
        if (tXLiteAVTexture3 == null || !kotlin.jvm.internal.o.b(tXLiteAVTexture3.eglContext, tXLiteAVTexture2.eglContext)) {
            com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture4 = new com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture();
            tXLiteAVTexture4.eglContext = tXLiteAVTexture2.eglContext;
            b0Var.f338556a = tXLiteAVTexture4;
        }
        com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture5 = b0Var.f338556a;
        if (tXLiteAVTexture5 != null && ((i17 = tXLiteAVTexture5.textureId) == 0 || tXLiteAVTexture5.width != tXLiteAVTexture2.width || tXLiteAVTexture5.height != tXLiteAVTexture2.height)) {
            if (i17 != 0) {
                rs0.g gVar = rs0.i.f399296a;
                android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
                com.tencent.mars.xlog.Log.i("SingleTextureCache", "checkResetCache deleteTexture:" + tXLiteAVTexture5.textureId);
            }
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i27 = iArr[0];
            android.opengl.GLES20.glBindTexture(3553, i27);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, tXLiteAVTexture2.width, tXLiteAVTexture2.height, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLES20.glBindTexture(3553, 0);
            tXLiteAVTexture5.textureId = i27;
            tXLiteAVTexture5.width = tXLiteAVTexture2.width;
            tXLiteAVTexture5.height = tXLiteAVTexture2.height;
            tXLiteAVTexture5.eglContext = tXLiteAVTexture2.eglContext;
            com.tencent.mars.xlog.Log.i("SingleTextureCache", "checkResetCache newTextureId:" + i27 + ", width:" + tXLiteAVTexture5.width + ", height:" + tXLiteAVTexture5.height + ", eglContext:" + tXLiteAVTexture5.eglContext);
        }
        com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture6 = b0Var.f338556a;
        if (tXLiteAVTexture6 != null) {
            int i28 = tXLiteAVTexture6.textureId;
            int i29 = tXLiteAVTexture2.textureId;
            int i37 = tXLiteAVTexture2.width;
            int i38 = tXLiteAVTexture2.height;
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, iArr2[0]);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i29, 0);
            if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
                com.tencent.mars.xlog.Log.i("SingleTextureCache", "GL_FRAMEBUFFER_COMPLETE failed.");
            } else {
                android.opengl.GLES20.glBindTexture(3553, i28);
                android.opengl.GLES20.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, i37, i38);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
            }
        }
        com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture7 = b0Var.f338556a;
        if (tXLiteAVTexture7 != null) {
            tXLiteAVTexture2 = tXLiteAVTexture7;
        }
        android.opengl.GLES20.glFinish();
        k(2, 0, tXLiteAVTexture2);
    }

    @Override // nn0.o
    public nn0.a pg() {
        return this.f338620s;
    }

    @Override // nn0.o
    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        com.tencent.mars.xlog.Log.i(this.f338608d, "set listener " + iTXLivePlayListener);
        this.f338626y = iTXLivePlayListener;
    }

    @Override // nn0.o
    public void setRenderMode(int i17) {
        this.C = i17;
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            bVar.setRenderMode(i17);
        }
    }

    @Override // nn0.o
    public void setRenderRotation(int i17) {
        this.D = i17;
        pn0.b bVar = this.f338613i;
        if (bVar != null) {
            bVar.setRenderRotation(i17);
        }
    }

    @Override // nn0.o
    public void startPlay() {
        e();
        this.f338624w = false;
        g();
    }

    @Override // nn0.o
    public void stopPlay(boolean z17) {
        h(z17);
        nn0.b bVar = this.f338620s;
        synchronized (this.E) {
            if (this.f338612h != null) {
                this.f338621t = this.f338610f.getId();
            }
            if (bVar != null) {
                this.f338620s = null;
            }
            this.f338624w = false;
        }
        synchronized (this) {
            if (bVar != null) {
                nn0.q qVar = this.f338612h;
                if (qVar != null) {
                    qVar.obtainMessage(3, bVar).sendToTarget();
                }
            }
            l();
        }
    }

    @Override // nn0.o
    public void t3(android.graphics.RectF rectF) {
        this.f338627z = rectF;
        nn0.b bVar = this.f338620s;
        if (bVar != null) {
            bVar.s(rectF);
        }
    }

    @Override // nn0.o
    public void u(int i17, int i18) {
        pn0.b d17 = d();
        if (d17 != null) {
            d17.u(i17, i18);
        }
    }

    @Override // nn0.o
    public void v(android.view.Surface surface, int i17, int i18) {
        if (surface != null) {
            this.f338613i = new pn0.c(this, surface, i17, i18);
            this.f338614m = true;
            com.tencent.mars.xlog.Log.i(this.f338608d, "setOutsideSurface " + surface);
        }
    }

    @Override // nn0.o
    public void v3(android.graphics.SurfaceTexture surfaceTexture) {
        this.f338619r = surfaceTexture;
    }

    @Override // nn0.o
    public android.graphics.Bitmap yf(android.graphics.Bitmap.Config config) {
        int i17;
        int i18;
        pn0.b bVar = this.f338613i;
        if (bVar != null && (bVar instanceof pn0.h)) {
            if (((pn0.a) bVar).f356947k == null || ((pn0.a) bVar).f356947k.getVideoView() == null) {
                return null;
            }
            return ((pn0.a) this.f338613i).f356947k.getVideoView().getBitmap();
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.I;
        if (!atomicBoolean.get() && (i17 = this.F) != 0 && (i18 = this.G) != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/core/core/postprocessor/customrender/NewCustomRender", "getSurfaceViewFrameBitmap", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/live/core/core/postprocessor/customrender/NewCustomRender", "getSurfaceViewFrameBitmap", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.H = createBitmap;
            if (createBitmap == null || createBitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.e(this.f338608d, "getSurfaceViewFrameBitmap failed to create bitmap, size=%dx%d", java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.G));
                return null;
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                this.T = java.lang.System.currentTimeMillis();
                k(1000, 1000, null);
            }
        }
        return this.H;
    }

    @Override // nn0.o
    public void z(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18) {
        j4(tXCloudVideoView, null);
        u(i17, i18);
    }
}
