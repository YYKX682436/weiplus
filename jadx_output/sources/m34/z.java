package m34;

/* loaded from: classes4.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f323381d;

    public z(com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView) {
        this.f323381d = videoPlayView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323381d;
        if (videoPlayView.f162513m.isPlaying()) {
            return;
        }
        ((com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar) videoPlayView.f162514n).m();
    }
}
