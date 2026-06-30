package ff1;

/* loaded from: classes15.dex */
public class b implements ye1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261599a;

    public b(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261599a = abstractVideoTextureView;
    }

    @Override // ye1.g
    public void a(ye1.e eVar) {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261599a;
        abstractVideoTextureView.e("video on completion", new java.lang.Object[0]);
        abstractVideoTextureView.f83670u = com.tencent.mm.sdk.platformtools.t8.i1();
        ff1.z zVar = abstractVideoTextureView.f83664o;
        if (zVar != null) {
            zVar.onCompletion();
        }
    }
}
