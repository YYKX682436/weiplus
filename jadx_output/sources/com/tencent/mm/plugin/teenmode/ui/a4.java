package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes5.dex */
public class a4 implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f172928a;

    public a4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f172928a = settingsTeenModeMain;
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int scrollY = view.getScrollY();
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = this.f172928a;
        if (scrollY > i65.a.b(settingsTeenModeMain.getContext(), 144)) {
            settingsTeenModeMain.setMMTitle(com.tencent.mm.R.string.izu);
            settingsTeenModeMain.setActionbarColor(settingsTeenModeMain.getResources().getColor(com.tencent.mm.R.color.aaw));
            settingsTeenModeMain.supportLightStatusBar();
        } else {
            settingsTeenModeMain.setMMTitle("");
            settingsTeenModeMain.setActionbarColor(settingsTeenModeMain.getResources().getColor(com.tencent.mm.R.color.a9e));
            settingsTeenModeMain.setActionbarElementColor(settingsTeenModeMain.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            settingsTeenModeMain.supportLightStatusBar();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
