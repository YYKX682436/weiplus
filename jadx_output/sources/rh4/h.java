package rh4;

/* loaded from: classes3.dex */
public class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh4.i f395728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f395729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh4.k f395731g;

    public h(rh4.k kVar, rh4.i iVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f395731g = kVar;
        this.f395728d = iVar;
        this.f395729e = viewPropertyAnimator;
        this.f395730f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f395729e.setListener(null);
        android.view.View view = this.f395730f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionCommonUsedWeAppItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rh4.i iVar = this.f395728d;
        androidx.recyclerview.widget.k3 k3Var = iVar.f395736b;
        rh4.k kVar = this.f395731g;
        kVar.h(k3Var);
        kVar.f395758r.remove(iVar.f395736b);
        kVar.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        androidx.recyclerview.widget.k3 k3Var = this.f395728d.f395736b;
        this.f395731g.getClass();
    }
}
