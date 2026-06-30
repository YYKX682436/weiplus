package jq4;

/* loaded from: classes3.dex */
public final class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.y f301182e;

    public p(android.view.View view, jq4.y yVar) {
        this.f301181d = view;
        this.f301182e = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        jq4.y yVar = this.f301182e;
        yVar.f301233b = true;
        java.lang.String str = null;
        yVar.f301241j = null;
        android.view.View view = yVar.f301248q;
        if (view != null) {
            if (view != null && (context = view.getContext()) != null) {
                str = context.getString(com.tencent.mm.R.string.kcw);
            }
            view.setContentDescription(str);
        }
        android.view.View view2 = yVar.f301248q;
        if (view2 != null) {
            view2.sendAccessibilityEvent(128);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        android.view.View view = this.f301181d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showFinishCard$3$2$positionAnimator$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showFinishCard$3$2$positionAnimator$1$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
