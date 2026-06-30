package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class x implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137190a;

    public x(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f137190a = faceFlashActionPreviewLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        wu5.c cVar = this.f137190a.G;
        if (cVar != null) {
            cVar.cancel(false);
            this.f137190a.G = null;
        }
        this.f137190a.G = ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.w(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "after onAnimationStart ");
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137190a;
        faceFlashActionPreviewLayout.f137081v.b(faceFlashActionPreviewLayout.f137069h);
        faceFlashActionPreviewLayout.f137069h.setVisibility(0);
    }
}
