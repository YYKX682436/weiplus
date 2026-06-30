package wq4;

/* loaded from: classes14.dex */
public class f0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f448637a;

    public f0(wq4.k0 k0Var) {
        this.f448637a = k0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        mediaPlayer.release();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        wq4.k0 k0Var = this.f448637a;
        if (currentTimeMillis - k0Var.f448653g > 5000) {
            k0Var.getClass();
        }
    }
}
