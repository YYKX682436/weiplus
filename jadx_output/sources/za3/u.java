package za3;

/* loaded from: classes15.dex */
public class u implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.PoiPoint f471023a;

    public u(com.tencent.mm.plugin.location.ui.PoiPoint poiPoint) {
        this.f471023a = poiPoint;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
    public boolean onMarkerClick(com.tencent.mapsdk.raster.model.Marker marker) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PoiPoint", "onClick.");
        com.tencent.mm.plugin.location.ui.PoiPoint poiPoint = this.f471023a;
        za3.v vVar = poiPoint.C;
        if (vVar == null) {
            return false;
        }
        za3.w wVar = poiPoint.B;
        com.tencent.mm.plugin.location.ui.impl.s0 s0Var = (com.tencent.mm.plugin.location.ui.impl.s0) vVar;
        za3.w wVar2 = za3.w.SIT;
        if (wVar2 == wVar) {
            com.tencent.mm.plugin.location.ui.impl.x1 x1Var = s0Var.f144893a;
            if (-1 == x1Var.f144932t.f144760f) {
                x1Var.s(true);
            }
            com.tencent.mm.plugin.location.ui.PoiPoint poiPoint2 = x1Var.I1;
            if (poiPoint2 != null && za3.w.STAND == poiPoint2.B) {
                poiPoint2.B = wVar2;
                poiPoint2.f144639q.reverse();
                poiPoint2.f144640r.reverse();
                poiPoint2.f144641s.reverse();
            }
            x1Var.f144910e.getIController().animateTo(poiPoint.getLat(), poiPoint.getLng());
            x1Var.I1 = poiPoint;
            poiPoint.c();
            com.tencent.mm.plugin.location.ui.impl.x1.o(x1Var, poiPoint.getPosition());
            x1Var.f144932t.f144760f = poiPoint.getPosition();
            x1Var.f144932t.notifyDataSetChanged();
            long position = poiPoint.getPosition() + 1;
            com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = x1Var.f144922l1;
            finishSelectPOIStruct.f58108g = position;
            finishSelectPOIStruct.f58107f = 2;
        }
        return true;
    }
}
