package ey5;

/* loaded from: classes13.dex */
public class c implements com.tencent.mapsdk.raster.model.CustomLayer {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.model.CustomLayer f257642a;

    public c(com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer) {
        this.f257642a = customLayer;
    }

    @Override // com.tencent.mapsdk.raster.model.CustomLayer
    public void clearDiskCache() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f257642a;
        if (customLayer == null) {
            return;
        }
        customLayer.clearDiskCache();
    }

    @Override // com.tencent.mapsdk.raster.model.CustomLayer
    public java.lang.String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f257642a;
        if (customLayer == null) {
            return null;
        }
        return customLayer.getId();
    }

    @Override // com.tencent.mapsdk.raster.model.CustomLayer
    public void reload() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f257642a;
        if (customLayer == null) {
            return;
        }
        customLayer.reload();
    }

    @Override // com.tencent.mapsdk.raster.model.CustomLayer
    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayer customLayer = this.f257642a;
        if (customLayer == null) {
            return;
        }
        customLayer.remove();
    }
}
