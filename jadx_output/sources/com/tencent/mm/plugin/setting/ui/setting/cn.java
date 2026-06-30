package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class cn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI f160924d;

    public cn(com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI settingsSystemPermissionUI) {
        this.f160924d = settingsSystemPermissionUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI settingsSystemPermissionUI = this.f160924d;
        android.content.Intent intent = new android.content.Intent(this.f160924d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.permission.SettingCameraPermissionUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(settingsSystemPermissionUI, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsSystemPermissionUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(settingsSystemPermissionUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
