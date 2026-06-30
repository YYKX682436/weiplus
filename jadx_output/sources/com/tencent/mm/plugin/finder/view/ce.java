package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ce extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView f131773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView finderLiveShoppingCouponView, android.content.Context context) {
        super(0);
        this.f131773d = finderLiveShoppingCouponView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f131773d.findViewById(com.tencent.mm.R.id.obc);
        textView.setTextSize(1, (14.0f * j65.f.g()) / 400);
        return textView;
    }
}
