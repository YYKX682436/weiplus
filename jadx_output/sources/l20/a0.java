package l20;

/* loaded from: classes9.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView f315132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView ecsFinderFeedProductNewAndBulkBuyerView) {
        super(1);
        this.f315132d = ecsFinderFeedProductNewAndBulkBuyerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String clickType = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(clickType, "clickType");
        int i17 = com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView.f65878x;
        this.f315132d.d("feeds_spu_card", "element_click", "{\"click_type\":\"" + clickType + "\"}");
        return jz5.f0.f302826a;
    }
}
