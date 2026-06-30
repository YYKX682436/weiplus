package vo1;

/* loaded from: classes3.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.c f438517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f438518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f438519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438520h;

    public h(vo1.q qVar, vo1.c cVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.animation.AnimatorSet animatorSet, android.view.View view) {
        this.f438516d = qVar;
        this.f438517e = cVar;
        this.f438518f = viewPropertyAnimator;
        this.f438519g = animatorSet;
        this.f438520h = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438518f.setListener(null);
        this.f438519g.cancel();
        android.view.View view = this.f438520h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateChangeImpl$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f438520h;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        vo1.c cVar = this.f438517e;
        androidx.recyclerview.widget.k3 k3Var = cVar.f438498a;
        vo1.q qVar = this.f438516d;
        qVar.h(k3Var);
        qVar.f438556r.remove(cVar.f438498a);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        androidx.recyclerview.widget.k3 k3Var = this.f438517e.f438498a;
        this.f438516d.getClass();
    }
}
