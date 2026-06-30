package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class bi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI f160874d;

    public bi(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        this.f160874d = settingsModifyEmailAddrUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.d().g(new r61.f1(4));
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = this.f160874d;
        java.lang.String string = settingsModifyEmailAddrUI.getString(com.tencent.mm.R.string.f490573yv);
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI2 = this.f160874d;
        settingsModifyEmailAddrUI.f160536d = db5.e1.Q(settingsModifyEmailAddrUI, string, settingsModifyEmailAddrUI2.getString(com.tencent.mm.R.string.j0h), true, true, new com.tencent.mm.plugin.setting.ui.setting.ai(this));
        settingsModifyEmailAddrUI2.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
