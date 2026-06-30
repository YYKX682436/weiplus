package q01;

/* loaded from: classes12.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q01.a1 f359259a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f359260b;

    /* renamed from: c, reason: collision with root package name */
    public static final q01.a1 f359261c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f359262d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f359263e;

    static {
        q01.a1 a1Var = new q01.a1();
        f359259a = a1Var;
        jz5.i iVar = jz5.i.f302829d;
        f359260b = jz5.h.a(iVar, q01.z0.f359360d);
        f359261c = a1Var;
        f359262d = jz5.h.a(iVar, q01.y0.f359354d);
        f359263e = jz5.h.a(iVar, q01.x0.f359352d);
    }

    public final java.lang.String a(com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(m1Var, "<this>");
        if (m1Var.getType() != 0) {
            return m1Var.getType() + '-' + e(m1Var);
        }
        if (m1Var instanceof c01.ra) {
            return "0-local";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m1Var.getType());
        sb6.append('-');
        java.lang.String e17 = e(m1Var);
        if (e17 == null) {
            e17 = m1Var.getClass().getName();
        }
        sb6.append(e17);
        return sb6.toString();
    }

    public final boolean b() {
        return ((java.lang.Boolean) f359260b.getValue()).booleanValue();
    }

    public final q01.s0 c(com.tencent.mm.modelbase.m1 m1Var) {
        synchronized (f359261c) {
            int hashCode = m1Var.hashCode();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            jz5.g gVar = f359262d;
            if (((java.util.Map) gVar.getValue()).containsKey(valueOf)) {
                java.lang.Object obj = ((java.util.Map) gVar.getValue()).get(java.lang.Integer.valueOf(hashCode));
                kotlin.jvm.internal.o.d(obj);
                return (q01.s0) obj;
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(hashCode);
            jz5.g gVar2 = f359263e;
            if (!((java.util.Map) gVar2.getValue()).containsKey(valueOf2)) {
                return new q01.s0(m1Var);
            }
            java.lang.Object obj2 = ((java.util.Map) gVar2.getValue()).get(java.lang.Integer.valueOf(hashCode));
            kotlin.jvm.internal.o.d(obj2);
            return (q01.s0) obj2;
        }
    }

    public final void d(com.tencent.mm.modelbase.m1 netScene) {
        kotlin.jvm.internal.o.g(netScene, "netScene");
        if (b()) {
            netScene.trackState().g(300);
            synchronized (f359261c) {
                int hashCode = netScene.hashCode();
                q01.s0 s0Var = (q01.s0) ((java.util.Map) f359263e.getValue()).remove(java.lang.Integer.valueOf(hashCode));
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTracker", "#onRemoveNetScene: " + s0Var + '@' + hashCode);
                if (s0Var != null) {
                    hr0.k0 k0Var = (hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class));
                    k0Var.getClass();
                    ((ku5.t0) ku5.t0.f312615d).h(new hr0.h0(k0Var, s0Var, android.os.SystemClock.uptimeMillis() - s0Var.f359331c), "MicroMsg.NetSceneTrackFeatureService");
                }
            }
        }
    }

    public final java.lang.String e(com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String uri;
        kotlin.jvm.internal.o.g(m1Var, "<this>");
        com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
        if (reqResp == null || (uri = reqResp.getUri()) == null) {
            return null;
        }
        if (!r26.n0.B(uri, "/", false)) {
            return uri;
        }
        java.lang.String substring = uri.substring(r26.n0.P(uri, "/", 0, false, 6, null) + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }
}
