package l20;

/* loaded from: classes9.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView) {
        super(1);
        this.f315188d = ecsFinderFeedProductCardView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.x7 jumpInfo = (bw5.x7) obj;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f315188d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.q.Lb(qVar, new pq.a(context), jumpInfo, null, 4, null);
        return jz5.f0.f302826a;
    }
}
