package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class af implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f146709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146710e;

    public af(java.lang.Integer num, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f146709d = num;
        this.f146710e = luckyMoneyNewReceiveUI;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f146710e;
        java.lang.Integer num = this.f146709d;
        if (num == null || num.intValue() != 2) {
            android.widget.ImageView imageView = luckyMoneyNewReceiveUI.f146317y;
            if (imageView != null) {
                imageView.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.ze(luckyMoneyNewReceiveUI), 0L);
                return;
            }
            return;
        }
        android.view.View view = luckyMoneyNewReceiveUI.E;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = luckyMoneyNewReceiveUI.E;
        if (view2 != null) {
            view2.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.xe(luckyMoneyNewReceiveUI), 300L);
        }
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
