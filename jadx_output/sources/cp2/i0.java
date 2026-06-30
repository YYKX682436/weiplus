package cp2;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(cp2.v0 v0Var) {
        super(1);
        this.f220821d = v0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.j0 dispatcher;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        c92.g gVar = c92.g.f39738a;
        if (!(((java.lang.Number) kb2.c.f306227b.r()).intValue() == 1) && (nearbyLiveFeedLoader = this.f220821d.f220943w) != null && (dispatcher = nearbyLiveFeedLoader.getDispatcher()) != null) {
            dispatcher.a();
        }
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", " receive FinderNearbyDataUpdateEvent mergeInsert done");
        return jz5.f0.f302826a;
    }
}
