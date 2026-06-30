package vc1;

/* loaded from: classes13.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap[] f435180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.w f435182f;

    public u(vc1.w wVar, android.graphics.Bitmap[] bitmapArr, int i17) {
        this.f435182f = wVar;
        this.f435180d = bitmapArr;
        this.f435181e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mapsdk.raster.model.Marker marker;
        vc1.w wVar = this.f435182f;
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "realMarker setGifIcon markerId:%s", wVar.f435191b.f435195f);
        vc1.x xVar = wVar.f435191b;
        vc1.o1 z17 = xVar.f435202p.z(xVar.f435195f);
        com.tencent.mapsdk.raster.model.Marker marker2 = wVar.f435191b.f435196g;
        int i17 = this.f435181e;
        android.graphics.Bitmap[] bitmapArr = this.f435180d;
        if (marker2 != null) {
            marker2.setGifIcon(bitmapArr, true, i17);
        } else if (z17 != null && (marker = z17.f435030c) != null && marker != null && i17 > 0) {
            marker.setGifIcon(bitmapArr, true, i17);
        }
        for (android.graphics.Bitmap bitmap : bitmapArr) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }
}
