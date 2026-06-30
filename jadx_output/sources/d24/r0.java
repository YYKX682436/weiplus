package d24;

/* loaded from: classes5.dex */
public final class r0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f225960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225961b;

    public r0(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225960a = z2Var;
        this.f225961b = settingButtonLogoutAccount;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "logout");
        this.f225960a.B();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount.x7(this.f225961b);
    }
}
