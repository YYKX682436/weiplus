package ff1;

/* loaded from: classes15.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261635d;

    public y(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261635d = abstractVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261635d;
        android.widget.LinearLayout linearLayout = abstractVideoView.f83681i;
        if (linearLayout == null || linearLayout.getVisibility() == 8) {
            return;
        }
        abstractVideoView.f83681i.setVisibility(8);
    }
}
