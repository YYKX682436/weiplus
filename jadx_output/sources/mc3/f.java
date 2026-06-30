package mc3;

/* loaded from: classes7.dex */
public abstract class f extends lc3.e implements jc3.i0, jc3.h0, jc3.u, qp0.a {

    /* renamed from: d, reason: collision with root package name */
    public final nc3.a f325625d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f325626e;

    /* renamed from: f, reason: collision with root package name */
    public qp0.c f325627f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f325628g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f325629h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f325630i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f325631m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f325632n;

    /* renamed from: o, reason: collision with root package name */
    public bf3.p f325633o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f325634p;

    /* renamed from: q, reason: collision with root package name */
    public jc3.j0 f325635q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f325636r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f325637s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f325638t;

    /* renamed from: u, reason: collision with root package name */
    public final mc3.d f325639u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f325640v;

    public f(nc3.a bizConfig) {
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        this.f325625d = bizConfig;
        java.lang.String str = bizConfig.f336109a;
        this.f325626e = str;
        this.f325627f = bizConfig.f336110b;
        this.f325630i = new java.util.HashSet();
        this.f325632n = jz5.h.b(new mc3.c(this));
        this.f325637s = new java.util.concurrent.CopyOnWriteArrayList();
        this.f325638t = new java.util.concurrent.CopyOnWriteArrayList();
        this.f325639u = new mc3.d(this);
        this.f325640v = "MagicBaseBiz." + str;
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.f325629h;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    public final qp0.b C0() {
        return (qp0.b) ((jz5.n) this.f325632n).getValue();
    }

    public final jc3.r0 E0(long j17) {
        int i17 = s26.a.f402368f;
        if (j17 == 0) {
            return jc3.r0.f298980f;
        }
        com.tencent.mars.xlog.Log.i(this.f325640v, "preload runtime, cacheTime: " + ((java.lang.Object) s26.a.h(j17)));
        G0();
        H0(false);
        ((rp0.e) C0()).c(true, j17);
        return jc3.r0.f298978d;
    }

    public final void F0(java.lang.String str, java.lang.String event, java.lang.String str2) {
        kotlin.jvm.internal.o.g(event, "event");
        int length = str2.length();
        if (length > 500) {
            length = 500;
        }
        com.tencent.mars.xlog.Log.i(this.f325640v, "send event," + str + " event: " + event + ", data: " + length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (r3 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mc3.f.G0():void");
    }

    public final void H0(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f325640v, "setActiveStatus, before: " + this.f325628g + ", after: " + z17);
        this.f325628g = z17;
        qp0.b.a(C0(), false, 1, null);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e(this.f325640v, "on js exception, envId: " + envId + ", msg: " + msg);
    }

    @Override // jc3.i0
    public final void S(jc3.l0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        ((java.util.HashSet) this.f325630i).add(listener);
    }

    @Override // jc3.i0
    public synchronized void V(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i(this.f325640v, "activate");
        rp0.e eVar = (rp0.e) C0();
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "cancel try destroy");
        java.lang.Runnable runnable = eVar.f398349i;
        if (runnable != null) {
            eVar.f398345e.removeCallbacks(runnable);
            eVar.f398349i = null;
        }
        this.f325629h = new java.lang.ref.WeakReference(activity);
        G0();
        H0(true);
    }

    @Override // jc3.u
    public void b1() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "on connection exception");
        java.util.Iterator it = this.f325630i.iterator();
        while (it.hasNext()) {
            ((jc3.l0) it.next()).b1();
        }
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.removeLifecycleCallback(this.f325639u);
        rp0.e eVar = (rp0.e) C0();
        com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "tryRecreateBiz, foreground: " + eVar.f398346f);
        if (!eVar.f398346f) {
            eVar.f398351k = new rp0.d(eVar);
            return;
        }
        com.tencent.mars.xlog.Log.e("MagicAutoLifecycleExt", "exceptionListener invoke, try to recreate biz");
        qp0.a aVar = eVar.f398341a;
        int i17 = eVar.f398350j;
        eVar.f398350j = i17 + 1;
        boolean z17 = i17 >= eVar.f398344d;
        mc3.f fVar = (mc3.f) aVar;
        synchronized (fVar) {
            com.tencent.mars.xlog.Log.i(fVar.f325640v, "recreateBiz, isOutOfLimit=" + z17);
            if (!z17) {
                pm0.v.X(new mc3.e(fVar));
                return;
            }
            com.tencent.mars.xlog.Log.e(fVar.f325640v, "biz recreate too much times, destroy it.");
            java.util.Iterator it6 = ((java.util.HashSet) fVar.f325630i).iterator();
            while (it6.hasNext()) {
                ((jc3.l0) it6.next()).d0(true);
            }
            fVar.f325631m = true;
            fVar.destroy();
            fVar.f325631m = false;
        }
    }

    @Override // jc3.i0
    public synchronized void deactivate() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "deActivated");
        H0(false);
        rp0.e eVar = (rp0.e) C0();
        eVar.getClass();
        int i17 = s26.a.f402368f;
        eVar.c(false, s26.c.d(eVar.f398343c, s26.d.f402372g));
    }

    public abstract void destroy();

    @Override // jc3.i0
    public void l(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase event) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String event2 = event.f147881d;
        java.lang.String data = event.f147882e;
        kotlin.jvm.internal.o.g(event2, "event");
        kotlin.jvm.internal.o.g(data, "data");
        jc3.j0 j0Var = this.f325635q;
        if (j0Var != null) {
            synchronized (j0Var) {
                if (!this.f325636r) {
                    this.f325637s.add(new mc3.a(event2, data));
                    F0("but pending, ", event2, data);
                    return;
                }
                ((rp0.e) C0()).e(true);
                jc3.j0 j0Var2 = this.f325635q;
                kotlin.jvm.internal.o.d(j0Var2);
                ((rc3.w0) j0Var2).k(event2, data);
                F0("", event2, data);
                f0Var = jz5.f0.f302826a;
            }
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f325640v, "send event, but mb biz is null");
        }
    }

    @Override // jc3.u
    public void n() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "on main script is injected");
        jc3.j0 j0Var = this.f325635q;
        if (j0Var != null) {
            synchronized (j0Var) {
                ((rp0.e) C0()).e(true);
                for (mc3.a aVar : this.f325637s) {
                    ((rc3.w0) j0Var).k(aVar.f325618a, aVar.f325619b);
                    F0("pending over", aVar.f325618a, aVar.f325619b);
                }
                this.f325637s.clear();
                this.f325636r = true;
                if (!this.f325638t.isEmpty()) {
                    for (mc3.b bVar : this.f325638t) {
                        ((rc3.w0) j0Var).l(bVar.f325620a, bVar.f325621b);
                    }
                    this.f325638t.clear();
                }
            }
        }
    }

    @Override // jc3.u
    public void onCreated() {
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.addLifecycleCallback(this.f325639u);
    }

    @Override // jc3.u
    public void onDestroy(int i17) {
        com.tencent.mars.xlog.Log.i(this.f325640v, "on destroy, reason: " + i17);
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.removeLifecycleCallback(this.f325639u);
    }

    @Override // jc3.u
    public void onPause() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "on pause");
    }

    @Override // jc3.u
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "on resume");
    }

    @Override // jc3.i0
    public void pause() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "pause");
        ((rp0.e) C0()).d();
    }

    @Override // jc3.i0
    public void resume() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "resume");
        qp0.b.a(C0(), false, 1, null);
    }

    @Override // jc3.i0
    public void t0(java.lang.String script, yz5.l lVar) {
        kotlin.jvm.internal.o.g(script, "script");
        if (!z65.c.a()) {
            com.tencent.mars.xlog.Log.e(this.f325640v, "test evaluate script blocked, not in debug environment");
            if (lVar != null) {
                lVar.invoke("not in debug environment");
                return;
            }
            return;
        }
        jc3.j0 j0Var = this.f325635q;
        if (j0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f325640v, "test evaluate script, but mb biz is null");
            if (lVar != null) {
                lVar.invoke("mb biz is null");
                return;
            }
            return;
        }
        if (this.f325636r) {
            ((rc3.w0) j0Var).l(script, lVar);
            return;
        }
        synchronized (j0Var) {
            if (this.f325636r) {
                ((rc3.w0) j0Var).l(script, lVar);
                return;
            }
            this.f325638t.add(new mc3.b(script, lVar));
            com.tencent.mars.xlog.Log.i(this.f325640v, "test evaluate script, but main script is not injected, pending. size=" + this.f325638t.size());
        }
    }

    @Override // jc3.u
    public void x5() {
        com.tencent.mars.xlog.Log.i(this.f325640v, "on service ready");
    }
}
