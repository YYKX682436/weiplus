package vc1;

/* loaded from: classes13.dex */
public class f1 implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434965a;

    public f1(vc1.p1 p1Var) {
        this.f434965a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener
    public void onCollisionHidden(com.tencent.tencentmap.mapsdk.maps.model.Marker marker, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionHidden");
        if (marker == null || marker.getTag() == null) {
            return;
        }
        java.lang.String str = (java.lang.String) marker.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionHidden markerId:%s", str);
        vc1.p1 p1Var = this.f434965a;
        if (p1Var.z(str) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "onCollisionHidden map:%s TencentMarker is null, return", this);
        } else if (p1Var.f435108y != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            p1Var.f435108y.b(arrayList);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener
    public void onCollisionShown(com.tencent.tencentmap.mapsdk.maps.model.Marker marker, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionShown");
        if (marker == null || marker.getTag() == null) {
            return;
        }
        java.lang.String str = (java.lang.String) marker.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCollisionShown markerId:%s", str);
        vc1.p1 p1Var = this.f434965a;
        if (p1Var.z(str) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "onCollisionShown map:%s TencentMarker is null, return", this);
        } else if (p1Var.f435108y != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            p1Var.f435108y.a(arrayList);
        }
    }
}
