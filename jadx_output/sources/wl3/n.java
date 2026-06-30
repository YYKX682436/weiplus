package wl3;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView f447075d;

    public n(com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView) {
        this.f447075d = musicPlayerLyricView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView = this.f447075d;
        if (musicPlayerLyricView.g() && musicPlayerLyricView.F) {
            musicPlayerLyricView.F = false;
            musicPlayerLyricView.j(musicPlayerLyricView.E, musicPlayerLyricView.f150835o);
        }
    }
}
