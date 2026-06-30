package vo1;

/* loaded from: classes3.dex */
public final class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f438511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f438513g;

    public e(vo1.q qVar, androidx.recyclerview.widget.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f438510d = qVar;
        this.f438511e = k3Var;
        this.f438512f = view;
        this.f438513g = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.View view = this.f438512f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateAddImpl$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateAddImpl$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438513g.setListener(null);
        vo1.q qVar = this.f438510d;
        androidx.recyclerview.widget.k3 k3Var = this.f438511e;
        qVar.h(k3Var);
        qVar.f438553o.remove(k3Var);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438510d.getClass();
    }
}
