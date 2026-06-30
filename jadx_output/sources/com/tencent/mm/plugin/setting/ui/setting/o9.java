package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class o9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161384d;

    public o9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161384d = settingsCareModeIntro;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161384d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsCareModeIntro.getContext());
        u1Var.g(settingsCareModeIntro.getContext().getResources().getString(com.tencent.mm.R.string.f492980ij4));
        u1Var.a(true);
        u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.n9(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
