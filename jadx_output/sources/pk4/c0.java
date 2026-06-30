package pk4;

/* loaded from: classes15.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView f356467d;

    public c0(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
        this.f356467d = thumbPlayerSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356467d;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "first video frame rendered new");
        thumbPlayerSurfaceView.f174585q.c();
    }
}
