package ey5;

/* loaded from: classes13.dex */
public class v implements com.tencent.tencentmap.mapsdk.maps.model.TileProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.TileProvider f257687a;

    public v(com.tencent.mapsdk.raster.model.TileProvider tileProvider) {
        this.f257687a = tileProvider;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileProvider
    public com.tencent.tencentmap.mapsdk.maps.model.Tile getTile(int i17, int i18, int i19) {
        com.tencent.mapsdk.raster.model.Tile tile = this.f257687a.getTile(i17, i18, i19);
        if (tile == null) {
            return null;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.Tile(tile.mWidth, tile.mHeight, tile.mData);
    }
}
