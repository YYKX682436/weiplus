package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class dc implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160940a;

    public dc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView) {
        this.f160940a = settingsHearingAidAudioCardView;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidAudioCardView", "MediaPlayer error: what=" + i17 + " extra=" + i18);
        int i19 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v;
        this.f160940a.b(false);
        return true;
    }
}
