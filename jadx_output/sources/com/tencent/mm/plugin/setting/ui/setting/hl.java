package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class hl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI f161118d;

    public hl(com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI settingsRingtoneUI) {
        this.f161118d = settingsRingtoneUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI settingsRingtoneUI = this.f161118d;
        android.content.SharedPreferences.Editor edit = settingsRingtoneUI.getSharedPreferences(e17, 0).edit();
        int i17 = settingsRingtoneUI.f160631i;
        if (i17 != 0) {
            android.net.Uri ringtoneUri = settingsRingtoneUI.f160626d.getRingtoneUri(i17 - 1);
            java.util.Objects.toString(ringtoneUri);
            if (ringtoneUri != null) {
                str = ringtoneUri.toString();
                edit.putString("settings.ringtone.name", android.media.RingtoneManager.getRingtone(settingsRingtoneUI, ringtoneUri).getTitle(settingsRingtoneUI));
                edit.commit();
                ip.b.v().edit().putString("settings.ringtone", str).commit();
                com.tencent.mars.xlog.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", str);
                settingsRingtoneUI.finish();
                return true;
            }
            edit.putString("settings.ringtone.name", settingsRingtoneUI.getString(com.tencent.mm.R.string.iui));
        } else {
            edit.putString("settings.ringtone.name", settingsRingtoneUI.getString(com.tencent.mm.R.string.iui));
        }
        str = null;
        edit.commit();
        ip.b.v().edit().putString("settings.ringtone", str).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", str);
        settingsRingtoneUI.finish();
        return true;
    }
}
