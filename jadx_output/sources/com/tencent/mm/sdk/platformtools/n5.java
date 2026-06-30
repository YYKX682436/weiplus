package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class n5 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f192871a;

    public n5(android.media.MediaPlayer mediaPlayer) {
        this.f192871a = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PlaySound", "onError, what: %d, extra: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        android.media.MediaPlayer mediaPlayer2 = this.f192871a;
        if (mediaPlayer2 == null) {
            return false;
        }
        mediaPlayer2.release();
        return false;
    }
}
