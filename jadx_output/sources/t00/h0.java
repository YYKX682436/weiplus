package t00;

/* loaded from: classes9.dex */
public final class h0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414285d;

    public h0(c00.n3 n3Var) {
        this.f414285d = n3Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo = (com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo) obj;
        kotlin.jvm.internal.o.d(getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65621d);
        jSONObject.put("longitude", java.lang.Float.valueOf(getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65622e));
        jSONObject.put("latitude", java.lang.Float.valueOf(getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65623f));
        jSONObject.put(dm.i4.COL_UPDATETIME, getEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo.f65624g);
        this.f414285d.b(jSONObject);
    }
}
