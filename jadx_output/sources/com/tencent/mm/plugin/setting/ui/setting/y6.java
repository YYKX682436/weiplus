package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI f161777d;

    public y6(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI settingsAliasUI) {
        this.f161777d = settingsAliasUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI settingsAliasUI = this.f161777d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAliasUI", "click next, allPass %s", java.lang.Boolean.valueOf(settingsAliasUI.f160320h));
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = settingsAliasUI.f160326q;
        modifyAliasLogStruct.f59239e = 1L;
        if (settingsAliasUI.f160320h) {
            modifyAliasLogStruct.k();
            settingsAliasUI.a7();
        } else {
            java.util.List list = settingsAliasUI.f160318f;
            if (list == null || list.isEmpty()) {
                settingsAliasUI.f160321i = true;
                settingsAliasUI.Z6(true);
            } else {
                int i17 = 0;
                int i18 = 0;
                while (i17 < ((java.util.LinkedList) settingsAliasUI.f160318f).size()) {
                    if (!((r45.e00) ((java.util.LinkedList) settingsAliasUI.f160318f).get(i17)).f372889g) {
                        i18 = i17 == 0 ? i18 | 1 : i18 | 2;
                    }
                    i17++;
                }
                modifyAliasLogStruct.f59240f = i18;
                modifyAliasLogStruct.k();
                com.tencent.mm.ui.MMWizardActivity.X6(settingsAliasUI, new android.content.Intent(settingsAliasUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI.class));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
