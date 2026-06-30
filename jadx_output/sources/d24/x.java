package d24;

/* loaded from: classes11.dex */
public final class x implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225971d;

    public x(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225971d = settingButtonLogoutAccount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ((is.f) ((js.r0) i95.n0.c(js.r0.class))).fj((de0.f) m1Var, "last_logout_no_pwd_ticket_for_one_click", true);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225971d;
        com.tencent.mm.sdk.platformtools.u3.h(new d24.w(settingButtonLogoutAccount));
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingButtonLogoutAccount.f161853i;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount.z7(settingButtonLogoutAccount);
    }
}
