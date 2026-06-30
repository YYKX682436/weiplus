package d24;

/* loaded from: classes.dex */
public final class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225902d;

    public a0(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225902d = settingButtonLogoutAccount;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225902d;
        android.content.Intent intent = new android.content.Intent(settingButtonLogoutAccount.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
        intent.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class.getCanonicalName());
        com.tencent.mm.ui.MMWizardActivity.X6(settingButtonLogoutAccount.getContext(), intent);
    }
}
