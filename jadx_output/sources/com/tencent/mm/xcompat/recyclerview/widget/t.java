package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f214632d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.v f214633e;

    public t(com.tencent.mm.xcompat.recyclerview.widget.v vVar) {
        this.f214633e = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f214632d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f214632d) {
            this.f214632d = false;
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.v vVar = this.f214633e;
        if (((java.lang.Float) vVar.f214685z.getAnimatedValue()).floatValue() == 0.0f) {
            vVar.A = 0;
            vVar.c(0);
        } else {
            vVar.A = 2;
            vVar.f214678s.invalidate();
        }
    }
}
