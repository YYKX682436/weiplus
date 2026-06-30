package vc1;

/* loaded from: classes13.dex */
public class t0 implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435173a;

    public t0(vc1.p1 p1Var) {
        this.f435173a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener
    public void onMapClick(com.tencent.mapsdk.raster.model.LatLng latLng) {
        vc1.o2 o2Var;
        com.tencent.mapsdk.raster.model.Marker marker;
        vc1.p1 p1Var = this.f435173a;
        for (vc1.o1 o1Var : ((java.util.concurrent.ConcurrentHashMap) p1Var.Y).values()) {
            vc1.q2 q2Var = o1Var.f435025b;
            if (q2Var != null && (o2Var = q2Var.f435148s) != null && o2Var.f435047n == 0 && (marker = o1Var.f435030c) != null && marker.isInfoWindowShown()) {
                o1Var.f435030c.hideInfoWindow();
            }
        }
        vc1.e2 e2Var = p1Var.H;
        if (e2Var != null) {
            e2Var.a(latLng.getLongitude(), latLng.getLatitude());
        }
    }
}
