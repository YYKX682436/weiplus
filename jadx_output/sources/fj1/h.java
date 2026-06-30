package fj1;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.auth.g, uh1.u {

    /* renamed from: d, reason: collision with root package name */
    public final fj1.y f263112d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.t f263113e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f263114f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f263115g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f263116h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f263117i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f263118m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.SparseArray f263119n;

    public h(fj1.y runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f263112d = runtime;
        this.f263113e = (com.tencent.mm.plugin.appbrand.jsruntime.t) com.tencent.mm.plugin.appbrand.utils.o1.a("MicroMsg.WAMagicBrushFrameJsApiInvokeComponentAdapter.dummyJsRuntime", com.tencent.mm.plugin.appbrand.jsruntime.t.class);
        this.f263114f = jz5.h.b(fj1.e.f263109d);
        this.f263115g = jz5.h.b(new fj1.f(this));
        this.f263116h = new java.util.concurrent.ConcurrentSkipListSet(fj1.d.f263108d);
        this.f263117i = jz5.h.b(new fj1.g(this));
        this.f263118m = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f263119n = new android.util.SparseArray();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.g
    public com.tencent.mm.plugin.appbrand.jsapi.auth.h B() {
        return (com.tencent.mm.plugin.appbrand.jsapi.auth.l) ((jz5.n) this.f263115g).getValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.g
    public com.tencent.mm.plugin.appbrand.jsapi.auth.h L() {
        return (com.tencent.mm.plugin.appbrand.jsapi.auth.f) ((jz5.n) this.f263114f).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: Exception -> 0x0046, TryCatch #1 {Exception -> 0x0046, blocks: (B:22:0x0021, B:12:0x002d, B:14:0x003a, B:20:0x0040), top: B:21:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #1 {Exception -> 0x0046, blocks: (B:22:0x0021, B:12:0x002d, B:14:0x003a, B:20:0x0040), top: B:21:0x0021 }] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            android.util.SparseArray r0 = r3.f263119n
            monitor-enter(r0)
            android.util.SparseArray r1 = r3.f263119n     // Catch: java.lang.Throwable -> L51
            int r4 = r1.indexOfKey(r4)     // Catch: java.lang.Throwable -> L51
            if (r4 < 0) goto L1c
            android.util.SparseArray r1 = r3.f263119n     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r1.valueAt(r4)     // Catch: java.lang.Throwable -> L51
            r2 = r1
            yz5.l r2 = (yz5.l) r2     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r2 = r3.f263119n     // Catch: java.lang.Throwable -> L51
            r2.removeAt(r4)     // Catch: java.lang.Throwable -> L51
            yz5.l r1 = (yz5.l) r1     // Catch: java.lang.Throwable -> L51
            goto L1d
        L1c:
            r1 = 0
        L1d:
            monitor-exit(r0)
            r4 = 0
            if (r5 == 0) goto L2a
            int r0 = r5.length()     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto L28
            goto L2a
        L28:
            r0 = r4
            goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 != 0) goto L40
            lc3.a0 r0 = new lc3.a0     // Catch: java.lang.Exception -> L46
            r0.<init>(r5)     // Catch: java.lang.Exception -> L46
            java.lang.String r5 = "errCode"
            boolean r5 = r0.has(r5)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L4b
            java.lang.String r5 = "errCode"
            r0.put(r5, r4)     // Catch: java.lang.Exception -> L46
            goto L4b
        L40:
            lc3.a0 r0 = new lc3.a0     // Catch: java.lang.Exception -> L46
            r0.<init>()     // Catch: java.lang.Exception -> L46
            goto L4b
        L46:
            lc3.a0 r0 = new lc3.a0
            r0.<init>()
        L4b:
            if (r1 == 0) goto L50
            r1.invoke(r0)
        L50:
            return
        L51:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fj1.h.a(int, java.lang.String):void");
    }

    public final void a0(fj1.k cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        this.f263116h.add(cb6);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isAssignableFrom(k91.z0.class)) {
            return this.f263112d.e();
        }
        if (!cls.isAssignableFrom(uh1.a.class)) {
            return null;
        }
        java.lang.Object value = ((jz5.n) this.f263117i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (uh1.a) value;
    }

    public final int b0(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        int incrementAndGet = this.f263118m.incrementAndGet();
        synchronized (this.f263119n) {
            this.f263119n.put(incrementAndGet, callback);
        }
        return incrementAndGet;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        return isRunning();
    }

    public final void c0(fj1.k cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        this.f263116h.remove(cb6);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        g(str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        g(str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String event, java.lang.String str) {
        if (event == null || event.length() == 0) {
            return;
        }
        java.util.Iterator it = this.f263116h.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            fh1.z zVar = (fh1.z) ((fj1.k) it.next());
            zVar.getClass();
            kotlin.jvm.internal.o.g(event, "event");
            zVar.e(new fh1.j(zVar, event, str));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        return this.f263112d.c();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        int ordinal = this.f263112d.f253278a.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return u81.b.FOREGROUND;
        }
        if (ordinal == 3) {
            return u81.b.BACKGROUND;
        }
        if (ordinal == 4) {
            return u81.b.DESTROYED;
        }
        throw new jz5.j();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ qu5.a getAsyncHandler() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public int getComponentId() {
        return hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public android.content.Context getContext() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime() {
        com.tencent.mm.plugin.appbrand.jsruntime.t dummyJsRuntime = this.f263113e;
        kotlin.jvm.internal.o.f(dummyJsRuntime, "dummyJsRuntime");
        return dummyJsRuntime;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    public void h() {
        this.f263116h.clear();
        synchronized (this.f263119n) {
            this.f263119n.clear();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 event, int[] iArr) {
        kotlin.jvm.internal.o.g(event, "event");
        d(event.k(), event.o(), iArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        return (ej1.g.CREATED == this.f263112d.f253278a || ej1.g.DESTROYED == this.f263112d.f253278a) ? false : true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void p(com.tencent.mm.plugin.appbrand.jsapi.n5 event) {
        kotlin.jvm.internal.o.g(event, "event");
        g(event.k(), event.o());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        if (kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.appbrand.networking.c0.class)) {
            return com.tencent.mm.plugin.appbrand.networking.m0.INSTANCE;
        }
        return null;
    }

    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
    }

    public boolean s(java.lang.String str) {
        return isRunning();
    }

    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
    }

    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
    }
}
