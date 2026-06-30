package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes3.dex */
public class y4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f145726a;

    public y4(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f145726a = mMPAGView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f145726a;
        mMPAGView.setVisibility(8);
        mMPAGView.n();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
