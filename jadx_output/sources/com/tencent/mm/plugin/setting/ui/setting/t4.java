package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public final class t4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI f161562d;

    public t4(com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI settingMessageRingtoneUI) {
        this.f161562d = settingMessageRingtoneUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f161562d.finish();
    }
}
