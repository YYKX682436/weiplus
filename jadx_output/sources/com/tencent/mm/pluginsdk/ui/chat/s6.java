package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class s6 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f190644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190645e;

    public s6(android.view.ViewPropertyAnimator viewPropertyAnimator, com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190644d = viewPropertyAnimator;
        this.f190645e = c8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f190644d;
        viewPropertyAnimator.setListener(null);
        viewPropertyAnimator.setUpdateListener(null);
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190645e;
        android.view.View h17 = c8Var.h();
        h17.setOutlineProvider(new zl5.a(true, false, 0.0f));
        h17.setClipToOutline(true);
        c8Var.c().setVisibility(0);
        if (c8Var.f190220b.getChattingContext() == null || ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) c8Var.e().f460708c.a(sb5.i0.class))).f200304y) {
            return;
        }
        java.lang.Object value = ((jz5.n) c8Var.f190239u).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
