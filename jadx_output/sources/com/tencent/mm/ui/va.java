package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class va implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f211113d;

    public va(com.tencent.mm.ui.ga gaVar) {
        this.f211113d = gaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f211113d.r0(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), false);
    }
}
