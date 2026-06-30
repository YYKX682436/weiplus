package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public abstract class BaseSmallView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f177088d;

    /* renamed from: e, reason: collision with root package name */
    public int f177089e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f177090f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f177091g;

    public BaseSmallView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new android.graphics.PointF();
        new android.graphics.Point();
        new android.graphics.Point();
        new android.graphics.Point();
        this.f177089e = -1;
        this.f177091g = new com.tencent.mm.plugin.voip.widget.b(this);
        this.f177088d = (android.view.WindowManager) context.getSystemService("window");
        new com.tencent.mm.sdk.platformtools.n3();
        new android.graphics.Point(this.f177088d.getDefaultDisplay().getWidth(), this.f177088d.getDefaultDisplay().getHeight());
    }

    public void c(boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).A("resumeIcon");
        ((ku5.t0) ku5.t0.f312615d).l(this.f177091g, 2000L, "resumeIcon");
    }

    public boolean d() {
        ((ku5.t0) ku5.t0.f312615d).A("resumeIcon");
        return true;
    }

    public void e(int i17) {
    }

    public void f() {
    }

    public void g() {
        ((ku5.t0) ku5.t0.f312615d).A("resumeIcon");
        ((ku5.t0) ku5.t0.f312615d).l(this.f177091g, 2000L, "resumeIcon");
    }

    @java.lang.Deprecated
    public com.tencent.mm.plugin.voip.video.OpenGlRender getBeautyData() {
        return null;
    }

    @java.lang.Deprecated
    public com.tencent.mm.plugin.voip.video.OpenGlRender getSpatioTemporalFilterData() {
        return null;
    }

    public void h(int i17, int i18) {
    }

    public void i(boolean z17) {
    }

    public void j() {
        this.f177088d = null;
    }

    public void k(java.lang.String str) {
    }

    public void l(java.lang.String str) {
    }

    @Override // android.view.View
    public void onAnimationEnd() {
    }

    @java.lang.Deprecated
    public void setCaptureView(com.tencent.mm.plugin.voip.video.camera.prev.CaptureView captureView) {
    }

    public void setConnectSec(long j17) {
    }

    @java.lang.Deprecated
    public void setHWDecMode(int i17) {
    }

    @java.lang.Deprecated
    public void setSpatiotemporalDenosing(int i17) {
    }

    public void setStatus(int i17) {
    }

    public void setVoicePlayDevice(int i17) {
        ((ku5.t0) ku5.t0.f312615d).A("resumeIcon");
        ((ku5.t0) ku5.t0.f312615d).l(this.f177091g, 2000L, "resumeIcon");
    }

    @java.lang.Deprecated
    public void setVoipBeauty(int i17) {
    }

    public void setVoipUIListener(com.tencent.mm.plugin.voip.ui.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.BaseSmallView", "hwViewSmall setVoipUIListener, before initHWView");
        this.f177090f = new java.lang.ref.WeakReference(gVar);
    }
}
