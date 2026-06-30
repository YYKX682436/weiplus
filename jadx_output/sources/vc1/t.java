package vc1;

/* loaded from: classes13.dex */
public class t implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435172a;

    public t(vc1.p1 p1Var) {
        this.f435172a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnInfoWindowClickListener
    public void onInfoWindowClick(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onInfoWindowClick");
        if (marker == null) {
            return;
        }
        java.lang.String str = (java.lang.String) marker.getTag();
        vc1.p1 p1Var = this.f435172a;
        vc1.o1 z17 = p1Var.z(str);
        if (z17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onInfoWindowClick] map:%s appbrandMarker is null, return", this);
            return;
        }
        vc1.d2 d2Var = p1Var.f435072g;
        if (d2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onInfoWindowClick] map:%s mapCalloutClick is null, return", this);
        } else {
            d2Var.a(z17);
        }
    }
}
