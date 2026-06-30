package l20;

/* loaded from: classes9.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView f315200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qf f315201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView ecsFinderFeedProductNewAndBulkBuyerView, bw5.qf qfVar) {
        super(0);
        this.f315200d = ecsFinderFeedProductNewAndBulkBuyerView;
        this.f315201e = qfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f315200d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.x7 e17 = this.f315201e.e();
        kotlin.jvm.internal.o.f(e17, "getProductDetailJumpInfo(...)");
        pq.q.Lb(qVar, aVar, e17, null, 4, null);
        return jz5.f0.f302826a;
    }
}
