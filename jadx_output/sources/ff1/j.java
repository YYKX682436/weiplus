package ff1;

/* loaded from: classes15.dex */
public class j implements ye1.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261619a;

    public j(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261619a = abstractVideoTextureView;
    }

    @Override // ye1.q
    public void a(ye1.e eVar, int i17, int i18) {
        ye1.e eVar2;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261619a;
        try {
            eVar2 = abstractVideoTextureView.f83659g;
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
            int i19 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
            abstractVideoTextureView.f(e17, "on video size changed error[%d, %d]", objArr);
        }
        if (eVar != eVar2) {
            abstractVideoTextureView.g("another player on video size changed, return now.[%s, %s]", eVar, eVar2);
            return;
        }
        abstractVideoTextureView.f83661i = eVar.getVideoWidth();
        abstractVideoTextureView.f83662m = eVar.getVideoHeight();
        abstractVideoTextureView.e("on size change size:( " + abstractVideoTextureView.f83661i + " , " + abstractVideoTextureView.f83662m + " )", new java.lang.Object[0]);
        ff1.z zVar = abstractVideoTextureView.f83664o;
        if (zVar != null) {
            int i27 = abstractVideoTextureView.f83661i;
            int i28 = abstractVideoTextureView.f83662m;
            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) zVar;
            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "on get video size [%d, %d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
            oe1.h1 h1Var = abstractVideoView.f83686q;
            if (h1Var != null) {
                h1Var.I(abstractVideoView.getSessionId(), abstractVideoView.getMediaId(), i27, i28);
            }
        }
        int i29 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) abstractVideoTextureView.getLayoutParams();
        layoutParams.addRule(13);
        abstractVideoTextureView.setLayoutParams(layoutParams);
    }
}
