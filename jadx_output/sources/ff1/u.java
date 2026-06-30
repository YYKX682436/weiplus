package ff1;

/* loaded from: classes15.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView f261631d;

    public u(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView) {
        this.f261631d = abstractVideoView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/video/videoview/AbstractVideoView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = this.f261631d;
        abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "seek bar play button on click ", new java.lang.Object[0]);
        if (abstractVideoView.f83684o != null) {
            if (abstractVideoView.isPlaying()) {
                abstractVideoView.pause();
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(abstractVideoView.f83684o.getVideoPath())) {
                ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.BaseVideoView) abstractVideoView).start();
            } else {
                abstractVideoView.play();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/video/videoview/AbstractVideoView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
