package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public abstract class BaseMapView extends android.widget.FrameLayout {

    /* loaded from: classes13.dex */
    public interface MapViewProxy {
        com.tencent.tencentmap.mapsdk.maps.TencentMap getMap();

        boolean isOpaque();

        boolean isTouchable();

        void onCreated();

        void onDestroy();

        void onPause();

        void onRestart();

        void onResume();

        void onSizeChanged(int i17, int i18, int i19, int i27);

        void onStart();

        void onStop();

        void onSurfaceChanged(java.lang.Object obj, int i17, int i18);

        boolean onTouchEvent(android.view.MotionEvent motionEvent);

        void onUpdateOptions(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions);

        void setOnTop(boolean z17);

        void setOpaque(boolean z17);
    }

    public BaseMapView(android.content.Context context) {
        super(context);
    }

    public abstract com.tencent.tencentmap.mapsdk.maps.TencentMap getMap();

    public abstract com.tencent.tencentmap.mapsdk.maps.TencentMap getMap(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions);

    public com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.IMapKernel getMapKernel() {
        return com.tencent.tencentmap.mapsdk.maps.model.MapKernel.Vector;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MapViewType getViewType() {
        return com.tencent.tencentmap.mapsdk.maps.model.MapViewType.SurfaceView;
    }

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onRestart();

    public abstract void onResume();

    public abstract void onStart();

    public abstract void onStop();

    public BaseMapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseMapView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
