package qm;

/* loaded from: classes13.dex */
public class l implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f364639a;

    public l(qm.o oVar) {
        this.f364639a = oVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.o oVar = this.f364639a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "play sound finish, player: %s", oVar.f364645b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "play sound real finish, player: %s,playerIsInit:%s", oVar.f364645b, java.lang.Boolean.valueOf(oVar.f364644a));
        }
    }
}
