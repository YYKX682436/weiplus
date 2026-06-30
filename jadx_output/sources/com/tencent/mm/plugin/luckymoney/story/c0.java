package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145842d;

    public c0(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145842d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145842d;
        envelopeAppBarLayout.B1.B(-(envelopeAppBarLayout.getTotalScrollRange() - envelopeAppBarLayout.f145796z1));
        envelopeAppBarLayout.f145792y.setAlpha(1.0f);
        if (envelopeAppBarLayout.i()) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = envelopeAppBarLayout.U;
            android.view.View view2 = luckyMoneyNewDetailUI.mToplinkArea;
            if (view2 != null && luckyMoneyNewDetailUI.f146240z2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                envelopeAppBarLayout.U.f146240z2.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = envelopeAppBarLayout.V;
            if (luckyMoneyDetailUI != null && (view = luckyMoneyDetailUI.f146111y2) != null && luckyMoneyDetailUI.f146114z2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                envelopeAppBarLayout.V.f146114z2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout.e(envelopeAppBarLayout);
    }
}
