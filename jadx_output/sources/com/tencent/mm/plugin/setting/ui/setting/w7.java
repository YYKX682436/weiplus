package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class w7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161690d;

    public w7(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161690d = settingsAuthUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.f160327x;
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161690d;
        settingsAuthUI.X6().f267572b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        i65.a.B(settingsAuthUI);
        settingsAuthUI.f160333i = java.lang.Math.min(java.lang.Math.max(settingsAuthUI.X6().f267572b.getMeasuredHeight(), 0), i65.a.k(settingsAuthUI));
        settingsAuthUI.X6().f267572b.getMeasuredHeight();
        int i18 = settingsAuthUI.f160333i;
        if (com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.V6(settingsAuthUI)) {
            settingsAuthUI.Z6(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.U6(settingsAuthUI);
        }
    }
}
