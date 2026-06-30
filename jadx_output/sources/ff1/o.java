package ff1;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261624d;

    public o(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261624d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261624d;
        try {
            abstractVideoView.r(0);
            abstractVideoView.s(abstractVideoView.isPlaying());
        } catch (java.lang.Throwable unused) {
        }
    }
}
