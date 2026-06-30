package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.a0 f137192d;

    public z(com.tencent.mm.plugin.flash.action.a0 a0Var) {
        this.f137192d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "startTranslateAnimation");
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137192d.f137115e;
        android.view.animation.Animation animation = faceFlashActionPreviewLayout.f137085y;
        animation.cancel();
        animation.setDuration(500L);
        animation.setAnimationListener(new com.tencent.mm.plugin.flash.action.u(faceFlashActionPreviewLayout));
        faceFlashActionPreviewLayout.f137068g.startAnimation(animation);
        android.view.animation.Animation animation2 = faceFlashActionPreviewLayout.f137087z;
        animation2.cancel();
        animation2.setDuration(500L);
        animation2.setAnimationListener(new com.tencent.mm.plugin.flash.action.x(faceFlashActionPreviewLayout));
        faceFlashActionPreviewLayout.f137069h.startAnimation(animation2);
    }
}
