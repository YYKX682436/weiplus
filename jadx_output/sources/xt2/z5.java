package xt2;

/* loaded from: classes3.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList f457156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList) {
        super(0);
        this.f457156d = finderLiveShoppingSkuList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList = this.f457156d;
        android.view.View inflate = android.view.LayoutInflater.from(finderLiveShoppingSkuList.getContext()).inflate(com.tencent.mm.R.layout.ddh, (android.view.ViewGroup) null);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(i65.a.a(inflate.getContext(), 12.0f));
        inflate.setLayoutParams(marginLayoutParams);
        ym5.a1.h(inflate, new xt2.y5(finderLiveShoppingSkuList));
        return inflate;
    }
}
