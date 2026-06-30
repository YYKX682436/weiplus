package rs;

/* loaded from: classes3.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f399242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f399243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f399244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rs.k f399245g;

    public d(rs.k kVar, androidx.recyclerview.widget.k3 k3Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f399245g = kVar;
        this.f399242d = k3Var;
        this.f399243e = viewPropertyAnimator;
        this.f399244f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f399243e.setListener(null);
        android.view.View view = this.f399244f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rs.k kVar = this.f399245g;
        androidx.recyclerview.widget.k3 k3Var = this.f399242d;
        kVar.y(k3Var);
        kVar.f399285q.remove(k3Var);
        kVar.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f399245g.C(this.f399242d);
    }
}
