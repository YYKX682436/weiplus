package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class b1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.f1 f176235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f176236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f176237c;

    public b1(com.tencent.mm.plugin.voiceprint.ui.f1 f1Var, int i17, android.view.View view) {
        this.f176235a = f1Var;
        this.f176236b = i17;
        this.f176237c = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.voiceprint.ui.f1 f1Var = this.f176235a;
        if (f1Var != null) {
            f1Var.b();
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0, this.f176236b, 0, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setStartOffset(0L);
        translateAnimation.setRepeatMode(-1);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new com.tencent.mm.plugin.voiceprint.ui.a1(this));
        this.f176237c.startAnimation(translateAnimation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
