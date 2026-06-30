package mb2;

/* loaded from: classes5.dex */
public final class i extends mb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f325345e;

    /* renamed from: f, reason: collision with root package name */
    public final e42.b0 f325346f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, java.lang.Object obj, e42.b0 expname, yz5.a onConfigChanged) {
        super(obj, "SVR", onConfigChanged);
        kotlin.jvm.internal.o.g(expname, "expname");
        kotlin.jvm.internal.o.g(onConfigChanged, "onConfigChanged");
        this.f325345e = z17;
        this.f325346f = expname;
        this.f325347g = jz5.h.b(mb2.h.f325344d);
        a();
        com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor finderSvrConfigMonitor = com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor.f102819d;
        java.lang.String name = expname.name();
        kotlin.jvm.internal.o.f(name, "name(...)");
        finderSvrConfigMonitor.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.config.base.FinderSvrConfigMonitor.f102820e;
        if (concurrentHashMap.containsKey(name)) {
            return;
        }
        concurrentHashMap.put(name, new java.lang.ref.WeakReference(this));
    }

    @Override // mb2.a, mb2.e
    public void a() {
        boolean z17 = this.f325345e;
        this.f325336d = d(z17);
        com.tencent.mars.xlog.Log.i("ConfigItem", "[updateValueFromSvr] isReadWithHit=" + z17 + " keyName:" + this.f325346f.name() + ", has update to " + this.f325336d);
    }

    @Override // mb2.a
    public void b() {
        d(true);
        com.tencent.mars.xlog.Log.i("ConfigItem", "[manualHit] keyName:" + this.f325346f.name() + ", has update to " + this.f325336d);
    }

    @Override // mb2.a
    public java.lang.Object c() {
        if (((java.lang.Number) this.f325347g.getValue()).intValue() == 1) {
            a();
        }
        java.lang.Object obj = this.f325336d;
        return obj == null ? this.f325333a : obj;
    }

    public final java.lang.Object d(boolean z17) {
        e42.b0 b0Var = this.f325346f;
        java.lang.Object obj = this.f325333a;
        if (z17) {
            if (obj instanceof java.lang.Integer) {
                e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return java.lang.Integer.valueOf(((h62.d) e0Var).Ni(b0Var, ((java.lang.Integer) obj).intValue()));
            }
            if (obj instanceof java.lang.Long) {
                e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                return java.lang.Long.valueOf(((h62.d) e0Var2).Ui(b0Var, ((java.lang.Long) obj).longValue()));
            }
            if (obj instanceof java.lang.Boolean) {
                e42.e0 e0Var3 = (e42.e0) i95.n0.c(e42.e0.class);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                return java.lang.Boolean.valueOf(((h62.d) e0Var3).fj(b0Var, ((java.lang.Boolean) obj).booleanValue()));
            }
            if (obj instanceof java.lang.String) {
                e42.e0 e0Var4 = (e42.e0) i95.n0.c(e42.e0.class);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                return ((h62.d) e0Var4).Zi(b0Var, (java.lang.String) obj, true);
            }
            if (!(obj instanceof java.lang.Float)) {
                return obj;
            }
            e42.e0 e0Var5 = (e42.e0) i95.n0.c(e42.e0.class);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(((h62.d) e0Var5).Di(b0Var, ((java.lang.Float) obj).floatValue()));
        }
        if (obj instanceof java.lang.Integer) {
            e42.e0 e0Var6 = (e42.e0) i95.n0.c(e42.e0.class);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(((h62.d) e0Var6).rj(b0Var, ((java.lang.Integer) obj).intValue()));
        }
        if (obj instanceof java.lang.Long) {
            e42.e0 e0Var7 = (e42.e0) i95.n0.c(e42.e0.class);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((java.lang.Long) obj).longValue();
            java.lang.String Zi = ((h62.d) e0Var7).Zi(b0Var, "", false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                longValue = com.tencent.mm.sdk.platformtools.t8.V(Zi, longValue);
            }
            return java.lang.Long.valueOf(longValue);
        }
        if (obj instanceof java.lang.Boolean) {
            e42.e0 e0Var8 = (e42.e0) i95.n0.c(e42.e0.class);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(((h62.d) e0Var8).sj(b0Var, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (obj instanceof java.lang.String) {
            e42.e0 e0Var9 = (e42.e0) i95.n0.c(e42.e0.class);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            return ((h62.d) e0Var9).Zi(b0Var, (java.lang.String) obj, false);
        }
        if (!(obj instanceof java.lang.Float)) {
            return obj;
        }
        e42.e0 e0Var10 = (e42.e0) i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) obj).floatValue();
        java.lang.String Zi2 = ((h62.d) e0Var10).Zi(b0Var, "", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi2)) {
            floatValue = com.tencent.mm.sdk.platformtools.t8.L(Zi2, floatValue);
        }
        return java.lang.Float.valueOf(floatValue);
    }
}
