package ym5;

/* loaded from: classes10.dex */
public class t implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.h f463531a;

    public t(ym5.h hVar) {
        this.f463531a = hVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ym5.h hVar = this.f463531a;
        android.view.View footerBg = hVar.getFooterBg();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(footerBg, arrayList.toArray(), "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        footerBg.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(footerBg, "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View actionBar = hVar.getActionBar();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(actionBar, arrayList2.toArray(), "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionBar.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(actionBar, "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
