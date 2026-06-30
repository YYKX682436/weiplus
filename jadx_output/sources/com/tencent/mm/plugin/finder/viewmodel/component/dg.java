package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class dg extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.gg f134141d;

    public dg(com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar) {
        this.f134141d = ggVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = this.f134141d;
        ggVar.f134519u = false;
        if (ggVar.f134516r && ggVar.f134505d && !ggVar.f134520v) {
            ggVar.R6();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = this.f134141d;
        ggVar.f134519u = false;
        if (ggVar.f134516r && ggVar.f134505d && !ggVar.f134520v) {
            ggVar.R6();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        this.f134141d.f134519u = true;
    }
}
