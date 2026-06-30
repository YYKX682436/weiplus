package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class j implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.e f177155d;

    public j(com.tencent.mm.plugin.voip.widget.e eVar) {
        this.f177155d = eVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.voip.widget.e eVar = this.f177155d;
        eVar.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "onRemoteReady");
        eVar.n();
        eVar.o();
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = eVar.f177134i;
        voIPRenderTextureView.b();
        voIPRenderTextureView.setAlpha(1.0f);
        eVar.f177133h.setAlpha(1.0f);
        eVar.f();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
