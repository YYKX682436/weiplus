package wl3;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MarqueeLyricView f447053d;

    public a(com.tencent.mm.plugin.music.ui.view.MarqueeLyricView marqueeLyricView) {
        this.f447053d = marqueeLyricView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.music.ui.view.MarqueeLyricView marqueeLyricView = this.f447053d;
        marqueeLyricView.f150819t.setDuration(marqueeLyricView.f150816q);
        marqueeLyricView.startAnimation(marqueeLyricView.f150819t);
        long j17 = marqueeLyricView.f150816q;
    }
}
