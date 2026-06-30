package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class p6 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f190562e;

    public p6(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f190561d = c8Var;
        this.f190562e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190561d;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = c8Var.f190220b;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.getChatFooterPanel();
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibleChangeListener(null);
        }
        c8Var.f190219a = false;
        android.view.View i17 = c8Var.i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(i17, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(i17, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fl5.i iVar = c8Var.f190221c;
        iVar.getSizeAnimController().a(false);
        java.lang.Object value = ((jz5.n) c8Var.f190235q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        c8Var.r((android.widget.LinearLayout) value);
        iVar.l().post(new com.tencent.mm.pluginsdk.ui.chat.c7(c8Var));
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = chatFooter.getChatFooterPanel();
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.f(false);
        }
        chatFooter.R1();
        c8Var.b(true);
        c8Var.t();
        this.f190562e.setListener(null);
        c8Var.h().setTranslationY(0.0f);
        c8Var.h().setTranslationX(0.0f);
    }
}
