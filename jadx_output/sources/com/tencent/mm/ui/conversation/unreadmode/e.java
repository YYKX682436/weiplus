package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f208128e;

    public e(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI, float f17) {
        this.f208127d = unreadConversationFmUI;
        this.f208128e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        em.e4 e4Var;
        android.view.Window window;
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208127d;
        e4Var = unreadConversationFmUI.viewBinding;
        android.view.View view = null;
        if (e4Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        e4Var.a().setTranslationY(floatValue);
        float e17 = 1.0f - e06.p.e(floatValue / (this.f208128e * 0.5f), 0.0f, 1.0f);
        androidx.fragment.app.FragmentActivity activity = unreadConversationFmUI.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            view = window.getDecorView();
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(e17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$animateEnter$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$animateEnter$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
