package vc1;

/* loaded from: classes13.dex */
public class f implements o91.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434962a;

    public f(vc1.p1 p1Var) {
        this.f434962a = p1Var;
    }

    @Override // o91.b
    public void a(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon load bitmap is null");
            return;
        }
        vc1.p1 p1Var = this.f434962a;
        vc1.c3 c3Var = p1Var.f435065c0;
        if (c3Var == null || c3Var.getRealMarker() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon mapLocationPoint is null");
        } else {
            p1Var.f435065c0.getRealMarker().setIcon(com.tencent.mapsdk.raster.model.BitmapDescriptorFactory.fromBitmap(bitmap));
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon success");
        }
    }
}
