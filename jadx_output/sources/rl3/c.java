package rl3;

/* loaded from: classes14.dex */
public class c implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f397236a;

    public c(rl3.h hVar) {
        this.f397236a = hVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMediaPlayer", "onCompletion, stop music");
        rl3.h hVar = this.f397236a;
        if (hVar.f397245g) {
            hVar.f(false);
        } else {
            hVar.f(true);
        }
    }
}
