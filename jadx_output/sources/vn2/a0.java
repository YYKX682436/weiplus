package vn2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f438236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f438237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f438238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438239g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(jz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, ym5.q1 q1Var, java.lang.String str) {
        super(0);
        this.f438236d = lVar;
        this.f438237e = baseFeedLoader;
        this.f438238f = q1Var;
        this.f438239g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ey2.g1 g1Var = (ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class);
        jz5.l lVar = this.f438236d;
        g1Var.P6(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) lVar.f302834e).getItemId());
        java.util.AbstractCollection dataListJustForAdapter = this.f438237e.getDataListJustForAdapter();
        java.lang.Object obj = lVar.f302834e;
        dataListJustForAdapter.remove(obj);
        java.lang.Object obj2 = lVar.f302833d;
        ym5.q1 q1Var = this.f438238f;
        if (q1Var != null) {
            q1Var.onItemRangeRemoved(((java.lang.Number) obj2).intValue(), 1);
        }
        com.tencent.mars.xlog.Log.i(this.f438239g, "deleteSeeLater removeAt " + ((java.lang.Number) obj2).intValue() + "  " + ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getFeedObject());
        return jz5.f0.f302826a;
    }
}
