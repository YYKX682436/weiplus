package com.tencent.mm.plugin.voip.video;

/* loaded from: classes14.dex */
public final class OpenGlRender implements wq4.q {
    public static int A;
    public static final java.lang.Object B = new java.lang.Object();
    public static final java.lang.Object C = new java.lang.Object();
    public static final java.lang.Object D = new java.lang.Object();
    public static boolean E;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f177057e;

    /* renamed from: f, reason: collision with root package name */
    public final int f177058f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f177059g;

    /* renamed from: h, reason: collision with root package name */
    public int f177060h;

    /* renamed from: i, reason: collision with root package name */
    public int f177061i;

    /* renamed from: j, reason: collision with root package name */
    public int f177062j;

    /* renamed from: k, reason: collision with root package name */
    public final ar4.b f177063k;

    /* renamed from: l, reason: collision with root package name */
    public final br4.g f177064l;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f177066n;

    /* renamed from: o, reason: collision with root package name */
    public int f177067o;

    /* renamed from: p, reason: collision with root package name */
    public int f177068p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f177069q;

    /* renamed from: r, reason: collision with root package name */
    public final int f177070r;

    /* renamed from: s, reason: collision with root package name */
    public final int f177071s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f177072t;

    /* renamed from: u, reason: collision with root package name */
    public int f177073u;

    /* renamed from: a, reason: collision with root package name */
    public boolean f177053a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f177054b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f177055c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f177056d = 0;

    /* renamed from: m, reason: collision with root package name */
    public p05.l4 f177065m = null;

    /* renamed from: v, reason: collision with root package name */
    public int f177074v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f177075w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f177076x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f177077y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f177078z = false;

    public OpenGlRender(com.tencent.mm.plugin.voip.video.OpenGlView openGlView, wq4.a0 a0Var, int i17) {
        this.f177058f = 0;
        this.f177059g = null;
        this.f177063k = null;
        this.f177069q = false;
        if (!E) {
            com.tencent.mm.plugin.voip.video.OpenGlRender.class.getClassLoader();
            fp.d0.n("mm_gl_disp");
            E = true;
        }
        this.f177058f = i17;
        this.f177057e = new java.lang.ref.WeakReference(openGlView);
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            new wq4.z(this, myLooper);
        } else {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                new wq4.z(this, mainLooper);
            }
        }
        if (a0Var != null) {
            new java.lang.ref.WeakReference(a0Var);
        }
        if (c() == 2) {
            this.f177063k = new ar4.b();
        }
        this.f177064l = new br4.g();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_ilink_voip_skin_smooth_weight, 0);
        this.f177070r = Ni;
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_ilink_voip_skin_bright_weight, 0);
        this.f177071s = Ni2;
        if (Ni < 0) {
            this.f177070r = 0;
        }
        if (this.f177070r >= 100) {
            this.f177070r = 100;
        }
        if (Ni2 < 0) {
            this.f177071s = 0;
        }
        if (this.f177071s >= 100) {
            this.f177071s = 100;
        }
        if (this.f177070r != 0 && this.f177071s != 0) {
            this.f177069q = true;
        }
        this.f177059g = null;
    }

    private native void Init(int i17, java.lang.Object obj, int i18);

    private native void Uninit(int i17);

    public static int c() {
        if (A == 0) {
            A = 2;
            com.tencent.mars.xlog.Log.i("OpenGlRender", "init gl version: %s", 2);
        }
        return A;
    }

    private native void render32(int[] iArr, int i17, int i18, int i19, int i27);

    private native void render8(byte[] bArr, int i17, int i18, int i19, int i27);

    private native void setMode(int i17, int i18, int i19, int i27);

    private native void setParam(float f17, float f18, float f19, int i17);

    public final void a(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f177057e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (z17) {
            if (this.f177077y) {
                com.tencent.mars.xlog.Log.i("OpenGlRender", "attachGLContext");
                this.f177077y = !this.f177064l.a();
                this.f177059g = null;
                com.tencent.mars.xlog.Log.i("OpenGlRender", "attach finish");
                return;
            }
            return;
        }
        com.tencent.mm.plugin.voip.video.OpenGlView openGlView = (com.tencent.mm.plugin.voip.video.OpenGlView) this.f177057e.get();
        com.tencent.mars.xlog.Log.i("OpenGlRender", "attachGLContext:%s", openGlView);
        openGlView.b(new wq4.y(this));
        java.lang.Object obj = C;
        synchronized (obj) {
            try {
                obj.wait(100L);
                com.tencent.mars.xlog.Log.i("OpenGlRender", "attachGLContext wait finish, bNeedAttach:%s", java.lang.Boolean.valueOf(this.f177077y));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("OpenGlRender", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final void b(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f177057e;
        if (weakReference == null || weakReference.get() == null) {
            if (this.f177078z) {
                ((com.tencent.mm.plugin.voip.video.OpenGlView) this.f177057e.get()).b(new wq4.x(this));
            }
        } else {
            if (z17) {
                return;
            }
            com.tencent.mm.plugin.voip.video.OpenGlView openGlView = (com.tencent.mm.plugin.voip.video.OpenGlView) this.f177057e.get();
            com.tencent.mars.xlog.Log.i("OpenGlRender", "detachGLContext:%s", openGlView);
            openGlView.b(new wq4.w(this));
            java.lang.Object obj = B;
            synchronized (obj) {
                try {
                    obj.wait(100L);
                    com.tencent.mars.xlog.Log.i("OpenGlRender", "detachGLContext wait finish, bNeedDetach:%s", java.lang.Boolean.valueOf(this.f177078z));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("OpenGlRender", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0286 A[Catch: all -> 0x01ca, TryCatch #0 {all -> 0x01ca, blocks: (B:66:0x0189, B:69:0x0191, B:71:0x019e, B:73:0x01a1, B:75:0x01a5, B:77:0x01a9, B:83:0x01c7, B:84:0x01cd, B:85:0x0202, B:86:0x022c, B:88:0x0235, B:89:0x025d, B:91:0x0260, B:93:0x026a, B:97:0x0275, B:99:0x0279, B:101:0x027b, B:108:0x0286, B:110:0x02bc, B:111:0x02e4), top: B:65:0x0189 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(javax.microedition.khronos.opengles.GL10 r28) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.video.OpenGlRender.d(javax.microedition.khronos.opengles.GL10):void");
    }

    public void e(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("OpenGlRender", "%s onSurfaceChanged, width: %s, height: %s, self:%b, UI:%dx%d,mode:%d, lastHWDecSize:%dx%d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.f177072t), java.lang.Integer.valueOf(this.f177055c), java.lang.Integer.valueOf(this.f177056d), java.lang.Integer.valueOf(this.f177058f), java.lang.Integer.valueOf(this.f177075w), java.lang.Integer.valueOf(this.f177076x));
        if (this.f177055c != i17 || this.f177056d != i18) {
            gl10.glViewport(0, 0, i17, i18);
            this.f177055c = i17;
            this.f177056d = i18;
        }
        ar4.b bVar = this.f177063k;
        if (bVar != null) {
            bVar.getClass();
            bVar.getClass();
        }
        br4.g gVar = this.f177064l;
        if (gVar != null) {
            gVar.onSurfaceChanged(gl10, i17, i18);
        }
        if (this.f177065m == null) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_xsetting_allow_checkgpu, true);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_facebeauty_gpu_rating_limited, 50);
            if (fj6) {
                int i19 = -1;
                try {
                    int c17 = rs0.n.f399306d.c();
                    if (c17 == -1) {
                        new rs0.n().a();
                    }
                    i19 = c17;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.GpuDetectorUtil", "error happened " + e17, new java.lang.Object[0]);
                }
                if (i19 < Ni) {
                    this.f177069q = false;
                }
            }
        }
        if (this.f177069q) {
            if (this.f177065m == null) {
                p05.l4 l4Var = new p05.l4(1);
                this.f177065m = l4Var;
                l4Var.A(this.f177070r, -1, -1, this.f177071s, -1);
                this.f177065m.H(false);
                this.f177065m.K(true);
            }
            p05.l4 l4Var2 = this.f177065m;
            if (l4Var2 != null) {
                l4Var2.J(i17, i18);
                this.f177067o = i17;
                this.f177068p = i18;
            }
        }
        int i27 = this.f177074v;
        this.f177074v = i27;
        if (gVar != null) {
            com.tencent.mm.sdk.platformtools.Log.c("OpenGlRender", "setShowMode, mode:%d, uiWidth: %s, uiHeight: %s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f177055c), java.lang.Integer.valueOf(this.f177056d));
            if (i27 != 1) {
                this.f177078z = true;
                b(false);
            } else {
                if (this.f177078z) {
                    com.tencent.mars.xlog.Log.i("OpenGlRender", "is need to detach");
                    b(false);
                }
                this.f177077y = true;
                a(false);
            }
            gVar.f(this.f177074v);
        }
        int i28 = this.f177075w;
        int i29 = this.f177076x;
        com.tencent.mars.xlog.Log.i("OpenGlRender", "video=" + i28 + "x" + i29);
        if (i28 <= 0 || i29 <= 0) {
            com.tencent.mars.xlog.Log.e("OpenGlRender", "ERROR video size:%dx%d, lastviddeosize:%dx%d ", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(this.f177075w), java.lang.Integer.valueOf(this.f177076x));
            return;
        }
        this.f177075w = i28;
        this.f177076x = i29;
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipRenderer", "setHWDecVideoSize: width:%s, height:%s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
            gVar.f23728g = i28;
            gVar.f23729h = i29;
            gVar.b(i28, i29, br4.b.f23685f, br4.b.f23686g);
        }
    }

    public void f(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mars.xlog.Log.i("OpenGlRender", "onSurfaceCreated...");
        if (c() == 2) {
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glDisable(2929);
        }
        br4.g gVar = this.f177064l;
        if (gVar != null) {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        }
        if (com.tencent.mm.plugin.voip.model.v2protocal.f176825l2 == null) {
            br4.e b17 = br4.e.b();
            b17.getClass();
            try {
                b17.f23720c = b17.a();
                b17.f23718a.set(false);
                android.view.Surface surface = new android.view.Surface(b17.f23720c);
                com.tencent.mm.plugin.voip.model.v2protocal.f176827n2 = b17.f23720c;
                com.tencent.mm.plugin.voip.model.v2protocal.f176826m2 = null;
                com.tencent.mm.plugin.voip.model.v2protocal.f176825l2 = surface;
                ((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m0) b17.f23721d).a();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipHardDecodeUtil", e17, "initSurfaceTexutre error", new java.lang.Object[0]);
            }
        }
    }

    public void g() {
        if (this.f177057e.get() != null) {
            wq4.m mVar = ((com.tencent.mm.plugin.voip.video.OpenGlView) this.f177057e.get()).f177031e;
            mVar.getClass();
            wq4.n nVar = com.tencent.mm.plugin.voip.video.GLTextureView.f177029r;
            synchronized (nVar) {
                mVar.f448675r = true;
                nVar.notifyAll();
            }
        }
    }
}
