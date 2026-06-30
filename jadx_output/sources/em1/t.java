package em1;

/* loaded from: classes7.dex */
public abstract class t extends em1.d {
    public static final void o(em1.t tVar, com.tencent.mm.plugin.appbrand.jsapi.m mVar, java.lang.Runnable runnable) {
        tVar.getClass();
        com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = mVar instanceof com.tencent.luggage.sdk.jsapi.component.service.y ? (com.tencent.luggage.sdk.jsapi.component.service.y) mVar : null;
        if (o0Var != (yVar != null ? yVar.w1() : null)) {
            ((ku5.t0) ku5.t0.f312615d).r(runnable, "MicroMsg.V8WorkerManagerWC");
        }
    }

    @Override // cl.l3
    public com.tencent.mm.plugin.appbrand.jsruntime.c0 d(int i17, java.lang.ref.WeakReference weakReference) {
        com.tencent.mm.plugin.appbrand.w9[] w9VarArr = com.tencent.mm.plugin.appbrand.w9.f90956d;
        return i17 == 0 ? new em1.p(this, weakReference) : new cl.c3(this, weakReference);
    }

    @Override // em1.d, cl.l3
    public com.tencent.mm.appbrand.v8.IJSRuntime$Config i(com.tencent.mm.plugin.appbrand.jsapi.m component) {
        kotlin.jvm.internal.o.g(component, "component");
        com.tencent.mm.appbrand.v8.IJSRuntime$Config i17 = super.i(component);
        com.tencent.mm.plugin.appbrand.v8_snapshot.d1 d1Var = (com.tencent.mm.plugin.appbrand.v8_snapshot.d1) i95.n0.c(com.tencent.mm.plugin.appbrand.v8_snapshot.d1.class);
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo w57 = d1Var != null ? d1Var.w5() : null;
        i17.f53959q = new em1.s(w57, this, component);
        if (w57 == null) {
            return i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.V8WorkerManagerWC", "setupJSRuntimeConfig, use nodeOnly snapshot");
        i17.f53944b = w57.f90669i;
        i17.f53945c = true;
        i17.f53947e = w57.c();
        return i17;
    }

    @Override // cl.l3
    public int j() {
        com.tencent.mm.plugin.appbrand.w9[] w9VarArr = com.tencent.mm.plugin.appbrand.w9.f90956d;
        return 1;
    }

    @Override // em1.d
    public java.lang.String l(com.tencent.mm.plugin.appbrand.jsapi.m component) {
        k91.z0 E0;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        kotlin.jvm.internal.o.g(component, "component");
        if (!(component instanceof com.tencent.mm.plugin.appbrand.e9)) {
            return "";
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = ((com.tencent.mm.plugin.appbrand.e9) component).t3();
        java.lang.String str = (t37 == null || (E0 = t37.E0()) == null || (wxaPkgWrappingInfo = E0.f305852r) == null) ? null : wxaPkgWrappingInfo.f75372md5;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @Override // em1.d
    public java.lang.String m() {
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsruntime.d2.a();
        kotlin.jvm.internal.o.f(a17, "retrieve(...)");
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    @Override // em1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(cl.j3 r6, long r7, long r9, cl.k1 r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: em1.t.n(cl.j3, long, long, cl.k1):void");
    }
}
