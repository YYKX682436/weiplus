package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class c3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI f160897d;

    public c3(com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI settingDeleteAccountInputPassUI) {
        this.f160897d = settingDeleteAccountInputPassUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI settingDeleteAccountInputPassUI = this.f160897d;
        settingDeleteAccountInputPassUI.hideVKB();
        com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI settingDeleteAccountInputPassUI2 = this.f160897d;
        android.content.Intent intent = new android.content.Intent(settingDeleteAccountInputPassUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingDeleteAccountInputPassUI2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountInputPassUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingDeleteAccountInputPassUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingDeleteAccountInputPassUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountInputPassUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
