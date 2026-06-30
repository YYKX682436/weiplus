package rh4;

/* loaded from: classes3.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f395707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f395708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.k f395710g;

    public d(rh4.k kVar, androidx.recyclerview.widget.k3 k3Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f395710g = kVar;
        this.f395707d = k3Var;
        this.f395708e = viewPropertyAnimator;
        this.f395709f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f395708e.setListener(null);
        android.view.View view = this.f395709f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rh4.k kVar = this.f395710g;
        androidx.recyclerview.widget.k3 k3Var = this.f395707d;
        kVar.y(k3Var);
        kVar.f395757q.remove(k3Var);
        kVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f395710g.C(this.f395707d);
    }
}
