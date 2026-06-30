package km1;

/* loaded from: classes7.dex */
public final class s implements ag.g, ag.c, ag.d, ag.e, gh.r, com.tencent.mm.plugin.appbrand.jsapi.x, com.tencent.mm.plugin.appbrand.jsapi.v, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public static final km1.a E = new km1.a(null);
    public static final boolean F;
    public static final android.util.Size G;
    public final km1.s A;
    public final km1.s B;
    public final km1.s C;
    public final gh.y D;

    /* renamed from: d, reason: collision with root package name */
    public final yf.i0 f309027d;

    /* renamed from: e, reason: collision with root package name */
    public final yf.o f309028e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f309029f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f309030g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f309031h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f309032i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f309033m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.view.Surface f309034n;

    /* renamed from: o, reason: collision with root package name */
    public volatile android.util.Size f309035o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f309036p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f309037q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f309038r;

    /* renamed from: s, reason: collision with root package name */
    public volatile android.graphics.SurfaceTexture f309039s;

    /* renamed from: t, reason: collision with root package name */
    public volatile ts0.r f309040t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.tencent.magicbrush.MagicBrush f309041u;

    /* renamed from: v, reason: collision with root package name */
    public volatile com.tencent.magicbrush.ui.MagicBrushView f309042v;

    /* renamed from: w, reason: collision with root package name */
    public volatile gh.t f309043w;

    /* renamed from: x, reason: collision with root package name */
    public volatile int f309044x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f309045y;

    /* renamed from: z, reason: collision with root package name */
    public final km1.e f309046z;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        F = z65.c.a();
        G = new android.util.Size(-1, -1);
    }

    public s(yf.i0 livePusherBroker, yf.o livePusher) {
        kotlin.jvm.internal.o.g(livePusherBroker, "livePusherBroker");
        kotlin.jvm.internal.o.g(livePusher, "livePusher");
        this.f309027d = livePusherBroker;
        this.f309028e = livePusher;
        java.lang.String str = "MicroMsg.AppBrandVideoCustomRenderProcessor#" + hashCode();
        this.f309029f = str;
        this.f309032i = true;
        this.f309033m = true;
        this.f309035o = G;
        this.f309045y = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f309046z = new km1.e(str);
        new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A = this;
        this.B = this;
        this.C = this;
        this.D = gh.y.VirtualView;
    }

    @Override // ag.e
    public void a(int i17) {
        boolean z17 = F;
        ts0.r rVar = this.f309040t;
        if (rVar != null) {
            rVar.t(true, false, i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        boolean z17 = F;
        s();
        android.graphics.SurfaceTexture surfaceTexture = this.f309039s;
        if (surfaceTexture != null) {
            u(surfaceTexture);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (true == r0.L0()) goto L18;
     */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r3 = this;
            ts0.r r0 = r3.f309040t
            if (r0 == 0) goto L9
            ts0.b r0 = (ts0.b) r0
            r0.H()
        L9:
            ts0.r r0 = r3.f309040t
            if (r0 == 0) goto L10
            r0.release()
        L10:
            r0 = 0
            r3.f309040t = r0
            java.lang.ref.WeakReference r0 = r3.f309030g
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.n7 r0 = (com.tencent.mm.plugin.appbrand.page.n7) r0
            if (r0 == 0) goto L2d
            com.tencent.mm.plugin.appbrand.o6 r0 = r0.getRuntime()
            if (r0 == 0) goto L2d
            boolean r0 = r0.L0()
            r1 = 1
            if (r1 != r0) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 == 0) goto L31
            return
        L31:
            java.lang.ref.WeakReference r0 = r3.f309030g
            if (r0 == 0) goto L62
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.n7 r0 = (com.tencent.mm.plugin.appbrand.page.n7) r0
            if (r0 != 0) goto L3e
            goto L62
        L3e:
            vb1.b r1 = vb1.d.f434473c
            java.lang.String r0 = r0.getAppId()
            java.lang.String r2 = "getAppId(...)"
            kotlin.jvm.internal.o.f(r0, r2)
            vb1.d r0 = r1.a(r0)
            yf.i0 r1 = r3.f309027d
            int r1 = r1.f252497d
            r0.b(r1)
            int r0 = r0.d()
            if (r0 != 0) goto L69
            com.tencent.magicbrush.MagicBrush r0 = r3.f309041u
            if (r0 == 0) goto L69
            r0.e()
            goto L69
        L62:
            java.lang.String r0 = "MicroMsg.AppBrandVideoCustomRenderProcessor"
            java.lang.String r1 = "notifyBackgroundIfCan, insertComponent is null"
            com.tencent.mars.xlog.Log.e(r0, r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.s.c():void");
    }

    @Override // ag.g
    public boolean d(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        if (F) {
            java.util.Objects.toString(invokeContext.c());
        }
        java.lang.String l17 = invokeContext.l();
        if (!(l17 != null && true == r26.n0.B(l17, "operate", false))) {
            return false;
        }
        jc1.d dVar = jc1.f.f298915d;
        org.json.JSONObject c17 = invokeContext.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e(this.f309029f, "onPreOperateJsApiCall, params is null");
        } else {
            if (kotlin.jvm.internal.o.b("switchCamera", c17.optString("type")) && this.f309031h) {
                com.tencent.mars.xlog.Log.i(this.f309029f, "onPreOperateJsApiCall switchCamera");
                ts0.r rVar = this.f309040t;
                if (rVar == null) {
                    return true;
                }
                ((ts0.b) rVar).M();
                return true;
            }
            if (kotlin.jvm.internal.o.b("sendCustomVideoFrame", c17.optString("type"))) {
                if (!this.f309028e.isPushing()) {
                    com.tencent.mars.xlog.Log.i(this.f309029f, "onPreOperateJsApiCall, prevent sendCustomVideoFrame before start pushing");
                    invokeContext.a(jc1.f.f298912a);
                    return true;
                }
                try {
                    int i17 = c17.getInt("bufferId");
                    try {
                        int i18 = c17.getInt("rotation");
                        try {
                            int i19 = c17.getInt("width");
                            try {
                                int i27 = c17.getInt("height");
                                com.tencent.mm.plugin.appbrand.jsruntime.h0 r17 = r();
                                java.nio.ByteBuffer m07 = r17 != null ? ((com.tencent.mm.plugin.appbrand.jsruntime.n) r17).m0(i17) : null;
                                if (m07 == null) {
                                    com.tencent.mars.xlog.Log.e(this.f309029f, "onPreOperateJsApiCall, videoFrameBuffer is null");
                                    invokeContext.d("fail:videoFrameBuffer is null", dVar);
                                    return true;
                                }
                                byte[] bArr = new byte[(int) (i19 * 1.5f * i27)];
                                m07.rewind();
                                m07.get(bArr);
                                this.f309027d.G(new km1.k(this, bArr, i19, i27, i18, invokeContext));
                                return true;
                            } catch (java.lang.Exception unused) {
                                com.tencent.mars.xlog.Log.e(this.f309029f, "onPreOperateJsApiCall, height is null");
                                invokeContext.d("fail:height is null", dVar);
                                return true;
                            }
                        } catch (java.lang.Exception unused2) {
                            com.tencent.mars.xlog.Log.e(this.f309029f, "onPreOperateJsApiCall, width is null");
                            invokeContext.d("fail:width is null", dVar);
                            return true;
                        }
                    } catch (java.lang.Exception unused3) {
                        com.tencent.mars.xlog.Log.e(this.f309029f, "onPreOperateJsApiCall, rotation is null");
                        invokeContext.d("fail:rotation is null", dVar);
                        return true;
                    }
                } catch (java.lang.Exception unused4) {
                    com.tencent.mars.xlog.Log.e(this.f309029f, "onPreOperateJsApiCall, bufferId is null");
                    invokeContext.d("fail:bufferId is null", dVar);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ag.g
    public ag.e e() {
        return this.C;
    }

    @Override // ag.g
    public void f(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        if (F) {
            java.util.Objects.toString(invokeContext.c());
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = invokeContext.m();
        if (m17 instanceof com.tencent.mm.plugin.appbrand.page.n7) {
            this.f309030g = new java.lang.ref.WeakReference(m17);
            w(invokeContext);
            q();
        }
    }

    @Override // ag.g
    public void g(android.util.Size size) {
        android.view.Surface surface;
        kotlin.jvm.internal.o.g(size, "size");
        if (F) {
            size.toString();
        }
        this.f309035o = size;
        gh.t tVar = this.f309043w;
        if (tVar != null && (surface = this.f309034n) != null) {
            com.tencent.mars.xlog.Log.i(this.f309029f, "notifyPreviewSurfaceSizeUpdateIfCan, do notify");
            tVar.c(surface, size.getWidth(), size.getHeight());
        }
        q();
        p(size);
    }

    @Override // gh.r
    public java.lang.Object getSurface() {
        return gh.q.a(this);
    }

    @Override // gh.r
    public android.view.View getThisView() {
        return null;
    }

    @Override // gh.r
    public gh.y getViewType() {
        return this.D;
    }

    @Override // ag.g
    public void h(android.view.Surface previewSurface) {
        kotlin.jvm.internal.o.g(previewSurface, "previewSurface");
        if (F) {
            previewSurface.toString();
        }
        this.f309034n = previewSurface;
        t();
        q();
    }

    @Override // ag.c
    public void i(int i17) {
        boolean z17 = F;
        this.f309044x = i17;
    }

    @Override // ag.g
    public ag.d j() {
        return this.B;
    }

    @Override // ag.g
    public void k() {
        android.view.Surface surface;
        boolean z17 = F;
        v(false, null);
        gh.t tVar = this.f309043w;
        if (tVar != null && (surface = this.f309034n) != null) {
            com.tencent.mars.xlog.Log.i(this.f309029f, "notifyPreviewSurfaceReleaseIfCan, do notify");
            tVar.a(surface, false);
        }
        this.f309034n = null;
    }

    @Override // ag.g
    public void l(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        if (F) {
            java.util.Objects.toString(invokeContext.c());
        }
        if (w(invokeContext)) {
            q();
        }
    }

    @Override // ag.d
    public void m(android.graphics.PointF pos) {
        ts0.r rVar;
        kotlin.jvm.internal.o.g(pos, "pos");
        if (F) {
            pos.toString();
        }
        android.util.Size size = kotlin.jvm.internal.o.b(G, this.f309035o) ? null : this.f309035o;
        if (size == null || (rVar = this.f309040t) == null) {
            return;
        }
        rVar.y(rVar.m(pos.x, pos.y, 1.25f, size.getWidth(), size.getHeight()), rVar.m(pos.x, pos.y, 1.0f, size.getWidth(), size.getHeight()));
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.tencent.magicbrush.MBRuntime runtime) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        if (F) {
            runtime.toString();
        }
    }

    @Override // ag.g
    public ag.c o() {
        return this.A;
    }

    @Override // gh.r
    public void onDestroy() {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        if (F) {
            java.util.Objects.toString(surfaceTexture);
        }
        if (!this.f309031h) {
            com.tencent.mars.xlog.Log.i(this.f309029f, "onFrameAvailable, videoCustomRender is not enable");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f309030g;
        if (weakReference == null || (n7Var = (com.tencent.mm.plugin.appbrand.page.n7) weakReference.get()) == null) {
            return;
        }
        int i17 = this.f309027d.f252497d;
        int i18 = this.f309044x;
        km1.e eVar = this.f309046z;
        eVar.getClass();
        com.tencent.mm.plugin.appbrand.jsruntime.t a17 = km1.u.a(n7Var);
        if (a17 == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) a17.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
            return;
        }
        km1.b bVar = new km1.b();
        bVar.t(kz5.c1.k(new jz5.l("livePusherId", java.lang.Integer.valueOf(i17)), new jz5.l("deviceOrientationRotation", java.lang.Integer.valueOf(i18))));
        km1.f fVar = eVar.f308996b;
        fVar.getClass();
        fVar.f308997a = bVar;
        final km1.d dVar = new km1.d(eVar, n7Var);
        f0Var.post(new java.lang.Runnable(dVar) { // from class: km1.t

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f309047d;

            {
                kotlin.jvm.internal.o.g(dVar, "function");
                this.f309047d = dVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f309047d.invoke();
            }
        });
    }

    public final void p(android.util.Size size) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        com.tencent.mm.plugin.appbrand.jsruntime.t a17;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        java.lang.ref.WeakReference weakReference = this.f309030g;
        if (weakReference == null || (n7Var = (com.tencent.mm.plugin.appbrand.page.n7) weakReference.get()) == null || (a17 = km1.u.a(n7Var)) == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) a17.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
            return;
        }
        f0Var.post(new km1.h(this, size, n7Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r5 = this;
            boolean r0 = r5.f309031h
            android.util.Size r1 = r5.f309035o
            km1.j r2 = new km1.j
            r2.<init>(r0, r1, r5)
            boolean r0 = r5.f309031h
            boolean r1 = r5.f309036p
            if (r0 != r1) goto L10
            goto L42
        L10:
            if (r0 == 0) goto L23
            yf.o r1 = r5.f309028e
            boolean r1 = r1.isPushing()
            if (r1 == 0) goto L23
            java.lang.String r1 = r5.f309029f
            java.lang.String r3 = "configCustomVideoCaptureIfNeed, already push, can not enable"
            com.tencent.mars.xlog.Log.e(r1, r3)
            r1 = 0
            goto L43
        L23:
            java.lang.String r1 = r5.f309029f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "configCustomVideoCaptureIfNeed, do enable: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r1, r3)
            yf.i0 r1 = r5.f309027d
            km1.g r3 = new km1.g
            r3.<init>(r5, r0)
            r1.G(r3)
            r5.f309036p = r0
        L42:
            r1 = 1
        L43:
            if (r1 == 0) goto L49
            r5.v(r0, r2)
            goto L4e
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.invoke(r0)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.s.q():void");
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.h0 r() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        com.tencent.mm.plugin.appbrand.jsruntime.t a17;
        java.lang.ref.WeakReference weakReference = this.f309030g;
        if (weakReference == null || (n7Var = (com.tencent.mm.plugin.appbrand.page.n7) weakReference.get()) == null || (a17 = km1.u.a(n7Var)) == null) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.jsruntime.h0) a17.h0(com.tencent.mm.plugin.appbrand.jsruntime.h0.class);
    }

    public final void s() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        com.tencent.magicbrush.MagicBrush magicBrush;
        java.lang.ref.WeakReference weakReference = this.f309030g;
        if (weakReference == null || (n7Var = (com.tencent.mm.plugin.appbrand.page.n7) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandVideoCustomRenderProcessor", "notifyForegroundIfCan, insertComponent is null");
            return;
        }
        vb1.b bVar = vb1.d.f434473c;
        java.lang.String appId = n7Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vb1.d a17 = bVar.a(appId);
        a17.c(this.f309027d.f252497d);
        if (a17.d() != 1 || (magicBrush = this.f309041u) == null) {
            return;
        }
        magicBrush.f();
    }

    @Override // gh.r
    public void setSurfaceListener(gh.t tVar) {
        if (F) {
            java.util.Objects.toString(tVar);
        }
        this.f309043w = tVar;
        t();
    }

    public final void t() {
        gh.t tVar;
        android.view.Surface surface;
        if (this.f309042v == null || (tVar = this.f309043w) == null || (surface = this.f309034n) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f309029f, "notifyPreviewSurfaceReadyIfCan, do notify");
        gh.s.a(tVar, surface, this.f309035o.getWidth(), this.f309035o.getHeight(), false, false, 16, null);
    }

    public final void u(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        if (F) {
            java.util.Objects.toString(surfaceTexture);
        }
        if (this.f309040t != null) {
            com.tencent.mars.xlog.Log.i(this.f309029f, "startCameraPreview, already started");
            return;
        }
        boolean z17 = this.f309033m;
        ts0.s sVar = (ts0.s) i95.n0.c(ts0.s.class);
        if (sVar == null) {
            com.tencent.mars.xlog.Log.i(this.f309029f, "startCameraPreview, camera is null");
            return;
        }
        ts0.r wi6 = ((mr0.a) sVar).wi(z17, false, false, true, false);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        wi6.c(context, !z17);
        wi6.p(surfaceTexture, false, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
        wi6.B(20);
        this.f309040t = wi6;
        java.lang.ref.WeakReference weakReference = this.f309030g;
        com.tencent.mm.plugin.appbrand.o6 runtime = (weakReference == null || (n7Var = (com.tencent.mm.plugin.appbrand.page.n7) weakReference.get()) == null) ? null : n7Var.getRuntime();
        if (runtime != null) {
            com.tencent.mm.autogen.mmdata.rpt.WAEnableVideoCustomRenderStruct wAEnableVideoCustomRenderStruct = new com.tencent.mm.autogen.mmdata.rpt.WAEnableVideoCustomRenderStruct();
            wAEnableVideoCustomRenderStruct.f61939d = wAEnableVideoCustomRenderStruct.b("Appid", runtime.f74803n, true);
            wAEnableVideoCustomRenderStruct.f61940e = wAEnableVideoCustomRenderStruct.b("Username", runtime.n0(), true);
            wAEnableVideoCustomRenderStruct.f61941f = runtime.d2();
            wAEnableVideoCustomRenderStruct.f61942g = runtime.f74805p.f77281g;
            wAEnableVideoCustomRenderStruct.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(boolean r8, yz5.l r9) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.s.v(boolean, yz5.l):void");
    }

    public final boolean w(sf.f fVar) {
        boolean z17 = this.f309031h;
        org.json.JSONObject c17 = fVar.c();
        boolean optBoolean = c17 != null ? c17.optBoolean("enableVideoCustomRender", z17) : z17;
        boolean z18 = this.f309032i;
        org.json.JSONObject c18 = fVar.c();
        boolean optBoolean2 = c18 != null ? c18.optBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, z18) : z18;
        java.lang.String str = this.f309033m ? "front" : "back";
        org.json.JSONObject c19 = fVar.c();
        java.lang.String optString = c19 != null ? c19.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, str) : null;
        if (optString == null) {
            optString = str;
        }
        boolean b17 = kotlin.jvm.internal.o.b("front", optString);
        boolean z19 = (optBoolean == z17 && optBoolean2 == z18 && kotlin.jvm.internal.o.b(optString, str)) ? false : true;
        this.f309031h = optBoolean;
        this.f309032i = optBoolean2;
        this.f309033m = b17;
        com.tencent.mars.xlog.Log.i(this.f309029f, "updateConfig, enableVideoCustomRender: " + optBoolean + ", enableCameraPreview: " + optBoolean2 + ", useFrontCamera: " + b17 + ", isConfigUpdated: " + z19);
        if (z19) {
            if (optBoolean && optBoolean2) {
                com.tencent.mars.xlog.Log.i(this.f309029f, "override enableCameraPreview to false");
                org.json.JSONObject c27 = fVar.c();
                if (c27 != null) {
                    c27.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, false);
                }
            } else if (!optBoolean && optBoolean2) {
                com.tencent.mars.xlog.Log.i(this.f309029f, "recover enableCameraPreview to true");
                org.json.JSONObject c28 = fVar.c();
                if (c28 != null) {
                    c28.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, true);
                }
            }
        }
        return z19;
    }
}
