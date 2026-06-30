package com.tencent.mm.plugin.sns.ui.video;

/* loaded from: classes4.dex */
public class SnsTimelineVideoView extends com.tencent.mm.plugin.sns.ui.OnlineVideoView {

    /* renamed from: t2, reason: collision with root package name */
    public static final /* synthetic */ int f170638t2 = 0;

    /* renamed from: k2, reason: collision with root package name */
    public xd4.d0 f170639k2;

    /* renamed from: l2, reason: collision with root package name */
    public xd4.j0 f170640l2;

    /* renamed from: m2, reason: collision with root package name */
    public java.lang.String f170641m2;

    /* renamed from: n2, reason: collision with root package name */
    public long f170642n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.view.View f170643o2;

    /* renamed from: p2, reason: collision with root package name */
    public volatile boolean f170644p2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f170645q2;

    /* renamed from: r2, reason: collision with root package name */
    public volatile boolean f170646r2;

    /* renamed from: s2, reason: collision with root package name */
    public xd4.e0 f170647s2;

    public SnsTimelineVideoView(android.content.Context context, boolean z17) {
        super(context, z17);
        this.f170639k2 = xd4.d0.AVAILABLE;
        this.f170642n2 = 0L;
        this.f170644p2 = false;
        this.f170645q2 = false;
        this.f170646r2 = false;
        this.f170647s2 = null;
        e0();
    }

    private void e0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        this.f170643o2 = findViewById(com.tencent.mm.R.id.f487567p13);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView
    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        c0(this.f170641m2);
        this.f170641m2 = "";
        super.B();
        this.f170644p2 = false;
        this.f170646r2 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%d on destroy succ", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView
    public void C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        d0();
        super.C();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView
    public void F() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var;
            try {
                bitmap = thumbPlayerVideoView.getBitmap(thumbPlayerVideoView.getWidth() / 2, thumbPlayerVideoView.getHeight() / 2);
            } catch (java.lang.OutOfMemoryError unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SnsOnlineVideoView", "OOM occurs, ignore bitmap");
                bitmap = null;
            }
            if (bitmap != null) {
                this.F.setImageBitmap(bitmap);
            }
        }
        super.F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        super.K();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s resumePlay, setState PLAYING", java.lang.Integer.valueOf(hashCode()));
        this.f170639k2 = xd4.d0.PLAYING;
        this.f170642n2 = java.lang.System.currentTimeMillis();
        d0();
        U(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void b0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        try {
            xd4.e0 e0Var = this.f170647s2;
            if (e0Var != null) {
                e0Var.a(this.f170641m2);
                this.f170647s2 = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.SnsOnlineVideoView", e17, "doUICallback", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public final void c0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUICallbackAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        if (this.f170647s2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            post(new xd4.c0(this, str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUICallbackAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        android.view.View view = this.f170643o2;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s refreshPlayBtn gone", java.lang.Integer.valueOf(hashCode()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public boolean f0() {
        boolean z17;
        ph3.o oVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
            ph3.k kVar = ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).f191450m;
            z17 = (kVar == null || (oVar = kVar.f354428f) == null || oVar.f354447j != 4) ? false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return z17;
        }
        if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
            z17 = ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var).f174606u == 6;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return z17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SnsOnlineVideoView", "videoview not VideoPlayerTextureView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        return false;
    }

    public void g0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroyAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%d onDestroyAsync", java.lang.Integer.valueOf(hashCode()));
        c0(this.f170641m2);
        this.f170641m2 = "";
        this.f170644p2 = true;
        fk4.u uVar = this.f166463y1;
        if (uVar != null) {
            ((fk4.k) uVar).p();
            this.f166463y1 = null;
        }
        if (this.G != null) {
            this.G.p();
            this.G.d();
            this.G = null;
        }
        t();
        ((ku5.t0) ku5.t0.f312615d).g(new xd4.b0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroyAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public android.view.View getInnerVideoView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        java.lang.Object obj = this.B;
        if (!(obj instanceof android.view.View)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return null;
        }
        android.view.View view = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        return view;
    }

    public void h0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroyWithoutCallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        this.f170641m2 = "";
        super.B();
        this.f170644p2 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%d onDestroyWithoutCallback succ", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroyWithoutCallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void i0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        F();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s pausePlay, setState ATTACHING", java.lang.Integer.valueOf(hashCode()));
        this.f170639k2 = xd4.d0.ATTACHING;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            android.view.View view = this.f170643o2;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "showPlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "showPlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s refreshPlayBtn visible", java.lang.Integer.valueOf(hashCode()));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        }
        t();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void j0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayWithoutChangePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        i0(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s pausePlayWithoutChangePlayBtn, setState ATTACHING", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayWithoutChangePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s onDetachedFromWindow, setState AVAILABLE, %s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f170645q2));
        this.f170639k2 = xd4.d0.AVAILABLE;
        if (this.f170645q2) {
            this.f170645q2 = false;
        } else {
            g0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void setUICallback(xd4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s videoview setUICallback", java.lang.Integer.valueOf(hashCode()));
        this.f170647s2 = e0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public SnsTimelineVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170639k2 = xd4.d0.AVAILABLE;
        this.f170642n2 = 0L;
        this.f170644p2 = false;
        this.f170645q2 = false;
        this.f170646r2 = false;
        this.f170647s2 = null;
        e0();
    }

    public SnsTimelineVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170639k2 = xd4.d0.AVAILABLE;
        this.f170642n2 = 0L;
        this.f170644p2 = false;
        this.f170645q2 = false;
        this.f170646r2 = false;
        this.f170647s2 = null;
        e0();
    }

    public SnsTimelineVideoView(android.content.Context context) {
        super(context, (android.util.AttributeSet) null);
        this.f170639k2 = xd4.d0.AVAILABLE;
        this.f170642n2 = 0L;
        this.f170644p2 = false;
        this.f170645q2 = false;
        this.f170646r2 = false;
        this.f170647s2 = null;
        e0();
    }
}
