package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jm implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f113138d;

    public jm(com.tencent.mm.plugin.finder.live.plugin.bn bnVar) {
        this.f113138d = bnVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "onAnimationCancel");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "onAnimationStart");
        this.f113138d.f112052p.setVisibility(0);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "onAnimationEnd");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "onAnimationRepeat");
    }
}
