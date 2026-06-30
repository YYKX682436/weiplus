package xl3;

/* loaded from: classes11.dex */
public class a implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xl3.b f455116d;

    public a(xl3.b bVar) {
        this.f455116d = bVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", java.lang.Integer.valueOf(i17));
        if (i17 == -2 || i17 == -3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
            if (kl3.t.g().a().g()) {
                kl3.t.g().a().b();
                return;
            }
            return;
        }
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
            if (kl3.t.g().a().g()) {
                kl3.t.g().a().j(false);
                return;
            }
            return;
        }
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
            if (kl3.t.g().a().g()) {
                kl3.t.g().a().b();
                kl3.t.g().c();
                kl3.t.g().p(600000);
            }
            xl3.b bVar = this.f455116d;
            android.media.AudioManager audioManager = bVar.f455117a;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(bVar.f455118b);
            }
        }
    }
}
