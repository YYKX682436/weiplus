package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class ao implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f160845d;

    public ao(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f160845d = settingsUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f160845d;
        android.content.Intent intent = new android.content.Intent(settingsUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
        intent.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class.getCanonicalName());
        com.tencent.mm.ui.MMWizardActivity.X6(settingsUI.getContext(), intent);
    }
}
