package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class b0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f149293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149294e;

    public b0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f149294e = mMSightRecordButton;
        this.f149293d = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f149294e.f149202o = false;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f149293d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f149294e.f149202o = true;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f149293d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
