package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f60 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118318d;

    public f60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f118318d = z60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f118318d;
        z60Var.getClass();
        android.widget.LinearLayout linearLayout = z60Var.f120539m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout.getLayoutParams().height = -2;
        android.widget.LinearLayout linearLayout2 = z60Var.f120539m;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout2.requestLayout();
        android.view.View view = z60Var.f120541o;
        if (view == null) {
            kotlin.jvm.internal.o.o("tabRecyclerSeparator");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = z60Var.f120541o;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("tabRecyclerSeparator");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        z60Var.f120534e = null;
        android.widget.LinearLayout linearLayout3 = z60Var.f120539m;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        n3.t1 t1Var = new n3.t1(linearLayout3);
        while (t1Var.hasNext()) {
            android.view.View view3 = (android.view.View) t1Var.next();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$animateContentDisappearance$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.z60.d(z60Var, z60Var.f120543q);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f118318d.getClass();
    }
}
