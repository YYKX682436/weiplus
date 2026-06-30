package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class t6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI f161564d;

    public t6(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI settingsAliasResultUI) {
        this.f161564d = settingsAliasResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI settingsAliasResultUI = this.f161564d;
        android.content.Intent intent = new android.content.Intent(settingsAliasResultUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
        intent.putExtra("kintent_hint", settingsAliasResultUI.getString(com.tencent.mm.R.string.hx7));
        settingsAliasResultUI.startActivityForResult(intent, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
