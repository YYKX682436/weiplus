package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ef implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMileStoneView f132004d;

    public ef(com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView) {
        this.f132004d = finderMileStoneView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        int i17 = com.tencent.mm.plugin.finder.view.FinderMileStoneView.G;
        com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView = this.f132004d;
        finderMileStoneView.getClass();
        java.lang.Object animatedValue = animator.getAnimatedValue("leftAvatarTranslationX");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = animator.getAnimatedValue("rightAvatarTranslationX");
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = animator.getAnimatedValue("avatarTranslationY");
        kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue3).floatValue();
        java.lang.Object animatedValue4 = animator.getAnimatedValue("leftAvatarRotation");
        kotlin.jvm.internal.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        float floatValue4 = ((java.lang.Float) animatedValue4).floatValue();
        java.lang.Object animatedValue5 = animator.getAnimatedValue("rightAvatarRotation");
        kotlin.jvm.internal.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
        float floatValue5 = ((java.lang.Float) animatedValue5).floatValue();
        java.lang.Object animatedValue6 = animator.getAnimatedValue("avatarAlpha");
        kotlin.jvm.internal.o.e(animatedValue6, "null cannot be cast to non-null type kotlin.Float");
        float floatValue6 = ((java.lang.Float) animatedValue6).floatValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderMileStoneView", "avatarAnimatorValue: leftTranslationX: " + floatValue + ", rightTranslationX: " + floatValue2 + ", translationY: " + floatValue3 + ", leftRotation: " + floatValue4 + ", rightRotation: " + floatValue5);
        android.widget.ImageView imageView = finderMileStoneView.mileStoneLeftAvatar;
        imageView.setTranslationX(floatValue);
        imageView.setTranslationY(floatValue3);
        imageView.setRotation(floatValue4);
        imageView.setAlpha(floatValue6);
        android.widget.ImageView imageView2 = finderMileStoneView.mileStoneRightAvatar;
        imageView2.setTranslationX(floatValue2);
        imageView2.setTranslationY(floatValue3);
        imageView2.setRotation(floatValue5);
        imageView2.setAlpha(floatValue6);
    }
}
