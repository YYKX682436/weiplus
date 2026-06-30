package vo1;

/* loaded from: classes3.dex */
public final class m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f438535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f438536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438537g;

    public m(vo1.q qVar, androidx.recyclerview.widget.k3 k3Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f438534d = qVar;
        this.f438535e = k3Var;
        this.f438536f = viewPropertyAnimator;
        this.f438537g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438536f.setListener(null);
        android.view.View view = this.f438537g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateRemoveImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$animateRemoveImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        vo1.q qVar = this.f438534d;
        androidx.recyclerview.widget.k3 k3Var = this.f438535e;
        qVar.y(k3Var);
        qVar.f438555q.remove(k3Var);
        qVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f438534d.C(this.f438535e);
    }
}
