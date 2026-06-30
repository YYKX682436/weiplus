package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes3.dex */
public class a0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f156638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f156639e;

    public a0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI, java.lang.ref.WeakReference weakReference, int i17) {
        this.f156638d = weakReference;
        this.f156639e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = (android.view.View) this.f156638d.get();
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams2.setMargins(layoutParams.leftMargin, this.f156639e, layoutParams.rightMargin, layoutParams.bottomMargin);
            view.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
