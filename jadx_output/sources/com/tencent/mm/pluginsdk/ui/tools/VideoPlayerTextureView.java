package com.tencent.mm.pluginsdk.ui.tools;

@java.lang.Deprecated
/* loaded from: classes15.dex */
public class VideoPlayerTextureView extends com.tencent.mm.ui.base.MMTextureView implements com.tencent.mm.pluginsdk.ui.tools.f4 {
    public ph3.b A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public android.graphics.SurfaceTexture F;
    public boolean G;
    public final ph3.d H;
    public final android.view.TextureView.SurfaceTextureListener I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.o8 f191447J;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f191448h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f191449i;

    /* renamed from: m, reason: collision with root package name */
    public ph3.k f191450m;

    /* renamed from: n, reason: collision with root package name */
    public int f191451n;

    /* renamed from: o, reason: collision with root package name */
    public int f191452o;

    /* renamed from: p, reason: collision with root package name */
    public int f191453p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f191454q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f191455r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f191456s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.Surface f191457t;

    /* renamed from: u, reason: collision with root package name */
    public long f191458u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f191459v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.a4 f191460w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.e4 f191461x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.c4 f191462y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.d4 f191463z;

    public VideoPlayerTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void E() {
        ph3.p pVar;
        if (this.f191450m == null || !this.f191454q || this.f191457t == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f191448h, "%d flush surface start ", java.lang.Integer.valueOf(hashCode()));
        ph3.o oVar = this.f191450m.f354428f;
        if (oVar == null || (pVar = oVar.f354449l) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s player flush surface", oVar.j());
        pVar.t(10);
        oVar.k(oVar.f354439b, android.os.SystemClock.elapsedRealtime(), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:3:0x002a, B:9:0x0057, B:11:0x005b, B:13:0x005f, B:14:0x0070, B:16:0x0079, B:19:0x007e, B:21:0x0087, B:22:0x009e, B:23:0x00a4, B:25:0x00ab, B:30:0x008d, B:31:0x00a1, B:32:0x0069, B:39:0x0050, B:5:0x0032, B:34:0x0037, B:36:0x003b, B:37:0x0043), top: B:2:0x002a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r2 = r3.D
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r5, r6, r2}
            java.lang.String r6 = r3.f191448h
            java.lang.String r0 = "handleOnSurfaceTextureAvailable %d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            com.tencent.mars.xlog.Log.i(r6, r0, r5)
            r5 = 0
            r3.C()     // Catch: java.lang.Exception -> Laf
            android.view.Surface r0 = r3.f191457t     // Catch: java.lang.Exception -> Laf
            r3.I(r0)     // Catch: java.lang.Exception -> Laf
            boolean r0 = r3.G     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L37
            goto L57
        L37:
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L43
            java.lang.String r0 = "first time to onSurfaceTextureAvailable"
            com.tencent.mars.xlog.Log.i(r6, r0)     // Catch: java.lang.Throwable -> L4f
            r3.F = r4     // Catch: java.lang.Throwable -> L4f
            goto L57
        L43:
            java.lang.String r0 = "video view onSurfaceTextureAvailable from detach to attach"
            com.tencent.mars.xlog.Log.i(r6, r0)     // Catch: java.lang.Throwable -> L4f
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Throwable -> L4f
            r3.setSurfaceTexture(r0)     // Catch: java.lang.Throwable -> L4f
            goto L57
        L4f:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Laf
            com.tencent.mars.xlog.Log.e(r6, r0)     // Catch: java.lang.Exception -> Laf
        L57:
            boolean r0 = r3.G     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L69
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L69
            android.view.Surface r4 = new android.view.Surface     // Catch: java.lang.Exception -> Laf
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Exception -> Laf
            r4.<init>(r0)     // Catch: java.lang.Exception -> Laf
            r3.f191457t = r4     // Catch: java.lang.Exception -> Laf
            goto L70
        L69:
            android.view.Surface r0 = new android.view.Surface     // Catch: java.lang.Exception -> Laf
            r0.<init>(r4)     // Catch: java.lang.Exception -> Laf
            r3.f191457t = r0     // Catch: java.lang.Exception -> Laf
        L70:
            android.view.Surface r4 = r3.f191457t     // Catch: java.lang.Exception -> Laf
            r4.hashCode()     // Catch: java.lang.Exception -> Laf
            ph3.k r4 = r3.f191450m     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto La1
            boolean r0 = r3.f191454q     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L7e
            goto La1
        L7e:
            android.view.Surface r0 = r3.f191457t     // Catch: java.lang.Exception -> Laf
            r4.k(r0)     // Catch: java.lang.Exception -> Laf
            boolean r4 = r3.D     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto L8d
            ph3.k r4 = r3.f191450m     // Catch: java.lang.Exception -> Laf
            r4.start()     // Catch: java.lang.Exception -> Laf
            goto L9e
        L8d:
            r4 = 1
            r3.E = r4     // Catch: java.lang.Exception -> Laf
            r0 = 0
            r3.f191458u = r0     // Catch: java.lang.Exception -> Laf
            ph3.k r0 = r3.f191450m     // Catch: java.lang.Exception -> Laf
            r0.setMute(r4)     // Catch: java.lang.Exception -> Laf
            ph3.k r4 = r3.f191450m     // Catch: java.lang.Exception -> Laf
            r4.start()     // Catch: java.lang.Exception -> Laf
        L9e:
            r3.D = r5     // Catch: java.lang.Exception -> Laf
            goto La4
        La1:
            r3.H()     // Catch: java.lang.Exception -> Laf
        La4:
            r3.J()     // Catch: java.lang.Exception -> Laf
            com.tencent.mm.pluginsdk.ui.tools.d4 r4 = r3.f191463z     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto Lb7
            r4.onSurfaceAvailable()     // Catch: java.lang.Exception -> Laf
            goto Lb7
        Laf:
            r4 = move-exception
            java.lang.String r0 = "onSurfaceTextureAvailable failed"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r6, r4, r0, r5)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView.F(android.graphics.SurfaceTexture, int, int):void");
    }

    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        ph3.k kVar;
        if (this.E && this.f191458u > 0 && (kVar = this.f191450m) != null) {
            kVar.pause();
            this.f191450m.setMute(this.f191455r);
            this.E = false;
        }
        if (this.f191458u > 0 && this.f191461x != null) {
            com.tencent.mars.xlog.Log.i(this.f191448h, "%d notify surface update", java.lang.Integer.valueOf(hashCode()));
            this.f191461x.v();
            this.f191461x = null;
        }
        this.f191458u = java.lang.System.currentTimeMillis();
    }

    public void H() {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode()), this.f191449i, this.f191457t};
        java.lang.String str = this.f191448h;
        com.tencent.mars.xlog.Log.i(str, "%d open video [%s] [%s]", objArr);
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            kVar.f354429g = null;
            kVar.stop();
            this.f191450m.release();
            this.f191450m = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f191449i) || this.f191457t == null) {
            com.tencent.mars.xlog.Log.w(str, "%d open video but path is null or mSurface is null", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        try {
            this.f191454q = false;
            this.f191450m = new ph3.k(android.os.Looper.getMainLooper(), false, 0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191449i)) {
                this.f191450m.h(this.f191449i);
            }
            ph3.k kVar2 = this.f191450m;
            ph3.b bVar = this.A;
            if (bVar != null) {
                ph3.o oVar = kVar2.f354428f;
                if (oVar != null) {
                    oVar.f354449l.f354407g = bVar;
                }
            } else {
                kVar2.getClass();
            }
            this.f191450m.q(this.B);
            this.f191450m.p(this.C);
            ph3.k kVar3 = this.f191450m;
            kVar3.f354429g = this.H;
            kVar3.setSurface(this.f191457t);
            this.f191450m.f354428f.f354449l.getClass();
            if (this.f191457t != null) {
                this.f191450m.prepare();
            } else if (this.f191459v) {
                this.f191450m.prepare();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "prepare async error %s", e17.getMessage());
            com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191460w;
            if (a4Var != null) {
                a4Var.onError(-1, -1);
            }
        }
    }

    public void I(android.view.Surface surface) {
        java.util.Objects.toString(surface);
        if (surface != null) {
            surface.hashCode();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.tools.q7(this, surface));
    }

    public void J() {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null || layoutParams.getRule(13) == -1) {
            return;
        }
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void a(double d17, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = java.lang.Double.valueOf(d17);
        objArr[2] = java.lang.Boolean.valueOf(this.f191450m == null);
        com.tencent.mars.xlog.Log.i(this.f191448h, "%d seekTo:%f  play is null?[%b", objArr);
        this.f191456s = z17;
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            kVar.o((int) d17, true);
        }
    }

    public void b(double d17) {
        a(d17, true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean c(android.content.Context context, boolean z17) {
        return start();
    }

    public void finalize() {
        android.view.Surface surface = this.f191457t;
        if (surface == null || !surface.isValid()) {
            return;
        }
        this.f191457t.release();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getCurrentPosition() {
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            return kVar.l();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getDuration() {
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            return (int) kVar.f354428f.f354443f;
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public double getLastProgresstime() {
        return 0.0d;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public long getLastSurfaceUpdateTime() {
        return this.f191458u;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    /* renamed from: getVideoPath */
    public java.lang.String getF174598m() {
        return this.f191449i;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean isPlaying() {
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            return kVar.n();
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void onDetach() {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View.getDefaultSize(1, i17);
        android.view.View.getDefaultSize(1, i18);
        if (this.f191452o == 0 || this.f191451n == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f191452o;
        int i27 = this.f191451n;
        com.tencent.mm.pluginsdk.ui.tools.o8 o8Var = this.f191447J;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        int i28 = o8Var.f191818g;
        int i29 = o8Var.f191819h;
        int i37 = this.f191453p;
        if (i37 == 90 || i37 == 270) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.set(getMatrix());
            float f17 = i28;
            float f18 = f17 / 2.0f;
            float f19 = i29;
            float f27 = f19 / 2.0f;
            float f28 = f19 / f17;
            if (getScaleX() != 1.0f || getScaleY() != 1.0f) {
                matrix.setScale(getScaleX(), getScaleY(), f18, f27);
            }
            matrix.postRotate(this.f191453p, f18, f27);
            matrix.postScale(1.0f / f28, f28, f18, f27);
            setTransform(matrix);
        }
        setMeasuredDimension(i28, i29);
    }

    public void pause() {
        ph3.k kVar = this.f191450m;
        if (kVar != null && kVar.n()) {
            this.f191450m.pause();
        }
        this.D = false;
        this.f191456s = false;
    }

    public void setForceScaleFullScreen(boolean z17) {
        this.f191447J.f191812a = z17;
    }

    public void setIOnlineCache(ph3.b bVar) {
        this.A = bVar;
    }

    public void setIsOnlineVideoType(boolean z17) {
        this.C = z17;
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            kVar.p(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setLoop(boolean z17) {
    }

    public void setMute(boolean z17) {
        this.f191455r = z17;
        try {
            if (this.f191450m != null) {
                com.tencent.mars.xlog.Log.i(this.f191448h, "%d set mute [%b]", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
                this.f191450m.setMute(z17);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void setNeedOperateSurfaceTexture(boolean z17) {
        this.G = z17;
    }

    public void setNeedResetExtractor(boolean z17) {
        this.B = z17;
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            kVar.q(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnInfoCallback(com.tencent.mm.pluginsdk.ui.tools.b4 b4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var) {
        this.f191462y = c4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSurfaceCallback(com.tencent.mm.pluginsdk.ui.tools.d4 d4Var) {
        this.f191463z = d4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOneTimeVideoTextureUpdateCallback(com.tencent.mm.pluginsdk.ui.tools.e4 e4Var) {
        this.f191461x = e4Var;
    }

    public void setOpenWithNoneSurface(boolean z17) {
        this.f191459v = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setPlayProgressCallback(boolean z17) {
    }

    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        if (this.f191447J.d(e1Var)) {
            requestLayout();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setThumb(android.graphics.Bitmap bitmap) {
    }

    public void setUseMp4Extrator(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 a4Var) {
        this.f191460w = a4Var;
    }

    public void setVideoPath(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f191448h, "%d set video path [%s]", java.lang.Integer.valueOf(hashCode()), str);
        this.f191449i = str;
        H();
        requestLayout();
    }

    public boolean start() {
        ph3.k kVar = this.f191450m;
        java.lang.String str = this.f191448h;
        if (kVar == null || !this.f191454q) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            objArr[1] = java.lang.Boolean.valueOf(this.f191450m == null);
            objArr[2] = java.lang.Boolean.valueOf(this.f191454q);
            com.tencent.mars.xlog.Log.w(str, "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[4];
        objArr2[0] = java.lang.Integer.valueOf(hashCode());
        objArr2[1] = java.lang.Boolean.valueOf(this.E);
        objArr2[2] = java.lang.Boolean.valueOf(this.D);
        objArr2[3] = java.lang.Boolean.valueOf(this.f191457t != null);
        com.tencent.mars.xlog.Log.i(str, "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", objArr2);
        if (this.f191457t == null) {
            this.D = true;
            return true;
        }
        if (!this.E) {
            this.f191450m.start();
            return true;
        }
        this.D = true;
        this.E = false;
        setMute(this.f191455r);
        return true;
    }

    public void stop() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(this.f191448h, "%d player stop [%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        ph3.k kVar = this.f191450m;
        if (kVar != null) {
            kVar.f354429g = null;
            kVar.stop();
            this.f191450m.release();
            this.f191450m = null;
        }
        this.f191453p = 0;
        this.f191451n = 0;
        this.f191452o = 0;
        this.f191447J.c();
        this.f191454q = false;
        this.f191449i = null;
        this.f191458u = 0L;
    }

    public VideoPlayerTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f191448h = "MicroMsg.VideoPlayerTextureView@" + hashCode();
        this.f191453p = 0;
        this.f191454q = false;
        this.f191456s = true;
        this.f191458u = 0L;
        this.f191459v = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.G = false;
        this.H = new com.tencent.mm.pluginsdk.ui.tools.o7(this);
        com.tencent.mm.pluginsdk.ui.tools.p7 p7Var = new com.tencent.mm.pluginsdk.ui.tools.p7(this);
        this.I = p7Var;
        this.f191447J = new com.tencent.mm.pluginsdk.ui.tools.o8();
        this.f191452o = 0;
        this.f191451n = 0;
        setSurfaceTextureListener(p7Var);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
