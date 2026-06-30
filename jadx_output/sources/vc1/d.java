package vc1;

/* loaded from: classes13.dex */
public class d implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434951a;

    public d(vc1.p1 p1Var) {
        this.f434951a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChange(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        vc1.p1 p1Var = this.f434951a;
        if (p1Var.K != null) {
            vc1.q1 q1Var = new vc1.q1();
            cameraPosition.getTarget().getLatitude();
            cameraPosition.getTarget().getLongitude();
            q1Var.f435127a = cameraPosition.getZoom();
            q1Var.f435128b = cameraPosition.getBearing();
            q1Var.f435129c = cameraPosition.getSkew();
            p1Var.K.b(q1Var, p1Var.f435059J);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChangeFinish(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        vc1.p1 p1Var = this.f434951a;
        if (p1Var.K != null) {
            vc1.q1 q1Var = new vc1.q1();
            cameraPosition.getTarget().getLatitude();
            cameraPosition.getTarget().getLongitude();
            q1Var.f435127a = cameraPosition.getZoom();
            q1Var.f435128b = cameraPosition.getBearing();
            q1Var.f435129c = cameraPosition.getSkew();
            p1Var.K.a(q1Var, p1Var.f435059J);
            p1Var.f435059J = false;
        }
        vc1.p1.f(p1Var);
    }
}
