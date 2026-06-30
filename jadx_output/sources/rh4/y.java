package rh4;

/* loaded from: classes3.dex */
public class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh4.z f395804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f395805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f395807g;

    public y(rh4.b0 b0Var, rh4.z zVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f395807g = b0Var;
        this.f395804d = zVar;
        this.f395805e = viewPropertyAnimator;
        this.f395806f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f395805e.setListener(null);
        android.view.View view = this.f395806f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f395806f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        rh4.z zVar = this.f395804d;
        androidx.recyclerview.widget.k3 k3Var = zVar.f395809b;
        rh4.b0 b0Var = this.f395807g;
        b0Var.h(k3Var);
        b0Var.f395703r.remove(zVar.f395809b);
        b0Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        androidx.recyclerview.widget.k3 k3Var = this.f395804d.f395809b;
        this.f395807g.getClass();
    }
}
