package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class s0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f172696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f172697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f172698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f172699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f172700h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f172701i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f172702m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f172703n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarContainer f172704o;

    public s0(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer, android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29, int i17) {
        this.f172704o = taskBarContainer;
        this.f172696d = view;
        this.f172697e = f17;
        this.f172698f = f18;
        this.f172699g = f19;
        this.f172700h = f27;
        this.f172701i = f28;
        this.f172702m = f29;
        this.f172703n = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f172696d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = this.f172697e;
        android.view.View view2 = this.f172696d;
        view2.setScaleX(f17);
        view2.setScaleY(this.f172698f);
        view2.setX(this.f172699g);
        view2.setY(this.f172700h);
        view2.setTranslationX(this.f172701i);
        view2.setTranslationY(this.f172702m);
        view2.getLayoutParams().width = this.f172703n;
        view2.requestLayout();
        view2.postDelayed(new com.tencent.mm.plugin.taskbar.ui.r0(this), 500L);
        this.f172704o.B = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
