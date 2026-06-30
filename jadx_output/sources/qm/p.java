package qm;

/* loaded from: classes13.dex */
public class p extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f364649a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qm.x xVar, android.os.Looper looper) {
        super(looper);
        this.f364649a = xVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 305419896) {
            qm.x xVar = this.f364649a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", java.lang.Boolean.valueOf(xVar.f364662f));
            try {
                try {
                    if (xVar.f364662f) {
                        if (xVar.f364663g.isPlaying()) {
                            xVar.f364663g.stop();
                        }
                        xVar.f364663g.release();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", java.lang.Boolean.valueOf(xVar.f364662f));
                    }
                } catch (java.lang.IllegalStateException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.Tool.SoundFixed", e17, "Exception in playSoundHander,playerIsInit:%s", java.lang.Boolean.valueOf(xVar.f364662f));
                    android.media.MediaPlayer mediaPlayer = xVar.f364663g;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                }
            } finally {
                xVar.f364662f = false;
            }
        }
    }
}
