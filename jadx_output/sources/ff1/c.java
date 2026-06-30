package ff1;

/* loaded from: classes15.dex */
public class c implements ye1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261600a;

    public c(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261600a = abstractVideoTextureView;
    }

    @Override // ye1.j
    public boolean a(ye1.e eVar, int i17, int i18) {
        int i19 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261600a;
        abstractVideoTextureView.g("Error: " + i17 + "," + i18, new java.lang.Object[0]);
        ff1.z zVar = abstractVideoTextureView.f83664o;
        if (zVar == null) {
            return true;
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) zVar).n(i17, i18);
        return true;
    }
}
