package qm;

/* loaded from: classes13.dex */
public class j implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f364637a;

    public j(qm.o oVar) {
        this.f364637a = oVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.o oVar = this.f364637a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound finish, player: %s", oVar.f364645b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
    }
}
