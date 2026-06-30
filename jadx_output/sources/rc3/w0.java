package rc3;

/* loaded from: classes7.dex */
public final class w0 extends qc3.b implements jc3.j0, jc3.o {
    public qc3.f A;
    public com.tencent.mm.plugin.magicbrush.n4 B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f394086d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f394087e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f394088f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f394089g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f394090h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.magicbrush.MBBuildConfig f394091i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f394092m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f394093n;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f394094o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f394095p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f394096q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f394097r;

    /* renamed from: s, reason: collision with root package name */
    public int f394098s;

    /* renamed from: t, reason: collision with root package name */
    public int f394099t;

    /* renamed from: u, reason: collision with root package name */
    public final kz5.q f394100u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f394101v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f394102w;

    /* renamed from: x, reason: collision with root package name */
    public je3.o f394103x;

    /* renamed from: y, reason: collision with root package name */
    public final oc3.c f394104y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f394105z;

    public w0(android.content.Context context, java.lang.String instanceName, android.os.HandlerThread stateThread, yz5.l needConnectCb, yz5.l disconnectCb) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(stateThread, "stateThread");
        kotlin.jvm.internal.o.g(needConnectCb, "needConnectCb");
        kotlin.jvm.internal.o.g(disconnectCb, "disconnectCb");
        this.f394086d = context;
        this.f394087e = instanceName;
        this.f394088f = stateThread;
        this.f394089g = needConnectCb;
        this.f394090h = disconnectCb;
        this.f394092m = new java.util.HashSet();
        this.f394093n = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f394094o = new android.os.Handler(stateThread.getLooper());
        this.f394095p = new java.util.HashMap();
        this.f394096q = new java.util.HashMap();
        this.f394097r = new java.util.HashMap();
        this.f394099t = 1;
        this.f394100u = new kz5.q(16);
        this.f394102w = r26.n0.s0(instanceName, "-", instanceName);
        this.f394104y = new oc3.c(instanceName, null, 2, null);
        this.f394105z = "MBBizClient_" + r26.n0.s0(instanceName, "-", instanceName).concat(r26.p0.F0(r26.n0.p0(instanceName, "-", ""), 5));
    }

    public static final void e(rc3.w0 w0Var) {
        w0Var.f394099t = 16;
        java.util.Iterator it = w0Var.f394092m.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).onDestroy(3);
        }
        w0Var.j();
    }

    public void A() {
        M(new rc3.o0(this));
    }

    @Override // qc3.c
    public void B8(int i17, int i18, int i19, int i27, int i28, int i29) {
        M(new rc3.u(this, i17, i18, i19, i27, i28));
    }

    @Override // qc3.c
    public void Bi(int i17, float[] left, float[] top, float[] width, float[] height) {
        kotlin.jvm.internal.o.g(left, "left");
        kotlin.jvm.internal.o.g(top, "top");
        kotlin.jvm.internal.o.g(width, "width");
        kotlin.jvm.internal.o.g(height, "height");
        M(new rc3.s(this, i17, left, top, width, height));
    }

    @Override // qc3.c
    public void C3(int i17, int i18, int i19, int i27, int i28, int i29) {
        M(new rc3.n(this, i17, i18, i19, i27, i28));
    }

    @Override // qc3.c
    public void Da(boolean z17) {
        T(new rc3.x(this, z17));
    }

    @Override // qc3.c
    public void F2(int i17, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        T(new rc3.y(this, i17, msg));
    }

    @Override // qc3.c
    public void K3(int i17) {
        M(new rc3.r(this, i17));
    }

    @Override // qc3.c
    public void Ke(java.lang.String logStr) {
        kotlin.jvm.internal.o.g(logStr, "logStr");
        T(new rc3.b0(this, logStr));
    }

    public final void M(yz5.a aVar) {
        if (this.f394099t == 16) {
            return;
        }
        this.f394094o.post(new rc3.p0(this, aVar));
    }

    @Override // qc3.c
    public void Oe() {
        com.tencent.mars.xlog.Log.i(this.f394105z, "onPing localStatus:" + this.f394099t + ", isPending:" + this.f394101v + " instanceName:" + this.f394087e);
    }

    public final void S(yz5.a aVar) {
        this.f394093n.post(new rc3.r0(aVar));
    }

    public final void T(yz5.a aVar) {
        if (this.f394099t == 16) {
            return;
        }
        this.f394094o.post(new rc3.r0(aVar));
    }

    public final void V(yz5.a aVar) {
        if (this.f394099t == 16) {
            return;
        }
        this.f394094o.post(new rc3.q0(this, aVar));
    }

    public void W(com.tencent.mm.plugin.magicbrush.MBBuildConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        synchronized (this) {
            if (this.f394091i != null) {
                com.tencent.mars.xlog.Log.w(this.f394105z, "duplicate setup");
                return;
            }
            this.f394091i = config;
            if (config.f147826p.length() > 0) {
                byte[] bytes = config.f147826p.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                int length = bytes.length;
                if (length > 102400) {
                    com.tencent.mars.xlog.Log.e(this.f394105z, "customEnvParams size=" + length + " exceeds limit=102400, biz:" + this.f394102w);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            }
            if (config.f147832v) {
                je3.o oVar = new je3.o(this.f394102w, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, null);
                java.lang.String str2 = oVar.f299306b;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                config.f147819f = str2;
                this.f394103x = oVar;
            }
            java.lang.String a17 = bm5.f1.a();
            kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
            config.f147820g = a17;
            T(new rc3.a(this));
            M(new rc3.t0(this, config));
        }
    }

    @Override // qc3.c
    public void c(int i17, boolean z17) {
        M(new rc3.p(this, i17, z17));
    }

    public void destroy() {
        T(new rc3.e(this));
    }

    @Override // qc3.c
    public void h(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        T(new rc3.a0(this, msg, envId));
    }

    @Override // qc3.c
    public java.lang.String ih(java.lang.String event, java.lang.String data, java.lang.String privateData) {
        lc3.c0 c0Var;
        java.lang.String a17;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(privateData, "privateData");
        try {
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394091i;
            if (mBBuildConfig == null || (c0Var = (lc3.c0) mBBuildConfig.f147827q.get(event)) == null) {
                return "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
            }
            lc3.d0 d0Var = (lc3.d0) c0Var;
            d0Var.f317890a = mBBuildConfig.b();
            d0Var.o(this.f394104y);
            d0Var.f317892c = privateData;
            lc3.a0 a0Var = new lc3.a0(data);
            if (d0Var.n()) {
                hh.h hVar = new hh.h(new rc3.k(d0Var, a0Var));
                this.f394093n.post(hVar);
                a17 = ((lc3.a0) hVar.b()).a();
            } else {
                a17 = d0Var.r(a0Var).a();
            }
            d0Var.f317890a = null;
            return a17;
        } catch (java.lang.Exception e17) {
            je3.k kVar = je3.k.f299298e;
            java.lang.String str = this.f394102w;
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            kVar.T5(str, "jsapi-exception", stackTraceString, event + ':' + data, 1.0f);
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f394105z, e17, this.f394102w + ": catch jsapi exception " + event + ", data = " + data, new java.lang.Object[0]);
            d75.b.g(new rc3.l(e17));
            return "{\"errMsg\":\"jsapi exception\", \"errCode\": -4}";
        }
    }

    public final void j() {
        java.lang.String str = this.f394105z;
        com.tencent.mars.xlog.Log.i(str, "cleanup");
        this.f394101v = false;
        this.f394091i = null;
        this.A = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pendingTaskRemove ");
        kz5.q qVar = this.f394100u;
        sb6.append(qVar.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        qVar.clear();
        this.f394097r.clear();
        S(new rc3.b(this));
        this.f394092m.clear();
        this.f394088f.quit();
        this.f394090h.invoke(this.f394087e);
    }

    @Override // qc3.c
    public void j6(java.lang.String event, java.lang.String data, java.lang.String privateData, int i17) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(privateData, "privateData");
        try {
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394091i;
            if (mBBuildConfig == null) {
                return;
            }
            lc3.c0 c0Var = (lc3.c0) mBBuildConfig.f147827q.get(event);
            if (c0Var != null) {
                lc3.b0 r17 = ((lc3.b0) c0Var).r();
                r17.f317890a = mBBuildConfig.b();
                r17.o(this.f394104y);
                r17.f317892c = privateData;
                r17.f317886d = new rc3.h(this, i17, r17);
                lc3.a0 a0Var = new lc3.a0(data);
                if (r17.n()) {
                    this.f394093n.post(new rc3.i(r17, a0Var));
                } else {
                    r17.t(a0Var);
                }
            }
        } catch (java.lang.Exception e17) {
            je3.k kVar = je3.k.f299298e;
            java.lang.String str = this.f394102w;
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            kVar.T5(str, "jsapi-exception", stackTraceString, event + ':' + data, 1.0f);
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f394105z, e17, this.f394102w + ": catch jsapi exception " + event + ", data = " + data, new java.lang.Object[0]);
            d75.b.g(new rc3.j(e17));
        }
    }

    public void k(java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        M(new rc3.f(this, event, data));
    }

    public void l(java.lang.String script, yz5.l lVar) {
        kotlin.jvm.internal.o.g(script, "script");
        M(new rc3.g(this, lVar, script));
    }

    @Override // qc3.c
    public void n() {
        V(new rc3.c0(this));
    }

    @Override // qc3.c
    public void onCreated() {
        V(new rc3.v(this));
    }

    @Override // qc3.c
    public void onDestroy() {
        V(new rc3.w(this));
    }

    public void p(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        kotlin.jvm.internal.o.g(pointerIds, "pointerIds");
        kotlin.jvm.internal.o.g(x17, "x");
        kotlin.jvm.internal.o.g(y17, "y");
        M(new rc3.m0(this, i17, i18, i19, j17, pointerIds, x17, y17));
    }

    public void pause() {
        M(new rc3.g0(this));
    }

    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        kotlin.jvm.internal.o.g(surface, "surface");
        M(new rc3.i0(this, i17, i18, i19, surface));
    }

    public void start() {
        M(new rc3.u0(this));
    }

    public void w(jc3.u listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        T(new rc3.n0(this, listener));
    }
}
