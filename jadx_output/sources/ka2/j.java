package ka2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ha2.a f306035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI, ha2.a aVar) {
        super(3);
        this.f306034d = finderPoiNormalLbsListUI;
        this.f306035e = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String poiId = (java.lang.String) obj;
        java.lang.String productId = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(poiId, "poiId");
        kotlin.jvm.internal.o.g(productId, "productId");
        int i17 = com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.P;
        this.f306034d.m7(this.f306035e, productId, booleanValue);
        return jz5.f0.f302826a;
    }
}
