package vc1;

/* loaded from: classes13.dex */
public class c implements com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434918a;

    public c(vc1.p1 p1Var) {
        this.f434918a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onDoubleTap(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onDown(float f17, float f18) {
        this.f434918a.f435059J = true;
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onFling(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onLongPress(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public void onMapStable() {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onScroll(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onSingleTap(float f17, float f18) {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.TencentMapGestureListener
    public boolean onUp(float f17, float f18) {
        return false;
    }
}
