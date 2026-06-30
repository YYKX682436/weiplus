package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173145d;

    public t4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173145d = settingsTeenModeMain;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent(this.f173145d, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.BindGuardianUI.class);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = this.f173145d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(settingsTeenModeMain, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsTeenModeMain.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(settingsTeenModeMain, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
