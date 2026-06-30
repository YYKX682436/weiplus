package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y20 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f120406d;

    public y20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var) {
        this.f120406d = e30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f120406d;
        com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView cheerCountDownView = e30Var.f118220y;
        kotlinx.coroutines.r2 r2Var = cheerCountDownView.f111524h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        cheerCountDownView.f111526m = 360.0f;
        e30Var.f118220y.setVisibility(8);
    }
}
