package ff1;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f261625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261626e;

    public p(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView, int i17) {
        this.f261626e = abstractVideoView;
        this.f261625d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261626e;
        abstractVideoView.getClass();
        int i17 = this.f261625d;
        abstractVideoView.r(i17);
        abstractVideoView.a(i17, true);
        abstractVideoView.getClass();
    }
}
