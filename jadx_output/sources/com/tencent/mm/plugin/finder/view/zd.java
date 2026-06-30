package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class zd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f133460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        super(0);
        this.f133460d = finderLiveShoppingCouponView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f133460d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) finderLiveShoppingCouponView.findViewById(com.tencent.mm.R.id.uz6);
        if (weImageView == null) {
            return null;
        }
        weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.view.yd(finderLiveShoppingCouponView));
        return weImageView;
    }
}
