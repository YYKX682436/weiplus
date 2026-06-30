package dg1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg1.g f232266d;

    public a(dg1.g gVar) {
        this.f232266d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f232266d.f232282m == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "mSameLayerMapView is null, may be not insert");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onSurfaceChange");
            this.f232266d.f232282m.b(this.f232266d.f232281i);
        }
    }
}
