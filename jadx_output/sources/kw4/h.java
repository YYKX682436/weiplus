package kw4;

/* loaded from: classes8.dex */
public class h implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f313177d;

    public h(com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView) {
        this.f313177d = ftsWebVideoView;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onSeekTo %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313177d;
        ftsWebVideoView.j(i17, false);
        ftsWebVideoView.f182070g.x();
        lw4.j jVar = ftsWebVideoView.H;
        if (jVar != null) {
            jVar.i();
        }
    }

    @Override // m34.e
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FtsWebVideoView", "onSeekPre");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f313177d.f182070g.L;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
