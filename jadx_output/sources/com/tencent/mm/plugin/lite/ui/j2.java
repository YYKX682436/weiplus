package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout f144426e;

    public j2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI, com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout) {
        this.f144425d = wxaLiteAppSheetUI;
        this.f144426e = scrollableFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean hasArrivedTop = this.f144426e.getHasArrivedTop();
        int i17 = com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI.f144352x;
        this.f144425d.P6(hasArrivedTop);
    }
}
