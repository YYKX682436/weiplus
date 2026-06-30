package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f202948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f202949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f202950f;

    public g1(com.tencent.mm.ui.chatting.view.e2 e2Var, androidx.recyclerview.widget.k3 k3Var, android.view.View view) {
        this.f202948d = e2Var;
        this.f202949e = k3Var;
        this.f202950f = view;
    }

    public final void a(android.animation.Animator animator) {
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f202948d;
        ((java.util.ArrayList) e2Var.f202917n).remove(animator);
        java.util.HashMap hashMap = e2Var.f202918o;
        androidx.recyclerview.widget.k3 k3Var = this.f202949e;
        hashMap.remove(k3Var);
        android.view.View view = this.f202950f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$animateAdd$anim$1$2", "finish", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$animateAdd$anim$1$2", "finish", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        e2Var.h(k3Var);
        e2Var.J();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        a(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        a(animation);
    }
}
