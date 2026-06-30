package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class pl implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161449d;

    public pl(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161449d = settingsSearchAuthUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161449d;
        settingsSearchAuthUI.f160636f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        i65.a.B(settingsSearchAuthUI);
        int min = java.lang.Math.min(java.lang.Math.max(settingsSearchAuthUI.f160636f.getMeasuredHeight(), 0), i65.a.k(settingsSearchAuthUI));
        settingsSearchAuthUI.f160636f.getMeasuredHeight();
        android.widget.TextView textView = settingsSearchAuthUI.f160638h;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (min * 0.3f);
                settingsSearchAuthUI.f160638h.setLayoutParams(layoutParams);
            }
        }
        android.widget.ProgressBar progressBar = settingsSearchAuthUI.f160639i;
        if (progressBar != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = progressBar.getLayoutParams();
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (min * 0.3f);
                settingsSearchAuthUI.f160639i.setLayoutParams(layoutParams2);
            }
        }
    }
}
