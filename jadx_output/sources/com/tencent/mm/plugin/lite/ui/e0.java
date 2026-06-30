package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144396d;

    public e0(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView) {
        this.f144396d = wxaHalfScreenLiteAppView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View landscapeMarginView;
        com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = this.f144396d;
        if (wxaHalfScreenLiteAppView.K == null) {
            wxaHalfScreenLiteAppView.K = com.tencent.mm.plugin.lite.LiteAppCenter.readPageConfig(wxaHalfScreenLiteAppView.f46051r, wxaHalfScreenLiteAppView.f46056w, wxaHalfScreenLiteAppView.f46055v, wxaHalfScreenLiteAppView.f46052s);
        }
        boolean isCurrentDarkMode = com.tencent.mm.plugin.lite.LiteAppCenter.isCurrentDarkMode();
        int backgroundColor = wxaHalfScreenLiteAppView.K.getBackgroundColor(isCurrentDarkMode);
        if (backgroundColor == 0) {
            backgroundColor = isCurrentDarkMode ? -16777216 : -1;
        }
        if (wxaHalfScreenLiteAppView.getLandscape()) {
            android.content.Context context = zc.c.f471339b;
            if (context == null) {
                kotlin.jvm.internal.o.o("appContext");
                throw null;
            }
            android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
            android.widget.FrameLayout landscapeContentView = wxaHalfScreenLiteAppView.getLandscapeContentView();
            kotlin.jvm.internal.o.d(landscapeContentView);
            landscapeContentView.setTranslationX(-(h17.x / 2));
            wxaHalfScreenLiteAppView.i(com.tencent.mm.plugin.lite.ui.a.f144380f, 300L, new com.tencent.mm.plugin.lite.ui.d0(wxaHalfScreenLiteAppView));
            int titleBackgroundColor = wxaHalfScreenLiteAppView.K.getTitleBackgroundColor(isCurrentDarkMode);
            if (titleBackgroundColor != 0 && (landscapeMarginView = wxaHalfScreenLiteAppView.getLandscapeMarginView()) != null) {
                landscapeMarginView.setBackgroundColor(titleBackgroundColor);
            }
        } else {
            wxaHalfScreenLiteAppView.k(true);
        }
        if (wxaHalfScreenLiteAppView.f46058y) {
            return;
        }
        wxaHalfScreenLiteAppView.f46043g.setBackgroundColor(backgroundColor);
    }
}
