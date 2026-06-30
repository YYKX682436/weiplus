package vc1;

/* loaded from: classes13.dex */
public class y0 implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions f435220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f435221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435222d;

    public y0(vc1.p1 p1Var, java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions, int i17) {
        this.f435222d = p1Var;
        this.f435219a = str;
        this.f435220b = groundOverlayOptions;
        this.f435221c = i17;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        java.lang.String str = this.f435219a;
        if (inputStream == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay, openRead failed, url=%s", str);
            return;
        }
        vc1.p1 p1Var = this.f435222d;
        android.graphics.Bitmap i17 = vc1.p1.i(p1Var, inputStream, str, 4000000);
        s46.d.a(inputStream);
        if (i17 == null || i17.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "groundOverlay decode bitmap fail");
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromBitmap = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(i17);
        com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions = this.f435220b;
        groundOverlayOptions.bitmap(fromBitmap);
        i17.recycle();
        com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay = p1Var.f435068e.getMap().addGroundOverlay(groundOverlayOptions);
        if (addGroundOverlay == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay fail, groundOverlay is null");
            return;
        }
        java.util.HashMap hashMap = p1Var.f435097s0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        int i18 = this.f435221c;
        sb6.append(i18);
        hashMap.put(sb6.toString(), addGroundOverlay);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay success id:%d", java.lang.Integer.valueOf(i18));
    }
}
