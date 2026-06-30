package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public final class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI f161724d;

    public x4(com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI) {
        this.f161724d = settingMessageRingtoneUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI = this.f161724d;
        java.util.concurrent.Future future = settingMessageRingtoneUI.f160238d;
        if (future != null) {
            future.cancel(false);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = settingMessageRingtoneUI.f160242h;
        if (u3Var != null) {
            u3Var.hide();
        }
    }
}
