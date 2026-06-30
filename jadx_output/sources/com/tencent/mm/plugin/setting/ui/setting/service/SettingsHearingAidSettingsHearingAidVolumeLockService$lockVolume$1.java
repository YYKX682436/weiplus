package com.tencent.mm.plugin.setting.ui.setting.service;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/setting/ui/setting/service/SettingsHearingAidSettingsHearingAidVolumeLockService$lockVolume$1", "Landroid/content/BroadcastReceiver;", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingsHearingAidSettingsHearingAidVolumeLockService$lockVolume$1 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
        if (kotlin.jvm.internal.o.b(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intExtra == 3) {
            throw null;
        }
    }
}
