package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class ng implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.og f161361a;

    public ng(com.tencent.mm.plugin.setting.ui.setting.og ogVar) {
        this.f161361a = ogVar;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        boolean z18;
        com.tencent.mm.plugin.setting.ui.setting.og ogVar = this.f161361a;
        if (en0Var == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, response no.");
            v24.o0.l(ogVar.f161394c.f161475d);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, response yes.");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = ogVar.f161394c.f161475d;
        settingsManageFindOtherServiceUI.f160513u.postDelayed(new com.tencent.mm.plugin.setting.ui.setting.sg(settingsManageFindOtherServiceUI), 1000L);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.setting.ui.setting.qg qgVar = ogVar.f161394c;
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI2 = qgVar.f161475d;
        java.util.Iterator it = settingsManageFindOtherServiceUI2.f160494f.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue != 3) {
                if (intValue != 10) {
                    if (intValue != 11) {
                        if (intValue != 7) {
                            if (intValue != 13) {
                                if (intValue == 8 && ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).q("settings_miniprogram_switch") && ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).h("settings_miniprogram_switch")).N()) {
                                    z18 = true;
                                    break;
                                }
                            } else {
                                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).q(settingsManageFindOtherServiceUI2.f160511s)) {
                                    if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).h(settingsManageFindOtherServiceUI2.f160511s)).N()) {
                                        z18 = true;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).q("settings_game_switch") && ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).h("settings_game_switch")).N()) {
                            z18 = true;
                            break;
                        }
                    } else if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).q("settings_finder_switch") && ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).h("settings_finder_switch")).N()) {
                        z18 = true;
                        break;
                    }
                } else if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).q("settings_look_switch") && ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).h("settings_look_switch")).N()) {
                    z18 = true;
                    break;
                }
            } else if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).q("settings_search_switch") && ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI2.getPreferenceScreen()).h("settings_search_switch")).N()) {
                z18 = true;
                break;
            }
        }
        z18 = false;
        if (z18) {
            qgVar.f161475d.f160513u.postDelayed(new com.tencent.mm.plugin.setting.ui.setting.mg(this), 500L);
        }
    }
}
