package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class zf extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.gg f136682d;

    public zf(com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar) {
        this.f136682d = ggVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = this.f136682d;
        ggVar.getActivity().finish();
        ggVar.getActivity().overridePendingTransition(0, 0);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "checkBackPressedAnim onAnimationEnd");
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = this.f136682d;
        ggVar.getActivity().finish();
        ggVar.getActivity().overridePendingTransition(0, 0);
    }
}
