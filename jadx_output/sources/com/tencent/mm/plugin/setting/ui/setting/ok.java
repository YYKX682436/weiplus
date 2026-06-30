package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class ok implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI f161397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f161398b;

    public ok(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, kotlin.jvm.internal.c0 c0Var) {
        this.f161397a = settingsPersonalInfoPreviewUI;
        this.f161398b = c0Var;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int scrollY = view.getScrollY();
        com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f161397a;
        int b17 = i65.a.b(settingsPersonalInfoPreviewUI.getContext(), 80);
        kotlin.jvm.internal.c0 c0Var = this.f161398b;
        if (scrollY > b17) {
            if (c0Var.f310112d) {
                settingsPersonalInfoPreviewUI.setMMTitle(com.tencent.mm.R.string.iwa);
                settingsPersonalInfoPreviewUI.setActionbarColor(settingsPersonalInfoPreviewUI.getResources().getColor(com.tencent.mm.R.color.aaw));
                settingsPersonalInfoPreviewUI.supportLightStatusBar();
                c0Var.f310112d = false;
            }
        } else if (!c0Var.f310112d) {
            settingsPersonalInfoPreviewUI.setMMTitle("");
            settingsPersonalInfoPreviewUI.setActionbarColor(settingsPersonalInfoPreviewUI.getResources().getColor(com.tencent.mm.R.color.a9e));
            settingsPersonalInfoPreviewUI.setActionbarElementColor(settingsPersonalInfoPreviewUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            settingsPersonalInfoPreviewUI.supportLightStatusBar();
            c0Var.f310112d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
