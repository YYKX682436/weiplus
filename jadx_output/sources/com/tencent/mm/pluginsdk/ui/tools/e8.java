package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes13.dex */
public class e8 extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f191606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191607e;

    public e8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView, android.media.MediaPlayer mediaPlayer) {
        this.f191607e = videoTextureView;
        this.f191606d = mediaPlayer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.media.MediaPlayer mediaPlayer = this.f191606d;
        if (mediaPlayer != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d another thread to release player[%s]", java.lang.Integer.valueOf(this.f191607e.hashCode()), mediaPlayer);
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
