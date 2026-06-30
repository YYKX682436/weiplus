package ff1;

/* loaded from: classes15.dex */
public class g extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ye1.e f261614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261615e;

    public g(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView, ye1.e eVar) {
        this.f261615e = abstractVideoTextureView;
        this.f261614d = eVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ye1.e eVar = this.f261614d;
        if (eVar != null) {
            try {
                int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
                this.f261615e.e("MicroMsg.Video.AbstractVideoTextureView", "another thread to release player[%s]", eVar);
                eVar.stop();
                eVar.release();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
