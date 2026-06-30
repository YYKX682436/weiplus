package n20;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView f334221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView ecsFinderFeedHeadView) {
        super(0);
        this.f334221d = ecsFinderFeedHeadView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        l20.o0 callback = this.f334221d.getCallback();
        java.util.Map params = callback != null ? callback.getParams() : null;
        return params == null ? kz5.q0.f314001d : params;
    }
}
