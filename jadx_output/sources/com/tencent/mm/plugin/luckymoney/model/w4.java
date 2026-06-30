package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f145679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145680e;

    public w4(com.tencent.mm.view.MMPAGView mMPAGView, java.lang.String str) {
        this.f145679d = mMPAGView;
        this.f145680e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f145679d;
        mMPAGView.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.v4(this));
        mMPAGView.setPath(this.f145680e);
        mMPAGView.n();
        mMPAGView.d();
        mMPAGView.g();
        mMPAGView.setVisibility(0);
    }
}
