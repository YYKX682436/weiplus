package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes13.dex */
public class on implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI f161401d;

    public on(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI) {
        this.f161401d = settingsTrustFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI = this.f161401d;
        if (settingsTrustFriendUI.f160739i) {
            settingsTrustFriendUI.f160739i = false;
            settingsTrustFriendUI.f160736f.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
