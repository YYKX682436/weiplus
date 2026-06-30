package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f172686d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f172688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarContainer f172689g;

    public q0(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer, int i17, android.view.View view) {
        this.f172689g = taskBarContainer;
        this.f172687e = i17;
        this.f172688f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        if (num.intValue() / this.f172687e >= 0.87d && !this.f172686d) {
            this.f172686d = true;
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172689g;
            taskBarContainer.f172498e.s1();
            taskBarContainer.B = false;
        }
        android.view.View view = this.f172688f;
        view.getLayoutParams().width = num.intValue();
        view.requestLayout();
    }
}
