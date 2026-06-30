package ms0;

/* loaded from: classes10.dex */
public abstract class c implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public int f330945a;

    /* renamed from: b, reason: collision with root package name */
    public int f330946b;

    /* renamed from: c, reason: collision with root package name */
    public int f330947c;

    /* renamed from: d, reason: collision with root package name */
    public int f330948d;

    /* renamed from: e, reason: collision with root package name */
    public final int f330949e;

    /* renamed from: f, reason: collision with root package name */
    public final int f330950f;

    /* renamed from: g, reason: collision with root package name */
    public os0.a f330951g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f330952h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f330953i;

    /* renamed from: j, reason: collision with root package name */
    public is0.c f330954j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f330955k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f330956l;

    /* renamed from: m, reason: collision with root package name */
    public int f330957m;

    /* renamed from: n, reason: collision with root package name */
    public int f330958n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f330959o;

    /* renamed from: p, reason: collision with root package name */
    public final ms0.a f330960p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f330961q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f330962r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f330963s;

    public c(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f330945a = i17;
        this.f330946b = i18;
        this.f330947c = i19;
        this.f330948d = i27;
        this.f330949e = i28;
        this.f330950f = i29;
        this.f330957m = -1;
        this.f330960p = new ms0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r3 != null && r3.length == r2.length) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(ms0.c r1, byte[] r2, boolean r3, int r4, java.lang.Object r5) {
        /*
            if (r5 != 0) goto L42
            r4 = r4 & 2
            r5 = 1
            if (r4 == 0) goto L8
            r3 = r5
        L8:
            r1.getClass()
            java.lang.String r4 = "frame"
            kotlin.jvm.internal.o.g(r2, r4)
            if (r3 == 0) goto L33
            byte[] r3 = r1.f330952h
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.M0(r3)
            r4 = 0
            if (r3 != 0) goto L27
            byte[] r3 = r1.f330952h
            if (r3 == 0) goto L24
            int r3 = r3.length
            int r0 = r2.length
            if (r3 != r0) goto L24
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L2c
        L27:
            int r3 = r2.length
            byte[] r3 = new byte[r3]
            r1.f330952h = r3
        L2c:
            byte[] r3 = r1.f330952h
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r4, r3, r4, r5)
            goto L35
        L33:
            r1.f330952h = r2
        L35:
            os0.a r2 = r1.f330951g
            if (r2 == 0) goto L41
            byte[] r1 = r1.f330952h
            kotlin.jvm.internal.o.d(r1)
            r2.q(r1)
        L41:
            return
        L42:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: input"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ms0.c.l(ms0.c, byte[], boolean, int, java.lang.Object):void");
    }

    public static /* synthetic */ void o(ms0.c cVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: release");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        cVar.n(z17);
    }

    public abstract os0.a f();

    public is0.c g() {
        return this.f330954j;
    }

    public int h() {
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            return aVar.f348016y;
        }
        return 0;
    }

    public int i() {
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            return aVar.f348015x;
        }
        return 0;
    }

    public is0.c j() {
        return this.f330954j;
    }

    public void k(boolean z17) {
        if (this.f330963s) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " initRenderProcInGlesThread, already init", new java.lang.Object[0]);
            return;
        }
        this.f330956l = z17;
        this.f330951g = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " exec func initGLTextureRender  mirror : " + this.f330959o);
        t(this.f330947c, this.f330948d);
        u(this.f330945a, this.f330946b);
        r(this.f330958n);
        m(this.f330959o);
        if (this.f330956l && (this.f330953i == null || this.f330957m <= 0)) {
            this.f330954j = is0.b.b(false, 12L);
            android.opengl.GLES20.glFinish();
            is0.c cVar = this.f330954j;
            if (cVar != null) {
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f294395e);
                final yz5.l lVar = this.f330961q;
                surfaceTexture.setOnFrameAvailableListener(lVar != null ? new android.graphics.SurfaceTexture.OnFrameAvailableListener(lVar) { // from class: ms0.b

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.l f330944d;

                    {
                        kotlin.jvm.internal.o.g(lVar, "function");
                        this.f330944d = lVar;
                    }

                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final /* synthetic */ void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                        this.f330944d.invoke(surfaceTexture2);
                    }
                } : null);
                this.f330953i = surfaceTexture;
                is0.c cVar2 = this.f330954j;
                if ((cVar2 != null ? cVar2.f294395e : -1) <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "markCreateExternalTextureFailed");
                    jx3.f.INSTANCE.w(985L, 55L, 1L);
                }
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + this.f330954j, new java.lang.Object[0]);
            }
            is0.c cVar3 = this.f330954j;
            int i17 = cVar3 != null ? cVar3.f294395e : -1;
            this.f330957m = i17;
            os0.a aVar = this.f330951g;
            if (aVar != null) {
                aVar.r(i17);
            }
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + z17 + ", surfaceTexture:" + this.f330953i, new java.lang.Object[0]);
        this.f330963s = true;
    }

    public void m(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " set mirror: " + z17);
        this.f330959o = z17;
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            aVar.j(z17);
        }
    }

    public void n(boolean z17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " called release, shouldDestroySurfaceTexture: " + z17 + ", externalTextureObj:" + this.f330954j + ", surfaceTexture:" + this.f330953i, new java.lang.Object[0]);
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            aVar.n();
        }
        is0.c cVar = this.f330954j;
        if (cVar != null) {
            cVar.close();
        }
        this.f330954j = null;
        android.opengl.GLES20.glFinish();
        if (z17 && (surfaceTexture = this.f330953i) != null) {
            surfaceTexture.release();
        }
        synchronized (this) {
            this.f330953i = null;
        }
        this.f330963s = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f330955k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "do clear frame");
            this.f330955k = false;
            return;
        }
        if (this.f330952h == null && this.f330957m == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " there is no input ,do you dismiss setting input");
            return;
        }
        ms0.a aVar = this.f330960p;
        aVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        aVar.f330941c = elapsedRealtime;
        if (aVar.f330942d == 0) {
            aVar.f330942d = elapsedRealtime;
        }
        p();
        ms0.a aVar2 = this.f330960p;
        aVar2.f330940b++;
        aVar2.f330939a += android.os.SystemClock.elapsedRealtime() - aVar2.f330941c;
        aVar2.f330943e = android.os.SystemClock.elapsedRealtime();
        if (this.f330956l) {
            com.tencent.mm.sdk.platformtools.b3 b3Var = qs0.a.f366207a;
            synchronized (b3Var) {
                try {
                    b3Var.c();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreviewRenderSignal", e17, "markRendering error", new java.lang.Object[0]);
                }
            }
        }
        yz5.a aVar3 = this.f330962r;
        if (aVar3 != null) {
            aVar3.invoke();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceChanged width:" + i17 + ", height:" + i18);
        t(i17, i18);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceCreated");
        rs0.i.f399296a.g();
    }

    public void p() {
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            aVar.o();
        }
    }

    public void q(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("glTextureRenderProc is null ?");
        sb6.append(this.f330951g == null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", sb6.toString(), new java.lang.Object[0]);
        os0.a aVar = this.f330951g;
        if (aVar == null) {
            return;
        }
        aVar.f348009r = listener;
    }

    public void r(int i17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " change rotate ,old degree : " + this.f330958n + " , new degree : " + i17, new java.lang.Object[0]);
        this.f330958n = i17;
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            aVar.s(i17);
        }
    }

    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "takePhoto");
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            aVar.f348013v = true;
        }
    }

    public void t(int i17, int i18) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateDrawViewSize ,width : " + i17 + " , height : " + i18, new java.lang.Object[0]);
        this.f330947c = i17;
        this.f330948d = i18;
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            aVar.u(i17, i18);
        }
    }

    public void u(int i17, int i18) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateTextureSize ,width : " + i17 + " , height : " + i18, new java.lang.Object[0]);
        this.f330945a = i17;
        this.f330946b = i18;
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            aVar.w(i17, i18);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c(int r5, int r6, int r7, int r8, int r9, int r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L7
            r12 = r0
            goto L8
        L7:
            r12 = r5
        L8:
            r5 = r11 & 2
            if (r5 == 0) goto Ld
            goto Le
        Ld:
            r0 = r6
        Le:
            r5 = r11 & 4
            if (r5 == 0) goto L14
            r1 = r12
            goto L15
        L14:
            r1 = r7
        L15:
            r5 = r11 & 8
            if (r5 == 0) goto L1b
            r2 = r0
            goto L1c
        L1b:
            r2 = r8
        L1c:
            r5 = r11 & 16
            r6 = 1
            if (r5 == 0) goto L23
            r3 = r6
            goto L24
        L23:
            r3 = r9
        L24:
            r5 = r11 & 32
            if (r5 == 0) goto L2a
            r11 = r6
            goto L2b
        L2a:
            r11 = r10
        L2b:
            r5 = r4
            r6 = r12
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ms0.c.<init>(int, int, int, int, int, int, int, kotlin.jvm.internal.i):void");
    }
}
