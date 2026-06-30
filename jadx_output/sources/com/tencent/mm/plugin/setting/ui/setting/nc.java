package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class nc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI f161357d;

    public nc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI) {
        this.f161357d = settingsHearingAidFinishUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI = this.f161357d;
        android.content.Intent intent = new android.content.Intent(settingsHearingAidFinishUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.class);
        intent.putExtra("result_code", 0);
        intent.putExtra("audio_test_abandon", true);
        intent.addFlags(603979776);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI2 = this.f161357d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingsHearingAidFinishUI2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsHearingAidFinishUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingsHearingAidFinishUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsHearingAidFinishUI.finish();
        return false;
    }
}
