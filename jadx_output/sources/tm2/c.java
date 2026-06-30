package tm2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.g f420491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tm2.g gVar) {
        super(5);
        this.f420491d = gVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        km2.b bVar = (km2.b) obj5;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        tm2.g gVar = this.f420491d;
        pm0.v.X(new tm2.b(booleanValue, bVar, gVar, intValue));
        com.tencent.mars.xlog.Log.i(gVar.f420509g, "finish live result:" + booleanValue + ',' + bVar);
        if (booleanValue) {
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            if (com.tencent.mm.plugin.finder.assist.n8.f102409b == 3) {
                com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1140L);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportExternalManualClose but not record live!");
            }
            com.tencent.mm.plugin.finder.assist.u8.f102599a.b(gVar.f19609a, com.tencent.mm.plugin.appbrand.jsapi.wccoin.u.CTRL_INDEX, 0, "externalManualClose", "0-vBitrate:" + hn0.v.f282442c);
        }
        return jz5.f0.f302826a;
    }
}
