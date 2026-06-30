package qm;

/* loaded from: classes13.dex */
public class i implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioManager f364635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.o f364636b;

    public i(qm.o oVar, android.media.AudioManager audioManager) {
        this.f364636b = oVar;
        this.f364635a = audioManager;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.o oVar = this.f364636b;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", oVar.f364645b);
        this.f364635a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        return false;
    }
}
