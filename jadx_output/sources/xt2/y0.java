package xt2;

/* loaded from: classes3.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f457112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f457112d = finderLiveShopPromoteContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View container;
        container = this.f457112d.getContainer();
        return container.findViewById(com.tencent.mm.R.id.lcd);
    }
}
