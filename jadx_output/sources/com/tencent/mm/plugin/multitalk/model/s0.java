package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class s0 implements xq4.d {

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f150112d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f150113e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f150114f;

    /* renamed from: g, reason: collision with root package name */
    public is0.c f150115g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.z f150116h;

    /* renamed from: i, reason: collision with root package name */
    public long f150117i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.r2 f150118m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f150119n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.SurfaceTexture f150120o;

    /* renamed from: p, reason: collision with root package name */
    public is0.c f150121p;

    /* renamed from: q, reason: collision with root package name */
    public volatile android.util.Size f150122q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f150123r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.app.y2 f150124s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150125t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.model.h0 f150126u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f150127v;

    public s0() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f150119n = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f150122q = new android.util.Size(0, 0);
        this.f150123r = true;
        this.f150124s = new com.tencent.mm.plugin.multitalk.model.n0(this);
        this.f150125t = zj3.j.g();
        this.f150126u = new com.tencent.mm.plugin.multitalk.model.h0();
        this.f150127v = jz5.h.b(com.tencent.mm.plugin.multitalk.model.r0.f150083d);
    }

    public static void h(com.tencent.mm.plugin.multitalk.model.s0 s0Var, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        s0Var.getClass();
        boolean g17 = zj3.j.g();
        s0Var.f150125t = g17;
        if (g17) {
            kotlinx.coroutines.l.d(s0Var.f150119n, null, null, new com.tencent.mm.plugin.multitalk.model.p0(s0Var, z17, null), 3, null);
            return;
        }
        com.tencent.mm.plugin.multitalk.model.q0 q0Var = new com.tencent.mm.plugin.multitalk.model.q0(s0Var, z17);
        java.lang.String str = "MultiTalkCameraManager_Thread" + s0Var.hashCode();
        int i18 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, 5);
        s0Var.f150112d = a17;
        a17.start();
        android.os.HandlerThread handlerThread = s0Var.f150112d;
        s0Var.f150113e = new com.tencent.mm.sdk.platformtools.n3(handlerThread != null ? handlerThread.getLooper() : null);
        final com.tencent.mm.plugin.multitalk.model.i0 i0Var = new com.tencent.mm.plugin.multitalk.model.i0(s0Var, q0Var);
        android.os.HandlerThread handlerThread2 = s0Var.f150112d;
        if (!(handlerThread2 != null && handlerThread2.isAlive()) || (n3Var = s0Var.f150113e) == null) {
            return;
        }
        n3Var.post(new java.lang.Runnable(i0Var) { // from class: com.tencent.mm.plugin.multitalk.model.m0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f150044d;

            {
                kotlin.jvm.internal.o.g(i0Var, "function");
                this.f150044d = i0Var;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f150044d.invoke();
            }
        });
    }

    public static /* synthetic */ void j(com.tencent.mm.plugin.multitalk.model.s0 s0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        s0Var.i(z17);
    }

    @Override // xq4.d
    public void Y(int i17, int i18) {
        this.f150122q = new android.util.Size(i17, i18);
        if (this.f150125t) {
            com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
            if (n17 != null) {
                n17.g(i17, i18);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkCameraManager", "camera preview size applye is " + i17 + " and " + i18);
        }
    }

    public final void a() {
        this.f150117i = 0L;
        this.f150122q = new android.util.Size(0, 0);
        com.tencent.mm.plugin.multitalk.model.r2 r2Var = this.f150118m;
        if (r2Var != null) {
            if (xq4.e.f456113a.f464581b < 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + xq4.e.f456113a.f464581b);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + xq4.e.f456113a.f464581b);
                r2Var.e();
                r2Var.b(r2Var.f150095i, r2Var.f150087a ^ true);
                r2Var.d();
                gq4.v.Bi().J(r2Var.f150089c);
            }
        }
        com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        com.tencent.mm.plugin.multitalk.model.r2 r2Var2 = this.f150118m;
        Ri.f150166i = r2Var2 != null ? r2Var2.f150087a : true;
    }

    public final boolean b() {
        long j17 = this.f150117i;
        if (j17 == 0) {
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 <= ((java.lang.Number) ((jz5.n) this.f150127v).getValue()).longValue()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkCameraManager", "current camera is open but has no video ");
        return true;
    }

    public final boolean c() {
        return this.f150118m != null;
    }

    public final boolean d() {
        com.tencent.mm.plugin.multitalk.model.r2 r2Var = this.f150118m;
        if (r2Var != null) {
            return r2Var.f150087a;
        }
        return true;
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkCameraManager", "release");
        this.f150117i = 0L;
        if (this.f150125t) {
            com.tencent.mm.plugin.multitalk.model.r2 r2Var = this.f150118m;
            if (r2Var != null) {
                r2Var.e();
            }
            this.f150118m = null;
            this.f150120o = null;
        } else {
            android.graphics.SurfaceTexture surfaceTexture = this.f150120o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f150120o = null;
            is0.c cVar = this.f150115g;
            if (cVar != null) {
                cVar.close();
            }
            this.f150115g = null;
            rs0.h hVar = this.f150114f;
            if (hVar != null) {
                rs0.i.f399296a.u(hVar);
            }
            com.tencent.mm.plugin.multitalk.model.r2 r2Var2 = this.f150118m;
            if (r2Var2 != null) {
                r2Var2.e();
            }
            this.f150118m = null;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f150113e;
            if (n3Var != null) {
                n3Var.quitSafely();
            }
            this.f150113e = null;
            android.os.HandlerThread handlerThread = this.f150112d;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        }
        com.tencent.mm.plugin.multitalk.model.h0 h0Var = this.f150126u;
        h0Var.getClass();
        h0Var.getClass();
        h0Var.getClass();
    }

    public final void g() {
        com.tencent.mm.plugin.multitalk.model.r2 r2Var = this.f150118m;
        if (r2Var != null) {
            r2Var.e();
        }
        com.tencent.mm.plugin.multitalk.model.r2 r2Var2 = new com.tencent.mm.plugin.multitalk.model.r2(640, 480);
        this.f150118m = r2Var2;
        r2Var2.f150106t = !this.f150125t;
        r2Var2.b(this, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150166i);
        com.tencent.mm.plugin.multitalk.model.r2 r2Var3 = this.f150118m;
        if (r2Var3 != null) {
            r2Var3.f150104r = this.f150120o;
        }
        if (r2Var3 != null) {
            r2Var3.d();
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.plugin.multitalk.model.r2 r2Var4 = this.f150118m;
        objArr[0] = r2Var4 != null ? java.lang.Boolean.valueOf(r2Var4.f150087a) : null;
        com.tencent.mm.plugin.multitalk.model.r2 r2Var5 = this.f150118m;
        objArr[1] = r2Var5 != null ? r2Var5.f150088b : null;
        objArr[2] = this.f150120o;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkCameraManager", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b, texture %s", objArr);
    }

    public final void i(boolean z17) {
        if (z17) {
            com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
            com.tencent.mm.app.y2 y2Var = this.f150124s;
            synchronized (wVar.f53888m) {
                ((java.util.HashSet) wVar.f53888m).remove(y2Var);
            }
        }
        com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
        if (n17 != null) {
            n17.c();
        }
        f();
        com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m);
    }

    @Override // xq4.d
    public void o() {
        com.tencent.mm.plugin.multitalk.model.z zVar = this.f150116h;
        if (zVar != null) {
            zVar.v4();
        }
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y()) {
            return;
        }
        i(true);
    }
}
