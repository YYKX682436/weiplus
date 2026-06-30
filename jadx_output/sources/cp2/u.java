package cp2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory f220918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
        super(0);
        this.f220918d = nearbyLiveItemConvertFactory;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cp2.c cVar;
        cVar = this.f220918d.presenter;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter");
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = ((cp2.v0) cVar).f220943w;
        kotlin.jvm.internal.o.d(nearbyLiveFeedLoader);
        nearbyLiveFeedLoader.requestRefresh();
        return jz5.f0.f302826a;
    }
}
