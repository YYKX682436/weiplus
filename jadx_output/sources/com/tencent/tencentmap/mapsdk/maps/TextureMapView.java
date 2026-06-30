package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public class TextureMapView extends com.tencent.tencentmap.mapsdk.maps.MapView {
    public TextureMapView(android.content.Context context) {
        this(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public final com.tencent.tencentmap.mapsdk.maps.model.MapViewType getViewType() {
        return com.tencent.tencentmap.mapsdk.maps.model.MapViewType.TextureView;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            return mapViewProxy.isOpaque();
        }
        return true;
    }

    public void setOpaque(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy mapViewProxy = this.mMapDelegate;
        if (mapViewProxy != null) {
            mapViewProxy.setOpaque(z17);
        }
    }

    public TextureMapView(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        super(context, tencentMapOptions);
    }

    public TextureMapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextureMapView(android.content.Context context, android.util.AttributeSet attributeSet, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        this(context, attributeSet, 0, tencentMapOptions);
    }

    public TextureMapView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public TextureMapView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        super(context, attributeSet, i17, tencentMapOptions);
    }
}
