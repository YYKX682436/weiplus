package l20;

/* loaded from: classes9.dex */
public final class c0 implements r00.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView f315138a;

    public c0(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView ecsFinderFeedProductNewAndBulkBuyerView) {
        this.f315138a = ecsFinderFeedProductNewAndBulkBuyerView;
    }

    @Override // r00.h
    public void a(r00.a aVar) {
        if (aVar != null) {
            int i17 = aVar.f367996a | (-16777216);
            com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView ecsFinderFeedProductNewAndBulkBuyerView = this.f315138a;
            ecsFinderFeedProductNewAndBulkBuyerView.getBgNavi().setBackgroundColor(i17);
            ecsFinderFeedProductNewAndBulkBuyerView.getBgNaviCart().setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i17, 16777215 & i17}));
        }
    }
}
