package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public class MapRenderLayer extends com.tencent.tencentmap.mapsdk.maps.MapView {
    public MapRenderLayer(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        super(context, tencentMapOptions);
        if (tencentMapOptions != null) {
            int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
            if (extSurfaceWidth > 0) {
                setLeft(0);
                setRight(extSurfaceWidth);
            }
            int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
            if (extSurfaceHeight > 0) {
                setTop(0);
                setBottom(extSurfaceHeight);
            }
        }
        onResume();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public final com.tencent.tencentmap.mapsdk.maps.model.MapViewType getViewType() {
        return com.tencent.tencentmap.mapsdk.maps.model.MapViewType.RenderLayer;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.MapView
    public final void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        if ((obj instanceof android.view.Surface) || (obj instanceof android.graphics.SurfaceTexture) || (obj instanceof android.view.SurfaceHolder)) {
            super.onSurfaceChanged(obj, i17, i18);
        }
    }
}
