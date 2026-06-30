package ey5;

/* loaded from: classes13.dex */
public class m implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener f257657a;

    public m(ey5.r rVar, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.f257657a = onMapPoiClickListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener
    public void onClicked(com.tencent.tencentmap.mapsdk.maps.model.MapPoi mapPoi) {
        com.tencent.mapsdk.raster.model.MapPoi mapPoi2;
        com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener onMapPoiClickListener = this.f257657a;
        if (onMapPoiClickListener != null) {
            if (mapPoi == null) {
                mapPoi2 = null;
            } else if (mapPoi instanceof com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi) {
                com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi indoorMapPoi = (com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi) mapPoi;
                mapPoi2 = new com.tencent.mapsdk.raster.model.IndoorMapPoi(indoorMapPoi.getName(), ey5.x.a(indoorMapPoi.getPosition()), indoorMapPoi.getBuildingId(), indoorMapPoi.getBuildingName(), indoorMapPoi.getFloorName());
            } else {
                mapPoi2 = new com.tencent.mapsdk.raster.model.MapPoi(mapPoi.getName(), ey5.x.a(mapPoi.getPosition()));
            }
            onMapPoiClickListener.onClicked(mapPoi2);
        }
    }
}
