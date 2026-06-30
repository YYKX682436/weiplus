package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class e9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f160988d;

    public e9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f160988d = settingsCareModeIntro;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f160988d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingsCareModeIntro.getContext(), 1, true);
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.y8(this);
        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.a9(this);
        k0Var.q(settingsCareModeIntro.getResources().getString(com.tencent.mm.R.string.lsi), 17);
        k0Var.f211880r = new com.tencent.mm.plugin.setting.ui.setting.b9(this);
        k0Var.C = new com.tencent.mm.plugin.setting.ui.setting.c9(this);
        k0Var.f211854d = new com.tencent.mm.plugin.setting.ui.setting.d9(this);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
