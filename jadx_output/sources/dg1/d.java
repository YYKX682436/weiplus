package dg1;

/* loaded from: classes13.dex */
public class d implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg1.g f232273d;

    public d(dg1.g gVar) {
        this.f232273d = gVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onBackground");
        if (this.f232273d.f232282m != null) {
            ((vc1.p1) this.f232273d.f232282m).G();
        }
    }
}
