package xt2;

/* loaded from: classes3.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f457058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f457058d = finderLiveShopPromoteContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer = this.f457058d;
        return android.view.LayoutInflater.from(finderLiveShopPromoteContainer.getContext()).inflate(com.tencent.mm.R.layout.az6, (android.view.ViewGroup) finderLiveShopPromoteContainer, true);
    }
}
