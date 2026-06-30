package rs;

/* loaded from: classes3.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs.i f399256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f399257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f399258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rs.k f399259g;

    public g(rs.k kVar, rs.i iVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f399259g = kVar;
        this.f399256d = iVar;
        this.f399257e = viewPropertyAnimator;
        this.f399258f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f399257e.setListener(null);
        android.view.View view = this.f399258f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/anim/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/feature/anim/DefaultItemAnimator$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f399258f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        rs.i iVar = this.f399256d;
        androidx.recyclerview.widget.k3 k3Var = iVar.f399264a;
        rs.k kVar = this.f399259g;
        kVar.h(k3Var);
        kVar.f399286r.remove(iVar.f399264a);
        kVar.G();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        androidx.recyclerview.widget.k3 k3Var = this.f399256d.f399264a;
        this.f399259g.getClass();
    }
}
