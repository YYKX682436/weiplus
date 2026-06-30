package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class zn implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161835a;

    public zn(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161835a = settingsUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161835a;
        android.content.Intent intent = new android.content.Intent(settingsUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
        intent.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class.getCanonicalName());
        com.tencent.mm.ui.MMWizardActivity.X6(settingsUI.getContext(), intent);
    }
}
