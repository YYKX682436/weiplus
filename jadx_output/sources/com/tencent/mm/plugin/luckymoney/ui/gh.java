package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gh implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.hh f146950a;

    public gh(com.tencent.mm.plugin.luckymoney.ui.hh hhVar) {
        this.f146950a = hhVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f146950a.f146997a.A.setVisibility(0);
    }
}
