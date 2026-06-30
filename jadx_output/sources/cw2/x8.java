package cw2;

/* loaded from: classes.dex */
public final class x8 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f224111e;

    public x8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, float f17) {
        this.f224110d = finderVideoLayout;
        this.f224111e = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.View loading;
        android.view.View loading2;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224110d;
        loading = finderVideoLayout.getLoading();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(this.f224111e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loading, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        loading.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(loading, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        loading2 = finderVideoLayout.getLoading();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(loading2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loading2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(loading2, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
