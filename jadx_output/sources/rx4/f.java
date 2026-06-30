package rx4;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC f401148d;

    public f(com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC) {
        this.f401148d = fTSFlutterSearchUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSFlutterSearchUIC fTSFlutterSearchUIC = this.f401148d;
        android.view.ViewGroup viewGroup = fTSFlutterSearchUIC.f184641e;
        if (viewGroup == null || viewGroup.getVisibility() == 0 || !fTSFlutterSearchUIC.f184647n) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "Flutter view is not visible after 1s, show it");
        viewGroup.setVisibility(0);
    }
}
