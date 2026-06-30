package d24;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225908d;

    public c0(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225908d = settingButtonLogoutAccount;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonLogoutAccount$initFingerprintEntry$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v61.d.g("fingerprint_login_logout", 0);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount.y7(this.f225908d, "SettingGroup_Main_AccountInfo_Fingerprint");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonLogoutAccount$initFingerprintEntry$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
