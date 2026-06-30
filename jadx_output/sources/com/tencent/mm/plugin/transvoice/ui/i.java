package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes8.dex */
public class i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout f175435d;

    public i(com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout languageChoiceLayout) {
        this.f175435d = languageChoiceLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f175435d.setVisibility(8);
    }
}
