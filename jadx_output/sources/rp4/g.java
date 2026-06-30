package rp4;

/* loaded from: classes10.dex */
public final class g implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.videocomposition.play.VideoCompositionPlayView f398649d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f398650e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f398651f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f398652g;

    /* renamed from: h, reason: collision with root package name */
    public fp.e f398653h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f398654i;

    /* renamed from: m, reason: collision with root package name */
    public int f398655m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f398656n;

    /* renamed from: o, reason: collision with root package name */
    public int f398657o;

    /* renamed from: p, reason: collision with root package name */
    public int f398658p;

    /* renamed from: q, reason: collision with root package name */
    public rp4.x f398659q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f398660r;

    /* renamed from: s, reason: collision with root package name */
    public final rp4.f f398661s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f398662t;

    public g(com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView, ju3.d0 status, android.widget.TextView textView, android.content.Context context) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(context, "context");
        this.f398649d = videoCompositionPlayView;
        this.f398650e = status;
        this.f398651f = textView;
        this.f398652g = context;
        this.f398655m = 10000;
        this.f398660r = true;
        this.f398661s = new rp4.f(this);
        this.f398662t = jz5.h.b(rp4.b.f398611d);
    }

    public final android.view.ViewGroup a() {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f398649d;
        return (android.view.ViewGroup) (videoCompositionPlayView != null ? videoCompositionPlayView.getParent() : null);
    }

    public final void b(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        this.f398656n = false;
        android.view.ViewGroup a17 = a();
        android.view.ViewPropertyAnimator translationY = (a17 == null || (animate = a17.animate()) == null || (scaleX = animate.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null) ? null : scaleY.translationY(0.0f);
        if (translationY != null) {
            translationY.setDuration(300L);
        }
        if (z17) {
            return;
        }
        this.f398657o = 0;
        ct0.b bVar = this.f398654i;
        this.f398658p = bVar != null ? bVar.f222208e : 10000;
    }

    public final void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseVideo >> ");
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f398649d;
        sb6.append(videoCompositionPlayView != null ? java.lang.Integer.valueOf(videoCompositionPlayView.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", sb6.toString());
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView2 = this.f398649d;
        if (videoCompositionPlayView2 != null) {
            if (videoCompositionPlayView2 != null) {
                videoCompositionPlayView2.g();
            }
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView3 = this.f398649d;
            if (videoCompositionPlayView3 != null) {
                videoCompositionPlayView3.setPlayerCallback(null);
            }
            this.f398649d = null;
        }
    }

    public final void d(boolean z17) {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f398649d;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.f(z17);
        }
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "onDetach");
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f398649d;
        if (videoCompositionPlayView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(videoCompositionPlayView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        videoCompositionPlayView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(videoCompositionPlayView, "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "onPause");
        fp.e eVar = this.f398653h;
        if (eVar != null) {
            eVar.a();
        }
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f398649d;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.pause();
        }
    }

    @Override // yt3.r2
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "onResume");
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f398649d;
        if (videoCompositionPlayView != null) {
            kotlin.jvm.internal.o.d(videoCompositionPlayView);
            if (videoCompositionPlayView.isPlaying()) {
                return;
            }
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView2 = this.f398649d;
            kotlin.jvm.internal.o.d(videoCompositionPlayView2);
            videoCompositionPlayView2.h();
        }
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "onRelease");
        c();
    }

    @Override // yt3.r2
    public void reset() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "reset");
        fp.e eVar = this.f398653h;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f398649d;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.setVisibility(i17);
        }
        android.widget.TextView textView = this.f398651f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i17);
    }
}
