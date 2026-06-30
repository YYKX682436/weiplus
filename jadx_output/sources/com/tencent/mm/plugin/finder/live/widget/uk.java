package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class uk implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f119977d;

    public uk(com.tencent.mm.plugin.finder.live.widget.hl hlVar) {
        this.f119977d = hlVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "onAnimationCancel");
        tn0.w0 Z0 = this.f119977d.f118574b.Z0();
        if (Z0 != null) {
            Z0.G0();
        }
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "onAnimationStart");
        this.f119977d.f118573a.setVisibility(0);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "onAnimationEnd");
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "onAnimationRepeat");
    }
}
