package vc1;

/* loaded from: classes13.dex */
public class l1 extends com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435005z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(vc1.p1 p1Var, android.content.Context context, com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager clusterManager) {
        super(context, tencentMap, clusterManager);
        this.f435005z = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer
    public void onBeforeClusterItemRendered(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem clusterItem, com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
        vc1.n1 n1Var = (vc1.n1) clusterItem;
        super.onBeforeClusterItemRendered(n1Var, markerOptions);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onBeforeClusterItemRendered");
        int i17 = n1Var.f435023c;
        if (i17 > 0 && this.f435005z.f435083l0.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "remove clusterId:%d", java.lang.Integer.valueOf(n1Var.f435023c));
            this.f435005z.P("" + n1Var.f435023c);
            this.f435005z.f435083l0.remove(java.lang.Integer.valueOf(n1Var.f435023c));
            this.f435005z.f435087n0.remove(java.lang.Integer.valueOf(n1Var.f435023c));
            this.f435005z.f435096s.cluster();
        }
        n1Var.f435023c = 0;
        com.tencent.mapsdk.raster.model.Marker marker = getMarker((vc1.l1) n1Var);
        vc1.q2 q2Var = (vc1.q2) this.f435005z.f435089o0.get(n1Var.f435021a);
        vc1.p1.h(this.f435005z, n1Var.f435021a, markerOptions, q2Var, marker);
        com.tencent.mm.sdk.platformtools.u3.i(new vc1.k1(this, n1Var, q2Var, markerOptions), 200L);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer
    public void onBeforeClusterRendered(com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster cluster, com.tencent.mapsdk.raster.model.MarkerOptions markerOptions) {
        vc1.p1 p1Var;
        boolean z17;
        super.onBeforeClusterRendered(cluster, markerOptions);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onBeforeClusterRendered, cluster size:%d", java.lang.Integer.valueOf(cluster.getItems().size()));
        java.util.Iterator it = cluster.getItems().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            p1Var = this.f435005z;
            if (!hasNext) {
                break;
            }
            vc1.n1 n1Var = (vc1.n1) it.next();
            if (n1Var.f435023c > 0) {
                p1Var.P("" + n1Var.f435023c);
            }
            p1Var.P("" + n1Var.f435021a);
        }
        if (!p1Var.f435095r0) {
            markerOptions.alpha(0.0f);
        }
        if (p1Var.f435077i0 != null) {
            for (vc1.n1 n1Var2 : cluster.getItems()) {
                if (((vc1.o1) ((java.util.concurrent.ConcurrentHashMap) p1Var.Y).get(n1Var2.f435021a)) != null) {
                    if (n1Var2.f435023c > 0) {
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            z17 = true;
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "don't send ClusterCreateEvent");
                return;
            }
            vc1.i2 i2Var = p1Var.f435077i0;
            p1Var.getClass();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(p1Var.w(cluster, true));
            i2Var.a(jSONArray);
        }
    }
}
