package l20;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.kf f315173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView, bw5.kf kfVar) {
        super(0);
        this.f315171d = str;
        this.f315172e = ecsFinderFeedProductCardView;
        this.f315173f = kfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("click_type", "img"), new jz5.l("img_url", this.f315171d), new jz5.l("img_pos", "0"));
        int i17 = com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView.L;
        com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView = this.f315172e;
        ecsFinderFeedProductCardView.d("feeds_spu_card", "element_click", k17);
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = ecsFinderFeedProductCardView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.x7 b17 = this.f315173f.b();
        kotlin.jvm.internal.o.f(b17, "getEcsJumpInfo(...)");
        pq.q.Lb(qVar, aVar, b17, null, 4, null);
        return jz5.f0.f302826a;
    }
}
