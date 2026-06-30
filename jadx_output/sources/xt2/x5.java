package xt2;

/* loaded from: classes3.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList f457102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList) {
        super(0);
        this.f457102d = finderLiveShoppingSkuList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList = this.f457102d;
        android.view.View inflate = android.view.LayoutInflater.from(finderLiveShoppingSkuList.getContext()).inflate(com.tencent.mm.R.layout.ddg, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pyr)).setLineSpacing(0.0f, 0.8f);
        ym5.a1.h(inflate, new xt2.w5(finderLiveShoppingSkuList));
        return inflate;
    }
}
