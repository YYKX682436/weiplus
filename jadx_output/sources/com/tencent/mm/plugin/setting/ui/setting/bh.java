package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class bh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI f160873e;

    public bh(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI, java.lang.String str) {
        this.f160873e = settingsModifyAliasUI;
        this.f160872d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.f160519u;
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI = this.f160873e;
        settingsModifyAliasUI.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList2 = settingsModifyAliasUI.f160530r;
        if (arrayList2 != null && settingsModifyAliasUI.f160531s != null && arrayList2.size() == settingsModifyAliasUI.f160531s.size()) {
            for (int i18 = 0; i18 < settingsModifyAliasUI.f160530r.size(); i18++) {
                hashMap.put((java.lang.Integer) settingsModifyAliasUI.f160530r.get(i18), (java.lang.String) settingsModifyAliasUI.f160531s.get(i18));
            }
        }
        settingsModifyAliasUI.f160529q = new k14.y(1, this.f160872d, hashMap);
        settingsModifyAliasUI.f160527o = db5.e1.Q(settingsModifyAliasUI.getContext(), settingsModifyAliasUI.getString(com.tencent.mm.R.string.gyb), settingsModifyAliasUI.getString(com.tencent.mm.R.string.gy7), false, false, null);
        gm0.j1.d().g(settingsModifyAliasUI.f160529q);
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
        modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
        modifyAliasLogStruct.f59239e = 6L;
        modifyAliasLogStruct.k();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
