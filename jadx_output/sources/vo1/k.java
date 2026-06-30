package vo1;

/* loaded from: classes3.dex */
public final class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.c f438524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f438525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f438526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438527h;

    public k(vo1.q qVar, vo1.c cVar, android.view.ViewPropertyAnimator viewPropertyAnimator, kotlin.jvm.internal.h0 h0Var, android.view.View view) {
        this.f438523d = qVar;
        this.f438524e = cVar;
        this.f438525f = viewPropertyAnimator;
        this.f438526g = h0Var;
        this.f438527h = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438525f.setListener(null);
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) this.f438526g.f310123d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.view.View view = this.f438527h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f438527h;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        vo1.c cVar = this.f438524e;
        androidx.recyclerview.widget.k3 k3Var = cVar.f438499b;
        vo1.q qVar = this.f438523d;
        qVar.h(k3Var);
        qVar.f438556r.remove(cVar.f438499b);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        androidx.recyclerview.widget.k3 k3Var = this.f438524e.f438499b;
        this.f438523d.getClass();
    }
}
