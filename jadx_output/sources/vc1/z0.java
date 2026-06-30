package vc1;

/* loaded from: classes13.dex */
public class z0 implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay f435227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f435228c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435229d;

    public z0(vc1.p1 p1Var, java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay groundOverlay, int i17) {
        this.f435229d = p1Var;
        this.f435226a = str;
        this.f435227b = groundOverlay;
        this.f435228c = i17;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        java.lang.String str = this.f435226a;
        if (inputStream == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay, openRead failed, url=%s", str);
            return;
        }
        android.graphics.Bitmap i17 = vc1.p1.i(this.f435229d, inputStream, str, 4000000);
        s46.d.a(inputStream);
        if (i17 == null || i17.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay decode bitmap fail");
            return;
        }
        this.f435227b.setBitmap(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(i17));
        i17.recycle();
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay success id:%d", java.lang.Integer.valueOf(this.f435228c));
    }
}
