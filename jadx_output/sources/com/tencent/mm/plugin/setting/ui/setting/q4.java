package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public final class q4 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI f161462a;

    public q4(com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI) {
        this.f161462a = settingMessageRingtoneUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI = this.f161462a;
        if (z17) {
            com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI.U6(settingMessageRingtoneUI);
        } else {
            settingMessageRingtoneUI.finish();
        }
    }
}
