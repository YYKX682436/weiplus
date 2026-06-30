package ey5;

/* loaded from: classes13.dex */
public class t implements com.tencent.mapsdk.raster.model.TileOverlay {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlay f257685a;

    public t(com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay) {
        this.f257685a = tileOverlay;
    }

    @Override // com.tencent.mapsdk.raster.model.TileOverlay
    public void clearTileCache() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f257685a;
        if (tileOverlay == null) {
            return;
        }
        tileOverlay.clearTileCache();
    }

    @Override // com.tencent.mapsdk.raster.model.TileOverlay
    public java.lang.String getId() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f257685a;
        if (tileOverlay == null) {
            return null;
        }
        return tileOverlay.getId();
    }

    @Override // com.tencent.mapsdk.raster.model.TileOverlay
    public void reload() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f257685a;
        if (tileOverlay == null) {
            return;
        }
        tileOverlay.reload();
    }

    @Override // com.tencent.mapsdk.raster.model.TileOverlay
    public void remove() {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f257685a;
        if (tileOverlay == null) {
            return;
        }
        tileOverlay.remove();
    }

    @Override // com.tencent.mapsdk.raster.model.TileOverlay
    public void setDiskCacheDir(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f257685a;
        if (tileOverlay == null) {
            return;
        }
        tileOverlay.setDiskCacheDir(str);
    }

    @Override // com.tencent.mapsdk.raster.model.TileOverlay
    public void setZindex(int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay tileOverlay = this.f257685a;
        if (tileOverlay == null) {
            return;
        }
        tileOverlay.setZindex(i17);
    }
}
