package rl3;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f397240d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.h f397241e;

    public g(rl3.h hVar, rl3.c cVar) {
        this.f397241e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rl3.h hVar = this.f397241e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", "start run play progress task");
        while (!this.f397240d) {
            try {
                android.media.MediaPlayer mediaPlayer = hVar.f397243e;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    android.media.MediaPlayer mediaPlayer2 = hVar.f397243e;
                    int currentPosition = mediaPlayer2.getCurrentPosition();
                    int duration = mediaPlayer2.getDuration();
                    if (currentPosition > 0 && duration > 0) {
                        int i17 = (currentPosition * 100) / duration;
                        if (hVar.f150663a != null) {
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.player.base.g(hVar, i17));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "onPlayUpdate", new java.lang.Object[0]);
            }
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e18, "sleep", new java.lang.Object[0]);
            }
        }
    }
}
