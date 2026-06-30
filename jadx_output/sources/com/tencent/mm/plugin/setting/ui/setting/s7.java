package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class s7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161532d;

    public s7(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161532d = settingsAuthUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161532d;
        android.view.View view = settingsAuthUI.f160329e;
        kotlin.jvm.internal.o.d(view);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.View view2 = settingsAuthUI.f160329e;
        kotlin.jvm.internal.o.d(view2);
        settingsAuthUI.f160330f = view2.getMeasuredHeight();
        int i17 = settingsAuthUI.f160330f;
        if (com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.V6(settingsAuthUI)) {
            settingsAuthUI.Z6(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.U6(settingsAuthUI);
        }
    }
}
