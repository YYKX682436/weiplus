package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public final class b8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f160862d;

    public b8(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f160862d = settingsAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f160862d;
        android.content.Intent intent = new android.content.Intent(settingsAuthUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.class);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI2 = this.f160862d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingsAuthUI2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$updateOptionMenu$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsAuthUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingsAuthUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$updateOptionMenu$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.i(settingsAuthUI);
        return true;
    }
}
