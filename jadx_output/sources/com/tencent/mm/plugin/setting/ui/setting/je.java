package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class je implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI f161194d;

    public je(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        this.f161194d = settingsHearingAidTestEnvironmentUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestEnvironmentUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI = this.f161194d;
        if (settingsHearingAidTestEnvironmentUI.f160443m) {
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidTestEnvironmentUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1h);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestEnvironmentUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        androidx.appcompat.app.AppCompatActivity context2 = settingsHearingAidTestEnvironmentUI.getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var2.d(com.tencent.mm.R.string.p1j);
        e4Var2.c();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestEnvironmentUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
