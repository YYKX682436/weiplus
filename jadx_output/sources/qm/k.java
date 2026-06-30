package qm;

/* loaded from: classes13.dex */
public class k implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f364638a;

    public k(qm.o oVar) {
        this.f364638a = oVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.o oVar = this.f364638a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", oVar.f364645b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
        if (mediaPlayer2 == null) {
            return false;
        }
        mediaPlayer2.release();
        return false;
    }
}
