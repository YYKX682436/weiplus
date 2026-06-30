package n20;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView f334215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kf f334216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView ecsFinderFeedHeadView, bw5.kf kfVar) {
        super(0);
        this.f334215d = ecsFinderFeedHeadView;
        this.f334216e = kfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f334215d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.x7 b17 = this.f334216e.b();
        kotlin.jvm.internal.o.f(b17, "getEcsJumpInfo(...)");
        pq.q.Lb(qVar, aVar, b17, null, 4, null);
        return jz5.f0.f302826a;
    }
}
