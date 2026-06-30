package l20;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView) {
        super(1);
        this.f315149d = ecsFinderFeedProductCardView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String clickType = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(clickType, "clickType");
        java.util.Map e17 = kz5.b1.e(new jz5.l("click_type", clickType));
        int i17 = com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView.L;
        this.f315149d.d("feeds_spu_card", "element_click", e17);
        return jz5.f0.f302826a;
    }
}
