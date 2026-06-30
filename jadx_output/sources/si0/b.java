package si0;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.MediaPlayer f408037a;

    /* renamed from: b, reason: collision with root package name */
    public int f408038b;

    /* renamed from: c, reason: collision with root package name */
    public int f408039c;

    public b() {
        android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
        this.f408037a = mediaPlayer;
        mediaPlayer.setOnCompletionListener(new si0.a(this));
    }
}
