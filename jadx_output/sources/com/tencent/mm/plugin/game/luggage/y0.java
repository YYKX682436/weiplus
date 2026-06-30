package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI f140037d;

    public y0(com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI mMLuggageGameHalfWebViewUI) {
        this.f140037d = mMLuggageGameHalfWebViewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI mMLuggageGameHalfWebViewUI = this.f140037d;
        android.widget.FrameLayout frameLayout = mMLuggageGameHalfWebViewUI.f139504d.f406662c;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(frameLayout, "translationY", frameLayout.getTranslationY(), mMLuggageGameHalfWebViewUI.f139504d.f406662c.getTranslationY() + mMLuggageGameHalfWebViewUI.f139500i).setDuration(200L);
        duration.addListener(new com.tencent.mm.plugin.game.luggage.x0());
        duration.start();
        mMLuggageGameHalfWebViewUI.finish();
        mMLuggageGameHalfWebViewUI.overridePendingTransition(com.tencent.mm.R.anim.f477783bc, com.tencent.mm.R.anim.f477784bd);
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
