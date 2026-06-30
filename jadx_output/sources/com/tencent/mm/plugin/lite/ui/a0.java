package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144383d;

    public a0(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView) {
        this.f144383d = wxaHalfScreenLiteAppView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = this.f144383d;
        wxaHalfScreenLiteAppView.k(false);
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollContentView = wxaHalfScreenLiteAppView.getScrollContentView();
        if (scrollContentView != null) {
            scrollContentView.g();
        }
    }
}
