package ff1;

/* loaded from: classes15.dex */
public class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261627d;

    public q(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261627d = abstractVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261627d;
        if (!abstractVideoView.isPlaying()) {
            return false;
        }
        if (abstractVideoView.f83685p) {
            oe1.h1 h1Var = abstractVideoView.f83686q;
            if (h1Var != null) {
                h1Var.l(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
            }
            abstractVideoView.f83685p = false;
        }
        abstractVideoView.r(abstractVideoView.getCurrPosSec());
        abstractVideoView.s(abstractVideoView.isPlaying());
        abstractVideoView.getClass();
        return true;
    }
}
