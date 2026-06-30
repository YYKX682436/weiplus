package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView) {
        super(3);
        this.f144499d = wxaHalfScreenLiteAppView;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).floatValue();
        kotlin.jvm.internal.o.g((com.tencent.mm.plugin.lite.ui.a) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = this.f144499d;
        android.view.View backgroundView = wxaHalfScreenLiteAppView.getBackgroundView();
        if (backgroundView != null) {
            backgroundView.setBackgroundColor(0);
        }
        wxaHalfScreenLiteAppView.h(com.tencent.mm.plugin.lite.ui.a.f144378d, intValue);
        return jz5.f0.f302826a;
    }
}
