package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f174112d;

    public n1(com.tencent.mm.plugin.textstatus.ui.w1 w1Var) {
        this.f174112d = w1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC cardFeedUIC;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView$initIndicator$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var = this.f174112d;
        cardFeedUIC = w1Var.getCardFeedUIC();
        if (cardFeedUIC != null) {
            int i17 = cardFeedUIC.f173781o + 1;
            com.tencent.mars.xlog.Log.i(w1Var.f174390i, "click indicator,scrollToPosition:" + i17);
            w1Var.i(i17, false, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView$initIndicator$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
