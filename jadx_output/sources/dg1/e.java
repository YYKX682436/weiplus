package dg1;

/* loaded from: classes13.dex */
public class e implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg1.g f232274d;

    public e(dg1.g gVar) {
        this.f232274d = gVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onForeground");
        if (this.f232274d.f232282m != null) {
            ((vc1.p1) this.f232274d.f232282m).H();
        }
    }
}
