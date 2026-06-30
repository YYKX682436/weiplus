package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout f144417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout) {
        super(3);
        this.f144417d = scrollableFrameLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).floatValue();
        kotlin.jvm.internal.o.g((com.tencent.mm.plugin.lite.ui.a) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = this.f144417d;
        scrollableFrameLayout.setHasArrivedTop(false);
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout.c(scrollableFrameLayout, com.tencent.mm.plugin.lite.ui.a.f144381g, intValue);
        return jz5.f0.f302826a;
    }
}
