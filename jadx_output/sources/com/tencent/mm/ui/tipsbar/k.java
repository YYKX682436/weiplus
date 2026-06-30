package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f209944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209945e;

    public k(android.view.ViewPropertyAnimator viewPropertyAnimator, com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup) {
        this.f209944d = viewPropertyAnimator;
        this.f209945e = chatTipsBarGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f209944d.setListener(null);
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f209945e;
        android.view.View view = chatTipsBarGroup.f209910i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$animToFoldMode$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$animToFoldMode$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams = chatTipsBarGroup.f209911m.getLayoutParams();
        layoutParams.height = 0;
        chatTipsBarGroup.f209911m.setLayoutParams(layoutParams);
        chatTipsBarGroup.f209912n = false;
    }
}
