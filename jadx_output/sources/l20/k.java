package l20;

/* loaded from: classes9.dex */
public final class k implements r00.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315160a;

    public k(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView) {
        this.f315160a = ecsFinderFeedProductCardView;
    }

    @Override // r00.h
    public void a(r00.a aVar) {
        if (aVar != null) {
            int i17 = aVar.f367996a | (-16777216);
            com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView = this.f315160a;
            ecsFinderFeedProductCardView.getBgNavi().setBackgroundColor(i17);
            ecsFinderFeedProductCardView.getBgNaviCart().setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i17, 16777215 & i17}));
        }
    }
}
