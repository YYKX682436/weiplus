package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class q0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f171032f = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f171033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171034e;

    public q0(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        this.f171034e = v0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$18");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f171033d = true;
        com.tencent.mars.xlog.Log.i(this.f171034e.j(), "onAnimationCancel() called with: animation = [" + animation + ']');
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$18");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$18");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171034e;
        com.tencent.mars.xlog.Log.i(v0Var.j(), "onAnimationEnd() called and try repeat");
        kotlinx.coroutines.y0 h17 = v0Var.h();
        if (h17 != null) {
            kotlinx.coroutines.l.d(h17, null, null, new com.tencent.mm.plugin.sns.ui.widget.ad.p0(this, v0Var, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$18");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$18");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f171033d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processTwoImageViews$18");
    }
}
