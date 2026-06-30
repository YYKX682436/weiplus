package wl3;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MarqueeLyricView f447054d;

    public b(com.tencent.mm.plugin.music.ui.view.MarqueeLyricView marqueeLyricView) {
        this.f447054d = marqueeLyricView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.music.ui.view.MarqueeLyricView marqueeLyricView = this.f447054d;
        int i17 = marqueeLyricView.f150812m;
        int i18 = marqueeLyricView.f150813n;
        int i19 = marqueeLyricView.f150814o;
        marqueeLyricView.f150809g.startScroll(marqueeLyricView.f150812m, 0, marqueeLyricView.f150813n, 0, marqueeLyricView.f150814o);
        marqueeLyricView.invalidate();
    }
}
