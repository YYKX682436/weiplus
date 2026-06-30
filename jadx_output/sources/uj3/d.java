package uj3;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.g f428255d;

    public d(uj3.g gVar) {
        this.f428255d = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        uj3.g gVar = this.f428255d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = gVar.f428269b;
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        android.view.View view = gVar.f428272e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI$doAnimationHide$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI$doAnimationHide$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = gVar.f428272e;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            java.lang.Object animatedValue = it.getAnimatedValue("sizeW");
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((java.lang.Integer) animatedValue).intValue();
        }
        android.view.View view3 = gVar.f428272e;
        android.view.ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams2 != null) {
            java.lang.Object animatedValue2 = it.getAnimatedValue("sizeH");
            kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.height = ((java.lang.Integer) animatedValue2).intValue();
        }
        android.view.View view4 = gVar.f428272e;
        android.view.ViewGroup.LayoutParams layoutParams3 = view4 != null ? view4.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        java.lang.Object animatedValue3 = it.getAnimatedValue("marginBottom");
        kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams3).bottomMargin = ((java.lang.Integer) animatedValue3).intValue();
        android.view.View view5 = gVar.f428272e;
        android.view.ViewGroup.LayoutParams layoutParams4 = view5 != null ? view5.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        java.lang.Object animatedValue4 = it.getAnimatedValue("marginEnd");
        kotlin.jvm.internal.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams4).setMarginEnd(((java.lang.Integer) animatedValue4).intValue());
        android.view.View view6 = gVar.f428272e;
        if (view6 != null) {
            view6.requestLayout();
        }
    }
}
