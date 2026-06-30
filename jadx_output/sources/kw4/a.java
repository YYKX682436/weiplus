package kw4;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw4.e f313142d;

    public a(kw4.e eVar) {
        this.f313142d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kw4.q qVar = (kw4.q) this.f313142d.f313168e;
        qVar.getClass();
        int i17 = com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.V;
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = qVar.f313187a;
        boolean z17 = false;
        if (ftsWebVideoView.f182086z) {
            if (!(ftsWebVideoView.f182071h.getVisibility() == 0)) {
                z17 = true;
            }
        }
        if (z17) {
            ftsWebVideoView.f182070g.z(ftsWebVideoView.M);
        }
    }
}
