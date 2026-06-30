package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class r8 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f135776d;

    public r8(v65.n nVar) {
        this.f135776d = nVar;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f135776d.a(java.lang.Boolean.FALSE);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f135776d.a(java.lang.Boolean.TRUE);
    }
}
