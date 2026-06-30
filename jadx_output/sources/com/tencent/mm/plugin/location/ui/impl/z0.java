package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class z0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.w1 f144967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144968b;

    public z0(com.tencent.mm.plugin.location.ui.impl.x1 x1Var, com.tencent.mm.plugin.location.ui.impl.w1 w1Var) {
        this.f144968b = x1Var;
        this.f144967a = w1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144968b;
        x1Var.Q = true;
        com.tencent.mm.plugin.location.ui.impl.w1 w1Var = com.tencent.mm.plugin.location.ui.impl.w1.OPENED;
        com.tencent.mm.plugin.location.ui.impl.w1 w1Var2 = this.f144967a;
        if (w1Var == w1Var2) {
            x1Var.S = true;
            if (x1Var.f144920J) {
                if (x1Var.T1) {
                    x1Var.T1 = false;
                } else {
                    x1Var.C();
                }
            }
        } else {
            x1Var.S = false;
            com.tencent.mm.plugin.location.ui.impl.x1.p(x1Var);
            if (x1Var.f144920J) {
                com.tencent.mm.plugin.location.ui.impl.x1.o(x1Var, x1Var.f144932t.f144760f);
            }
        }
        x1Var.B(w1Var2);
        x1Var.L.clearAnimation();
        x1Var.f144934v.clearAnimation();
        x1Var.T.clearAnimation();
        if (x1Var.U1) {
            x1Var.U1 = false;
            if (x1Var.f144932t.f144764m.equals(x1Var.K) && x1Var.f144932t.f144766o) {
                x1Var.z();
            } else {
                x1Var.K1 = true;
                x1Var.w(false);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144968b;
        x1Var.Q = false;
        x1Var.R = true;
    }
}
