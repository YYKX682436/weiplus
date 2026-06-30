package wh2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader f445957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f445958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader finderLivePurchaseContentListLoader, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f445957d = finderLivePurchaseContentListLoader;
        this.f445958e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f445957d.f111693e;
        if (lVar != null) {
            lVar.invoke(this.f445958e);
        }
        return jz5.f0.f302826a;
    }
}
