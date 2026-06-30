package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public interface IMapView {
    void addView(android.view.View view, com.tencent.tencentmap.mapsdk.map.MapView.LayoutParams layoutParams);

    boolean dispatchTouchEvent(android.view.MotionEvent motionEvent);

    com.tencent.tencentmap.mapsdk.map.TencentMap getMap();

    @java.lang.Deprecated
    com.tencent.tencentmap.mapsdk.map.MapController getMapController();

    android.view.View getMapView();

    com.tencent.tencentmap.mapsdk.map.Projection getProjection();

    com.tencent.tencentmap.mapsdk.map.UiSettings getUiSettings();

    void onCreate(android.os.Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onLowMemory();

    void onPause();

    void onRestart();

    void onResume();

    void onSaveInstanceState(android.os.Bundle bundle);

    void onSizeChanged(int i17, int i18, int i19, int i27);

    void onStart();

    void onStop();

    void onSurfaceChanged(java.lang.Object obj, int i17, int i18);

    boolean onTouchEvent(android.view.MotionEvent motionEvent);

    void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);
}
