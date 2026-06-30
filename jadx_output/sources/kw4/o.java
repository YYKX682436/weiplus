package kw4;

/* loaded from: classes8.dex */
public class o extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f313184a;

    public o(com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView) {
        this.f313184a = ftsWebVideoView;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView = this.f313184a;
        if (ftsWebVideoView.f182068e.isPlaying()) {
            ftsWebVideoView.b(context);
        }
    }
}
