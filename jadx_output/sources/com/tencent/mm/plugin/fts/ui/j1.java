package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class j1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138081d;

    public j1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138081d = fTSBaseVoiceSearchUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138081d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) fTSBaseVoiceSearchUI.f137939z.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) fTSBaseVoiceSearchUI.A.getLayoutParams();
        if (fTSBaseVoiceSearchUI.M == valueAnimator) {
            layoutParams.width = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.width = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (fTSBaseVoiceSearchUI.N == valueAnimator) {
            layoutParams.height = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.height = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (fTSBaseVoiceSearchUI.P == valueAnimator) {
            layoutParams.topMargin = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.topMargin = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (fTSBaseVoiceSearchUI.Q == valueAnimator) {
            layoutParams.rightMargin = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.rightMargin = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (fTSBaseVoiceSearchUI.R == valueAnimator) {
            layoutParams.bottomMargin = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.bottomMargin = com.tencent.mm.ui.zk.a(fTSBaseVoiceSearchUI.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        fTSBaseVoiceSearchUI.f137939z.setLayoutParams(layoutParams);
        fTSBaseVoiceSearchUI.A.setLayoutParams(layoutParams2);
    }
}
