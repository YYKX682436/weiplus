package qm;

/* loaded from: classes13.dex */
public class m implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f364640a;

    public m(qm.o oVar) {
        this.f364640a = oVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.o oVar = this.f364640a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "play sound error, player: %s", oVar.f364645b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
        if (mediaPlayer2 == null) {
            return false;
        }
        mediaPlayer2.release();
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "play sound real error, player: %s,playerIsInit:%s", oVar.f364645b, java.lang.Boolean.valueOf(oVar.f364644a));
        return false;
    }
}
