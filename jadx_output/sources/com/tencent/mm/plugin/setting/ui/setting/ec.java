package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes13.dex */
public final class ec implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f160992a;

    public ec(android.media.MediaPlayer mediaPlayer) {
        this.f160992a = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        try {
            this.f160992a.start();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsHearingAidAudioCardView", e17, "start failed", new java.lang.Object[0]);
        }
    }
}
