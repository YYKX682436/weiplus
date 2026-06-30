package dr4;

/* loaded from: classes14.dex */
public final class p1 {
    public final dr4.v0 A;
    public final java.util.concurrent.ConcurrentHashMap B;
    public long C;
    public boolean D;
    public int E;
    public final long F;
    public int G;
    public com.tencent.mm.sdk.platformtools.b4 H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public final dr4.y0 f242701J;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f242702a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f242703b;

    /* renamed from: c, reason: collision with root package name */
    public xq4.a f242704c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f242705d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f242706e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242707f = true;

    /* renamed from: g, reason: collision with root package name */
    public dr4.x1 f242708g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242709h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f242710i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f242711j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f242712k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f242713l;

    /* renamed from: m, reason: collision with root package name */
    public final int f242714m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f242715n;

    /* renamed from: o, reason: collision with root package name */
    public final rq4.m f242716o;

    /* renamed from: p, reason: collision with root package name */
    public int f242717p;

    /* renamed from: q, reason: collision with root package name */
    public int f242718q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f242719r;

    /* renamed from: s, reason: collision with root package name */
    public dr4.i f242720s;

    /* renamed from: t, reason: collision with root package name */
    public final dr4.p0 f242721t;

    /* renamed from: u, reason: collision with root package name */
    public final long f242722u;

    /* renamed from: v, reason: collision with root package name */
    public y03.g f242723v;

    /* renamed from: w, reason: collision with root package name */
    public di3.d f242724w;

    /* renamed from: x, reason: collision with root package name */
    public final dr4.a f242725x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f242726y;

    /* renamed from: z, reason: collision with root package name */
    public final dr4.z0 f242727z;

    public p1(boolean z17, boolean z18) {
        this.f242702a = z17;
        this.f242703b = z18;
        vq4.b0 b0Var = vq4.b0.f439270a;
        int i17 = 0;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_encode_thread_independence_new, false);
        boolean c17 = vq4.b0.c();
        this.f242713l = vq4.b0.p();
        if (bm5.o1.f22719a.g(bm5.h0.RepairerConfig_VOIP_CameraChangePreviewSizeLow_Int, 0) == 0) {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_temperature_threshold, 38);
        }
        this.f242714m = i17;
        this.f242715n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_render_mgr_update_render_size, true);
        this.f242716o = new rq4.m();
        this.f242721t = new dr4.p0();
        long j17 = 10000;
        this.f242722u = j17;
        this.f242725x = new dr4.a(new dr4.o1(this));
        this.f242726y = jz5.h.b(dr4.a1.f242590d);
        this.f242727z = new dr4.z0(this);
        this.A = new dr4.v0(this);
        this.B = new java.util.concurrent.ConcurrentHashMap();
        if (vq4.b0.f439280k) {
            this.C = android.os.SystemClock.elapsedRealtime();
            if (fj6) {
                e("ENCODE", new pq4.c("encode"));
            }
            qq4.b wi6 = gq4.v.wi();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            wi6.f365983q = java.lang.System.currentTimeMillis();
            e("CAMERA", new pq4.c("camera"));
            e("DECODE", new pq4.c("decode"));
            if (c17) {
                e("DECODE_INDEPENDENCE", new pq4.c("D-Independence"));
            }
        } else {
            if (fj6) {
                gq4.v.wi().a("ENCODE", new pq4.c("encode"));
            }
            gq4.v.wi().f365983q = java.lang.System.currentTimeMillis();
            gq4.v.wi().a("CAMERA", new pq4.c("camera"));
            gq4.v.wi().a("DECODE", new pq4.c("decode"));
            if (c17) {
                gq4.v.wi().a("DECODE_INDEPENDENCE", new pq4.c("D-Independence"));
            }
            f();
        }
        this.F = j17;
        this.f242701J = new dr4.y0(this);
        vq4.b0.j();
    }

    public static final void a(dr4.p1 p1Var, dr4.c0 c0Var, boolean z17) {
        xq4.a aVar;
        android.util.Size size;
        p1Var.getClass();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIPRenderMgr", "bindCameraRenderer", new java.lang.Object[0]);
        if (!p1Var.f242706e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "setCameraCaptureBind,  isFace: %s", java.lang.Boolean.valueOf(z17));
            android.util.Size d17 = p1Var.d();
            if (p1Var.f242704c == null) {
                p1Var.f242704c = new zq4.b(d17.getWidth(), d17.getHeight());
            }
        }
        android.graphics.SurfaceTexture surfaceTexture = c0Var.f242603f;
        if (surfaceTexture == null || (aVar = p1Var.f242704c) == null) {
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPRenderMgr", "camera start failed casue no permisson");
            return;
        }
        if (!p1Var.f242703b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPRenderMgr", "camera not allow to start cause not ready ");
            return;
        }
        boolean z18 = aVar.b(p1Var.f242701J, z17) == 1;
        p1Var.f242707f = z18;
        if (z18) {
            zq4.b bVar = (zq4.b) aVar;
            bVar.f475054n = surfaceTexture;
            gq4.v.Bi().J(bVar.f475043c);
            xq4.a aVar2 = p1Var.f242704c;
            if (aVar2 == null || bVar.f475046f == null) {
                return;
            }
            aVar2.c();
            p1Var.f242706e = true;
            xq4.a aVar3 = p1Var.f242704c;
            if (aVar3 == null || (size = ((zq4.b) aVar3).f475046f) == null) {
                return;
            }
            p1Var.p(size);
        }
    }

    public static final void b(dr4.p1 p1Var) {
        y03.f fVar;
        y03.f fVar2;
        if (p1Var.f242712k) {
            return;
        }
        y03.g gVar = p1Var.f242723v;
        final y03.h hVar = null;
        final y03.h hVar2 = (gVar == null || (fVar2 = ((b13.f) gVar).f17100e) == null) ? null : fVar2.f458640c;
        if (hVar2 == null) {
            return;
        }
        android.graphics.SurfaceTexture st6 = hVar2.f458644d;
        kotlin.jvm.internal.o.f(st6, "st");
        boolean z17 = false;
        dr4.q qVar = new dr4.q(st6, 0, 0);
        dr4.x1 x1Var = p1Var.f242708g;
        if (!(x1Var != null && x1Var.b(qVar))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPRenderMgr", "create surface failed");
            return;
        }
        dr4.x1 x1Var2 = p1Var.f242708g;
        if (x1Var2 != null) {
            x1Var2.a(qVar, 0);
        }
        p1Var.k(qVar, 0);
        dr4.x1 x1Var3 = p1Var.f242708g;
        if (x1Var3 != null) {
            x1Var3.d();
        }
        dr4.p0 p0Var = p1Var.f242721t;
        dr4.o0 o0Var = p0Var.f242699a;
        o0Var.f242694a = st6;
        o0Var.f242695b = qVar;
        dr4.k1 k1Var = new dr4.k1(p1Var, qVar);
        hVar2.f458645e = k1Var;
        k1Var.c(hVar2.f458644d);
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: y03.h$$a
            @Override // java.lang.Runnable
            public final void run() {
                y03.h.this.f458647g.g(androidx.lifecycle.n.STARTED);
            }
        });
        y03.g gVar2 = p1Var.f242723v;
        if (gVar2 != null && (fVar = ((b13.f) gVar2).f17101f) != null) {
            hVar = fVar.f458640c;
        }
        if (hVar == null) {
            return;
        }
        android.graphics.SurfaceTexture st7 = hVar.f458644d;
        kotlin.jvm.internal.o.f(st7, "st");
        dr4.q qVar2 = new dr4.q(st7, 0, 0);
        dr4.x1 x1Var4 = p1Var.f242708g;
        if (x1Var4 != null && x1Var4.b(qVar2)) {
            z17 = true;
        }
        if (z17) {
            dr4.x1 x1Var5 = p1Var.f242708g;
            if (x1Var5 != null) {
                x1Var5.a(qVar2, 1);
            }
            p1Var.k(qVar2, 1);
            dr4.o0 o0Var2 = p0Var.f242700b;
            o0Var2.f242694a = st7;
            o0Var2.f242695b = qVar2;
            dr4.l1 l1Var = new dr4.l1(p1Var, qVar2);
            hVar.f458645e = l1Var;
            l1Var.c(hVar.f458644d);
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: y03.h$$a
                @Override // java.lang.Runnable
                public final void run() {
                    y03.h.this.f458647g.g(androidx.lifecycle.n.STARTED);
                }
            });
            p1Var.f242712k = true;
        }
    }

    public final void c() {
        int i17;
        int l17 = com.tencent.mm.ui.bl.l(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (l17 != 0) {
            if (l17 == 1) {
                i17 = 90;
            } else if (l17 == 2) {
                i17 = 180;
            } else if (l17 == 3) {
                i17 = 270;
            }
            this.f242717p = i17;
            rq4.m mVar = this.f242716o;
            mVar.b(true, i17);
            mVar.f399016a.a(25);
        }
        i17 = 0;
        this.f242717p = i17;
        rq4.m mVar2 = this.f242716o;
        mVar2.b(true, i17);
        mVar2.f399016a.a(25);
    }

    public final android.util.Size d() {
        wo.d dVar;
        int i17;
        int i18;
        wo.d dVar2;
        int i19;
        int i27;
        android.util.Size j17 = vq4.b0.j();
        if (j17 != null) {
            return j17;
        }
        int e17 = vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int a17 = wo.r.a();
        boolean z17 = (((e17 >= 4 && (a17 & 1024) != 0 && (a17 & 255) >= 26) && (a17 & 255) >= 30) && (a17 & 255) >= 60) && com.tencent.mm.plugin.voip.model.v2protocal.f();
        wo.e eVar = wo.v1.f447822b;
        int i28 = eVar.D;
        int i29 = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        int i37 = 1280;
        boolean z18 = i28 == 2 || ((i17 = (dVar = eVar.f447664i).f447648f) != 0 && i17 < 1280 && (i18 = dVar.f447649g) != 0 && i18 < 720 && (i19 = (dVar2 = eVar.f447666k).f447648f) != 0 && i19 < 1280 && (i27 = dVar2.f447649g) != 0 && i27 < 720);
        int i38 = eVar.F;
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_hwparam_for_mac, 0);
        boolean z19 = eVar.G == 1 || z17;
        boolean z27 = i38 == 1 || z17;
        if (z18) {
            vq4.d0.c("MicroMsg.VoipRendererHelper", "hseasun:Close the 720p force due to configuration from svr");
            z27 = false;
            z19 = false;
        }
        if (bm5.o1.f22719a.g(bm5.h0.RepairerConfig_VOIP_ForceHardEncode_Int, 0) == 3) {
            z19 = true;
        }
        if (!(z19 ? true : z27)) {
            i37 = 640;
            i29 = 480;
        }
        return new android.util.Size(i37, i29);
    }

    public final void e(java.lang.String type, pq4.c thread) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(thread, "thread");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "generateThread new ".concat(type));
        this.B.put(type + '_' + this.C, thread);
    }

    public final void f() {
        di3.d dVar = new di3.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f242724w = dVar;
        dVar.f232689g = new dr4.b1(this);
        dVar.enable();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), true, this.f242725x);
        ((android.hardware.display.DisplayManager) ((jz5.n) this.f242726y).getValue()).registerDisplayListener(this.f242727z, null);
        android.util.Size d17 = d();
        dr4.x1 x1Var = new dr4.x1(dr4.c1.f242616d);
        this.f242708g = x1Var;
        int width = d17.getWidth();
        int height = d17.getHeight();
        yz5.p pVar = x1Var.f242761a;
        x1Var.f242762b = new dr4.c0(width, height, pVar);
        x1Var.f242763c = new dr4.d2(true, pVar);
        x1Var.f242764d = new dr4.n0(pVar);
        x1Var.f242765e = new dr4.h(pVar);
        dr4.x1 x1Var2 = this.f242708g;
        if (x1Var2 != null) {
            dr4.d1 d1Var = new dr4.d1(this);
            dr4.d2 d2Var = x1Var2.f242763c;
            if (d2Var != null) {
                d2Var.f242693s = d1Var;
            }
            dr4.n0 n0Var = x1Var2.f242764d;
            if (n0Var != null) {
                n0Var.f242693s = d1Var;
            }
            dr4.h hVar = x1Var2.f242765e;
            if (hVar != null) {
                hVar.f242693s = d1Var;
            }
        }
        dr4.c0 c0Var = x1Var2 != null ? x1Var2.f242762b : null;
        if (c0Var != null) {
            c0Var.f242613p = new dr4.e1(this);
        }
        if (x1Var2 != null) {
            dr4.g1 g1Var = new dr4.g1(this);
            dr4.c0 c0Var2 = x1Var2.f242762b;
            if (c0Var2 != null) {
                c0Var2.b(new dr4.r(c0Var2, new dr4.s1(x1Var2, g1Var)));
            }
            dr4.c0 c0Var3 = x1Var2.f242762b;
            if (c0Var3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "start");
                c0Var3.b(new dr4.y(c0Var3));
            }
        }
        c();
        vq4.a0 a0Var = vq4.a0.f439264a;
        vq4.a0.f439267d = 0;
        vq4.a0.f439265b = 0;
        vq4.a0.f439266c = 0;
        vq4.a0.f439269f = vq4.b0.k();
        if (vq4.b0.f439279j) {
            this.A.alive();
        }
    }

    public final boolean g() {
        long j17 = this.I;
        if (j17 == 0) {
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - j17 <= this.F) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "current camera is open but has no video ");
        return true;
    }

    public final boolean h() {
        long j17 = this.I;
        if (j17 == 0) {
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - j17 <= this.F) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "current camera is open but has no video ");
        return true;
    }

    public final void i(boolean z17) {
        if (!z17) {
            dr4.x1 x1Var = this.f242708g;
            if (x1Var != null) {
                x1Var.d();
                return;
            }
            return;
        }
        dr4.x1 x1Var2 = this.f242708g;
        if (x1Var2 != null) {
            dr4.n0 n0Var = x1Var2.f242764d;
            if (n0Var != null) {
                com.tencent.mm.sdk.platformtools.Log.c(n0Var.f242678d, "pauseRender", new java.lang.Object[0]);
                n0Var.f242679e = false;
            }
            dr4.d2 d2Var = x1Var2.f242763c;
            if (d2Var != null) {
                com.tencent.mm.sdk.platformtools.Log.c(d2Var.f242678d, "pauseRender", new java.lang.Object[0]);
                d2Var.f242679e = false;
            }
        }
    }

    public final void j(dr4.q renderGLSurface, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(renderGLSurface, "renderGLSurface");
        renderGLSurface.d(0, 0, i17, i18);
        dr4.x1 x1Var = this.f242708g;
        if (x1Var != null) {
            dr4.d2 d2Var = x1Var.f242763c;
            if (d2Var != null) {
                if (i19 == 0) {
                    d2Var.f242681g = renderGLSurface;
                } else {
                    d2Var.f242682h = renderGLSurface;
                }
            }
            dr4.n0 n0Var = x1Var.f242764d;
            if (n0Var != null) {
                if (i19 == 0) {
                    n0Var.f242681g = renderGLSurface;
                } else {
                    n0Var.f242682h = renderGLSurface;
                }
            }
        }
        if (x1Var != null) {
            x1Var.d();
        }
    }

    public final void k(dr4.q renderGLSurface, int i17) {
        kotlin.jvm.internal.o.g(renderGLSurface, "renderGLSurface");
        dr4.x1 x1Var = this.f242708g;
        if (x1Var != null) {
            dr4.d2 d2Var = x1Var.f242763c;
            if (d2Var != null) {
                if (i17 == 0) {
                    d2Var.f242681g = renderGLSurface;
                } else {
                    d2Var.f242682h = renderGLSurface;
                }
            }
            dr4.n0 n0Var = x1Var.f242764d;
            if (n0Var != null) {
                if (i17 == 0) {
                    n0Var.f242681g = renderGLSurface;
                } else {
                    n0Var.f242682h = renderGLSurface;
                }
            }
        }
        if (x1Var != null) {
            x1Var.d();
        }
    }

    public final void l(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "pause local video trans");
        gq4.v.wi().f365975i = java.lang.Boolean.valueOf(z17);
    }

    public final void m() {
        pq4.c l17 = gq4.v.Bi().l("CAMERA");
        if (l17 != null) {
            l17.b(new dr4.j1(this));
        }
    }

    public final void n() {
        if (vq4.b0.f439279j) {
            this.A.dead();
        }
        this.f242703b = false;
        this.f242719r = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "release voip render mgr ");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.H;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.H;
        if (b4Var2 != null) {
            b4Var2.quitSafely();
        }
        this.H = null;
        di3.d dVar = this.f242724w;
        if (dVar != null) {
            dVar.disable();
        }
        di3.d dVar2 = this.f242724w;
        if (dVar2 != null) {
            dVar2.f232689g = null;
        }
        dr4.p0 p0Var = this.f242721t;
        dr4.o0 o0Var = p0Var.f242700b;
        o0Var.f242694a = null;
        dr4.o0 o0Var2 = p0Var.f242699a;
        o0Var2.f242694a = null;
        o0Var2.f242695b = null;
        o0Var.f242695b = null;
        this.f242723v = null;
        vq4.a0 a0Var = vq4.a0.f439264a;
        vq4.a0.f439267d = 0;
        vq4.a0.f439265b = 0;
        vq4.a0.f439266c = 0;
        vq4.a0.f439269f = vq4.b0.k();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().unregisterContentObserver(this.f242725x);
        ((android.hardware.display.DisplayManager) ((jz5.n) this.f242726y).getValue()).unregisterDisplayListener(this.f242727z);
        dr4.x1 x1Var = this.f242708g;
        if (x1Var != null) {
            dr4.m1 m1Var = new dr4.m1(this);
            dr4.c0 c0Var = x1Var.f242762b;
            if (c0Var != null) {
                c0Var.b(new dr4.w1(x1Var, m1Var));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r0 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r1 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0029, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0025, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r7) {
        /*
            r6 = this;
            xq4.a r0 = r6.f242704c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            zq4.b r0 = (zq4.b) r0
            boolean r0 = r0.f475041a
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            r3 = 4
            if (r7 == 0) goto L2b
            r4 = 90
            if (r7 == r4) goto L25
            r4 = 180(0xb4, float:2.52E-43)
            if (r7 == r4) goto L23
            r4 = 270(0x10e, float:3.78E-43)
            if (r7 == r4) goto L20
            goto L2b
        L20:
            if (r0 == 0) goto L27
            goto L29
        L23:
            r7 = 3
            goto L2c
        L25:
            if (r0 == 0) goto L29
        L27:
            r7 = 2
            goto L2c
        L29:
            r7 = r3
            goto L2c
        L2b:
            r7 = r2
        L2c:
            com.tencent.mm.plugin.voip.model.h2 r0 = gq4.v.Bi()
            qq4.b r4 = gq4.v.wi()
            java.lang.String r4 = r4.f365971e
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "toLowerCase(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            java.lang.String r5 = "ipad"
            boolean r4 = r26.n0.B(r4, r5, r1)
            if (r4 == 0) goto L4b
            goto L6c
        L4b:
            qq4.b r4 = gq4.v.wi()
            boolean r4 = r4.c()
            if (r4 == 0) goto L6d
            boolean r4 = vq4.b0.f439273d
            if (r4 == 0) goto L6d
            qq4.b r4 = gq4.v.wi()
            boolean r4 = r4.f365972f
            if (r4 == 0) goto L6c
            boolean r4 = vq4.b0.f439273d
            if (r4 == 0) goto L6a
            boolean r4 = vq4.b0.f439274e
            if (r4 == 0) goto L6a
            r1 = r2
        L6a:
            if (r1 != 0) goto L6d
        L6c:
            r2 = r7
        L6d:
            com.tencent.mm.plugin.voip.model.d3 r7 = r0.f176558a
            com.tencent.mm.plugin.voip.model.g1 r7 = r7.f176411a
            r7.getClass()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            byte r1 = (byte) r2
            r0.put(r1)
            byte[] r0 = r0.array()
            com.tencent.mm.plugin.voip.model.v2protocal r7 = r7.f176532x
            r1 = 21
            int r7 = r7.setAppCmd(r1, r0, r3)
            if (r7 >= 0) goto La3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "voipContext setOrientation ret:"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MicroMsg.Voip.VoipContext"
            vq4.d0.c(r0, r7)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr4.p1.o(int):void");
    }

    public final void p(android.util.Size size) {
        dr4.x1 x1Var = this.f242708g;
        if (x1Var != null) {
            android.util.Size size2 = new android.util.Size(size.getHeight(), size.getWidth());
            dr4.c0 c0Var = x1Var.f242762b;
            if (c0Var != null) {
                c0Var.d(size2);
                dr4.d2 d2Var = x1Var.f242763c;
                if (d2Var != null) {
                    d2Var.l(size2);
                }
                dr4.h hVar = x1Var.f242765e;
                if (hVar != null) {
                    hVar.l(size2);
                }
            }
        }
        rq4.q qVar = rq4.q.f399067a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(size.getHeight());
        sb6.append(':');
        sb6.append(size.getWidth());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.g(sb7, "<set-?>");
        rq4.q.f399072f = sb7;
    }

    public final void q(boolean z17) {
        dr4.x1 x1Var = this.f242708g;
        if (x1Var != null) {
            dr4.c0 c0Var = x1Var.f242762b;
            if (c0Var != null) {
                c0Var.f242605h = !z17;
            }
            dr4.h hVar = x1Var.f242765e;
            if (hVar == null) {
                return;
            }
            hVar.f242679e = !z17;
        }
    }
}
