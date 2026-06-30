package ff1;

/* loaded from: classes15.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261634d;

    public x(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261634d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261634d;
        android.widget.LinearLayout linearLayout = abstractVideoView.f83681i;
        if (linearLayout == null || linearLayout.getVisibility() == 0) {
            return;
        }
        abstractVideoView.f83681i.setVisibility(0);
    }
}
