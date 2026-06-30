package qm;

/* loaded from: classes13.dex */
public class u implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f364659a;

    public u(qm.x xVar) {
        this.f364659a = xVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.x xVar = this.f364659a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound error, player: %s", xVar.f364663g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f364663g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        xVar.f364662f = false;
        return false;
    }
}
