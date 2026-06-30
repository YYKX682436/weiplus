package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class q6 implements android.app.TimePickerDialog.OnTimeSetListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI f161464a;

    public q6(com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI settingsActiveTimeUI) {
        this.f161464a = settingsActiveTimeUI;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public void onTimeSet(android.widget.TimePicker timePicker, int i17, int i18) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI settingsActiveTimeUI = this.f161464a;
        if (settingsActiveTimeUI.f160300i) {
            settingsActiveTimeUI.f160296e = i17;
            settingsActiveTimeUI.f160297f = i18;
            android.content.SharedPreferences v17 = ip.b.v();
            v17.edit().putInt("settings_active_end_time_hour", i17).commit();
            v17.edit().putInt("settings_active_end_time_min", i18).commit();
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveActiveEnd: %d:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            settingsActiveTimeUI.f160298g = i17;
            settingsActiveTimeUI.f160299h = i18;
            android.content.SharedPreferences v18 = ip.b.v();
            v18.edit().putInt("settings_active_begin_time_hour", i17).commit();
            v18.edit().putInt("settings_active_begin_time_min", i18).commit();
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveActiveBegine: %d:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        settingsActiveTimeUI.initView();
    }
}
