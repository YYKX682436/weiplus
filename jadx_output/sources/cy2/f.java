package cy2;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView f224746d;

    public f(com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView finderWhatsNewView) {
        this.f224746d = finderWhatsNewView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = cy2.b.f224741a;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WHATS_NEW_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1305L, 0L, 1L);
        com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView finderWhatsNewView = this.f224746d;
        if (finderWhatsNewView.withEnterAnim) {
            finderWhatsNewView.setTranslationX(finderWhatsNewView.getHeight());
            finderWhatsNewView.animate().translationY(0.0f).setDuration(200L).setListener(new cy2.g(finderWhatsNewView)).start();
        }
    }
}
