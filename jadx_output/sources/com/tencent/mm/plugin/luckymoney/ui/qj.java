package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class qj implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147354e;

    public qj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, int i17) {
        this.f147354e = luckyMoneyNotHookReceiveUI;
        this.f147353d = i17;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        int i17 = this.f147353d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f147354e;
        if (i17 != 2) {
            luckyMoneyNotHookReceiveUI.f146485x.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.pj(this), 0L);
            return;
        }
        android.view.View view = luckyMoneyNotHookReceiveUI.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyNotHookReceiveUI.D.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.nj(this), 300L);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
