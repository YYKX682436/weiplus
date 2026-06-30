package nq0;

@j95.b(dependencies = {com.tencent.mm.plugin.magicbrush.s4.class})
/* loaded from: classes7.dex */
public final class p extends i95.w implements gq0.t {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f338942d = jz5.h.b(nq0.n.f338939d);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338943e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f338944f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f338945g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f338946h = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f338947i = new java.util.LinkedHashMap();

    public synchronized iq0.c Ai(yz5.a bizCreator, java.lang.String instanceKey) {
        kotlin.jvm.internal.o.g(bizCreator, "bizCreator");
        kotlin.jvm.internal.o.g(instanceKey, "instanceKey");
        iq0.a aVar = (iq0.a) bizCreator.invoke();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        iq0.b bVar = iq0.c.f293642e;
        h0Var.f310123d = bVar.b(aVar.f293634a, instanceKey, false);
        ((mq0.s0) Ri()).Ai(aVar.f293634a, "", "", mq0.a.f330527v, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f310123d).f293647d)));
        if (((jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(h0Var.f310123d)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "acquire biz, which is existed, bizHandle: " + h0Var.f310123d);
            ((mq0.s0) Ri()).Ai(aVar.f293634a, "", "", mq0.a.f330529x, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f310123d).f293647d)));
            return (iq0.c) h0Var.f310123d;
        }
        jz5.l Zi = Zi(aVar);
        if (((java.lang.Boolean) Zi.f302834e).booleanValue()) {
            bVar.a((iq0.c) h0Var.f310123d);
            h0Var.f310123d = bVar.b(aVar.f293634a, instanceKey, true);
            ((mq0.s0) Ri()).Ai(aVar.f293634a, "", "", mq0.a.f330530y, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f310123d).f293647d)));
        } else {
            ((mq0.s0) Ri()).Ai(aVar.f293634a, "", "", mq0.a.f330528w, true, "", kz5.b1.e(new jz5.l("bizHandle", ((iq0.c) h0Var.f310123d).f293647d)));
        }
        jc3.i0 i0Var = (jc3.i0) Zi.f302833d;
        if (i0Var != null) {
            this.f338945g.put(h0Var.f310123d, bizCreator);
            this.f338944f.put(h0Var.f310123d, i0Var);
            if (!(i0Var instanceof hq0.b0)) {
                i0Var.S(new nq0.k(h0Var, this));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "acquire biz, handle: " + h0Var.f310123d + ", isPreload: " + ((iq0.c) h0Var.f310123d).f293646c);
        return (iq0.c) h0Var.f310123d;
    }

    public void Bi(iq0.c handle, iq0.e eVar, android.view.ViewGroup containerView, java.lang.String frameSetName, java.lang.String frameSetData, int i17, yz5.l lVar) {
        jc3.i0 i0Var;
        kotlin.jvm.internal.o.g(handle, "handle");
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(handle);
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (!(i0Var instanceof hq0.h)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
            i0Var = null;
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar != null) {
            ((hq0.b0) hVar).N1(eVar, containerView, frameSetName, frameSetData, i17, lVar);
        }
    }

    public void Di(iq0.c handle) {
        jc3.i0 i0Var;
        yz5.a aVar;
        kotlin.jvm.internal.o.g(handle, "handle");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "deactiveBiz");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(handle);
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.deactivate();
            if (!(i0Var instanceof hq0.b0) || (aVar = (yz5.a) ((java.util.LinkedHashMap) this.f338945g).get(handle)) == null) {
                return;
            }
            double d17 = ((iq0.a) aVar.invoke()).f293639f;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "releaseBiz " + d17 + " later");
            if (d17 == 0.0d) {
                aj(handle);
                return;
            }
            if (d17 > 0.0d) {
                java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) this.f338947i).get(handle);
                if (runnable != null) {
                    this.f338946h.removeCallbacks(runnable);
                }
                nq0.o oVar = new nq0.o(this, handle);
                this.f338947i.put(handle, oVar);
                this.f338946h.postDelayed(oVar, (long) (1000 * d17));
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "releaseBiz " + d17 + " later");
            }
        }
    }

    public java.lang.String Ni(iq0.c handle) {
        jc3.i0 i0Var;
        java.lang.String e17;
        kotlin.jvm.internal.o.g(handle, "handle");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(handle);
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (!(i0Var instanceof hq0.h)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
            i0Var = null;
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar == null) {
            return "";
        }
        hq0.b0 b0Var = (hq0.b0) hVar;
        jc3.x E1 = b0Var.E1();
        return (E1 == null || (e17 = E1.e()) == null) ? ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi(b0Var.f282970x.f293634a) : e17;
    }

    public final mq0.d0 Ri() {
        java.lang.Object value = ((jz5.n) this.f338942d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (mq0.d0) value;
    }

    public void Ui(iq0.c handle, com.tencent.mm.plugin.magicbrush.base.MBJsEventBase jsEvent) {
        jc3.i0 i0Var;
        kotlin.jvm.internal.o.g(handle, "handle");
        kotlin.jvm.internal.o.g(jsEvent, "jsEvent");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(handle);
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.l(jsEvent);
        }
    }

    public synchronized gq0.y Vi(iq0.d bizConfig) {
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        java.lang.String str = bizConfig.f293648a;
        mq0.d0 Ri = Ri();
        mq0.a aVar = mq0.a.f330524s;
        kz5.q0 q0Var = kz5.q0.f314001d;
        ((mq0.s0) Ri).Ai(str, "", "", aVar, true, "", q0Var);
        if (((jc3.i0) this.f338943e.get(str)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "preload, exceed cache size, bizName: ".concat(str));
            ((mq0.s0) Ri()).Ai(str, "", "", mq0.a.f330526u, true, "", kz5.b1.e(new jz5.l("errMsg", "exceed cache size")));
            return gq0.y.f274492f;
        }
        jz5.f0 f0Var = null;
        gq0.s bVar = bizConfig instanceof iq0.i ? new oq0.b() : bizConfig instanceof iq0.f ? new oq0.a() : null;
        if (bVar != null) {
            jz5.l a17 = bVar.a(bizConfig, new nq0.m(this, str, bizConfig));
            jc3.r0 r0Var = (jc3.r0) a17.f302833d;
            jc3.i0 i0Var = (jc3.i0) a17.f302834e;
            if (r0Var == jc3.r0.f298978d && i0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "preload success, bizName: ".concat(str));
                this.f338943e.put(str, i0Var);
                ((mq0.s0) Ri()).Ai(str, "", "", mq0.a.f330525t, true, "", q0Var);
                return gq0.y.f274490d;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "preload fail, bizName: " + str + ", reason: " + r0Var);
            mq0.d0 Ri2 = Ri();
            ((mq0.s0) Ri2).Ai(str, "", "", mq0.a.f330526u, true, "", kz5.b1.e(new jz5.l("errMsg", "preload fail, reason " + r0Var)));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "preload, factory not match, bizName: ".concat(str));
            ((mq0.s0) Ri()).Ai(str, "", "", mq0.a.f330526u, true, "", kz5.b1.e(new jz5.l("errMsg", "factory not match")));
        }
        return gq0.y.f274491e;
    }

    public final jz5.l Zi(iq0.a aVar) {
        jc3.i0 b17;
        java.lang.String str = aVar.f293634a;
        gq0.s bVar = aVar instanceof iq0.h ? new oq0.b() : aVar instanceof iq0.g ? new oq0.a() : null;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "provideBizInstance, biz factory not found, bizName: " + str);
            return new jz5.l(null, java.lang.Boolean.FALSE);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f338943e;
        jc3.i0 i0Var = (jc3.i0) concurrentHashMap.get(str);
        if (i0Var == null || (b17 = bVar.b(i0Var, aVar)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "provideBizInstance, create biz, bizName: " + str);
            return new jz5.l(bVar.c(aVar), java.lang.Boolean.FALSE);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "provideBizInstance, use preload biz, bizName: " + str);
        concurrentHashMap.remove(str);
        return new jz5.l(b17, java.lang.Boolean.TRUE);
    }

    public final synchronized void aj(iq0.c cVar) {
        jc3.i0 i0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "releaseBiz");
        synchronized (cVar) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(cVar);
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (!(i0Var instanceof hq0.h)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
            i0Var = null;
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar != null) {
            ((hq0.b0) hVar).destroy();
        }
        iq0.c.f293642e.a(cVar);
        this.f338944f.remove(cVar);
        this.f338945g.remove(cVar);
    }

    public void bj(iq0.c handle, java.lang.String script, yz5.l lVar) {
        jc3.i0 i0Var;
        kotlin.jvm.internal.o.g(handle, "handle");
        kotlin.jvm.internal.o.g(script, "script");
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(handle);
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.t0(script, lVar);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        java.util.Map map = ge3.s.f270974a;
        for (java.lang.String str : ge3.s.f270974a.keySet()) {
            ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).bj(str, new nq0.l(str));
        }
    }

    public void wi(iq0.c handle, android.app.Activity activity) {
        jc3.i0 i0Var;
        kotlin.jvm.internal.o.g(handle, "handle");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "active");
        java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) this.f338947i).get(handle);
        if (runnable != null) {
            this.f338946h.removeCallbacks(runnable);
        }
        synchronized (handle) {
            i0Var = (jc3.i0) ((java.util.LinkedHashMap) this.f338944f).get(handle);
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                i0Var = null;
            }
        }
        if (i0Var != null) {
            i0Var.V(activity);
        }
    }
}
