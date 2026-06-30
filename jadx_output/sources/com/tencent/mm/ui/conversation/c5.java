package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class c5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f207606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.n f207608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f207609g;

    public c5(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.ui.conversation.o5 o5Var, yf5.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f207606d = l4Var;
        this.f207607e = o5Var;
        this.f207608f = nVar;
        this.f207609g = layoutParams;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        yf5.m c17;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.storage.l4 l4Var = this.f207606d;
        if (l4Var != null) {
            l4Var.f195085g2 = 2;
        }
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207607e;
        int i17 = o5Var.f207941x;
        if (i17 > 0) {
            o5Var.f207941x = i17 - 1;
        }
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = o5Var.f207926f;
        if (conversationListView != null) {
            conversationListView.h(false);
        }
        if (o5Var.K.getAndSet(false)) {
            yf5.j0 j0Var = o5Var.f207924d;
            if (j0Var != null && (c17 = ((yf5.w0) j0Var).c()) != null) {
                c17.b();
            }
            o5Var.f207939v = false;
            o5Var.B = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        yf5.m c17;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.storage.l4 l4Var = this.f207606d;
        if (l4Var != null) {
            l4Var.f195085g2 = 2;
        }
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207607e;
        com.tencent.mm.storage.l4 k17 = o5Var.k(h17);
        if (k17 != null) {
            k17.f195085g2 = 2;
        }
        yf5.n nVar = this.f207608f;
        android.view.View view = nVar.f461931r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f461930q.setLayoutParams(this.f207609g);
        nVar.f461929p = o5Var.f207931n;
        nVar.f461930q.requestLayout();
        int i17 = o5Var.f207941x;
        if (i17 > 0) {
            o5Var.f207941x = i17 - 1;
        }
        if (o5Var.K.getAndSet(false)) {
            yf5.j0 j0Var = o5Var.f207924d;
            if (j0Var != null && (c17 = ((yf5.w0) j0Var).c()) != null) {
                c17.b();
            }
            o5Var.f207939v = false;
            o5Var.B = false;
        }
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = o5Var.f207926f;
        if (conversationListView != null) {
            conversationListView.h(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.storage.l4 l4Var = this.f207606d;
        if (l4Var != null) {
            l4Var.f195085g2 = 66;
        }
        yf5.n nVar = this.f207608f;
        android.view.View view = nVar.f461931r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = nVar.f461930q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
