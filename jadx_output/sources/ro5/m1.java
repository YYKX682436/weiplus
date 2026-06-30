package ro5;

/* loaded from: classes14.dex */
public final class m1 {
    public static final ro5.c0 C = new ro5.c0(null);
    public int A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final so5.a0 f398239a;

    /* renamed from: b, reason: collision with root package name */
    public final so5.z f398240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398241c;

    /* renamed from: d, reason: collision with root package name */
    public final xo5.n f398242d;

    /* renamed from: e, reason: collision with root package name */
    public int f398243e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f398244f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f398245g;

    /* renamed from: h, reason: collision with root package name */
    public ro5.d0 f398246h;

    /* renamed from: i, reason: collision with root package name */
    public final ep5.d f398247i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f398248j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f398249k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f398250l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f398251m;

    /* renamed from: n, reason: collision with root package name */
    public final zo5.l f398252n;

    /* renamed from: o, reason: collision with root package name */
    public final zo5.k f398253o;

    /* renamed from: p, reason: collision with root package name */
    public final zo5.i f398254p;

    /* renamed from: q, reason: collision with root package name */
    public final zo5.i f398255q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f398256r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f398257s;

    /* renamed from: t, reason: collision with root package name */
    public final to5.c f398258t;

    /* renamed from: u, reason: collision with root package name */
    public final yo5.h f398259u;

    /* renamed from: v, reason: collision with root package name */
    public final so5.y f398260v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f398261w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f398262x;

    /* renamed from: y, reason: collision with root package name */
    public final android.util.SparseArray f398263y;

    /* renamed from: z, reason: collision with root package name */
    public ro5.e0 f398264z;

    public m1(so5.a0 hwCodecManager, so5.z codecParamsChange, java.util.List list) {
        kotlin.jvm.internal.o.g(hwCodecManager, "hwCodecManager");
        kotlin.jvm.internal.o.g(codecParamsChange, "codecParamsChange");
        this.f398239a = hwCodecManager;
        this.f398240b = codecParamsChange;
        this.f398241c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_ilink_renderhandlerclose, 0);
        xo5.n nVar = new xo5.n();
        this.f398242d = nVar;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        int i17 = s26.a.f402368f;
        kotlinx.coroutines.l.d(a17, null, null, new ro5.s0(this, s26.c.e(2, s26.d.f402372g), null), 3, null);
        this.f398244f = a17;
        kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        jz5.h.b(new ro5.w0(this));
        this.f398247i = new ep5.d();
        this.f398250l = new java.util.concurrent.ConcurrentHashMap();
        this.f398252n = new zo5.l();
        this.f398253o = new zo5.k();
        this.f398254p = new zo5.i();
        this.f398255q = new zo5.i();
        jz5.i iVar = jz5.i.f302831f;
        this.f398256r = jz5.h.a(iVar, ro5.t0.f398297d);
        this.f398257s = jz5.h.a(iVar, ro5.g1.f398200d);
        to5.c cVar = new to5.c(nVar.f455801o, new ro5.i0(this));
        this.f398258t = cVar;
        yo5.h hVar = new yo5.h();
        this.f398259u = hVar;
        this.f398260v = new so5.y(false, true, true, hwCodecManager, cVar, nVar.f455802p, hVar, list, new ro5.k1(this));
        this.f398261w = jz5.h.a(iVar, new ro5.l1(this));
        this.f398262x = jz5.h.a(iVar, new ro5.m0(this));
        this.f398263y = new android.util.SparseArray();
        ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).getClass();
        this.B = e50.j1.f249508a.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(ro5.m1 m1Var, int i17, dp5.d dVar, yz5.p pVar) {
        android.util.Size size;
        android.opengl.EGLSurface eGLSurface;
        boolean z17;
        android.util.Size size2;
        android.util.Size size3;
        java.util.Objects.toString(m1Var.f398242d.f455802p.b(i17, "texture"));
        bp5.g b17 = m1Var.f398242d.f455802p.b(i17, "texture");
        if (b17 == null) {
            return false;
        }
        b17.toString();
        bp5.h a17 = b17.a();
        java.lang.Boolean bool = null;
        bool = null;
        bool = null;
        java.util.Objects.toString(a17 != null ? a17.getSize() : null);
        bp5.h a18 = b17.a();
        if (a18 != null && (size3 = a18.getSize()) != null) {
            size3.getHeight();
        }
        bp5.h a19 = b17.a();
        if (a19 != null && (size2 = a19.getSize()) != null) {
            size2.getWidth();
        }
        bp5.h a27 = b17.a();
        if (a27 != null && (size = a27.getSize()) != null) {
            android.util.Size size4 = (size.getHeight() > 0 && size.getWidth() > 0) != false ? size : null;
            if (size4 != null) {
                bp5.h a28 = b17.a();
                if ((a28 != null && a28.getNeedRecreate()) != false) {
                    if (b17.f23464c != null) {
                        android.opengl.EGLDisplay eGLDisplay = dVar.f242280a;
                        android.opengl.EGLSurface eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
                        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, dVar.f242282c);
                        android.opengl.EGLDisplay eGLDisplay2 = b17.f23465d;
                        android.opengl.EGLSurface eGLSurface3 = b17.f23464c;
                        if (eGLSurface3 == null) {
                            eGLSurface3 = android.opengl.EGL14.EGL_NO_SURFACE;
                        }
                        boolean eglDestroySurface = android.opengl.EGL14.eglDestroySurface(eGLDisplay2, eGLSurface3);
                        if (eglDestroySurface) {
                            b17.f23464c = android.opengl.EGL14.EGL_NO_SURFACE;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "checkRenderTargetSurface release surface result " + eglDestroySurface);
                    }
                    bp5.h a29 = b17.a();
                    if (a29 != null) {
                        a29.setNeedRecreate(false);
                    }
                }
                if (b17.f23466e && ((eGLSurface = b17.f23464c) == null || kotlin.jvm.internal.o.b(eGLSurface, android.opengl.EGL14.EGL_NO_SURFACE))) {
                    bp5.h a37 = b17.a();
                    if ((a37 != null ? a37.getRenderTarget() : null) != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "eglCreateSurface for " + b17);
                        bp5.h a38 = b17.a();
                        java.lang.Object renderTarget = a38 != null ? a38.getRenderTarget() : null;
                        if (renderTarget == null) {
                            z17 = true;
                        } else {
                            try {
                                z17 = renderTarget instanceof android.view.Surface;
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "eglCreateSurface failed " + renderTarget, e17);
                            }
                        }
                        if (z17) {
                            android.view.Surface surface = (android.view.Surface) renderTarget;
                            if (((surface == null || surface.isValid()) ? false : true) != false) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "eglCreateSurface failed " + renderTarget + " is valid");
                            }
                        }
                        if (renderTarget != null) {
                            dp5.c cVar = dp5.c.f242278a;
                            android.opengl.EGLDisplay mEGLDisplay = dVar.f242280a;
                            kotlin.jvm.internal.o.g(mEGLDisplay, "mEGLDisplay");
                            dp5.b bVar = (dp5.b) dp5.c.f242279b;
                            bVar.getClass();
                            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                            android.opengl.EGL14.eglChooseConfig(mEGLDisplay, bVar.f242277a, 0, eGLConfigArr, 0, 1, new int[1], 0);
                            android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(mEGLDisplay, eGLConfigArr[0], renderTarget, new int[]{12344}, 0);
                            kotlin.jvm.internal.o.f(eglCreateWindowSurface, "eglCreateWindowSurface(...)");
                            b17.f23464c = eglCreateWindowSurface;
                            android.opengl.EGLDisplay eGLDisplay3 = dVar.f242280a;
                            kotlin.jvm.internal.o.g(eGLDisplay3, "<set-?>");
                            b17.f23465d = eGLDisplay3;
                        }
                    }
                }
                bool = java.lang.Boolean.valueOf(((java.lang.Boolean) pVar.invoke(new ro5.h1(b17, dVar), size4)).booleanValue());
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void b(int i17, bp5.h infoHolder) {
        kotlin.jvm.internal.o.g(infoHolder, "infoHolder");
        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "bindRenderTarget mid " + i17 + ", holder " + infoHolder);
        this.f398242d.f455802p.a(i17, infoHolder);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r7, yo5.e r8, yz5.p r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof ro5.o0
            if (r0 == 0) goto L13
            r0 = r10
            ro5.o0 r0 = (ro5.o0) r0
            int r1 = r0.f398272h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398272h = r1
            goto L18
        L13:
            ro5.o0 r0 = new ro5.o0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f398270f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f398272h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.f398269e
            java.lang.Object r8 = r0.f398268d
            ro5.m1 r8 = (ro5.m1) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r10)
            android.util.SparseArray r10 = r6.f398263y
            java.lang.Object r10 = r10.get(r7)
            ro5.f0 r10 = (ro5.f0) r10
            java.lang.String r2 = "MicroMsg.MVR.VoIPMPRenderLogic"
            if (r10 == 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getOesSurfaceTexture: get "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = " from cache"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r2, r4)
            ro5.p0 r4 = new ro5.p0
            r4.<init>(r9, r10)
            android.graphics.SurfaceTexture r10 = r10.f398191a
            r10.setOnFrameAvailableListener(r4)
            if (r10 != 0) goto L94
        L66:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r4 = "getOesSurfaceTexture: gen tex for "
            r10.<init>(r4)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r2, r10)
            ro5.r0 r10 = new ro5.r0
            r2 = 0
            r10.<init>(r6, r9, r2)
            r0.f398268d = r6
            r0.f398269e = r7
            r0.f398272h = r3
            java.lang.Object r10 = kotlinx.coroutines.l.g(r8, r10, r0)
            if (r10 != r1) goto L8a
            return r1
        L8a:
            r8 = r6
        L8b:
            ro5.f0 r10 = (ro5.f0) r10
            android.util.SparseArray r8 = r8.f398263y
            r8.put(r7, r10)
            android.graphics.SurfaceTexture r10 = r10.f398191a
        L94:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.m1.c(int, yo5.e, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r27, int r28, int r29, int r30, boolean r31, er4.r r32, boolean r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.m1.d(int, int, int, int, boolean, er4.r, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, int r6, yo5.e r7, yz5.p r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof ro5.i1
            if (r0 == 0) goto L13
            r0 = r9
            ro5.i1 r0 = (ro5.i1) r0
            int r1 = r0.f398213h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f398213h = r1
            goto L18
        L13:
            ro5.i1 r0 = new ro5.i1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f398211f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f398213h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r6 = r0.f398210e
            java.lang.Object r5 = r0.f398209d
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            ro5.j1 r9 = new ro5.j1
            r9.<init>(r4, r5, r8)
            r0.f398209d = r5
            r0.f398210e = r6
            r0.f398213h = r3
            java.lang.Object r9 = r4.c(r6, r7, r9, r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            android.graphics.SurfaceTexture r9 = (android.graphics.SurfaceTexture) r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "surfaceTextureScope: get "
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r8 = " for "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " with tag "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "MicroMsg.MVR.VoIPMPRenderLogic"
            com.tencent.mars.xlog.Log.i(r6, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.m1.e(java.lang.String, int, yo5.e, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(int i17, bp5.h infoHolder) {
        kotlin.jvm.internal.o.g(infoHolder, "infoHolder");
        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "unbindRenderTarget() called with: memberId = " + i17 + ", infoHolder = " + infoHolder);
        this.f398242d.f455802p.c(i17, infoHolder);
    }
}
