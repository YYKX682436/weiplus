package rl3;

/* loaded from: classes14.dex */
public class f implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f397239a;

    public f(rl3.h hVar) {
        this.f397239a = hVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMediaPlayer", "onError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        rl3.h hVar = this.f397239a;
        hVar.f397245g = true;
        if (hVar.f150663a != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.player.base.e(hVar, false));
        }
        return false;
    }
}
