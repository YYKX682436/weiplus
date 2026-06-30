package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class k2 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144430d;

    public k2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI) {
        this.f144430d = wxaLiteAppSheetUI;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = i27 - i18;
        int i47 = i38 - i29;
        if (i19 - i17 == i37 - i28 && i39 == i47) {
            return;
        }
        com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI = this.f144430d;
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = (com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) wxaLiteAppSheetUI.findViewById(com.tencent.mm.R.id.gd9);
        if (scrollableFrameLayout != null) {
            scrollableFrameLayout.post(new com.tencent.mm.plugin.lite.ui.j2(wxaLiteAppSheetUI, scrollableFrameLayout));
        }
    }
}
