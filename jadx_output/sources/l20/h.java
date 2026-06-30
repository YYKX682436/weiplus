package l20;

/* loaded from: classes9.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView) {
        super(0);
        this.f315151d = ecsFinderFeedProductCardView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView = this.f315151d;
        k20.g gVar = ecsFinderFeedProductCardView.H;
        if (gVar != null) {
            ((com.tencent.mm.plugin.finder.convert.tj) gVar).a(ecsFinderFeedProductCardView.getTvFeedBack());
        }
        return jz5.f0.f302826a;
    }
}
