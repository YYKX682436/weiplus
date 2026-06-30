package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class l0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172641d;

    public l0(com.tencent.mm.plugin.taskbar.ui.z zVar) {
        this.f172641d = zVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172641d;
        zVar.I1.animate().setListener(null);
        zVar.I1.setTranslationY(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172641d;
        zVar.I1.animate().setListener(null);
        zVar.I1.setTranslationY(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
