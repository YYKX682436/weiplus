package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class xd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f133326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        super(0);
        this.f133326d = finderLiveShoppingCouponView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float descSize;
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f133326d;
        android.widget.TextView textView = (android.widget.TextView) finderLiveShoppingCouponView.findViewById(com.tencent.mm.R.id.uz7);
        if (textView == null) {
            return null;
        }
        descSize = finderLiveShoppingCouponView.getDescSize();
        textView.setTextSize(1, descSize);
        return textView;
    }
}
