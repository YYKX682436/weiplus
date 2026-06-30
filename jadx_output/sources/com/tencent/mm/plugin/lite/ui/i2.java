package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144420d;

    public i2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI) {
        this.f144420d = wxaLiteAppSheetUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI.f144352x;
        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this.f144420d;
        wxaLiteAppSheetUI.P6(false);
        float f17 = (float) wxaLiteAppSheetUI.f144358i;
        android.view.View findViewById = wxaLiteAppSheetUI.findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = (com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById;
        if (scrollableFrameLayout.horizontalScroll) {
            scrollableFrameLayout.setTranslationX(f17);
        } else {
            scrollableFrameLayout.setTranslationY(f17);
        }
        scrollableFrameLayout.e(com.tencent.mm.plugin.lite.ui.a.f144380f, 300L, new com.tencent.mm.plugin.lite.ui.j(scrollableFrameLayout));
    }
}
