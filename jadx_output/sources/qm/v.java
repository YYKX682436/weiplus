package qm;

/* loaded from: classes13.dex */
public class v implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f364660a;

    public v(qm.x xVar) {
        this.f364660a = xVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.x xVar = this.f364660a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound finish, player: %s", xVar.f364663g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f364663g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound real finish, player: %s,playerIsInit:%s", xVar.f364663g, java.lang.Boolean.valueOf(xVar.f364662f));
        }
        xVar.f364662f = false;
    }
}
