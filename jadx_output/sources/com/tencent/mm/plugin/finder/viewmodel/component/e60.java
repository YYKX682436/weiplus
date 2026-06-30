package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class e60 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f134197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f134198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.i60 f134199f;

    public e60(kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.viewmodel.component.i60 i60Var) {
        this.f134197d = c0Var;
        this.f134198e = h0Var;
        this.f134199f = i60Var;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f134197d.f310112d = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        if (this.f134197d.f310112d) {
            return;
        }
        ((android.view.ViewGroup) this.f134198e.f310123d).removeView(this.f134199f.f134702d);
    }
}
