package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ad implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210278d;

    public ad(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210278d = showVideoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210278d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(showVideoUI.getContext(), com.tencent.mm.R.anim.f477877e1);
        loadAnimation.setAnimationListener(new com.tencent.mm.ui.tools.zc(this));
        showVideoUI.f210237y.startAnimation(loadAnimation);
        return java.lang.Boolean.TRUE;
    }
}
