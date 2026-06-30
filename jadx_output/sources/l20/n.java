package l20;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.kf f315180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, int i17, com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView, yz5.l lVar, bw5.kf kfVar) {
        super(0);
        this.f315176d = str;
        this.f315177e = i17;
        this.f315178f = ecsFinderFeedProductCardView;
        this.f315179g = lVar;
        this.f315180h = kfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("click_type", "img"), new jz5.l("img_url", this.f315176d), new jz5.l("img_pos", java.lang.String.valueOf(this.f315177e + 1)));
        int i17 = com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView.L;
        this.f315178f.d("feeds_spu_card", "element_click", k17);
        bw5.x7 b17 = this.f315180h.b();
        kotlin.jvm.internal.o.f(b17, "getEcsJumpInfo(...)");
        this.f315179g.invoke(b17);
        return jz5.f0.f302826a;
    }
}
