package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface TencentMapGestureListener {

    /* loaded from: classes6.dex */
    public enum TwoFingerMoveAgainstStatus {
        START,
        RUNNING,
        END
    }

    boolean onDoubleTap(float f17, float f18);

    boolean onDown(float f17, float f18);

    boolean onFling(float f17, float f18);

    boolean onLongPress(float f17, float f18);

    void onMapStable();

    boolean onScroll(float f17, float f18);

    boolean onSingleTap(float f17, float f18);

    boolean onTwoFingerMoveAgainst(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition);

    boolean onUp(float f17, float f18);
}
