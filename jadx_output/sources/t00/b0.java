package t00;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f414266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ipcinvoker.r rVar) {
        super(1);
        this.f414266d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.r6 poiInfo = (bw5.r6) obj;
        kotlin.jvm.internal.o.g(poiInfo, "poiInfo");
        com.tencent.mm.ipcinvoker.r rVar = this.f414266d;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo(poiInfo.f32413d, poiInfo.f32414e, poiInfo.f32415f, poiInfo.f32416g));
        }
        return jz5.f0.f302826a;
    }
}
