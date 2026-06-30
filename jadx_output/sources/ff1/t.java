package ff1;

/* loaded from: classes15.dex */
public class t implements oe1.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261630a;

    public t(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261630a = abstractVideoView;
    }

    @Override // oe1.i1
    public void a(int i17) {
        double d17 = i17;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261630a;
        if (abstractVideoView.a(d17, true)) {
            abstractVideoView.p(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar videoPlayerSeekBar = abstractVideoView.f83682m;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setIsPlay(true);
        }
    }

    @Override // oe1.i1
    public void b() {
    }
}
