package vc1;

/* loaded from: classes13.dex */
public class c1 implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434922a;

    public c1(vc1.p1 p1Var) {
        this.f434922a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapPoiClickListener
    public void onClicked(com.tencent.mapsdk.raster.model.MapPoi mapPoi) {
        vc1.p1 p1Var = this.f434922a;
        if (p1Var.I != null) {
            vc1.m2 m2Var = new vc1.m2();
            m2Var.f435012a = mapPoi.getPosition().getLatitude();
            m2Var.f435013b = mapPoi.getPosition().getLongitude();
            m2Var.f435014c = mapPoi.getName();
            if (mapPoi instanceof com.tencent.mapsdk.raster.model.IndoorMapPoi) {
                com.tencent.mapsdk.raster.model.IndoorMapPoi indoorMapPoi = (com.tencent.mapsdk.raster.model.IndoorMapPoi) mapPoi;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(indoorMapPoi.getBuildingId())) {
                    m2Var.f435015d = indoorMapPoi.getBuildingId();
                    m2Var.f435016e = indoorMapPoi.getFloorName();
                }
            }
            p1Var.I.a(m2Var);
        }
    }
}
