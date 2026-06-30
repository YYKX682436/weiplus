package m34;

/* loaded from: classes4.dex */
public class w implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f323378d;

    public w(com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView) {
        this.f323378d = videoPlayView;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "onSeek time " + i17);
        double d17 = (double) i17;
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323378d;
        videoPlayView.f162515o = d17;
        videoPlayView.f162513m.b(d17);
        videoPlayView.f162519s.removeCallbacks(videoPlayView.F);
        videoPlayView.f162519s.postDelayed(videoPlayView.F, 3000L);
    }

    @Override // m34.e
    public void b() {
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323378d;
        videoPlayView.f162519s.removeCallbacks(videoPlayView.F);
        videoPlayView.g();
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
