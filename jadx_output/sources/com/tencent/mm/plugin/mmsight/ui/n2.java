package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class n2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149373d;

    public n2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149373d = sightCaptureUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f149373d.E.setVisibility(8);
    }
}
