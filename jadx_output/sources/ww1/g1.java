package ww1;

/* loaded from: classes13.dex */
public class g1 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f450193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer.OnCompletionListener f450194c;

    public g1(java.lang.String str, android.media.MediaPlayer mediaPlayer, android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f450192a = str;
        this.f450193b = mediaPlayer;
        this.f450194c = onCompletionListener;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f450192a;
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = this.f450193b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        android.media.MediaPlayer.OnCompletionListener onCompletionListener = this.f450194c;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }
}
