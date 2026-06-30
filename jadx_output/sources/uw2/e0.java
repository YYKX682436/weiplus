package uw2;

/* loaded from: classes2.dex */
public final class e0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f431660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f431661f;

    public e0(in5.s0 s0Var, java.util.List list, kotlin.jvm.internal.h0 h0Var) {
        this.f431659d = s0Var;
        this.f431660e = list;
        this.f431661f = h0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f431659d.f293125i;
        nv2.h1 h1Var = nv2.n1.f340550g;
        java.util.LinkedList h17 = nv2.n1.f340551h.h(baseFinderFeed.getFeedObject().getFeedObject());
        java.util.List<android.view.View> list = this.f431660e;
        for (android.view.View view : list) {
            if (view != null) {
                view.setTranslationX(0.0f);
            }
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        kotlin.jvm.internal.h0 h0Var = this.f431661f;
        android.view.View view2 = (android.view.View) h0Var.f310123d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) h0Var.f310123d).setTranslationX(0.0f);
        android.view.View view3 = (android.view.View) h0Var.f310123d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.a0(h17, 0);
        uw2.h0 h0Var2 = uw2.h0.f431674a;
        if (finderCommentInfo != null) {
            java.lang.Object obj = list.get(2);
            kotlin.jvm.internal.o.d(obj);
            android.view.View findViewById = ((android.view.View) obj).findViewById(com.tencent.mm.R.id.ge9);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            h0Var2.n(finderCommentInfo, (android.widget.ImageView) findViewById);
        }
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.a0(h17, 1);
        if (finderCommentInfo2 != null) {
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.d(obj2);
            android.view.View findViewById2 = ((android.view.View) obj2).findViewById(com.tencent.mm.R.id.ge7);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            h0Var2.n(finderCommentInfo2, (android.widget.ImageView) findViewById2);
        }
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo3 = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.a0(h17, 2);
        if (finderCommentInfo3 != null) {
            java.lang.Object obj3 = list.get(0);
            kotlin.jvm.internal.o.d(obj3);
            android.view.View findViewById3 = ((android.view.View) obj3).findViewById(com.tencent.mm.R.id.f485060ge5);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            h0Var2.n(finderCommentInfo3, (android.widget.ImageView) findViewById3);
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
