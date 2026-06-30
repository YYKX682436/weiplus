package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public final class w4 implements android.media.SoundPool.OnLoadCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI f161684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161685b;

    public w4(com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI, java.lang.String str) {
        this.f161684a = settingMessageRingtoneUI;
        this.f161685b = str;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(android.media.SoundPool soundPool, int i17, int i18) {
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingMessageRingtoneUI", "SoundPool load error pathId " + this.f161685b + " status " + i18);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI = this.f161684a;
        settingMessageRingtoneUI.f160243i = valueOf;
        android.media.SoundPool soundPool2 = settingMessageRingtoneUI.f160239e;
        if (soundPool2 != null) {
            soundPool2.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
}
