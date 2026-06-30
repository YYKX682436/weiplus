package dg1;

/* loaded from: classes13.dex */
public class h extends vc1.p1 {
    public android.view.Surface G0;
    public int H0;
    public int I0;

    @Override // vc1.p1, vc1.a3
    public void a(int i17, int i18) {
        if (this.G0 != null) {
            this.H0 = i17;
            this.I0 = i18;
        }
        try {
            this.f435068e.onSizeChanged(i17, i18, i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayerMapView", "onSizeChanged :%s", e17);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }

    @Override // vc1.p1, vc1.a3
    public void b(android.view.Surface surface) {
        android.view.Surface surface2;
        if (surface == null || (surface2 = this.G0) == surface) {
            return;
        }
        this.G0 = surface;
        this.f435068e.onSurfaceChanged(surface, this.H0, this.I0);
        if (surface2 != null) {
            surface2.release();
        }
    }

    @Override // vc1.p1, vc1.a3
    public void onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.location_soso.api.SoSoMapView soSoMapView;
        if (this.G0 == null || (soSoMapView = this.f435068e) == null) {
            return;
        }
        soSoMapView.dispatchTouchEvent(motionEvent);
    }

    @Override // vc1.p1
    public com.tencent.tencentmap.mapsdk.map.TencentMapOptions v(java.util.Map map) {
        com.tencent.tencentmap.mapsdk.map.TencentMapOptions v17 = super.v(map);
        android.view.Surface surface = null;
        if (map != null) {
            java.lang.Object obj = map.get("surface");
            if (obj instanceof android.view.Surface) {
                surface = (android.view.Surface) obj;
            }
        }
        this.G0 = surface;
        if (surface == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayerMapView", "mSurface is null, return");
            this.G0 = new android.view.Surface(new android.graphics.SurfaceTexture(0));
        }
        v17.setExtSurface(this.G0);
        this.H0 = vc1.e3.d(map, "width", 0);
        this.I0 = vc1.e3.d(map, "height", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerMapView", "handler insert, position:[%d, %d]", java.lang.Integer.valueOf(this.H0), java.lang.Integer.valueOf(this.I0));
        v17.setExtSurfaceDimension(this.H0, this.I0);
        v17.setMapType(2);
        return v17;
    }
}
