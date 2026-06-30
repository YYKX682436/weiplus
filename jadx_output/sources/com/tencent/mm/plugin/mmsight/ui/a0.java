package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class a0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f149262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149263e;

    public a0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f149263e = mMSightRecordButton;
        this.f149262d = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f149263e.f149202o = false;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f149262d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f149263e.f149202o = true;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f149262d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
