package cp2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f220900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f220899d = nearbyLiveFeedLoader;
        this.f220900e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f220899d.f121468i;
        if (lVar != null) {
            lVar.invoke(this.f220900e);
        }
        return jz5.f0.f302826a;
    }
}
