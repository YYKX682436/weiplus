package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class gn implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI f161081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f161082b;

    public gn(com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI settingsSystemPermissionUI, kotlin.jvm.internal.c0 c0Var) {
        this.f161081a = settingsSystemPermissionUI;
        this.f161082b = c0Var;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int scrollY = view.getScrollY();
        com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI settingsSystemPermissionUI = this.f161081a;
        int b17 = i65.a.b(settingsSystemPermissionUI.getContext(), 80);
        kotlin.jvm.internal.c0 c0Var = this.f161082b;
        if (scrollY > b17) {
            if (c0Var.f310112d) {
                settingsSystemPermissionUI.setMMTitle(com.tencent.mm.R.string.f493080ix4);
                settingsSystemPermissionUI.setActionbarColor(settingsSystemPermissionUI.getResources().getColor(com.tencent.mm.R.color.f478491c));
                settingsSystemPermissionUI.supportLightStatusBar();
                c0Var.f310112d = false;
            }
        } else if (!c0Var.f310112d) {
            settingsSystemPermissionUI.setMMTitle("");
            settingsSystemPermissionUI.setActionbarColor(settingsSystemPermissionUI.getResources().getColor(com.tencent.mm.R.color.f478491c));
            settingsSystemPermissionUI.setActionbarElementColor(settingsSystemPermissionUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            settingsSystemPermissionUI.supportLightStatusBar();
            c0Var.f310112d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
