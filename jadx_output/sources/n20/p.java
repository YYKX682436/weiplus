package n20;

/* loaded from: classes9.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductViewV3 f334232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductViewV3 ecsFinderFeedProductViewV3) {
        super(0);
        this.f334232d = ecsFinderFeedProductViewV3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductViewV3 ecsFinderFeedProductViewV3 = this.f334232d;
        k20.g gVar = ecsFinderFeedProductViewV3.f65926g;
        if (gVar != null) {
            em.e0 vb6 = ecsFinderFeedProductViewV3.getVb();
            if (vb6.f254275j == null) {
                vb6.f254275j = (android.widget.TextView) vb6.f254266a.findViewById(com.tencent.mm.R.id.f487408vh3);
            }
            android.widget.TextView textView = vb6.f254275j;
            kotlin.jvm.internal.o.f(textView, "getTvFeedBack(...)");
            ((com.tencent.mm.plugin.finder.convert.tj) gVar).a(textView);
        }
        return jz5.f0.f302826a;
    }
}
