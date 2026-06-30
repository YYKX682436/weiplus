package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public final class f extends com.tencent.mm.plugin.game.chatroom.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.l f139101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.b f139102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f139103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139104g;

    public f(com.tencent.mm.plugin.game.chatroom.view.l lVar, com.tencent.mm.plugin.game.chatroom.view.b bVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f139101d = lVar;
        this.f139102e = bVar;
        this.f139103f = viewPropertyAnimator;
        this.f139104g = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f139103f.setListener(null);
        android.view.View view = this.f139104g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f139104g;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        com.tencent.mm.plugin.game.chatroom.view.b bVar = this.f139102e;
        androidx.recyclerview.widget.k3 k3Var = bVar.f139027a;
        com.tencent.mm.plugin.game.chatroom.view.l lVar = this.f139101d;
        lVar.h(k3Var);
        androidx.recyclerview.widget.k3 k3Var2 = bVar.f139027a;
        if (k3Var2 != null) {
            java.util.ArrayList arrayList2 = lVar.f139214r;
            kotlin.jvm.internal.o.d(k3Var2);
            arrayList2.remove(k3Var2);
        }
        lVar.E();
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.a, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        androidx.recyclerview.widget.k3 k3Var = this.f139102e.f139027a;
        this.f139101d.getClass();
    }
}
