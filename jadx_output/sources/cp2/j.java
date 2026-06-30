package cp2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.k f220823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.l f220824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f220825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cp2.k kVar, cp2.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader) {
        super(1);
        this.f220823d = kVar;
        this.f220824e = lVar;
        this.f220825f = n0Var;
        this.f220826g = nearbyLiveFeedLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        az2.w wVar = (az2.w) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (wVar != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) wVar.f16160d;
            this.f220826g.f121473q = iResponse.getLastBuffer();
            this.f220825f.onFetchDone(iResponse);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this.f220823d, this.f220824e, this.f220825f, false, 4, null);
        }
        return f0Var2;
    }
}
