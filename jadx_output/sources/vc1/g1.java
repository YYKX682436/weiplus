package vc1;

/* loaded from: classes13.dex */
public class g1 implements com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434968a;

    public g1(vc1.p1 p1Var) {
        this.f434968a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
    public android.view.View getInfoWindow(com.tencent.mapsdk.raster.model.Marker marker) {
        rl1.b bVar = null;
        if (marker == null) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) marker.getTag())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is null, return");
            return null;
        }
        if (((java.lang.String) marker.getTag()).endsWith("#label")) {
            return null;
        }
        vc1.o1 z17 = this.f434968a.z((java.lang.String) marker.getTag());
        if (z17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "[getInfoWindow] appbrandMarker is null, return");
            return null;
        }
        vc1.q2 q2Var = z17.f435025b;
        if (q2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "[getInfoWindow] appBrandMarker.appBrandMarkerOptions is null, return");
            return null;
        }
        vc1.o2 o2Var = q2Var.f435148s;
        if (o2Var == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17;
        objArr[1] = java.lang.Boolean.valueOf(o2Var.f435051r != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "marker:%s calloutStyle.view is %b", objArr);
        if (o2Var.f435051r != null || o2Var.f435052s != null) {
            if (z17.f435032e == null) {
                z17.f435032e = new android.widget.ImageView(this.f434968a.f435060a);
            }
            android.graphics.Bitmap bitmap = o2Var.f435052s;
            if (bitmap == null) {
                bitmap = com.tencent.mm.sdk.platformtools.x.b0(o2Var.f435051r);
            }
            if (bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "marker:%s calloutStyle.view exist but bitmap is null");
            }
            synchronized (this.f434968a.f435104w) {
                android.widget.ImageView imageView = z17.f435032e;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
            }
            return z17.f435032e;
        }
        vc1.p1 p1Var = this.f434968a;
        p1Var.getClass();
        java.util.LinkedList linkedList = vc1.i3.f434985b;
        synchronized (linkedList) {
            if (linkedList.size() > 0) {
                bVar = (rl1.b) linkedList.removeFirst();
                if (bVar != null && android.view.ViewGroup.class.isInstance(bVar.getParent())) {
                    ((android.view.ViewGroup) bVar.getParent()).removeView(bVar);
                }
            }
        }
        if (bVar == null) {
            bVar = new rl1.b(p1Var.f435060a);
        }
        bVar.setText("");
        bVar.setTextSize(12);
        bVar.setTextColor(rl1.b.f397155e);
        bVar.setTitlePadding(0);
        bVar.setGravity("center");
        int i17 = rl1.b.f397156f;
        rl1.b bVar2 = bVar;
        bVar2.a(0, 0, i17, i17, 0, 0, 0, 0, 0);
        bVar.setText(o2Var.f435034a);
        bVar.setTextSize(o2Var.f435036c);
        bVar.setTextColor(o2Var.f435035b);
        bVar.setTitlePadding(o2Var.f435041h);
        bVar.setGravity(o2Var.f435048o);
        bVar2.a(o2Var.f435037d, o2Var.f435038e, o2Var.f435039f, o2Var.f435040g, o2Var.f435042i, o2Var.f435044k, o2Var.f435045l, o2Var.f435043j, o2Var.f435046m);
        return bVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter
    public void onInfoWindowDettached(com.tencent.mapsdk.raster.model.Marker marker, android.view.View view) {
        if (view instanceof rl1.b) {
            rl1.b bVar = (rl1.b) view;
            java.util.LinkedList linkedList = vc1.i3.f434985b;
            synchronized (linkedList) {
                if (linkedList.size() <= 0) {
                    linkedList.push(bVar);
                }
            }
        }
    }
}
