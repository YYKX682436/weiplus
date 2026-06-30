package pk4;

/* loaded from: classes15.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView f356531d;

    public w0(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView) {
        this.f356531d = thumbPlayerVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356531d;
        thumbPlayerVideoView.f174610y = null;
        com.tencent.mm.pluginsdk.ui.tools.b4 b4Var = thumbPlayerVideoView.f174602q.f356524a;
        if (b4Var != null) {
            b4Var.k(701, 0);
        }
    }
}
