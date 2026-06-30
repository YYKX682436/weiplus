package qm;

/* loaded from: classes13.dex */
public class f extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f364628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qm.o oVar, android.os.Looper looper) {
        super(looper);
        this.f364628a = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        qm.o oVar = this.f364628a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", java.lang.Boolean.valueOf(oVar.f364644a));
        try {
            android.media.MediaPlayer mediaPlayer = oVar.f364645b;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    oVar.f364645b.stop();
                }
                oVar.f364645b.release();
                oVar.f364644a = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", false);
            }
        } catch (java.lang.IllegalStateException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Notification.Tool.Sound", "Exception in playSoundHander,playerIsInit:%s", java.lang.Boolean.valueOf(oVar.f364644a));
            android.media.MediaPlayer mediaPlayer2 = oVar.f364645b;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
        }
    }
}
