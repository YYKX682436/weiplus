package l20;

/* loaded from: classes9.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.kf f315187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView, yz5.l lVar, bw5.kf kfVar) {
        super(0);
        this.f315185d = ecsFinderFeedProductCardView;
        this.f315186e = lVar;
        this.f315187f = kfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map e17 = kz5.b1.e(new jz5.l("click_type", "video"));
        int i17 = com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView.L;
        this.f315185d.d("feeds_spu_card", "element_click", e17);
        bw5.x7 b17 = this.f315187f.b();
        kotlin.jvm.internal.o.f(b17, "getEcsJumpInfo(...)");
        this.f315186e.invoke(b17);
        return jz5.f0.f302826a;
    }
}
