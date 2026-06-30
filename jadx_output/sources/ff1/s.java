package ff1;

/* loaded from: classes15.dex */
public class s implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261629d;

    public s(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261629d = abstractVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261629d;
        if (abstractVideoView.f83691v <= 0) {
            return false;
        }
        if (!abstractVideoView.isPlaying()) {
            return true;
        }
        abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "reset error count ", new java.lang.Object[0]);
        abstractVideoView.f83691v = 0;
        return false;
    }
}
