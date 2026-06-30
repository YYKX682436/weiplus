package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class vc implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f161641d;

    public vc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        this.f161641d = settingsHearingAidInitUI;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus onPause: loss focus，canDuck is " + z17);
        android.content.Intent intent = new android.content.Intent("hearing_aid_message");
        intent.putExtra("isGetFocus", false);
        b4.d.a(this.f161641d.getContext()).c(intent);
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus onResume: gain focus");
        android.content.Intent intent = new android.content.Intent("hearing_aid_message");
        intent.putExtra("isGetFocus", true);
        b4.d.a(this.f161641d.getContext()).c(intent);
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus onStop: loss focus");
    }
}
