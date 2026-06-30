package ff1;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261633d;

    public w(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261633d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261633d;
        if (abstractVideoView.B) {
            abstractVideoView.B = false;
            oe1.h1 h1Var = abstractVideoView.f83686q;
            if (h1Var != null) {
                h1Var.k(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
            }
            android.widget.ProgressBar progressBar = abstractVideoView.f83680h;
            if (progressBar == null || progressBar.getVisibility() == 8) {
                return;
            }
            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "hide loading", new java.lang.Object[0]);
            abstractVideoView.f83680h.setVisibility(8);
        }
    }
}
