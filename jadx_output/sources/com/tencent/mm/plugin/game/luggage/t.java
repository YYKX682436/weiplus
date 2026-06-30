package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI f139966d;

    public t(com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI luggageGameHalfWebViewUI) {
        this.f139966d = luggageGameHalfWebViewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/LuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI luggageGameHalfWebViewUI = this.f139966d;
        android.widget.FrameLayout frameLayout = luggageGameHalfWebViewUI.f139494d.f406662c;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(frameLayout, "translationY", frameLayout.getTranslationY(), luggageGameHalfWebViewUI.f139494d.f406662c.getTranslationY() + luggageGameHalfWebViewUI.f139489n).setDuration(200L);
        duration.addListener(new com.tencent.mm.plugin.game.luggage.s());
        duration.start();
        super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
        luggageGameHalfWebViewUI.overridePendingTransition(com.tencent.mm.R.anim.f477783bc, com.tencent.mm.R.anim.f477831cp);
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/LuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
