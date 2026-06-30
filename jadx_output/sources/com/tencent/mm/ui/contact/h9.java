package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class h9 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public h9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "onAnimationUpdate %s", java.lang.Float.valueOf(((java.lang.Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
    }
}
