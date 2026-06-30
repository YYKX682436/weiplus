package t00;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt00/f0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCPoiRequest;", "Lcom/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class f0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest getEcsWeShopPoiDataActionHandler$IPCPoiRequest = (com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest) obj;
        if (getEcsWeShopPoiDataActionHandler$IPCPoiRequest == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo(102, 0.0f, 0.0f, 0L));
                return;
            }
            return;
        }
        c00.y3 y3Var = (c00.y3) i95.n0.c(c00.y3.class);
        if (y3Var == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo(107, 0.0f, 0.0f, 0L));
            }
        } else {
            bw5.r6 Ri = ((j20.o) y3Var).Ri(2, getEcsWeShopPoiDataActionHandler$IPCPoiRequest.f65625d);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo(Ri.f32413d, Ri.f32414e, Ri.f32415f, Ri.f32416g));
            }
        }
    }
}
