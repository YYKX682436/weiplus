package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class hf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f208881a;

    public hf(com.tencent.mm.ui.MultiTalkRoomPopupNav multiTalkRoomPopupNav, android.widget.LinearLayout linearLayout) {
        this.f208881a = linearLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f208881a.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
