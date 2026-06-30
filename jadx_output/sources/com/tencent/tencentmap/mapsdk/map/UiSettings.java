package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public interface UiSettings {

    @java.lang.Deprecated
    public static final int LOGO_POSITION_CENTER_BOTTOM = 4;

    @java.lang.Deprecated
    public static final int LOGO_POSITION_CENTER_TOP = 5;
    public static final int LOGO_POSITION_LEFT_BOTTOM = 0;
    public static final int LOGO_POSITION_LEFT_TOP = 3;
    public static final int LOGO_POSITION_RIGHT_BOTTOM = 1;
    public static final int LOGO_POSITION_RIGHT_TOP = 2;
    public static final int SCALEVIEW_POSITION_CENTER_BOTTOM = 1;
    public static final int SCALEVIEW_POSITION_LEFT_BOTTOM = 0;
    public static final int SCALEVIEW_POSITION_RIGHT_BOTTOM = 2;

    boolean isAnimationEnabled();

    boolean isCompassEnabled();

    boolean isIndoorLevelPickerEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScaleControlsEnabled();

    boolean isTiltGesturesEnabled();

    void setAllGesturesEnabled(boolean z17);

    void setAnimationEnabled(boolean z17);

    void setCompassEnabled(boolean z17);

    void setIndoorLevelPickerEnabled(boolean z17);

    void setLogoPosition(int i17);

    void setLogoPosition(int i17, int[] iArr);

    void setLogoScale(float f17);

    void setRotateGesturesEnabled(boolean z17);

    void setScaleControlsEnabled(boolean z17);

    void setScaleViewPositionWithMargin(int i17, int i18, int i19, int i27, int i28);

    void setScrollGesturesEnabled(boolean z17);

    void setTiltGesturesEnabled(boolean z17);

    void setZoomGesturesEnabled(boolean z17);
}
