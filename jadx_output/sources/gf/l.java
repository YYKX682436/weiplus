package gf;

/* loaded from: classes7.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f271112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.skyline.SkylineRuntime f271113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.l0 f271114g;

    public l(int i17, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.skyline.SkylineRuntime skylineRuntime, com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var) {
        this.f271111d = i17;
        this.f271112e = tVar;
        this.f271113f = skylineRuntime;
        this.f271114g = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", "initJSEngine on JsThread " + this.f271111d);
        df.h.f229470a.getClass();
        if (df.h.f229474e) {
            com.tencent.mm.plugin.appbrand.jsruntime.t tVar = this.f271112e;
            if (tVar instanceof com.tencent.mm.plugin.appbrand.jsruntime.o0) {
                kotlin.jvm.internal.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsruntime.AppBrandNodeJSBasedJsEngine");
                cl.q0 q0Var = ((com.tencent.mm.plugin.appbrand.jsruntime.o0) tVar).f83969g;
                if (q0Var != null) {
                    cl.w2 w2Var = new cl.w2();
                    w2Var.f42816e = true;
                    w2Var.b(q0Var);
                }
            }
        }
        com.tencent.skyline.SkylineRuntime skylineRuntime = this.f271113f;
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = this.f271114g;
        skylineRuntime.initJSEngine(l0Var.L(), l0Var.G(), l0Var.z());
    }
}
