package pk4;

/* loaded from: classes15.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView f356463d;

    public b0(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
        this.f356463d = thumbPlayerSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356463d;
        thumbPlayerSurfaceView.f174592x = null;
        com.tencent.mm.pluginsdk.ui.tools.b4 b4Var = thumbPlayerSurfaceView.f174581m.f356532a;
        if (b4Var != null) {
            b4Var.k(701, 0);
        }
    }
}
