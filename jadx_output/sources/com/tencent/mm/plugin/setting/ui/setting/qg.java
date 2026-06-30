package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class qg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI f161475d;

    public qg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI) {
        this.f161475d = settingsManageFindOtherServiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindOtherServiceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = this.f161475d;
        java.util.Iterator it = settingsManageFindOtherServiceUI.f160494f.keySet().iterator();
        long j17 = 0;
        long j18 = 0;
        boolean z17 = false;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue == 3) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).h("settings_search_switch");
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_search_switch")) {
                    j17 |= 2097152;
                    if (checkBoxPreference.N()) {
                        z17 = true;
                    } else {
                        j18 |= 2097152;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_search_switch " + checkBoxPreference.N());
                }
            } else if (intValue == 10) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_look_switch")) {
                    j17 |= 67108864;
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).h("settings_look_switch");
                    if (checkBoxPreference2.N()) {
                        z17 = true;
                    } else {
                        j18 |= 67108864;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_look_switch " + checkBoxPreference2.N());
                }
            } else if (intValue == 11) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_finder_switch")) {
                    j17 |= 34359738368L;
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).h("settings_finder_switch");
                    if (checkBoxPreference3.N()) {
                        z17 = true;
                    } else {
                        j18 |= 34359738368L;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_finder_switch = " + checkBoxPreference3.N());
                }
            } else if (intValue == 13) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q(settingsManageFindOtherServiceUI.f160511s)) {
                    j17 |= 9007199254740992L;
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).h(settingsManageFindOtherServiceUI.f160511s);
                    if (checkBoxPreference4.N()) {
                        z17 = true;
                    } else {
                        j18 |= 9007199254740992L;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_finder_live_switch = " + checkBoxPreference4.N());
                }
            } else if (intValue == 8) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_miniprogram_switch")) {
                    j17 |= 16777216;
                    com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference5 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).h("settings_miniprogram_switch");
                    if (checkBoxPreference5.N()) {
                        z17 = true;
                    } else {
                        j18 |= 16777216;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_miniprogram_switch = " + checkBoxPreference5.N());
                }
            } else if (intValue == 7 && ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_game_switch")) {
                j17 |= 8388608;
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference6 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).h("settings_game_switch");
                if (checkBoxPreference6.N()) {
                    z17 = true;
                } else {
                    j18 |= 8388608;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_game_switch = " + checkBoxPreference6.N());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, switchValue = " + j18 + ", WhichExtFunctionSwitch = " + j17 + ", hasOpen = " + z17);
        if (z17) {
            v24.o0.k(settingsManageFindOtherServiceUI, settingsManageFindOtherServiceUI.getString(com.tencent.mm.R.string.ijp), new com.tencent.mm.plugin.setting.ui.setting.og(this, j17, j18), false);
        } else {
            v24.o0.a(this.f161475d, 1, 2, j17, j18, new com.tencent.mm.plugin.setting.ui.setting.pg(this), false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindOtherServiceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
