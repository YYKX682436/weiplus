package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145874d;

    public h(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145874d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        in5.s0 s0Var;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145874d;
        if (!envelopeAppBarLayout.f145788w.h1(envelopeAppBarLayout.A1) || (s0Var = (in5.s0) envelopeAppBarLayout.f145788w.p0(envelopeAppBarLayout.A1)) == null) {
            return;
        }
        envelopeAppBarLayout.p(s0Var, envelopeAppBarLayout.A1, true);
        if (envelopeAppBarLayout.i()) {
            com.tencent.mm.plugin.luckymoney.ui.j7 j7Var = (com.tencent.mm.plugin.luckymoney.ui.j7) envelopeAppBarLayout.U.component(com.tencent.mm.plugin.luckymoney.ui.j7.class);
            android.view.View view = s0Var.itemView;
            j7Var.getClass();
            android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.j0c) : null;
            if (findViewById != null) {
                findViewById.sendAccessibilityEvent(32768);
            }
            if (findViewById != null) {
                findViewById.announceForAccessibility(j7Var.getString(com.tencent.mm.R.string.gjx));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = envelopeAppBarLayout.V;
        if (luckyMoneyDetailUI != null) {
            com.tencent.mm.plugin.luckymoney.ui.o3 o3Var = (com.tencent.mm.plugin.luckymoney.ui.o3) luckyMoneyDetailUI.component(com.tencent.mm.plugin.luckymoney.ui.o3.class);
            android.view.View view2 = s0Var.itemView;
            o3Var.getClass();
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.j0c);
            findViewById2.sendAccessibilityEvent(32768);
            findViewById2.announceForAccessibility(o3Var.getString(com.tencent.mm.R.string.gjx));
        }
    }
}
