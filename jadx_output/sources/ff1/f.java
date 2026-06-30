package ff1;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ye1.e f261604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261605e;

    public f(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView, ye1.e eVar) {
        this.f261605e = abstractVideoTextureView;
        this.f261604d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ye1.e eVar = this.f261604d;
        try {
            eVar.reset();
            eVar.release();
        } catch (java.lang.Exception e17) {
            int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
            this.f261605e.f(e17, "reset media player error", new java.lang.Object[0]);
        }
    }
}
