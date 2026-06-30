package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class d1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.f1 f176242a;

    public d1(com.tencent.mm.plugin.voiceprint.ui.f1 f1Var) {
        this.f176242a = f1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.voiceprint.ui.f1 f1Var = this.f176242a;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
