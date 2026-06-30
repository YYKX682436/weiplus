package ey5;

/* loaded from: classes13.dex */
public class q implements com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener f257661a;

    public q(ey5.r rVar, com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener onScreenShotListener) {
        this.f257661a = onScreenShotListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback
    public void onSnapshotReady(android.graphics.Bitmap bitmap) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener onScreenShotListener = this.f257661a;
        if (onScreenShotListener != null) {
            onScreenShotListener.onMapScreenShot(bitmap);
        }
    }
}
