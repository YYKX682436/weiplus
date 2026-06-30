package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class wd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f133291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        super(0);
        this.f133291d = finderLiveShoppingCouponView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float descSize;
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f133291d;
        android.widget.TextView textView = (android.widget.TextView) finderLiveShoppingCouponView.findViewById(com.tencent.mm.R.id.ltv);
        descSize = finderLiveShoppingCouponView.getDescSize();
        textView.setTextSize(1, descSize);
        return textView;
    }
}
