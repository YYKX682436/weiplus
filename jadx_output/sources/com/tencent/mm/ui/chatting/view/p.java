package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f203039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r f203040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f203041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f203042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f203043h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f203044i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f203045m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f203046n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f203047o;

    public p(com.tencent.mm.ui.chatting.view.r rVar, androidx.recyclerview.widget.k3 k3Var, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, int i17, int i18, android.graphics.Rect rect, float f17, int i19) {
        this.f203040e = rVar;
        this.f203041f = k3Var;
        this.f203042g = mMNeat7extView;
        this.f203043h = i17;
        this.f203044i = i18;
        this.f203045m = rect;
        this.f203046n = f17;
        this.f203047o = i19;
    }

    public final void a() {
        if (this.f203039d) {
            com.tencent.mars.xlog.Log.w("ChattingTextChangeItemAnimator", "animateChange(self): finish called repeatedly, ignore");
            return;
        }
        this.f203039d = true;
        com.tencent.mm.ui.chatting.view.r rVar = this.f203040e;
        androidx.recyclerview.widget.k3 k3Var = this.f203041f;
        rVar.G(k3Var, null);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f203042g;
        rVar.I(mMNeat7extView, this.f203043h, this.f203044i);
        mMNeat7extView.setClipBounds(this.f203045m);
        mMNeat7extView.setAlpha(this.f203046n);
        rVar.J(mMNeat7extView, this.f203047o, 1.0f);
        rVar.L(mMNeat7extView);
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
