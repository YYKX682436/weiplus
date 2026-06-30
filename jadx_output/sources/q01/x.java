package q01;

/* loaded from: classes12.dex */
public final class x implements com.tencent.mm.modelbase.u0, com.tencent.mm.network.l0 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f359343o = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f359344d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f359345e;

    /* renamed from: f, reason: collision with root package name */
    public final int f359346f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.network.l0 f359347g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f359348h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f359349i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f359350m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f359351n;

    public x(com.tencent.mm.modelbase.m1 scene, com.tencent.mm.modelbase.u0 queueCallback) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(queueCallback, "queueCallback");
        this.f359344d = scene;
        this.f359345e = queueCallback;
        this.f359346f = f359343o.getAndIncrement();
        this.f359348h = jz5.h.b(q01.u.f359337d);
        this.f359349i = jz5.h.b(q01.r.f359325d);
        this.f359350m = jz5.h.b(q01.s.f359327d);
        this.f359351n = jz5.h.b(q01.t.f359334d);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueTracker", "#init trackCallbacks: " + e());
    }

    public final java.util.LinkedHashMap a() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("dispatchToRemoteCounter", java.lang.Integer.valueOf(((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f359348h).getValue()).get()));
        linkedHashMap.put("callbackFromRemoteCounter", java.lang.Integer.valueOf(c().get()));
        linkedHashMap.put("callbackToQueueCounter", java.lang.Integer.valueOf(d().get()));
        ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
        return linkedHashMap;
    }

    public final java.lang.String b() {
        return "(" + ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f359348h).getValue()).get() + '|' + c().get() + '|' + d().get() + ')';
    }

    public final java.util.concurrent.atomic.AtomicInteger c() {
        return (java.util.concurrent.atomic.AtomicInteger) this.f359349i.getValue();
    }

    public final java.util.concurrent.atomic.AtomicInteger d() {
        return (java.util.concurrent.atomic.AtomicInteger) this.f359350m.getValue();
    }

    public final java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.modelbase.m1 m1Var = this.f359344d;
        sb6.append(m1Var.getClass().getName());
        sb6.append('@');
        sb6.append(m1Var.hashCode());
        sb6.append('(');
        sb6.append(q01.a1.f359259a.a(m1Var));
        sb6.append("), callbacks=(");
        sb6.append(this.f359346f);
        sb6.append('|');
        com.tencent.mm.network.l0 l0Var = this.f359347g;
        sb6.append(l0Var != null ? java.lang.Integer.valueOf(l0Var.hashCode()) : null);
        sb6.append("), counters=");
        sb6.append(b());
        return sb6.toString();
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        c().incrementAndGet();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueTracker", "#onGYNetEnd: " + e() + '}');
        com.tencent.mm.network.l0 l0Var = this.f359347g;
        kotlin.jvm.internal.o.d(l0Var);
        l0Var.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mm.modelbase.m1 m1Var = this.f359344d;
        if (d().get() >= c().get()) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect leaking callback: " + e());
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect leaking callback - clear & post");
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.NetSceneQueueTracker.Leak");
        ((ku5.t0) ku5.t0.f312615d).l(new q01.v(this, m1Var), 5000L, "MicroMsg.NetSceneQueueTracker.Leak");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        int i19;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!kotlin.jvm.internal.o.b(scene, this.f359344d)) {
            throw new java.lang.IllegalStateException("Illegal NetScene: callbacks are mismatched, expected=" + this.f359344d.getClass().getName() + '@' + this.f359344d.hashCode() + ", actual=" + scene.getClass().getName() + '@' + scene.hashCode());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueTracker", "#onSceneEnd callback to queue");
        this.f359345e.onSceneEnd(i17, i18, str, scene);
        d().incrementAndGet();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueTracker", "done: " + e());
        if (q01.e0.f359270a.e()) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            ((java.util.List) ((jz5.n) this.f359351n).getValue()).add(th6);
            if (((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f359348h).getValue()).get() > 0) {
                if (d().get() - ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) this.f359348h).getValue()).get() > 1 || d().get() - c().get() > 1) {
                    com.tencent.mm.modelbase.u0 u0Var = this.f359345e;
                    com.tencent.mm.modelbase.r1 r1Var = u0Var instanceof com.tencent.mm.modelbase.r1 ? (com.tencent.mm.modelbase.r1) u0Var : null;
                    if (r1Var != null) {
                        synchronized (r1Var.f70773p) {
                            linkedList = new java.util.LinkedList(r1Var.f70767g);
                        }
                        i19 = 0;
                        if (!linkedList.isEmpty()) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                if (kotlin.jvm.internal.o.b((com.tencent.mm.modelbase.m1) it.next(), scene) && (i19 = i19 + 1) < 0) {
                                    kz5.c0.o();
                                    throw null;
                                }
                            }
                        }
                    } else {
                        i19 = -1;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect duplicating callback to onSceneEnd: leakCount=" + i19);
                    java.util.LinkedHashMap a17 = a();
                    a17.put("leakCount", java.lang.Integer.valueOf(i19));
                    ap.a.a(10001, "errNetScene", th6, a17, "DuplicateCallback", q01.a1.f359259a.a(scene), b(), java.lang.String.valueOf(i19));
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect duplicating callback - clear & post");
                    ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.NetSceneQueueTracker.LeakCaller");
                    ((ku5.t0) ku5.t0.f312615d).l(new q01.w(this), 5000L, "MicroMsg.NetSceneQueueTracker.LeakCaller");
                }
            }
        }
    }
}
