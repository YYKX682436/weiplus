package vo1;

/* loaded from: classes.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f438496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438497f;

    public b(android.view.View view, int i17, yz5.a aVar) {
        this.f438495d = view;
        this.f438496e = i17;
        this.f438497f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f438495d.getLayoutParams().height = this.f438496e;
        android.view.View view = this.f438495d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils$animCollapseGone$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils$animCollapseGone$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f438497f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
