package lw4;

/* loaded from: classes8.dex */
public class d implements lw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f321650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lw4.g f321651b;

    public d(lw4.g gVar, com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView) {
        this.f321651b = gVar;
        this.f321650a = ftsWebVideoView;
    }

    @Override // lw4.e
    public void a() {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        kw4.b0 e17;
        java.lang.ref.WeakReference weakReference2;
        android.view.View view2;
        kw4.c0 c0Var = this.f321651b.f321654c;
        kw4.b0 e18 = c0Var.e(c0Var.f313159e);
        float[] fArr = c0Var.f313160f;
        if (e18 == null || (weakReference = e18.f313146a) == null || fArr == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        int i17 = c0Var.f313159e;
        int i18 = c0Var.f313158d;
        if (i17 != i18 && (e17 = c0Var.e(i18)) != null && (weakReference2 = e17.f313146a) != null && (view2 = (android.view.View) weakReference2.get()) != null) {
            c0Var.f(c0Var.f313158d, fArr, view2.getVisibility());
        }
        int i19 = c0Var.f313159e;
        c0Var.f313158d = -1;
        c0Var.f313159e = -1;
        lw4.a aVar = c0Var.f313162h;
        if (aVar != null) {
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = ((lw4.b) aVar).f321646a;
            ftsWebVideoView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onExitFullScreen");
            com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = ftsWebVideoView.f182070g;
            if (webSearchWebVideoViewControlBar.N) {
                webSearchWebVideoViewControlBar.N = false;
                webSearchWebVideoViewControlBar.w();
            }
            ftsWebVideoView.a(false);
            c0Var.f313162h = null;
        }
        c0Var.f(i19, fArr, view.getVisibility());
    }

    @Override // lw4.e
    public void b() {
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f321650a;
        ftsWebVideoView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onUIResume");
        ftsWebVideoView.f182068e.g();
    }

    @Override // lw4.e
    public void c() {
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f321650a;
        ftsWebVideoView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onUIPause");
        ftsWebVideoView.f182068e.e();
    }

    @Override // lw4.e
    public void d() {
        this.f321650a.g();
    }

    @Override // lw4.e
    public void e() {
        this.f321650a.f();
    }

    @Override // lw4.e
    public boolean onBackPressed() {
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f321650a;
        if (!ftsWebVideoView.d()) {
            return false;
        }
        ftsWebVideoView.h(false);
        return true;
    }

    @Override // lw4.e
    public void onDestroy() {
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f321650a;
        ftsWebVideoView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onUIDestroy");
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "clean");
        ftsWebVideoView.q();
        ftsWebVideoView.f182068e.d();
        com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = ftsWebVideoView.f182070g;
        com.tencent.mm.sdk.platformtools.b4 b4Var = webSearchWebVideoViewControlBar.M;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = webSearchWebVideoViewControlBar.L;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        try {
            ftsWebVideoView.getContext().unregisterReceiver(ftsWebVideoView.U);
        } catch (java.lang.Exception unused) {
        }
    }
}
