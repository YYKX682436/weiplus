package ww1;

/* loaded from: classes13.dex */
public class i1 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f450215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer.OnCompletionListener f450216c;

    public i1(java.lang.String str, android.media.MediaPlayer mediaPlayer, android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f450214a = str;
        this.f450215b = mediaPlayer;
        this.f450216c = onCompletionListener;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f450214a;
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = this.f450215b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        android.media.MediaPlayer.OnCompletionListener onCompletionListener = this.f450216c;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }
}
