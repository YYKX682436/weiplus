package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ad extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133770d;

    public ad(android.view.View view) {
        this.f133770d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd: check bg status, width = ");
        android.view.View view = this.f133770d;
        sb6.append(view.getWidth());
        sb6.append(", color = ");
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        sb6.append(colorDrawable != null ? java.lang.Integer.toHexString(colorDrawable.getColor()) : null);
        com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", sb6.toString());
    }
}
