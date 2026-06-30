package zf4;

/* loaded from: classes13.dex */
public class j implements android.media.MediaPlayer.OnCompletionListener {
    public j(zf4.l lVar) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        try {
            mediaPlayer.release();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", e17, "", new java.lang.Object[0]);
        }
    }
}
