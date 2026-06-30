package ff1;

/* loaded from: classes15.dex */
public class r implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261628d;

    public r(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261628d = abstractVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261628d;
        boolean isPlaying = abstractVideoView.isPlaying();
        int currPosMs = abstractVideoView.getCurrPosMs();
        abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "prepare start checker isplaying[%b] currPosMs[%d]", java.lang.Boolean.valueOf(isPlaying), java.lang.Integer.valueOf(currPosMs));
        ff1.e0 e0Var = abstractVideoView.f83684o;
        if (e0Var == null || currPosMs > 50) {
            return false;
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) e0Var).k(0.0d);
        return false;
    }
}
