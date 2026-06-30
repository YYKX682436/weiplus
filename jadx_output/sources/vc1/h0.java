package vc1;

/* loaded from: classes13.dex */
public class h0 implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434973a;

    public h0(vc1.p1 p1Var) {
        this.f434973a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
    public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.mapsdk.raster.model.Marker marker2;
        if (marker == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s markerid:%s, onMarkerClick", this, marker.getTag());
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) marker.getTag()) && this.f434973a.f435096s != null && ((vc1.l1) this.f434973a.f435096s.getRenderer()).getCluster(marker) != null) {
            this.f434973a.e(((vc1.l1) this.f434973a.f435096s.getRenderer()).getCluster(marker));
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) marker.getTag())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is null, return");
            return false;
        }
        if (((java.lang.String) marker.getTag()).endsWith("AnchorPoint")) {
            vc1.p1 p1Var = this.f434973a;
            if (p1Var.f435078j != null && p1Var.f435065c0 != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Map.DefaultTencentMapView", "click anchor point");
                vc1.p1 p1Var2 = this.f434973a;
                p1Var2.f435078j.a(p1Var2.f435065c0.getLatitude(), this.f434973a.f435065c0.getLongitude());
            }
            return true;
        }
        vc1.o1 z17 = this.f434973a.z((java.lang.String) marker.getTag());
        if (z17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onMarkerClickListener] map:%s appbrandMarker is null, return", this);
            return false;
        }
        if (this.f434973a.f435074h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onMarkerClickListener] map:%s mapCalloutClick is null, return", this);
            return false;
        }
        if (z17.f435025b != null) {
            if (((java.lang.String) marker.getTag()).endsWith("#label")) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is label marker, do nothing");
            } else {
                vc1.o2 o2Var = z17.f435025b.f435148s;
                com.tencent.mapsdk.raster.model.Marker marker3 = z17.f435030c;
                if (marker3 == null) {
                    marker3 = marker;
                }
                if (o2Var == null || o2Var.f435047n != 0 || marker3 == null) {
                    if (o2Var != null && marker3 != null) {
                        this.f434973a.d0(marker3);
                    }
                } else if (marker3.isInfoWindowShown()) {
                    marker3.hideInfoWindow();
                } else {
                    this.f434973a.d0(marker3);
                }
            }
        }
        com.tencent.mapsdk.raster.model.Marker marker4 = z17.f435030c;
        if (marker4 != null) {
            marker4.set2Top();
            z17.f435030c.refreshInfoWindow();
        }
        com.tencent.mapsdk.raster.model.Marker marker5 = z17.f435031d;
        if (marker5 != null) {
            marker5.set2Top();
            z17.f435031d.refreshInfoWindow();
        }
        vc1.c3 c3Var = this.f434973a.f435065c0;
        if (c3Var != null && (marker2 = c3Var.f434942d) != null) {
            marker2.set2Top();
            c3Var.f434942d.refreshInfoWindow();
        }
        int i17 = z17.f435025b.f435131b;
        if (i17 <= 0) {
            if (!((java.lang.String) marker.getTag()).endsWith("#label")) {
                return this.f434973a.f435074h.a(z17);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is label marker, return");
            return this.f434973a.f435076i.a(z17);
        }
        vc1.p1 p1Var3 = this.f434973a;
        p1Var3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "clickClusterLabelMarker");
        com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster cluster = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) p1Var3.f435087n0.get(java.lang.Integer.valueOf(i17));
        if (cluster != null) {
            java.util.Iterator it = cluster.getItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((vc1.n1) it.next()).f435023c == i17) {
                    vc1.i2 i2Var = p1Var3.f435077i0;
                    if (i2Var != null) {
                        i2Var.b(p1Var3.w(cluster, false));
                    }
                }
            }
            if (p1Var3.f435093q0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it6 = cluster.getItems().iterator();
                while (it6.hasNext()) {
                    linkedList.add(((vc1.n1) it6.next()).f435022b);
                }
                p1Var3.d(linkedList, 0, 0, 0, 0);
            }
        }
        return true;
    }
}
