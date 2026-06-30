package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class wg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI f161706d;

    public wg(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI) {
        this.f161706d = settingsModifyAliasUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI = this.f161706d;
        android.text.Editable text = settingsModifyAliasUI.f160521f.getText();
        settingsModifyAliasUI.getClass();
        if (text.length() >= 6 && text.length() <= 20) {
            settingsModifyAliasUI.hideVKB();
            settingsModifyAliasUI.a7("");
            java.lang.String obj = settingsModifyAliasUI.f160521f.getText().toString();
            settingsModifyAliasUI.getClass();
            settingsModifyAliasUI.f160528p = new v61.j0(obj);
            settingsModifyAliasUI.f160527o = db5.e1.Q(settingsModifyAliasUI.getContext(), "", settingsModifyAliasUI.getString(com.tencent.mm.R.string.f490552yb), false, true, new com.tencent.mm.plugin.setting.ui.setting.zg(settingsModifyAliasUI));
            gm0.j1.d().g(settingsModifyAliasUI.f160528p);
        } else {
            com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
            modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
            modifyAliasLogStruct.f59239e = 4L;
            modifyAliasLogStruct.f59240f = 5L;
            modifyAliasLogStruct.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
