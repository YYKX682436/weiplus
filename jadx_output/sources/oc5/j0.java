package oc5;

/* loaded from: classes3.dex */
public final class j0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f344439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f344440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f344441f;

    public j0(android.view.View view, boolean z17) {
        this.f344440e = view;
        this.f344441f = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        this.f344439d = true;
        android.view.View view = this.f344440e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f344440e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        oc5.k0 k0Var = oc5.k0.f344445a;
        oc5.k0.f344447c.remove(java.lang.Integer.valueOf(this.f344440e.hashCode()));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.View view;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.View view2 = this.f344440e;
        int i17 = (!this.f344441f || this.f344439d) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f344440e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper$doAlphaAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        oc5.k0 k0Var = oc5.k0.f344445a;
        java.util.HashMap hashMap = oc5.k0.f344447c;
        android.view.View view4 = this.f344440e;
        hashMap.remove(java.lang.Integer.valueOf(view4.hashCode()));
        java.lang.Integer num = (java.lang.Integer) oc5.k0.f344446b.remove(java.lang.Integer.valueOf(view4.hashCode()));
        if (num == null) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) oc5.k0.f344448d.get(java.lang.Integer.valueOf(view4.hashCode()));
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                return;
            }
            return;
        }
        num.intValue();
        boolean z17 = num.intValue() == 1;
        if (z17) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            view = view4;
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper", "runNextAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/scan/QuickButtonAnimationHelper", "runNextAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            view = view4;
        }
        k0Var.b(view, z17);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
    }
}
