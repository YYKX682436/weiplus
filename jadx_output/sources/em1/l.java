package em1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m f255053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f255054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f255055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f255056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255057h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f255058i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ em1.d f255059m;

    public l(em1.d dVar, com.tencent.mm.plugin.appbrand.jsapi.m mVar, java.util.List list, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, cl.q0 q0Var, int i17, boolean z17) {
        this.f255059m = dVar;
        this.f255053d = mVar;
        this.f255054e = list;
        this.f255055f = c0Var;
        this.f255056g = q0Var;
        this.f255057h = i17;
        this.f255058i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.jsapi.component.service.a0 y17;
        com.tencent.luggage.sdk.jsapi.component.service.e eVar = new com.tencent.luggage.sdk.jsapi.component.service.e(new em1.k(this, this.f255053d));
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams appBrandCommonBindingJniParams = new com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams();
        long isolatePtr = ((cl.a) this.f255056g.f42724b).f42568a.getIsolatePtr();
        long e17 = this.f255056g.e();
        long uVLoopPtr = ((cl.a) this.f255056g.f42724b).f42568a.getUVLoopPtr();
        java.lang.String m17 = this.f255059m.m();
        appBrandCommonBindingJniParams.wasmCachePath = m17;
        if (!android.text.TextUtils.isEmpty(m17)) {
            appBrandCommonBindingJniParams.wasmCachePath = com.tencent.mm.vfs.w6.i(appBrandCommonBindingJniParams.wasmCachePath, true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.m mVar = this.f255053d;
        if ((mVar instanceof com.tencent.luggage.sdk.jsapi.component.service.y) && (y17 = ((com.tencent.luggage.sdk.jsapi.component.service.y) mVar).y1()) != null) {
            appBrandCommonBindingJniParams.wasmOptState = y17.U();
        }
        eVar.f47398a.notifyCreate(appBrandCommonBindingJniParams);
        eVar.f47398a.notifyBindTo(isolatePtr, e17, uVLoopPtr);
        if (!(cl.q0.f42722l != null)) {
            eVar.f47398a.notifyBindConsoleTo(isolatePtr, e17, uVLoopPtr);
        }
        eVar.f47399b.a(((cl.a) this.f255056g.f42724b).f42568a.getIsolatePtr(), this.f255056g.e());
        this.f255059m.f255026f.put(this.f255057h, eVar);
        com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = new com.tencent.luggage.sdk.jsapi.component.service.n2();
        com.tencent.mm.weapp_core.JsBridge jsBridge = n2Var.f47502a;
        if (jsBridge == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        jsBridge.bindTo(isolatePtr, e17);
        this.f255059m.f255029i.put(this.f255057h, n2Var);
        if (this.f255058i && !this.f255059m.f255027g.get()) {
            synchronized (this.f255059m.f255028h) {
                android.util.SparseArray sparseArray = this.f255059m.f255028h;
                int i17 = this.f255057h;
                sparseArray.put(i17, new em1.n(i17, eVar, this.f255056g, this.f255053d));
            }
            return;
        }
        eVar.f47398a.notifyRuntimeReady(this.f255053d.getAppId(), this.f255059m.l(this.f255053d), this.f255059m.k(this.f255053d));
        com.tencent.mm.plugin.appbrand.jsapi.m mVar2 = this.f255053d;
        if (mVar2 instanceof com.tencent.mm.plugin.appbrand.e9) {
            com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) mVar2;
            if (e9Var.getRuntime() != null) {
                n2Var.c(e9Var.getRuntime(), uVLoopPtr);
            }
        }
    }
}
