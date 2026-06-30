package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class kg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.lg f161239d;

    public kg(com.tencent.mm.plugin.setting.ui.setting.lg lgVar) {
        this.f161239d = lgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        long j17;
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = this.f161239d.f161295d;
        boolean z17 = com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI.f160509w;
        settingsManageFindOtherServiceUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave.");
        java.util.Iterator it = settingsManageFindOtherServiceUI.f160494f.keySet().iterator();
        long j18 = 0;
        long j19 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue == 3) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_search_switch")) {
                    j17 = 2097152;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 10) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_look_switch")) {
                    j17 = 67108864;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 11) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_finder_switch")) {
                    j17 = 34359738368L;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 13) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q(settingsManageFindOtherServiceUI.f160511s)) {
                    j17 = 9007199254740992L;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 8) {
                if (((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_miniprogram_switch")) {
                    j17 = 16777216;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 7 && ((com.tencent.mm.ui.base.preference.h0) settingsManageFindOtherServiceUI.getPreferenceScreen()).q("settings_game_switch")) {
                j17 = 8388608;
                j18 |= j17;
                j19 |= j17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. switchValue = " + j19 + ", WhichExtFunctionSwitch= " + j18);
        v24.o0.a(settingsManageFindOtherServiceUI, 1, 2, j18, j19, new com.tencent.mm.plugin.setting.ui.setting.rg(settingsManageFindOtherServiceUI), false);
    }
}
