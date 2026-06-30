package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class e4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.n4 f210373d;

    public e4(com.tencent.mm.ui.tools.s4 s4Var, com.tencent.mm.ui.tools.n4 n4Var) {
        this.f210373d = n4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.ui.tools.n4 n4Var = this.f210373d;
        if (n4Var instanceof com.tencent.mm.ui.tools.o4) {
            ((com.tencent.mm.ui.tools.o4) n4Var).b(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
