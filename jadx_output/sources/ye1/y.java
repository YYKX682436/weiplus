package ye1;

/* loaded from: classes15.dex */
public class y implements android.media.MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ye1.e0 f461208a;

    public y(ye1.e0 e0Var) {
        this.f461208a = e0Var;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        this.f461208a.L(i17, i18);
    }
}
