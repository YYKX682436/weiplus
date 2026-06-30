package vc1;

/* loaded from: classes13.dex */
public class f3 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = vc1.h3.f434976b;
        java.util.HashSet hashSet = new java.util.HashSet(set);
        ((java.util.concurrent.CopyOnWriteArraySet) set).clear();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vc1.p1 p1Var = (vc1.p1) ((vc1.a3) it.next());
            p1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s onDestroy", p1Var);
            p1Var.f435073g0.set(true);
            com.tencent.mm.plugin.location_soso.api.SoSoMapView soSoMapView = p1Var.f435068e;
            soSoMapView.getMap().setOnMapCameraChangeListener(null);
            p1Var.M();
            p1Var.L();
            p1Var.L();
            ik1.h0.b(new vc1.l(p1Var));
            p1Var.K();
            p1Var.N();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) p1Var.O;
            java.util.Iterator it6 = concurrentHashMap.values().iterator();
            while (it6.hasNext()) {
                ((com.tencent.mapsdk.raster.model.CustomLayer) it6.next()).remove();
            }
            concurrentHashMap.clear();
            soSoMapView.getMap().setOnMapPoiClickListener(null);
            soSoMapView.clean();
            soSoMapView.onDestroy();
            vc1.c3 c3Var = p1Var.f435065c0;
            if (c3Var != null) {
                com.tencent.mapsdk.raster.model.Marker marker = c3Var.f434942d;
                if (marker != null) {
                    marker.remove();
                    c3Var.f434942d = null;
                }
                p1Var.f435065c0 = null;
            }
            if (p1Var.f435063b0) {
                ((lk1.c) nd.f.a(lk1.c.class)).ia("gcj02", p1Var.f435067d0, p1Var.u());
                vc1.h3.g(p1Var);
            } else if (p1Var.A) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "unregisterLocation from needGetMyLocation when onDestroy");
                p1Var.g0();
            }
        }
    }
}
