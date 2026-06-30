package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.j f172379d;

    public e(com.tencent.mm.plugin.subapp.ui.gallery.j jVar) {
        this.f172379d = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f172379d.f172390h.setAlpha(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f172379d.f172390h.setAlpha(0.0f);
    }
}
