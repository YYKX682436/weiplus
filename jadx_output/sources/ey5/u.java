package ey5;

/* loaded from: classes13.dex */
public class u extends com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.TileProvider f257686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17, int i18, com.tencent.mapsdk.raster.model.TileProvider tileProvider) {
        super(i17, i18);
        this.f257686e = tileProvider;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider
    public java.net.URL getTileUrl(int i17, int i18, int i19) {
        return ((com.tencent.mapsdk.raster.model.UrlTileProvider) this.f257686e).getTileUrl(i17, i18, i19);
    }
}
