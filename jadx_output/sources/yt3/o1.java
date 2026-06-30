package yt3;

/* loaded from: classes10.dex */
public final class o1 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView f465559d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f465560e;

    /* renamed from: f, reason: collision with root package name */
    public fp.e f465561f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f465562g;

    /* renamed from: h, reason: collision with root package name */
    public long f465563h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f465564i;

    /* renamed from: m, reason: collision with root package name */
    public int f465565m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f465566n;

    /* renamed from: o, reason: collision with root package name */
    public int f465567o;

    /* renamed from: p, reason: collision with root package name */
    public int f465568p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f465569q;

    /* renamed from: r, reason: collision with root package name */
    public final int f465570r;

    /* renamed from: s, reason: collision with root package name */
    public final yt3.n1 f465571s;

    public o1(com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView, ju3.d0 status, android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f465559d = videoPlayerTextureView;
        this.f465560e = textView;
        this.f465562g = videoPlayerTextureView != null ? videoPlayerTextureView.getContext() : null;
        this.f465563h = -1L;
        this.f465565m = 10000;
        this.f465570r = 333;
        this.f465571s = new yt3.n1(this, status);
    }

    public final android.view.ViewGroup a() {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f465559d;
        return (android.view.ViewGroup) (videoPlayerTextureView != null ? videoPlayerTextureView.getParent() : null);
    }

    public final void b(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        this.f465566n = false;
        android.view.ViewGroup a17 = a();
        android.view.ViewPropertyAnimator translationY = (a17 == null || (animate = a17.animate()) == null || (scaleX = animate.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null) ? null : scaleY.translationY(0.0f);
        if (translationY != null) {
            translationY.setDuration(300L);
        }
        if (z17) {
            return;
        }
        this.f465567o = 0;
        ct0.b bVar = this.f465564i;
        this.f465568p = bVar != null ? bVar.f222208e : 10000;
    }

    @Override // yt3.r2
    public void onDetach() {
        release();
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", "onPause");
        fp.e eVar = this.f465561f;
        if (eVar != null) {
            eVar.a();
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f465559d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.pause();
        }
    }

    @Override // yt3.r2
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", "onResume");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f465559d;
        kotlin.jvm.internal.o.d(videoPlayerTextureView);
        if (videoPlayerTextureView.isPlaying()) {
            return;
        }
        fp.e eVar = this.f465561f;
        if (eVar != null) {
            eVar.b();
        }
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.start();
        }
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", "release");
        fp.e eVar = this.f465561f;
        if (eVar != null) {
            eVar.a();
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f465559d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
        }
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.setVideoCallback(null);
        }
    }

    @Override // yt3.r2
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", "release");
        fp.e eVar = this.f465561f;
        if (eVar != null) {
            eVar.a();
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f465559d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
        }
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.setVideoCallback(null);
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f465559d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.setVisibility(i17);
        }
        android.widget.TextView textView = this.f465560e;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i17);
    }
}
