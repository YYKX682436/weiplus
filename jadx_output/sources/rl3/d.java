package rl3;

/* loaded from: classes14.dex */
public class d implements android.media.MediaPlayer.OnSeekCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f397237a;

    public d(rl3.h hVar) {
        this.f397237a = hVar;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        rl3.h hVar = this.f397237a;
        android.media.MediaPlayer mediaPlayer2 = hVar.f397243e;
        if (mediaPlayer2 == null || !mediaPlayer2.isPlaying()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", "onSeekComplete");
        try {
            hVar.f397243e.start();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "start", new java.lang.Object[0]);
        }
    }
}
