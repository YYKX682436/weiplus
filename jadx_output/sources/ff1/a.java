package ff1;

/* loaded from: classes15.dex */
public class a implements ye1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261598a;

    public a(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261598a = abstractVideoTextureView;
    }

    @Override // ye1.l
    public boolean a(ye1.e eVar, int i17, int i18) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        int i19 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261598a;
        abstractVideoTextureView.d("onInfo [%d %d]", objArr);
        ff1.a0 a0Var = abstractVideoTextureView.f83667r;
        if (a0Var == null) {
            return false;
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.BaseVideoView) a0Var).u(i17, i18);
        return false;
    }
}
