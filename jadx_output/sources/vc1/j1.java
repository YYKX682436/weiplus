package vc1;

/* loaded from: classes13.dex */
public class j1 extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434994r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(vc1.p1 p1Var, android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap) {
        super(context, tencentMap);
        this.f434994r = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChange(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        super.onCameraChange(cameraPosition);
        vc1.p1 p1Var = this.f434994r;
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

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
    public void onCameraChangeFinish(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        super.onCameraChangeFinish(cameraPosition);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish");
        if (this.f434994r.K != null) {
            vc1.q1 q1Var = new vc1.q1();
            cameraPosition.getTarget().getLatitude();
            cameraPosition.getTarget().getLongitude();
            q1Var.f435127a = cameraPosition.getZoom();
            q1Var.f435128b = cameraPosition.getBearing();
            q1Var.f435129c = cameraPosition.getSkew();
            vc1.p1 p1Var = this.f434994r;
            p1Var.K.a(q1Var, p1Var.f435059J);
            this.f434994r.f435059J = false;
        }
        vc1.p1.f(this.f434994r);
        if (this.f434994r.f435096s == null || this.f434994r.f435096s.getAlgorithm().getClusters(cameraPosition.getZoom()).size() <= 0) {
            return;
        }
        java.util.Set clusters = ((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm) ((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator) this.f434994r.f435096s.getAlgorithm()).getAlgorithm()).getClusters(cameraPosition.getZoom());
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish cluster size:%d", java.lang.Integer.valueOf(clusters.size()));
        java.util.Iterator it = clusters.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish cluster item size:%d", java.lang.Integer.valueOf(((com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) it.next()).getItems().size()));
        }
    }
}
