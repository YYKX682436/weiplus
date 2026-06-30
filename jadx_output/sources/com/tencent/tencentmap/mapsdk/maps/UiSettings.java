package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes16.dex */
public interface UiSettings {
    boolean isCompassEnabled();

    boolean isIndoorLevelPickerEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScaleViewEnabled();

    boolean isScrollGesturesEnabled();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean z17);

    void setCompassEnabled(boolean z17);

    void setCompassExtraPadding(int i17);

    void setCompassExtraPadding(int i17, int i18);

    void setFlingGestureEnabled(boolean z17);

    void setGestureRotateByMapCenter(boolean z17);

    void setGestureScaleByMapCenter(boolean z17);

    void setIndoorLevelPickerEnabled(boolean z17);

    void setLogoPosition(int i17);

    void setLogoPosition(int i17, int[] iArr);

    void setLogoPositionWithMargin(int i17, int i18, int i19, int i27, int i28);

    void setLogoScale(float f17);

    void setLogoSize(int i17);

    void setMyLocationButtonEnabled(boolean z17);

    void setRotateGesturesEnabled(boolean z17);

    void setScaleViewEnabled(boolean z17);

    void setScaleViewFadeEnable(boolean z17);

    void setScaleViewPosition(int i17);

    void setScaleViewPositionWithMargin(int i17, int i18, int i19, int i27, int i28);

    void setScrollGesturesEnabled(boolean z17);

    void setTiltGesturesEnabled(boolean z17);

    void setZoomControlsEnabled(boolean z17);

    void setZoomGesturesEnabled(boolean z17);

    void setZoomPosition(int i17);
}
