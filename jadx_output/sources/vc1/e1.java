package vc1;

/* loaded from: classes13.dex */
public class e1 implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434957a;

    public e1(vc1.p1 p1Var) {
        this.f434957a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener
    public void onPolylineClick(com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onPolylineClick id:%s", polyline.getId());
        vc1.p1 p1Var = this.f434957a;
        if (p1Var.f435106x == null || latLng == null) {
            return;
        }
        vc1.y1 y1Var = new vc1.y1(latLng.latitude, latLng.longitude);
        if (!((java.util.concurrent.ConcurrentHashMap) p1Var.X).containsKey(polyline.getId())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "not exist id:%s in polyLinesInnerIdMapOuterId", polyline.getId());
            return;
        }
        p1Var.f435106x.a((java.lang.String) ((java.util.concurrent.ConcurrentHashMap) p1Var.X).get(polyline.getId()), y1Var);
    }
}
