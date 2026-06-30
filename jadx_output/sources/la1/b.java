package la1;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f317493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        super(1);
        this.f317493d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.magicbrush.ui.MagicBrushView it = (com.tencent.magicbrush.ui.MagicBrushView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "InsertVideoPlayer, info: change viewType to TextureView");
        if (it.getViewType() != gh.y.TextureView) {
            it.setRendererView(new qa1.s(it.getContext()));
            it.setOpaque(false);
            com.tencent.mm.plugin.appbrand.o6 runtime = ((pa1.o) this.f317493d).getRuntime();
            if (!(runtime instanceof com.tencent.mm.plugin.appbrand.o6)) {
                runtime = null;
            }
            if (runtime != null && runtime.q2() && !runtime.f86167d3) {
                runtime.f86167d3 = true;
                com.tencent.mm.plugin.appbrand.hc hcVar = runtime.f74796e;
                if (hcVar instanceof com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) {
                    ((com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) hcVar).d0(runtime);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
