package d83;

/* loaded from: classes5.dex */
public final class t0 implements e70.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.ilink_stream.b f227021a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.o f227022b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f227023c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f227024d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f227025e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f227026f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f227027g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f227028h;

    public t0(boolean z17) {
        com.tencent.wechat.aff.ilink_stream.z zVar = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepaireConfigIlinkFullSpeedMode()) == 1 ? com.tencent.wechat.aff.ilink_stream.z.kTransferStrategyFullSpeedMode : com.tencent.wechat.aff.ilink_stream.z.kTransferStrategySpeedMode;
        com.tencent.wechat.aff.ilink_stream.b bVar = new com.tencent.wechat.aff.ilink_stream.b();
        bVar.f217223d = com.tencent.wechat.aff.ilink_stream.c.kStreamChannelModeDual;
        boolean[] zArr = bVar.f217229m;
        zArr[1] = true;
        bVar.f217227h = zVar;
        zArr[5] = true;
        bVar.f217225f = true;
        zArr[3] = true;
        bVar.f217228i = z17;
        zArr[6] = true;
        this.f227021a = bVar;
        this.f227023c = new java.util.concurrent.ConcurrentHashMap();
        this.f227024d = new java.util.concurrent.ConcurrentHashMap();
        this.f227025e = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ThreadPool.ILinkStreamController", gm0.j1.b().f273245h, 1);
        this.f227026f = new java.util.concurrent.atomic.AtomicLong(java.lang.System.currentTimeMillis());
        this.f227027g = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final void a(d83.t0 t0Var) {
        t0Var.f227026f.set(java.lang.System.currentTimeMillis());
        kotlinx.coroutines.r2 r2Var = t0Var.f227028h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        t0Var.f227028h = v65.i.b(t0Var.f227025e, null, new d83.s0(t0Var, null), 1, null);
    }

    public boolean b(java.lang.String streamId, e70.c0 listener) {
        kotlin.jvm.internal.o.g(streamId, "streamId");
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f227023c;
        d83.h0 h0Var = (d83.h0) concurrentHashMap.get(streamId);
        if (h0Var == null) {
            return false;
        }
        h0Var.f226973d.add(listener);
        concurrentHashMap.put(streamId, h0Var);
        return true;
    }

    public void c() {
        if (this.f227027g.compareAndSet(false, true)) {
            if (this.f227022b == null) {
                synchronized (this) {
                    if (this.f227022b == null) {
                        this.f227022b = com.tencent.wechat.aff.ilink_stream.p.f217294b.d(this.f227021a);
                        this.f227027g.set(false);
                    }
                }
            }
            a(this);
            com.tencent.wechat.aff.ilink_stream.o oVar = this.f227022b;
            if (oVar != null) {
                oVar.f("event", new d83.l0(this));
                oVar.h("event", new d83.n0(this));
                oVar.i("event", new d83.o0(this));
                oVar.e("event", new d83.p0(this));
                oVar.g("event", new d83.q0(this));
                oVar.o(300);
            }
        }
    }

    public void d() {
        synchronized (this) {
            java.util.Collection values = this.f227023c.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            for (d83.h0 h0Var : kz5.n0.S0(values)) {
                h0Var.f226975f.invoke();
                kotlinx.coroutines.r2 r2Var = h0Var.f226974e;
                if (r2Var != null) {
                    h0Var.f226974e = null;
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                h0Var.f226973d.clear();
            }
            this.f227023c.clear();
            java.util.Collection values2 = this.f227024d.values();
            kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
            java.util.Iterator it = kz5.n0.S0(values2).iterator();
            while (it.hasNext()) {
                ((d83.h0) it.next()).f226973d.clear();
            }
            this.f227024d.clear();
            com.tencent.wechat.aff.ilink_stream.o oVar = this.f227022b;
            if (oVar != null) {
                oVar.m("event");
                oVar.k("event");
                oVar.n("event");
                oVar.j("event");
                oVar.l("event");
            }
            this.f227022b = null;
            this.f227027g.set(false);
        }
    }

    public void e(java.lang.String streamId) {
        kotlin.jvm.internal.o.g(streamId, "streamId");
        d83.h0 h0Var = (d83.h0) this.f227023c.remove(streamId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseStream streamId: ");
        sb6.append(streamId);
        sb6.append(", existed: ");
        sb6.append(h0Var != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", sb6.toString());
        if (h0Var != null) {
            this.f227024d.put(streamId, h0Var);
            h0Var.f226975f.invoke();
            kotlinx.coroutines.r2 r2Var = h0Var.f226974e;
            if (r2Var != null) {
                h0Var.f226974e = null;
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            v65.i.b(this.f227025e, null, new d83.r0(this, streamId, null), 1, null);
        }
    }
}
