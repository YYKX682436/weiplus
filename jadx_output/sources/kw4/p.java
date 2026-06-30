package kw4;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f313185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f313186e;

    public p(com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView, android.content.Context context) {
        this.f313186e = ftsWebVideoView;
        this.f313185d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.V;
        kw4.v vVar = kw4.v.NO_NET;
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313186e;
        ftsWebVideoView.T = vVar;
        ftsWebVideoView.i();
        android.content.Context context = this.f313185d;
        ftsWebVideoView.o(context.getString(com.tencent.mm.R.string.k7r), context.getString(com.tencent.mm.R.string.f493446k80), null);
    }
}
