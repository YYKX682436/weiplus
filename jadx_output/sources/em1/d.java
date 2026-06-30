package em1;

/* loaded from: classes7.dex */
public abstract class d extends cl.l3 {

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f255026f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f255027g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f255028h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SparseArray f255029i;

    public d(cl.m3 m3Var) {
        super(m3Var);
        this.f255026f = new em1.e(this, 1);
        this.f255027g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f255028h = new android.util.SparseArray();
        this.f255029i = new em1.f(this, 1);
        this.f42688d = com.tencent.mm.plugin.appbrand.utils.e3.a();
    }

    @Override // cl.l3
    public void a(cl.q0 q0Var, java.util.ArrayList arrayList, cl.k3 k3Var) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        em1.h hVar = new em1.h(this, arrayList2, q0Var, k3Var);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cl.j3 j3Var = (cl.j3) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.V8EngineWorkerManagerLU", "batchInjectWorkEvalItems, about to submit item:%s, valid(%b)", j3Var.f42668a, java.lang.Boolean.valueOf(j3Var.a()));
            if (j3Var.a()) {
                boolean z17 = j3Var instanceof em1.o;
                if (z17) {
                }
                java.lang.String[] strArr = com.tencent.luggage.sdk.jsapi.component.o.f47360l0;
                int length = strArr.length;
                boolean z18 = false;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (u46.l.b(j3Var.f42668a, strArr[i17])) {
                        z18 = true;
                        break;
                    }
                    i17++;
                }
                com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = j3Var.f42669b;
                if (z18) {
                    hVar.apply(java.lang.Boolean.FALSE);
                    if (j3Var.a()) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
                        arrayList3.add(v8ScriptEvaluateRequest);
                        q0Var.b(arrayList3, com.tencent.mm.plugin.appbrand.utils.e3.a(), new em1.i(this, j3Var, currentTimeMillis));
                    }
                } else {
                    java.lang.String str = z17 ? ((em1.o) j3Var).f255065c : null;
                    if (!u46.l.e(str)) {
                        com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest2 = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
                        v8ScriptEvaluateRequest2.scriptText = str;
                        v8ScriptEvaluateRequest2.scriptType = 3;
                        arrayList2.add(v8ScriptEvaluateRequest2);
                    }
                    arrayList2.add(v8ScriptEvaluateRequest);
                }
            }
        }
        hVar.apply(java.lang.Boolean.TRUE);
    }

    @Override // cl.l3
    public void b(cl.q0 q0Var, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (q0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.V8EngineWorkerManagerLU", "hy: engine context released");
        } else if (valueCallback != null) {
            q0Var.d(str, new em1.m(this, valueCallback));
        } else {
            q0Var.d(str, null);
        }
    }

    @Override // cl.l3
    public void c(android.content.Context context, int i17, com.tencent.mm.plugin.appbrand.jsapi.m mVar, java.util.List list, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.V8EngineWorkerManagerLU", "hy: trigger bind to %d", java.lang.Integer.valueOf(i17));
        cl.q0 q0Var = (cl.q0) this.f42686b.get(java.lang.Integer.valueOf(i17));
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(q0Var);
        if (q0Var == null || mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.V8EngineWorkerManagerLU", "hy: worker not in map!");
        } else {
            ((cl.a) q0Var.f42724b).h(new em1.l(this, mVar, list, d(i17, weakReference), q0Var, i17, z17), false);
        }
    }

    @Override // cl.l3
    public void e(final int i17, cl.q0 q0Var) {
        final com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = (com.tencent.luggage.sdk.jsapi.component.service.n2) this.f255029i.get(i17);
        if (n2Var != null) {
            cl.p pVar = q0Var.f42724b;
            ((cl.a) pVar).f42588u.add(new java.lang.Runnable() { // from class: em1.d$$a
                @Override // java.lang.Runnable
                public final void run() {
                    u81.h hVar;
                    em1.d dVar = em1.d.this;
                    dVar.getClass();
                    com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var2 = n2Var;
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = n2Var2.f47505d;
                    if (appBrandRuntime != null && (hVar = appBrandRuntime.N) != null) {
                        hVar.c(n2Var2.f47503b);
                    }
                    com.tencent.mm.weapp_core.JsBridge jsBridge = n2Var2.f47502a;
                    if (jsBridge == null) {
                        kotlin.jvm.internal.o.o("jsBridge");
                        throw null;
                    }
                    jsBridge.destroy();
                    dVar.f255029i.remove(i17);
                }
            });
        }
        final com.tencent.luggage.sdk.jsapi.component.service.e eVar = (com.tencent.luggage.sdk.jsapi.component.service.e) this.f255026f.get(i17);
        if (eVar != null) {
            cl.p pVar2 = q0Var.f42724b;
            ((cl.a) pVar2).f42587t.add(new java.lang.Runnable() { // from class: em1.d$$b
                @Override // java.lang.Runnable
                public final void run() {
                    em1.d dVar = em1.d.this;
                    dVar.getClass();
                    com.tencent.luggage.sdk.jsapi.component.service.e eVar2 = eVar;
                    eVar2.f47399b.b();
                    eVar2.f47398a.notifyDestroy();
                    dVar.f255026f.remove(i17);
                }
            });
        }
        synchronized (this.f255028h) {
            this.f255028h.remove(i17);
        }
        super.e(i17, q0Var);
    }

    @Override // cl.l3
    public void f() {
        super.f();
        this.f255026f.clear();
        this.f255029i.clear();
        this.f255028h.clear();
    }

    @Override // cl.l3
    public void h() {
        if (this.f255027g.getAndSet(true)) {
            return;
        }
        synchronized (this.f255028h) {
            for (int i17 = 0; i17 < this.f255028h.size(); i17++) {
                final em1.n nVar = (em1.n) this.f255028h.valueAt(i17);
                final com.tencent.mm.plugin.appbrand.jsapi.m mVar = nVar.f255064d;
                ((cl.a) nVar.f255063c.f42724b).h(new java.lang.Runnable() { // from class: em1.d$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        em1.d dVar = em1.d.this;
                        dVar.getClass();
                        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = nVar.f255062b.f47398a;
                        com.tencent.mm.plugin.appbrand.jsapi.m mVar2 = mVar;
                        appBrandCommonBindingJni.notifyRuntimeReady(mVar2.getAppId(), dVar.l(mVar2), dVar.k(mVar2));
                    }
                }, false);
                final com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = (com.tencent.luggage.sdk.jsapi.component.service.n2) this.f255029i.get(nVar.f255061a);
                if (n2Var != null && (mVar instanceof com.tencent.mm.plugin.appbrand.e9)) {
                    final com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) mVar;
                    if (e9Var.t3() != null) {
                        ((cl.a) nVar.f255063c.f42724b).h(new java.lang.Runnable() { // from class: em1.d$$d
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.luggage.sdk.jsapi.component.service.n2.this.c(e9Var.t3(), ((cl.a) nVar.f255063c.f42724b).f42568a.getUVLoopPtr());
                            }
                        }, false);
                    }
                }
            }
        }
    }

    @Override // cl.l3
    public com.tencent.mm.appbrand.v8.IJSRuntime$Config i(com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.V8EngineWorkerManagerLU", "[no-node] setupJSRuntimeConfig called");
        com.tencent.mm.appbrand.v8.IJSRuntime$Config i17 = super.i(mVar);
        if (!(mVar instanceof com.tencent.luggage.sdk.jsapi.component.service.y) ? false : ((com.tencent.luggage.sdk.jsapi.component.service.y) mVar).A1().f47370q) {
            i17.f53960r = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.V8EngineWorkerManagerLU", "[no-node] setupJSRuntimeConfig: config.skipNode = true");
        }
        return i17;
    }

    public final java.lang.String k(com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) mVar.q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        if (iCommLibReader == null) {
            return "";
        }
        return org.chromium.base.BaseSwitches.V + iCommLibReader.i();
    }

    public java.lang.String l(com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        return "";
    }

    public java.lang.String m() {
        return "";
    }

    public void n(cl.j3 j3Var, long j17, long j18, cl.k1 k1Var) {
    }
}
