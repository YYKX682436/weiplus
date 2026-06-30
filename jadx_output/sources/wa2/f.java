package wa2;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.View view) {
        super(1);
        this.f444113d = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f444113d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$4", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$4", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return jz5.f0.f302826a;
    }
}
