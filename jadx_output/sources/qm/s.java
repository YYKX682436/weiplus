package qm;

/* loaded from: classes13.dex */
public class s implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioManager f364656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.x f364657b;

    public s(qm.x xVar, android.media.AudioManager audioManager) {
        this.f364657b = xVar;
        this.f364656a = audioManager;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.x xVar = this.f364657b;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound error, player: %s", xVar.f364663g);
        this.f364656a.setMode(0);
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
