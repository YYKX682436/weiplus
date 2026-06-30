package d24;

/* loaded from: classes.dex */
public final class b0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225905a;

    public b0(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225905a = settingButtonLogoutAccount;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225905a;
        android.content.Intent intent = new android.content.Intent(settingButtonLogoutAccount.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.class);
        intent.putExtra("WizardRootClass", com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class.getCanonicalName());
        com.tencent.mm.ui.MMWizardActivity.X6(settingButtonLogoutAccount.getContext(), intent);
    }
}
