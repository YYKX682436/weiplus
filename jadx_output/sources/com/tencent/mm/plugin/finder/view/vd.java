package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class vd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f133236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        super(0);
        this.f133236d = finderLiveShoppingCouponView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f133236d.findViewById(com.tencent.mm.R.id.d0d);
        kotlin.jvm.internal.o.d(textView);
        hc2.o.a(textView, false);
        return textView;
    }
}
