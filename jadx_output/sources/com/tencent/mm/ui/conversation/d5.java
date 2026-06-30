package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class d5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f207632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.n f207633f;

    public d5(float f17, com.tencent.mm.ui.conversation.o5 o5Var, android.view.ViewGroup.LayoutParams layoutParams, yf5.n nVar) {
        this.f207631d = o5Var;
        this.f207632e = layoutParams;
        this.f207633f = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f207632e;
        layoutParams.height = (int) (0.0f + ((this.f207631d.f207931n - 0.0f) * floatValue));
        yf5.n nVar = this.f207633f;
        android.view.View view = nVar.f461931r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f461930q.setLayoutParams(layoutParams);
        nVar.f461929p = layoutParams.height;
        nVar.f461930q.requestLayout();
    }
}
