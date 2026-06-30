package qm;

/* loaded from: classes13.dex */
public class w implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f364661a;

    public w(qm.x xVar) {
        this.f364661a = xVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.x xVar = this.f364661a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound error, player: %s", xVar.f364663g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f364663g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound real error, player: %s,playerIsInit:%s", xVar.f364663g, java.lang.Boolean.valueOf(xVar.f364662f));
        }
        xVar.f364662f = false;
        return false;
    }
}
