package fl3;

/* loaded from: classes13.dex */
public class b implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl3.a f263929d;

    public b(fl3.a aVar) {
        this.f263929d = aVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", java.lang.Integer.valueOf(i17));
        if (i17 == -2 || i17 == -3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
            return;
        }
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
            return;
        }
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
            fl3.a aVar = this.f263929d;
            if (aVar.f263926a.b() != null) {
                ((android.media.AudioManager) aVar.f263926a.b()).abandonAudioFocus(aVar.f263928c);
            }
            aVar.f263927b = false;
        }
    }
}
