package qm;

/* loaded from: classes13.dex */
public class h implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioManager f364633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.o f364634b;

    public h(qm.o oVar, android.media.AudioManager audioManager) {
        this.f364634b = oVar;
        this.f364633a = audioManager;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.o oVar = this.f364634b;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound finish, player: %s", oVar.f364645b);
        this.f364633a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
    }
}
