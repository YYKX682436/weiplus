package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class i6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI f161146d;

    public i6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI) {
        this.f161146d = settingsAboutSystemUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI = this.f161146d;
        settingsAboutSystemUI.getDefaultSharedPreferences().edit().putBoolean("settings_voicerecorder_mode", true).commit();
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsAboutSystemUI.f160276g).h("settings_voicerecorder_mode")).O(true);
        ((com.tencent.mm.ui.base.preference.h0) settingsAboutSystemUI.f160276g).notifyDataSetChanged();
    }
}
