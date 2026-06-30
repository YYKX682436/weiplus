package ff1;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f261602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261603e;

    public e(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView, android.view.Surface surface) {
        this.f261603e = abstractVideoTextureView;
        this.f261602d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261603e;
        android.view.Surface surface = this.f261602d;
        if (surface != null) {
            try {
                if (surface.isValid()) {
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(surface.hashCode())};
                    int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
                    abstractVideoTextureView.e("release surface [%d]", objArr);
                    surface.release();
                }
            } catch (java.lang.Exception e17) {
                int i18 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
                abstractVideoTextureView.f(e17, "release Surface error", new java.lang.Object[0]);
            }
        }
    }
}
