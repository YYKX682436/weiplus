package rl3;

/* loaded from: classes14.dex */
public class e implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f397238a;

    public e(rl3.h hVar) {
        this.f397238a = hVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        rl3.h hVar = this.f397238a;
        if (hVar.f397243e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", "onPrepared");
            try {
                hVar.f397243e.start();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "start", new java.lang.Object[0]);
            }
            hVar.f397244f = false;
            if (hVar.f150663a != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.player.base.f(hVar));
            }
            rl3.g gVar = hVar.f397242d;
            if (gVar != null) {
                gVar.f397240d = true;
            }
            rl3.g gVar2 = new rl3.g(hVar, null);
            hVar.f397242d = gVar2;
            gVar2.f397240d = false;
            s75.d.b(gVar2, "music_play_progress_runnable");
        }
    }
}
