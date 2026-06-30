package v31;

/* loaded from: classes7.dex */
public final class h implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f433090d;

    public h(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f433090d = lVar;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiPredownloadPlayablePackage", "onRunningStateChanged appId:" + str + " state:" + bVar);
        int i17 = bVar == null ? -1 : v31.g.f433089a[bVar.ordinal()];
        if (i17 == 1) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = ((com.tencent.mm.plugin.appbrand.y) this.f433090d).getRuntime();
            kotlin.jvm.internal.o.e(runtime, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
            if (((com.tencent.mm.plugin.appbrand.o6) runtime).a2()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiPredownloadPlayablePackage", "onRunningStateChanged background but in preRender Mode");
                return;
            } else {
                ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).wi();
                return;
            }
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Ni();
            return;
        }
        a41.k kVar = (a41.k) ((a41.i) i95.n0.c(a41.i.class));
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "resumeBiz");
        y31.f fVar = kVar.f1189d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "resume");
            jc3.j0 j0Var = fVar.f459163d;
            if (j0Var != null) {
                ((rc3.w0) j0Var).A();
            }
        }
    }
}
