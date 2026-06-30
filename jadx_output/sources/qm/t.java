package qm;

/* loaded from: classes13.dex */
public class t implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f364658a;

    public t(qm.x xVar) {
        this.f364658a = xVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.x xVar = this.f364658a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound finish, player: %s", xVar.f364663g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f364663g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        xVar.f364662f = false;
    }
}
