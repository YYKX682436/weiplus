package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class c1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149299d;

    public c1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149299d = a2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149299d;
        a2Var.f149281q.setVisibility(8);
        a2Var.f149281q.setAlpha(1.0f);
    }
}
