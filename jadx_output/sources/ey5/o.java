package ey5;

/* loaded from: classes13.dex */
public class o implements com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener f257659a;

    public o(ey5.r rVar, com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener) {
        this.f257659a = tencentMapGestureListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onDoubleTap(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onDoubleTap(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onDown(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onDown(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onFling(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onFling(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onLongPress(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onLongPress(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public void onMapStable() {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return;
        }
        tencentMapGestureListener.onMapStable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onScroll(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onScroll(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onSingleTap(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onSingleTap(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onTwoFingerMoveAgainst(twoFingerMoveAgainstStatus, cameraPosition);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public boolean onUp(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f257659a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.onUp(f17, f18);
    }
}
