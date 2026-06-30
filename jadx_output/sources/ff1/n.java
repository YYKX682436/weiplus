package ff1;

/* loaded from: classes15.dex */
public class n implements ye1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261623a;

    public n(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261623a = abstractVideoTextureView;
    }

    @Override // ye1.f
    public void a(ye1.e eVar, int i17) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        int i18 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261623a;
        abstractVideoTextureView.d("onBufferingUpdate percent[%d]", objArr);
        abstractVideoTextureView.f83671v = i17;
    }
}
