package vc1;

/* loaded from: classes13.dex */
public class i implements com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434981a;

    public i(vc1.p1 p1Var) {
        this.f434981a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource
    public android.location.Location getMyLocation() {
        vc1.p1 p1Var = this.f434981a;
        android.location.Location location = p1Var.f435110z;
        if (location != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "get MyLocation latit:%f, longtitude:%f", java.lang.Double.valueOf(location.getLatitude()), java.lang.Double.valueOf(p1Var.f435110z.getLongitude()));
            return p1Var.f435110z;
        }
        lk1.a b17 = ((lf.e) ((lk1.c) nd.f.a(lk1.c.class))).b("gcj02", 600000);
        if (b17 != null) {
            if (p1Var.f435110z == null) {
                p1Var.f435110z = new android.location.Location(b17.f318998c);
            }
            p1Var.f435110z.setLatitude(b17.f318996a);
            p1Var.f435110z.setLongitude(b17.f318997b);
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "get MyLocation from cache, latit:%f, longtitude:%f", java.lang.Double.valueOf(p1Var.f435110z.getLatitude()), java.lang.Double.valueOf(p1Var.f435110z.getLongitude()));
            return p1Var.f435110z;
        }
        if (p1Var.B) {
            return null;
        }
        p1Var.B = true;
        p1Var.A = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "to do get MyLocation");
        ((lk1.c) nd.f.a(lk1.c.class)).w9("gcj02", p1Var.f435067d0, p1Var.u());
        return null;
    }
}
