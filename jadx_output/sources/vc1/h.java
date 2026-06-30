package vc1;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f434971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434972e;

    public h(vc1.p1 p1Var, float f17) {
        this.f434972e = p1Var;
        this.f434971d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17 = this.f434971d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s zoomTo scale:%f", this, java.lang.Float.valueOf(f17));
        vc1.p1 p1Var = this.f434972e;
        com.tencent.tencentmap.mapsdk.map.TencentMap map = p1Var.f435068e.getMap();
        if (map != null) {
            p1Var.f435059J = false;
            map.animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.zoomTo(f17), vc1.p1.F0, p1Var.T);
        }
    }
}
