package l20;

/* loaded from: classes9.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewBuyerView f315152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lf f315153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewBuyerView ecsFinderFeedProductNewBuyerView, bw5.lf lfVar) {
        super(0);
        this.f315152d = ecsFinderFeedProductNewBuyerView;
        this.f315153e = lfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f315152d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.lf lfVar = this.f315153e;
        bw5.x7 x7Var = lfVar.f29770g[3] ? lfVar.f29769f : new bw5.x7();
        kotlin.jvm.internal.o.f(x7Var, "getDescJumpInfo(...)");
        pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
        return jz5.f0.f302826a;
    }
}
