package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sn extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zn f119819d;

    public sn(com.tencent.mm.plugin.finder.live.widget.zn znVar) {
        this.f119819d = znVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.f119819d;
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        znVar.f120587g.setAlpha(1.0f);
        znVar.f120584d.setElevation(znVar.f120581a.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3y));
        android.view.View view2 = znVar.f120585e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f120586f.setVisibility(8);
        znVar.f120587g.setVisibility(8);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView = znVar.f120591k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120592l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
        znVar.f120600t.setVisibility(8);
        znVar.f120600t.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
        znVar.f120600t.setClickable(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.f119819d;
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        znVar.f120587g.setAlpha(1.0f);
        znVar.f120584d.setElevation(znVar.f120581a.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3y));
        android.view.View view2 = znVar.f120585e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f120586f.setVisibility(8);
        znVar.f120587g.setVisibility(8);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView = znVar.f120591k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120592l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
        znVar.f120600t.setVisibility(8);
        znVar.f120600t.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
        znVar.f120600t.setClickable(false);
    }
}
