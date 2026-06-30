package w82;

/* loaded from: classes3.dex */
public class g1 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443869d;

    public g1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView) {
        this.f443869d = favVideoView;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443869d;
        if (!favVideoView.d()) {
            favVideoView.I.c(500L, 500L);
            favVideoView.setVideoStateIv(false);
        }
        favVideoView.i(i17);
        if (favVideoView.f101583x) {
            favVideoView.f101565J.c(4000L, 4000L);
        }
    }

    @Override // m34.e
    public void b() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443869d;
        if (favVideoView.f101569g.isPlaying()) {
            com.tencent.mars.xlog.Log.i(favVideoView.f101566d, "VideoPlay: pausePlay()");
            favVideoView.f101569g.pause();
        }
        favVideoView.f101565J.d();
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
