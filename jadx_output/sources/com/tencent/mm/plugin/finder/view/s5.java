package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f133017d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f133018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133020g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f133021h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentEditText f133022i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f133023m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f133024n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(yz5.l lVar, com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133019f = lVar;
        this.f133020g = finderCommentFooter;
        this.f133021h = frameLayout;
        this.f133022i = finderCommentEditText;
        this.f133023m = charSequence;
        this.f133024n = charSequence2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.view.s5 s5Var = new com.tencent.mm.plugin.finder.view.s5(this.f133019f, this.f133020g, this.f133021h, this.f133022i, this.f133023m, this.f133024n, continuation);
        s5Var.f133018e = obj;
        return s5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.s5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.f1 b17;
        java.lang.Object k17;
        java.lang.Object k18;
        android.view.View view;
        android.view.View view2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f133017d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f133018e;
            kotlinx.coroutines.f1 b18 = kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.plugin.finder.view.q5(this.f133020g, this.f133021h, this.f133022i, this.f133023m, null), 3, null);
            b17 = kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.plugin.finder.view.p5(this.f133020g, this.f133021h, this.f133022i, this.f133024n, null), 3, null);
            this.f133018e = b17;
            this.f133017d = 1;
            k17 = ((kotlinx.coroutines.g1) b18).k(this);
            if (k17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.view.View view3 = (android.view.View) this.f133018e;
                kotlin.ResultKt.throwOnFailure(obj);
                k18 = obj;
                view = view3;
                view2 = (android.view.View) k18;
                f0Var = jz5.f0.f302826a;
                if (view != null || view2 == null) {
                    java.util.Objects.toString(view);
                    java.util.Objects.toString(view2);
                    return f0Var;
                }
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.view.m5(view));
                android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
                ofFloat2.setDuration(200L);
                ofFloat2.setStartDelay(100L);
                ofFloat2.addUpdateListener(new com.tencent.mm.plugin.finder.view.n5(view2));
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText = this.f133022i;
                java.lang.CharSequence charSequence = this.f133024n;
                android.widget.FrameLayout frameLayout = this.f133021h;
                animatorSet.playTogether(ofFloat, ofFloat2);
                com.tencent.mm.plugin.finder.view.o5 o5Var = new com.tencent.mm.plugin.finder.view.o5(finderCommentEditText, charSequence, frameLayout, view2, view);
                animatorSet.addListener(new com.tencent.mm.plugin.finder.view.r5(o5Var, o5Var, finderCommentEditText));
                this.f133019f.invoke(animatorSet);
                return f0Var;
            }
            b17 = (kotlinx.coroutines.f1) this.f133018e;
            kotlin.ResultKt.throwOnFailure(obj);
            k17 = obj;
        }
        android.view.View view4 = (android.view.View) k17;
        this.f133018e = view4;
        this.f133017d = 2;
        k18 = b17.k(this);
        if (k18 == aVar) {
            return aVar;
        }
        view = view4;
        view2 = (android.view.View) k18;
        f0Var = jz5.f0.f302826a;
        if (view != null) {
        }
        java.util.Objects.toString(view);
        java.util.Objects.toString(view2);
        return f0Var;
    }
}
