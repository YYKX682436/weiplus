package ff1;

/* loaded from: classes15.dex */
public class m implements ye1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261622a;

    public m(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261622a = abstractVideoTextureView;
    }

    @Override // ye1.n
    public void a(ye1.e eVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(eVar != null ? eVar.getCurrentPosition() : -1);
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261622a;
        abstractVideoTextureView.e("video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", valueOf, java.lang.Boolean.valueOf(abstractVideoTextureView.f83663n), java.lang.Boolean.valueOf(abstractVideoTextureView.I));
        if (!abstractVideoTextureView.f83663n) {
            abstractVideoTextureView.i();
        } else if (abstractVideoTextureView.I) {
            return;
        } else {
            abstractVideoTextureView.l();
        }
        ff1.b0 b0Var = abstractVideoTextureView.f83666q;
        if (b0Var != null) {
            boolean z17 = abstractVideoTextureView.f83663n;
            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) b0Var;
            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "on seek complete startPlay[%b]", java.lang.Boolean.valueOf(z17));
            ff1.e0 e0Var = abstractVideoView.f83684o;
            if (e0Var != null) {
                e0Var.setOneTimeVideoTextureUpdateCallback(abstractVideoView);
            }
            abstractVideoView.i();
            abstractVideoView.s(z17);
            abstractVideoView.r(abstractVideoView.getCurrPosSec());
            if (z17) {
                abstractVideoView.p(false);
                abstractVideoView.f83685p = false;
                oe1.h1 h1Var = abstractVideoView.f83686q;
                if (h1Var != null) {
                    h1Var.l(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
                }
            }
        }
        abstractVideoTextureView.G = 0L;
    }
}
