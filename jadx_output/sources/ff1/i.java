package ff1;

/* loaded from: classes15.dex */
public class i implements ye1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f261617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261618b;

    public i(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView, java.lang.Runnable runnable) {
        this.f261618b = abstractVideoTextureView;
        this.f261617a = runnable;
    }

    public void a() {
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261618b;
        abstractVideoTextureView.e("onDataSourceSet#openVideo", new java.lang.Object[0]);
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        java.lang.Runnable runnable = this.f261617a;
        if (mainLooper == myLooper) {
            runnable.run();
        } else {
            abstractVideoTextureView.post(runnable);
        }
    }
}
