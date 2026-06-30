package vc1;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f434995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f434996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434997f;

    public k(vc1.p1 p1Var, float f17, float f18) {
        this.f434997f = p1Var;
        this.f434995d = f17;
        this.f434996e = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mapsdk.raster.model.CameraPosition cameraPosition;
        vc1.p1 p1Var = this.f434997f;
        com.tencent.tencentmap.mapsdk.map.TencentMap map = p1Var.f435068e.getMap();
        if (map == null || (cameraPosition = map.getCameraPosition()) == null) {
            return;
        }
        float f17 = this.f434995d;
        if (f17 != -1.0f) {
            p1Var.C = f17;
        } else if (p1Var.C0) {
            f17 = cameraPosition.getBearing();
            p1Var.C = f17;
        } else {
            f17 = p1Var.C;
        }
        float f18 = this.f434996e;
        if (f18 != -1.0f) {
            p1Var.D = f18;
        } else if (p1Var.C0) {
            f18 = cameraPosition.getSkew();
            p1Var.D = f18;
        } else {
            f18 = p1Var.D;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s rotateTo rotate:%f, skew:%f", p1Var, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        com.tencent.tencentmap.mapsdk.map.CameraUpdate rotateTo = com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.rotateTo(new com.tencent.mapsdk.raster.model.CameraPosition.Builder(cameraPosition).bearing(f17).skew(f18).build());
        p1Var.f435059J = false;
        map.animateCamera(rotateTo, vc1.p1.F0, p1Var.T);
    }
}
