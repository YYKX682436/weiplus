package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public abstract class UrlTileProvider implements com.tencent.tencentmap.mapsdk.maps.model.TileProvider {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "UrlTileProvider";
    private final int mHeight;
    private final int mWidth;

    public UrlTileProvider() {
        this(256, 256);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TileProvider
    public final com.tencent.tencentmap.mapsdk.maps.model.Tile getTile(int i17, int i18, int i19) {
        java.net.URL tileUrl = getTileUrl(i17, i18, i19);
        com.tencent.tencentmap.mapsdk.maps.model.Tile tile = com.tencent.tencentmap.mapsdk.maps.model.TileProvider.NO_TILE;
        if (tileUrl == null) {
            return tile;
        }
        com.tencent.map.tools.net.NetResponse requestTileData = requestTileData(tileUrl.toString());
        byte[] bArr = null;
        if (requestTileData != null) {
            if (!requestTileData.available()) {
                return requestTileData.exception instanceof com.tencent.map.tools.net.exception.NetErrorException ? requestTileData.statusCode == 404 ? tile : new com.tencent.tencentmap.mapsdk.maps.model.Tile(this.mWidth, this.mHeight, null) : requestTileData.statusCode == 404 ? tile : new com.tencent.tencentmap.mapsdk.maps.model.Tile(this.mWidth, this.mHeight, null);
            }
            bArr = requestTileData.data;
        }
        com.tencent.tencentmap.mapsdk.maps.model.Tile tile2 = (bArr == null || bArr.length == 0) ? tile : new com.tencent.tencentmap.mapsdk.maps.model.Tile(this.mWidth, this.mHeight, bArr);
        return tile2.equals(tile) ? com.tencent.tencentmap.mapsdk.maps.model.Tile.EMPTY_TILE : tile2;
    }

    public abstract java.net.URL getTileUrl(int i17, int i18, int i19);

    public com.tencent.map.tools.net.NetResponse requestTileData(java.lang.String str) {
        try {
            return com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public UrlTileProvider(int i17, int i18) {
        this.mWidth = i17;
        this.mHeight = i18;
    }
}
