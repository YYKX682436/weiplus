package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class n extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f203008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r f203009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f203010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f203011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f203012h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f203013i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f203014m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f203015n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f203016o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f203017p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203018q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f203019r;

    public n(com.tencent.mm.ui.chatting.view.r rVar, androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, int i17, int i18, android.graphics.Rect rect, float f17, int i19, android.view.View view, float f18) {
        this.f203009e = rVar;
        this.f203010f = k3Var;
        this.f203011g = k3Var2;
        this.f203012h = mMNeat7extView;
        this.f203013i = i17;
        this.f203014m = i18;
        this.f203015n = rect;
        this.f203016o = f17;
        this.f203017p = i19;
        this.f203018q = view;
        this.f203019r = f18;
    }

    public final void a() {
        if (this.f203008d) {
            com.tencent.mars.xlog.Log.w("ChattingTextChangeItemAnimator", "animateChange(old,new): finish called repeatedly, ignore");
            return;
        }
        this.f203008d = true;
        com.tencent.mm.ui.chatting.view.r rVar = this.f203009e;
        androidx.recyclerview.widget.k3 k3Var = this.f203010f;
        androidx.recyclerview.widget.k3 k3Var2 = this.f203011g;
        rVar.G(k3Var, k3Var2);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f203012h;
        rVar.I(mMNeat7extView, this.f203013i, this.f203014m);
        mMNeat7extView.setClipBounds(this.f203015n);
        mMNeat7extView.setAlpha(this.f203016o);
        rVar.J(mMNeat7extView, this.f203017p, 1.0f);
        android.view.View view = this.f203018q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(this.f203019r));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$animateChange$animator$1$2", "finish", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$animateChange$animator$1$2", "finish", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rVar.L(mMNeat7extView);
        rVar.h(k3Var2);
        rVar.h(k3Var);
        rVar.F();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        a();
    }
}
