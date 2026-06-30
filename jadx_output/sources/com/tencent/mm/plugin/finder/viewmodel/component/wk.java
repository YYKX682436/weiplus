package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class wk extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136349f;

    public wk(android.widget.FrameLayout frameLayout, android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f136347d = frameLayout;
        this.f136348e = view;
        this.f136349f = blVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f136347d.removeView(this.f136348e);
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f136349f;
        android.view.View findViewById = blVar.findViewById(com.tencent.mm.R.id.nfb);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$2$3$4$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$2$3$4$onAnimationEnd$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView = (com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView) blVar.findViewById(com.tencent.mm.R.id.nuq);
        if (finderEdgeTransparentView == null) {
            return;
        }
        finderEdgeTransparentView.setEnable(false);
    }
}
