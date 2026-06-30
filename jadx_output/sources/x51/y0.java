package x51;

/* loaded from: classes12.dex */
public class y0 implements android.media.MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        try {
            mediaPlayer.release();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MiroMsg.NotificationUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
