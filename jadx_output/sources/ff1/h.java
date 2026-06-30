package ff1;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261616d;

    public h(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261616d = abstractVideoTextureView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261616d;
        try {
            abstractVideoTextureView.f83659g.setSurface(abstractVideoTextureView.f83658f);
            abstractVideoTextureView.f83659g.prepareAsync();
            abstractVideoTextureView.f83662m = abstractVideoTextureView.f83659g.getVideoHeight();
            abstractVideoTextureView.f83661i = abstractVideoTextureView.f83659g.getVideoWidth();
            abstractVideoTextureView.setMute(abstractVideoTextureView.L);
            float f17 = abstractVideoTextureView.P;
            if (f17 <= 0.0f) {
                return;
            }
            abstractVideoTextureView.P = f17;
            ye1.e eVar = abstractVideoTextureView.f83659g;
            if (eVar != null) {
                eVar.f(f17);
            }
        } catch (java.lang.Exception e17) {
            int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
            abstractVideoTextureView.f(e17, "prepare async error path", new java.lang.Object[0]);
            ff1.z zVar = abstractVideoTextureView.f83664o;
            if (zVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) zVar).n(-1, -1);
            }
        }
    }
}
