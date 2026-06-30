package ye1;

/* loaded from: classes15.dex */
public class c0 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ye1.e0 f461181a;

    public c0(ye1.e0 e0Var) {
        this.f461181a = e0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        return this.f461181a.G(i17, i18);
    }
}
