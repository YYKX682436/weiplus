package ih1;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f291530a;

    /* renamed from: b, reason: collision with root package name */
    public final ih1.e f291531b;

    /* renamed from: c, reason: collision with root package name */
    public iq0.c f291532c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f291533d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f291534e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f291535f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f291536g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f291537h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f291538i;

    /* renamed from: j, reason: collision with root package name */
    public kotlinx.coroutines.r2 f291539j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f291540k;

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f291541l;

    public u(java.lang.String appId, ih1.e onMBADCallback) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(onMBADCallback, "onMBADCallback");
        this.f291530a = appId;
        this.f291531b = onMBADCallback;
        this.f291533d = jz5.h.b(new ih1.o(this));
        this.f291535f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310568a));
        this.f291536g = jz5.h.b(new ih1.n(this));
        jc3.y0 wi6 = ((com.tencent.mm.advertise.impl.jsapi.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicAdMiniProgram");
        java.util.LinkedList linkedList = new java.util.LinkedList(wi6.f299012a);
        linkedList.add(new hh1.c());
        this.f291537h = linkedList;
        this.f291538i = new java.util.HashSet(wi6.f299013b);
        this.f291540k = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        int i17 = kotlinx.coroutines.r0.N0;
        this.f291541l = new ih1.q(kotlinx.coroutines.q0.f310567d, this);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291530a + "], destroy");
        this.f291534e = true;
        iq0.c cVar = this.f291532c;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
        }
        com.tencent.mm.plugin.appbrand.service.i0 i0Var = (com.tencent.mm.plugin.appbrand.service.i0) this.f291531b;
        i0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] getGlobalNativeWidgetHandler");
        com.tencent.mm.plugin.appbrand.o6 t37 = i0Var.f88685a.t3();
        com.tencent.mm.plugin.appbrand.page.z zVar = (t37 == null || !t37.J0()) ? null : t37.D1;
        if (zVar != null) {
            zVar.r(3);
        }
        kotlinx.coroutines.z0.e(this.f291535f, null, 1, null);
        f();
        kotlinx.coroutines.z0.e(this.f291540k, null, 1, null);
    }

    public final ih1.m b() {
        return (ih1.m) ((jz5.n) this.f291536g).getValue();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291530a + "], pause");
        ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).getClass();
        boolean z17 = false;
        jc3.i0 i0Var = null;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_ad_mini_program_heart_beat, -1) == 1) {
            com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291530a + "], start send heart beat from app");
            kotlinx.coroutines.r2 r2Var = this.f291539j;
            if (r2Var != null && r2Var.a()) {
                z17 = true;
            }
            if (!z17) {
                kotlinx.coroutines.r2 r2Var2 = this.f291539j;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                this.f291539j = kotlinx.coroutines.l.d(this.f291540k, this.f291541l, null, new ih1.t(this, null), 2, null);
            }
        }
        iq0.c cVar = this.f291532c;
        if (cVar != null) {
            nq0.p pVar = (nq0.p) ((gq0.t) i95.n0.c(gq0.t.class));
            pVar.getClass();
            synchronized (cVar) {
                jc3.i0 i0Var2 = (jc3.i0) ((java.util.LinkedHashMap) pVar.f338944f).get(cVar);
                if (i0Var2 != null) {
                    i0Var = i0Var2;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                }
            }
            if (i0Var != null) {
                i0Var.pause();
            }
        }
    }

    public final void d() {
        long j17;
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "[MBAd] preload start");
        try {
            j17 = ((java.lang.Number) ((jz5.n) ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).f446414h).getValue()).longValue();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MagicAdMiniProgramInstaller", "[MBAd] preload read mbPreloadCacheTime failed, fallback cacheTime=0 (disabled): " + th6);
            j17 = 0;
        }
        int i17 = s26.a.f402368f;
        long f17 = s26.c.f(j17, s26.d.f402372g);
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "[MBAd] preload cacheTime(sec):" + j17 + ", bizName:MagicAdMiniProgram");
        ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Vi(new iq0.f("MagicAdMiniProgram", jc3.s0.f298984d, f17, null, this.f291537h, this.f291538i, 0.0d, b(), null, b(), 64, null));
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "[MBAd] preload submitted to MagicCardStarter");
    }

    public final void e() {
        jc3.i0 i0Var;
        jc3.i0 i0Var2;
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291530a + "], resume");
        iq0.c cVar = this.f291532c;
        if (cVar != null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            nq0.p pVar = (nq0.p) tVar;
            pVar.getClass();
            synchronized (cVar) {
                i0Var = (jc3.i0) ((java.util.LinkedHashMap) pVar.f338944f).get(cVar);
                i0Var2 = null;
                if (i0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                    i0Var = null;
                }
            }
            if (i0Var != null) {
                i0Var.resume();
            }
            nq0.p pVar2 = (nq0.p) tVar;
            synchronized (cVar) {
                jc3.i0 i0Var3 = (jc3.i0) ((java.util.LinkedHashMap) pVar2.f338944f).get(cVar);
                if (i0Var3 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                } else if (i0Var3 instanceof hq0.h) {
                    i0Var2 = i0Var3;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
                }
            }
            hq0.h hVar = (hq0.h) i0Var2;
            if (hVar != null) {
                hq0.b0 b0Var = (hq0.b0) hVar;
                java.lang.String str = b0Var.f282971y;
                com.tencent.mars.xlog.Log.i(str, "redraw");
                for (java.util.Map.Entry entry : b0Var.f283001p.entrySet()) {
                    com.tencent.mars.xlog.Log.i(str, "redraw, frameSetId: " + ((java.lang.String) entry.getKey()));
                    try {
                        ((hq0.e0) entry.getValue()).g();
                    } catch (java.lang.RuntimeException e17) {
                        com.tencent.mars.xlog.Log.e(str, "redraw failed for frameSetId: " + ((java.lang.String) entry.getKey()), e17);
                    }
                }
            }
        }
        f();
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291530a + "], stop send heart beat form app");
        kotlinx.coroutines.r2 r2Var = this.f291539j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f291539j = null;
    }
}
