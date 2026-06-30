package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w50 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f114875d;

    public w50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f114875d = r60Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f114875d;
        android.view.View view = r60Var.f114104y;
        if (view == null) {
            kotlin.jvm.internal.o.o("promoteAnchorBubbleDelToast");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = r60Var.f114104y;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("promoteAnchorBubbleDelToast");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (r60Var.f114100u == null) {
            df2.pv pvVar = (df2.pv) r60Var.U0(df2.pv.class);
            if (pvVar != null) {
                pvVar.b7(r60Var);
            }
            com.tencent.mm.plugin.finder.live.plugin.r60 r60Var2 = this.f114875d;
            com.tencent.mm.plugin.finder.live.plugin.l.b1(r60Var2, null, r60Var2.f114098s, false, 4, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
