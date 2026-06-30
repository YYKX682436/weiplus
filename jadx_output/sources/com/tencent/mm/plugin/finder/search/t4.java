package com.tencent.mm.plugin.finder.search;

/* loaded from: classes5.dex */
public final class t4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u4 f125870d;

    public t4(com.tencent.mm.plugin.finder.search.u4 u4Var) {
        this.f125870d = u4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "onAnimationCancel");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "onAnimationEnd");
        this.f125870d.f125887h.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "onAnimationRepeat");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "onAnimationStart");
    }
}
