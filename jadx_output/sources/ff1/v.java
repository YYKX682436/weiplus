package ff1;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261632d;

    public v(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261632d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261632d;
        abstractVideoView.B = true;
        android.widget.ProgressBar progressBar = abstractVideoView.f83680h;
        if (progressBar != null && progressBar.getVisibility() != 0) {
            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "show loading", new java.lang.Object[0]);
            abstractVideoView.f83680h.setVisibility(0);
        }
        oe1.h1 h1Var = abstractVideoView.f83686q;
        if (h1Var != null) {
            h1Var.f(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
        }
    }
}
